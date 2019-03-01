package modelo;

public class Avestruz implements Estado{

	@Override
	public String cantar() {
		throw new NoVueloNiCantoNadaError();
	}

	@Override
	public int volar() {
		throw new NoVueloNiCantoNadaError();
	}
	
	@Override
	public int correr(Superficie superficie) {
		
		if (superficie == Superficie.PISTA_ATLETISMO) {
			// corriendo soy un/a champion 70 km/h
			return 70;
		}
		
		if (superficie == Superficie.BARRO) {
			// Nada me detiene !!
			return 70;
		}
		
		if (superficie == Superficie.HIELO) {
			// En realidad el hielo si.
			return 0;
		}
		
		return -1;
	}

}
