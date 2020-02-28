public class DarVuelta implements Efecto {

	public String aplicarA(String unaCadena) {
		if (unaCadena.equals("")) {
			throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
		}

		return new StringBuffer(unaCadena).reverse().toString();
	}

}
