package letras;

import reglas.IRegla;

import java.util.List;

public class Consonante extends Letra {

    public static final int CONSTANTE_AUMENTO = 1;

    public Consonante(String letra, int peso, List<IRegla> reglas){
        super(letra, peso * CONSTANTE_AUMENTO, reglas);
    }
}
