package modelo.aves;

import modelo.acciones.Corredor;
import modelo.superficie.Superficie;
import modelo.superficie.SuperficieBarro;
import modelo.superficie.SuperficieHielo;
import modelo.superficie.SuperficiePistaAtletismo;

public class Avestruz implements Corredor {

    private static final int COEFICIENTE_BARRO = 70;
    private static final int COEFICIENTE_HIELO = 0;
    private static final int COEFICIENTE_PISTA_ATLETISMO = 70;

    @Override
    public int correr(Superficie superficie) {
        return superficie.deslizar(this);
    }

    @Override
    public int correr(SuperficieBarro superficie) {
        return COEFICIENTE_BARRO;
    }

    @Override
    public int correr(SuperficieHielo superficie) {
        return COEFICIENTE_HIELO;
    }

    @Override
    public int correr(SuperficiePistaAtletismo superficie) {
        return COEFICIENTE_PISTA_ATLETISMO;
    }
}
