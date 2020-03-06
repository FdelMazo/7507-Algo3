public class MinusculaState implements CambioState {

	@Override
	public String cambiarPrimera(String unaCadena) {
		if (unaCadena.equals("")) {
			throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
		}

		String nuevoString = new StringBuffer(unaCadena).toString();
		return nuevoString.substring(0,1).toLowerCase() + nuevoString.substring(1);
	}
}
