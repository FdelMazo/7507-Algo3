package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public class PartidoPoR extends Partido {

    private static PartidoPoR instancia = new PartidoPoR();

    private PartidoPoR() {
        NOMBRES = new ArrayList<>();
        NOMBRES.add("PoR");
        NOMBRES.add("POR");
        NOMBRES.add("pOr");
        NOMBRES.add("PxR");
    }

    static PartidoPoR getInstancia() {
        return instancia;
    }
}
