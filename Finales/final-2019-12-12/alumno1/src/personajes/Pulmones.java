package personajes;

import casas.CasaDelChanchito;

public class Pulmones extends Herramienta {
    @Override
    public void atacar(CasaDelChanchito casaDelChanchito) {
        casaDelChanchito.esAtacadaCon(this);
    }
}
