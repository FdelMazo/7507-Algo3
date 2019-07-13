public class ComparadorDeValores {

	private int valor;

	public ComparadorDeValores(int valor) {
		this.valor = valor;
	}

	@Override
	public boolean equals(Object obj) {
		ComparadorDeValores another = (ComparadorDeValores)obj;
		return valor == another.valor;
	}

}
