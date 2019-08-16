package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public abstract class Partido {

    private int votos;
    protected ArrayList<String> NOMBRES;

    public void recibirVotos(int cantidad_de_votos) {
        votos = votos + cantidad_de_votos;
    }

    public int escrutar() {
        return votos;
    }

    public boolean seLlama(String leyendaPartido) {
        return NOMBRES.contains(leyendaPartido);
    }

    public void resetear() {
        votos = 0;
    }
}
