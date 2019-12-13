package casas;

import personajes.Hacha;
import personajes.Herramienta;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public class CasaDelChanchitoDeMadera extends CasaDelChanchito{

	@Override
	public void esAtacadaCon(Pulmones pulmones) {

	}

	@Override
	public void esAtacadaCon(TaladroRotopercutor taladroRotopercutor) {
		destruida = true;
	}

	@Override
	public void esAtacadaCon(Hacha hacha) {
		destruida = true;
	}
}
