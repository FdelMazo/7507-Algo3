package musicos;

import instrumentos.GuitarraCriolla;
import instrumentos.Instrumento;

public class RicardoMollo extends Musico{

	public int tocar(GuitarraCriolla unaGuitarra){
		return unaGuitarra.serTocado();
	}


}
