package entrada;

import java.util.List;

import compresor.Compresor;


public class Directorio extends Entrada {
	private List<Entrada> subEntradas;
	
	public Directorio(String nombre, List<Entrada> subEntradas) {
		super(nombre);
		this.subEntradas = subEntradas;
	}

	public List<Entrada> getSubEntradas() {
		return subEntradas;
	}
	
	public String comprimir(Compresor compresor) {
		return compresor.comprimirDirectorio(this);
	}
}

