package musicos;

import instrumentos.Instrumento;
import instrumentos.Piano;

public class FitoPaez extends Musico {

	public int tocar(Piano unPiano) {
		return unPiano.serTocado();
	}
}
