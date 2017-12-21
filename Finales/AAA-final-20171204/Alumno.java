package finales;

public class Alumno {
	
	private int padron;
	private int dni;
	private String nombre;
	private String nacionalidad;
	private String email;
	private String telefono;
	private String domicilio;
	private String localidad;
	
	public Alumno(int padron, int dni, String nombre, String nacionalidad,
			String email, String telefono, String domicilio, String localidad) {
		super();
		this.padron = padron;
		this.dni = dni;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.email = email;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.localidad = localidad;
	}

	public int getPadron() {
		return padron;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
