package personajes;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeCemento;
import casas.CasaDelChanchitoDeMadera;
import casas.CasaDelChanchitoDePaja;

public class Bosque {
	
	private Lobo loboFeroz;
	private CasaDelChanchito casaActual;

	public Bosque(Lobo unLobo){
		casaActual = new CasaDelChanchitoDePaja();
		this.loboFeroz = unLobo;
	}
	
	public void loboAtacarCasaDelChanchito(){
		
		if (casaActual instanceof CasaDelChanchitoDePaja){
			this.casaActual.destruida = true;
		}
		
		if (casaActual.material == 2 && loboFeroz.herramienta == Herramienta.HACHA){
			this.casaActual.destruida = true;
		}
		
		if (casaActual instanceof CasaDelChanchitoDeCemento || casaActual.material == 3){
			//JAJA no puedes hacer nada Lobo Feroz !!
		}
		
	}
	
	public void huirHaciaUnaCasaDeMadera(){
		this.casaActual = new CasaDelChanchitoDeMadera();
	}
	
	public void huirHaciaUnaCasaDeCemento(){
		this.casaActual = new CasaDelChanchitoDeCemento();
	}
	
	public boolean casaDestruida(){
		return this.casaActual.destruida;
	}

}
