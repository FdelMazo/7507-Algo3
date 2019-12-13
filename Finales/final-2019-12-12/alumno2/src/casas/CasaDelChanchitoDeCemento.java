package casas;

import casas.estadoConstruccion.EstaDestruida;
import herramienta.Hacha;
import herramienta.Pulmones;
import herramienta.TaladroRotopercutor;
import material.Cemento;

public class CasaDelChanchitoDeCemento extends CasaDelChanchito{
	
	public CasaDelChanchitoDeCemento(){
		super();
		material = new Cemento();
	}


	@Override
	public void serAtacadaConPulmones(Pulmones pulmones) {

	}

	@Override
	public void serAtacadaConHacha(Hacha hacha) {

	}

	@Override
	public void serAtacadoConTaladro(TaladroRotopercutor taladroRotopercutor) {
		estadoConstruccion = new EstaDestruida();
	}
}
