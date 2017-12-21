package musicos;

import instrumentos.Charango;
import instrumentos.Instrumento;

public class LucianoPereyra extends Musico{

	public int tocar(Charango unCharango) {
        return unCharango.serTocado();
    }

}
