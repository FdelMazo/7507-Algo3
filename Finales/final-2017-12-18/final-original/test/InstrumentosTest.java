package test;

import static org.junit.Assert.*;

import org.junit.Test;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import musicos.FitoPaez;
import musicos.LucianoPereyra;
import musicos.RicardoMollo;

public class InstrumentosTest {
	
	
	@Test
	public void test_BIEN_BIEN_COMPLETO(){
		
		LucianoPereyra lucianoPereyra = new LucianoPereyra();
		FitoPaez fitoPaez = new FitoPaez();
		RicardoMollo ricardoMollo = new RicardoMollo();
		
		assertEquals(lucianoPereyra.tocar(new Charango()), 20);	
		assertEquals(lucianoPereyra.tocar(new GuitarraCriolla()), 0);
		assertEquals(lucianoPereyra.tocar(new Piano()), 0);
		
		assertEquals(fitoPaez.tocar(new Charango()), 0);	
		assertEquals(fitoPaez.tocar(new GuitarraCriolla()), 0);
		assertEquals(fitoPaez.tocar(new Piano()), 150);
		
		assertEquals(ricardoMollo.tocar(new Charango()), 0);	
		assertEquals(ricardoMollo.tocar(new GuitarraCriolla()), 20);
		assertEquals(ricardoMollo.tocar(new Piano()), 0);
		
		
		Charango charangoDePlastico = new Charango();
		charangoDePlastico.material = "Plastico";
		
		GuitarraCriolla guitarraDePlastico = new GuitarraCriolla();
		guitarraDePlastico.material = "Plastico";
		
		Piano pianoDePlastico = new Piano();
		pianoDePlastico.material = "Plastico";
		
		assertEquals(lucianoPereyra.tocar(charangoDePlastico), 10);	
		assertEquals(lucianoPereyra.tocar(guitarraDePlastico), 0);
		assertEquals(lucianoPereyra.tocar(pianoDePlastico), 0);
		
		assertEquals(fitoPaez.tocar(charangoDePlastico), 0);	
		assertEquals(fitoPaez.tocar(guitarraDePlastico), 0);
		assertEquals(fitoPaez.tocar(pianoDePlastico), 45);
		
		assertEquals(ricardoMollo.tocar(charangoDePlastico), 0);	
		assertEquals(ricardoMollo.tocar(guitarraDePlastico), 17);
		assertEquals(ricardoMollo.tocar(pianoDePlastico), 0);

	}

}
