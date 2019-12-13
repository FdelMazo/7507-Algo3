package personajes;

import casas.CasaDelChanchito;

public class Hacha extends Herramienta {
    @Override
    public void atacar(CasaDelChanchito casaDelChanchito) {
        casaDelChanchito.esAtacadaCon(this);
    }
}
