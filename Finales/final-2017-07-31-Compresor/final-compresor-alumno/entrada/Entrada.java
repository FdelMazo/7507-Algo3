package entrada;

import java.util.List;

import compresor.Compresor;

public abstract class Entrada {
	private String nombre;
	
	public Entrada(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String comprimir(Compresor compresor);
}
