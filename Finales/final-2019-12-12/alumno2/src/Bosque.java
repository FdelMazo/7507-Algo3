import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeCemento;
import casas.CasaDelChanchitoDeMadera;
import casas.CasaDelChanchitoDePaja;
import personajes.Chanchito;
import personajes.Lobo;

public class Bosque {
	
	private Lobo loboFeroz;
	private Chanchito chanchito;

	public Bosque(Lobo unLobo, Chanchito chanchito){
		this.chanchito = chanchito;
		this.loboFeroz = unLobo;
	}
	
	public void loboAtacarCasaDelChanchito(){
		loboFeroz.atacar(chanchito);
	}
	
	public void huirHaciaUnaCasaDeMadera(){
		chanchito.huirACasaDeMadera();
	}
	
	public void huirHaciaUnaCasaDeCemento(){
		chanchito.huirACasaDeCemento();
	}
	
	public boolean casaDestruida(){
		return chanchito.teDestruyeronLaCasa();
	}

}
