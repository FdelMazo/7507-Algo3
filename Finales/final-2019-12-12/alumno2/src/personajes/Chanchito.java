package personajes;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeCemento;
import casas.CasaDelChanchitoDeMadera;
import herramienta.Herramienta;

public class Chanchito {

    private CasaDelChanchito casa;

    public Chanchito(CasaDelChanchito casaInicial){
        casa = casaInicial;
    }

    public void serAtacadoCon(Herramienta herramienta) {
        casa.serAtacadaCon(herramienta);
    }

    public void huirACasaDeMadera() {
        casa = new CasaDelChanchitoDeMadera();
    }

    public void huirACasaDeCemento() {
        casa = new CasaDelChanchitoDeCemento();
    }

    public boolean teDestruyeronLaCasa() {
        return casa.estaDestruida();
    }
}
