package herramienta;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDePaja;

public class Pulmones extends Herramienta {
    @Override
    public void atacar(CasaDelChanchito casaDelChanchito) {
        casaDelChanchito.serAtacadaConPulmones(this);
    }
}
