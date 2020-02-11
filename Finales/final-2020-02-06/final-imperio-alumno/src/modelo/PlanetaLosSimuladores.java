package modelo;

public class PlanetaLosSimuladores implements Planeta {
    private int prodRobada;

    public PlanetaLosSimuladores(){
        prodRobada = 0;
    }

    @Override
    public void calcularImpuesto(Imperio imp) {
        int montoRobado = imp.robarPorcentajeDeRecaudacion(0.5);
        this.prodRobada += montoRobado;
    }

    public int getProdRobada(){
        return prodRobada;
    }
}
