package personajes;

import herramienta.Herramienta;
import herramienta.Pulmones;

public class Lobo {

	Herramienta herramienta;
	
	public Lobo(){
		this.herramienta = new Pulmones();
	}
	
	public void cambiarHerramienta(	Herramienta herramienta){
		this.herramienta = herramienta;
	}

	public void atacar(Chanchito chanchito) {
		chanchito.serAtacadoCon(herramienta);
	}
}
