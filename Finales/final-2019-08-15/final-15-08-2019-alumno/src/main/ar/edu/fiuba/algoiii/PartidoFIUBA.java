package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public class PartidoFIUBA extends Partido {

    private static PartidoFIUBA instancia = new PartidoFIUBA();

    private PartidoFIUBA() {
        NOMBRES = new ArrayList<>();
        NOMBRES.add("FIUBA");
        NOMBRES.add("Fiuba");
        NOMBRES.add("fiuba");
    }

    public static PartidoFIUBA getInstancia() {
        return instancia;
    }
}
