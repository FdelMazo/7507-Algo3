package herramienta;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDePaja;

public class TaladroRotopercutor extends Herramienta {

    @Override
    public void atacar(CasaDelChanchito casaDelChanchito) {
        casaDelChanchito.serAtacadoConTaladro(this);
    }
}
