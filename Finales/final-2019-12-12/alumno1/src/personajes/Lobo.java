package personajes;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeCemento;
import casas.CasaDelChanchitoDeMadera;
import casas.CasaDelChanchitoDePaja;

public class Lobo {

	Herramienta herramienta;
	
	public Lobo(){
		this.herramienta = new Pulmones();
	}

	public void cambiarHerramienta(	Herramienta herramienta){
		this.herramienta = herramienta;
	}

	public void atacar(CasaDelChanchito casaDelChanchito){
		herramienta.atacar(casaDelChanchito);
	}
	
}
