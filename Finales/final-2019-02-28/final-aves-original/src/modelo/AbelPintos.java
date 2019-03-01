package modelo;

public class AbelPintos implements Estado {

	@Override
	public String cantar() {
		return "vas a entrar sin pedirme la llave...";
	}

	@Override
	public int volar() {
		// y cero... porque en realidad no sé volar, así que no subo nada
		return 0;
	}

	@Override
	public int correr(Superficie superficie) {
		
		if (superficie == Superficie.PISTA_ATLETISMO) {
			// unos 15 km/h
			return 15;
		}
		
		if (superficie == Superficie.BARRO) {
			//medio lento pero se puede
			return 2;
		}
		
		if (superficie == Superficie.HIELO) {
			//olvidate, me caigo.
			return 0;
		}
		
		return -1;
	}

}
