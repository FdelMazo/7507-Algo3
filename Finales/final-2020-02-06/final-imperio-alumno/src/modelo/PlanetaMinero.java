package modelo;

public class PlanetaMinero implements Planeta {
    private int poblacion;

    public PlanetaMinero(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public void calcularImpuesto(Imperio imp) {
        imp.calcularImpuesto(this, poblacion / 2);
    }
}
