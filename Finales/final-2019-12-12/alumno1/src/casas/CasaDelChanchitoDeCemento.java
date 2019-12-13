package casas;

import personajes.Hacha;
import personajes.Herramienta;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public class CasaDelChanchitoDeCemento extends CasaDelChanchito{

	@Override
	public void esAtacadaCon(Pulmones pulmones) {

	}

	@Override
	public void esAtacadaCon(TaladroRotopercutor taladroRotopercutor) {

	}

	@Override
	public void esAtacadaCon(Hacha hacha) {
		destruida = true;
	}
}
