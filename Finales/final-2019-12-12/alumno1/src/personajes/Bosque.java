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

		loboFeroz.atacar(casaActual);
		
	}
	
	public void huirHaciaUnaCasaDeMadera(){
		this.casaActual = new CasaDelChanchitoDeMadera();
	}
	
	public void huirHaciaUnaCasaDeCemento(){
		this.casaActual = new CasaDelChanchitoDeCemento();
	}
	
	public boolean casaDestruida(){
		return this.casaActual.estaDestruida();
	}

}
