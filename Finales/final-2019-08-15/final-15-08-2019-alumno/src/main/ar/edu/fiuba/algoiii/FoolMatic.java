package main.ar.edu.fiuba.algoiii;

import java.util.ArrayList;

public class FoolMatic {

    private final int RATIO = 10;
    private final int VOTOS_REGALADOS = 10;
    private ArrayList<Partido> partidos;

    public FoolMatic() {
        partidos = new ArrayList<>();
        partidos.add(PartidoTordos.getInstancia());
        partidos.add(PartidoPoR.getInstancia());
        partidos.add(PartidoFIUBA.getInstancia());
    }

    public void votar(String leyendaPartido) throws NoExistePartidoException {
        votar(leyendaPartido, 1);
    }

    public void votar(String leyendaPartido, int cantidad_de_votos) throws NoExistePartidoException {
        getPartido(leyendaPartido).recibirVotos(cantidad_de_votos);

        for (Partido partido: partidos) {
            if (pierdePorMucho(partido)) {
                partido.recibirVotos(VOTOS_REGALADOS);
            }
        }
    }

    private boolean pierdePorMucho(Partido partido) {
        for (Partido otroPartido: partidos) {
            if (partido == otroPartido) { continue; }
            int votos = partido.escrutar();
            if (votos > 0 && votos < otroPartido.escrutar() * RATIO) {
                return true;
            }
        }
        return false;
    }

    public int escrutinio(String leyendaPartido) throws NoExistePartidoException {
        return getPartido(leyendaPartido).escrutar();
    }

    private Partido getPartido(String leyendaPartido) throws NoExistePartidoException {
        for (Partido partido: partidos) {
            if (partido.seLlama(leyendaPartido)) {
                return partido;
            }
        }
        throw new NoExistePartidoException();
    }

    public void resetear() {
        for (Partido partido: partidos) {
            partido.resetear();
            }
    }
}
