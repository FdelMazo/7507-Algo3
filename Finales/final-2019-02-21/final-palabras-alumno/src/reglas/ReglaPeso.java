package reglas;

import excepciones.PesoNoPuedeSerNegativoExcepcion;

public class ReglaPeso implements IRegla {
    @Override
    public boolean verificar(String letra, int peso) throws RuntimeException {
        if(peso < 0) throw new PesoNoPuedeSerNegativoExcepcion();
        return true;
    }
}
