package reglas;

import excepciones.LargoInvalidoExcepcion;

public class ReglaLargo implements IRegla {

    private static final int LARGO_PERMITIDO = 1;

    @Override
    public boolean verificar(String letra, int peso) throws RuntimeException {
        if(letra.length() != LARGO_PERMITIDO) throw new LargoInvalidoExcepcion();
        return true;
    }
}
