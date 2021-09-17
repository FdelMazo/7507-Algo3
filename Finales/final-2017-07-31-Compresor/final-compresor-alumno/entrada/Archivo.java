package entrada;

import java.util.Collections;
import java.util.List;

import compresor.Compresor;

public class Archivo extends Entrada implements Comprimible {
	
	public Archivo(String nombre) {
		super(nombre);
	}
	
	public String comprimir(Compresor compresor) {
		return compresor.comprimirArchivo(this);
	}
}
