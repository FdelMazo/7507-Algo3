package modelo.aves;

import modelo.acciones.Cantante;
import modelo.acciones.Volador;

public class Gorrion implements Cantante, Volador {

    private final static String CANTO = "pio pio";
    private final static int COEFICIENTE_VUELO = 50;

    @Override
    public String cantar() {
        return CANTO;
    }

    @Override
    public int volar() {
        return COEFICIENTE_VUELO;
    }
}
