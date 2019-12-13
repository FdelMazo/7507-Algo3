package casas;

import casas.estadoConstruccion.EstaDestruida;
import herramienta.Hacha;
import herramienta.Pulmones;
import herramienta.TaladroRotopercutor;
import material.Madera;

public class CasaDelChanchitoDeMadera extends CasaDelChanchito{
	
	public CasaDelChanchitoDeMadera(){

		super();
		material = new Madera();
	}

	@Override
	public void serAtacadaConPulmones(Pulmones pulmones) {

	}

	@Override
	public void serAtacadaConHacha(Hacha hacha) {
		estadoConstruccion = new EstaDestruida();
	}

	@Override
	public void serAtacadoConTaladro(TaladroRotopercutor taladroRotopercutor) {

	}
}
