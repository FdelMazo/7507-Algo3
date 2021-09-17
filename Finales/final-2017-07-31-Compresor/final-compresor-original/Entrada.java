import java.util.List;

public class Entrada {
	
	private boolean esDirectorio;
	private List<Entrada> subEntradas;
	private String nombre;
	
	public Entrada(String nombre, boolean esDirectorio, List<Entrada> subEntradas) {
		this.esDirectorio = esDirectorio;
		this.nombre = nombre;
		this.subEntradas = subEntradas;
		if (!this.esDirectorio && !this.subEntradas.isEmpty()) {
			throw new RuntimeException("Solo los directorios pueden tener subentradas");
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean esDirectorio() {
		return esDirectorio;
	}
	
	public List<Entrada> getSubEntradas() {
		if (!this.esDirectorio) {
			throw new RuntimeException("Los archivos no tienen subentradas");
		}
		return this.subEntradas;
	}
	
}
