
public class CompresorNombres {
	
	private int cantCaracteres;
	
	public CompresorNombres(int cantCaracteres) {
		this.cantCaracteres = cantCaracteres;
	}
	
	public String comprimir(Entrada e) {
		if (!e.esDirectorio()) {
			// archivo: devuelvo los primeros "cantCaracteres" del nombre
			return e.getNombre().substring(0, cantCaracteres);
		} else {
			// directorio: devuelvo los archivos usando dir(archivo)
			String nomDir = e.getNombre().substring(0, cantCaracteres);
			String resultado = "";
			for (Entrada sub : e.getSubEntradas()) {
				resultado += nomDir + "(" + sub.getNombre().substring(0, cantCaracteres) + ") ";
			}
			return resultado.trim(); 
		}
	}
	
}
