package herramienta;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDePaja;

public class Hacha extends Herramienta {

    @Override
    public void atacar(CasaDelChanchito casaDelChanchito) {
        casaDelChanchito.serAtacadaConHacha(this);
    }
}
