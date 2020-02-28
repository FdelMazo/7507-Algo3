public class CambiarPrimera implements Efecto {
	CambioState cambio;

	public CambiarPrimera(CambioState cambio) {
		this.cambio = cambio;
	}

	public String aplicarA(String unaCadena) {
	return cambio.cambiarPrimera(unaCadena);
	}
}
