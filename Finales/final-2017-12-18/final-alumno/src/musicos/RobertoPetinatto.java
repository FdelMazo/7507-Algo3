package musicos;

import instrumentos.Instrumento;
import instrumentos.Piano;
import instrumentos.Saxo;

public class RobertoPetinatto extends Musico {

    public int tocar(Saxo unSaxo) {
        return unSaxo.serTocado();
    }

}
