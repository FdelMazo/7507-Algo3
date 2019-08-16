package main.ar.edu.fiuba.algoiii;

public class FoolMatic {
    public int votosPartidoPoR = 0;
    public int votosPartidoTordos = 0;

    public void votar(String leyendaPartido) {
        if (leyendaPartido.equals("Tordos")) {
            votosPartidoTordos = votosPartidoTordos + 1;
        }
        if (leyendaPartido.equals("PoR")) {
            votosPartidoPoR = votosPartidoPoR + 1;
        }
    }

    public int escrutinio(String leyendaPartido) {
        if (leyendaPartido.equals("Tordos")) {
            return votosPartidoTordos;
        }

        return votosPartidoPoR;

    }

    public void votar(String leyendaPartido, int numeroVotos) {
        if (leyendaPartido.equals("Tordos")) {
            votosPartidoTordos = votosPartidoTordos + numeroVotos;
        }
        if (leyendaPartido.equals("PoR")) {
            votosPartidoPoR = votosPartidoPoR + numeroVotos;
        }

        if ( esLaDiferenciaTordosDiezVecesMayoraPoR(votosPartidoTordos, votosPartidoPoR)) {
            votosPartidoPoR += 10;
        }
    }

    private boolean esLaDiferenciaTordosDiezVecesMayoraPoR(int votosPartidoTordos, int votosPartidoPoR) {
        return ( votosPartidoTordos > votosPartidoPoR * 10);
    }
}
