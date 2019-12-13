package casas;

import personajes.Hacha;
import personajes.Herramienta;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public abstract class CasaDelChanchito {

	protected boolean destruida = false;

	public void esAtacadaCon(Herramienta herramienta){

	}

	public abstract void esAtacadaCon(Pulmones pulmones);

	public abstract void esAtacadaCon(TaladroRotopercutor taladroRotopercutor);

	public abstract void esAtacadaCon(Hacha hacha);

	public boolean estaDestruida(){
		return destruida;
	}
}
