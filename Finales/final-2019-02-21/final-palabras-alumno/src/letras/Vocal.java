package letras;

import reglas.IRegla;

import java.util.List;

public class Vocal extends Letra {

    public static final int CONSTANTE_AUMENTO = 2;

    public Vocal(String letra, int peso, List<IRegla> reglas){
        super(letra, peso * CONSTANTE_AUMENTO, reglas);
    }
}
