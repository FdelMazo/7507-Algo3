package personajes;

public class Lobo {

	Herramienta herramienta;
	
	public Lobo(){
		this.herramienta = Herramienta.PULMONES;
	}
	
	public void cambiarHerramienta(	Herramienta herramienta){
		this.herramienta = herramienta;
	}
	
}
