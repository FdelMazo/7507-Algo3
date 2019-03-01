package modelo;

public class Gorrion implements Estado{

	@Override
	public String cantar() {
		return "pio pio";
	}

	@Override
	public int volar() {
		return 50;
	}

	@Override
	public int correr(Superficie superficie) {
		// no sé correr, se volar
		return -1;
	}

}
