package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public class PartidoTordos extends Partido {

    private static PartidoTordos instancia = new PartidoTordos();

    private PartidoTordos() {
        NOMBRES = new ArrayList<>();
        NOMBRES.add("Tordos");
    }

    static PartidoTordos getInstancia() {
        return instancia;
    }

}
