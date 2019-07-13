package main.ar.edu.fiuba.algoiii;

public class MiClase {

	private int valor;

	public MiClase(int valor) {
		this.valor = valor;
	}

	@Override
	public boolean equals(Object obj) {
		MiClase another = (MiClase)obj;
		
		return valor == another.valor;
	}

}
