package casas;

import casas.estadoConstruccion.EstaDestruida;
import herramienta.Hacha;
import herramienta.Herramienta;
import herramienta.Pulmones;
import herramienta.TaladroRotopercutor;
import material.Paja;

public class CasaDelChanchitoDePaja extends CasaDelChanchito{

	public CasaDelChanchitoDePaja(){
		super();
		material = new Paja();
	}

	@Override
	public void serAtacadaCon(Herramienta herramienta) {
		herramienta.atacar(this);
	}

	@Override
	public void serAtacadaConPulmones(Pulmones pulmones) {
		estadoConstruccion = new EstaDestruida();
	}

	@Override
	public void serAtacadaConHacha(Hacha hacha) {

	}

	@Override
	public void serAtacadoConTaladro(TaladroRotopercutor taladroRotopercutor) {

	}
}
