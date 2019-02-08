package musicos;

import instrumentos.GuitarraCriolla;
import instrumentos.Instrumento;

public abstract class Musico {

    public int tocar(Instrumento instrumento){
        System.out.println("No se tocar eso...");
        return 0;
    }

}