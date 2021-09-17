package compresor;

import entrada.Archivo;
import entrada.Directorio;
import entrada.Entrada;

public class CompresorNombres implements Compresor {
	
	private int cantCaracteres;
	
	public CompresorNombres(int cantCaracteres) {
		this.cantCaracteres = cantCaracteres;
	}
	
	public String comprimir(Entrada e) {
		return e.comprimir(this);
	}
	
	public String comprimirArchivo(Archivo a) {
		return a.getNombre().substring(0, cantCaracteres);
	}
	
	public String comprimirDirectorio(Directorio directorio) {
		String resultado = "";
		String nombreDirectorio = directorio.getNombre().substring(0, cantCaracteres);
		
		for (Entrada e : directorio.getSubEntradas()) {
			resultado += nombreDirectorio + "(" + comprimir(e) + ") ";
		}
		
		return resultado.trim();
	}
	
}
