public class AgregarAlFinal implements Efecto {
	Character porAgregar;

	public AgregarAlFinal(Character porAgregar) {
		this.porAgregar = porAgregar;
	}

	public String aplicarA(String unaCadena) {
		if (unaCadena.equals("")) {
			throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
		}

		return unaCadena + porAgregar;

	}



}
