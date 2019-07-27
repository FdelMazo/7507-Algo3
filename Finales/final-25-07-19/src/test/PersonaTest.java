package test;
import org.junit.Assert;

import comensales.Persona;
import especialistas.Empanadero;
import especialistas.EmpanaderoCeliaco;
import especialistas.Panadero;
import especialistas.PanaderoCeliaco;

public class PersonaTest {

	@org.junit.Test
	public void personaNoCeliacaComeCosasParaNoCeliacosEstaTodoBien() {
		
		Persona personaNoCeliaca = new Persona(false);
		Assert.assertEquals(personaNoCeliaca.getCalorias(),0);
		
		Panadero panadero = new Panadero();
		String pan = panadero.hacerPan();
		personaNoCeliaca.comer(pan);
		Assert.assertEquals(personaNoCeliaca.calorias,10);
		
		Empanadero empandero = new Empanadero();
		String empanada = empandero.hacerEmpanada();
		personaNoCeliaca.comer(empanada);
		Assert.assertEquals(personaNoCeliaca.calorias,25);
	}
	
	@org.junit.Test
	public void personaCeliacaComeCosasParaCeliacosEstaTodoBien() {
		
		Persona celiaco = new Persona(true);
		Assert.assertEquals(celiaco.calorias,0);
		
		PanaderoCeliaco panaderoCeliaco = new PanaderoCeliaco();
		String pan = panaderoCeliaco.hacerPan();
		celiaco.comer(pan);
		Assert.assertEquals(celiaco.calorias,10);
		
		EmpanaderoCeliaco empanderoCeliaco = new EmpanaderoCeliaco();
		String empanada = empanderoCeliaco.hacerEmpanada();
		celiaco.comer(empanada);
		Assert.assertEquals(celiaco.calorias,25);
	}

}
