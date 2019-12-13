package personajes;

import casas.CasaDelChanchito;

public class TaladroRotopercutor extends Herramienta {
    @Override
    public void atacar(CasaDelChanchito casaDelChanchito) {
        casaDelChanchito.esAtacadaCon(this);
    }
}
