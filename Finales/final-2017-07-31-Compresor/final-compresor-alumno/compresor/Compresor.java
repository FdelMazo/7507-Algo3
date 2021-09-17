package compresor;

import entrada.Archivo;
import entrada.Directorio;

public interface Compresor {
	public String comprimirArchivo(Archivo archivo);
	public String comprimirDirectorio(Directorio directorio);
}
