package modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Imperio {

    private Collection<PlanetaAgricola> planetas = new ArrayList<>();

    private int fondoAcumulado = 0;

    public void solicitarRemesaDeProduccion() {

        int totalSolicitado = 0;

        for (PlanetaAgricola planetaAgricola : planetas) {
            int produccionDelPlaneta = planetaAgricola.producir();
            int remesa = (int) (produccionDelPlaneta * 0.5);
            totalSolicitado = totalSolicitado + remesa;
        }

        this.fondoAcumulado = this.fondoAcumulado + totalSolicitado;
    }

    public void agregarPlaneta(PlanetaAgricola planetaAgricola) {
        this.planetas.add(planetaAgricola);
    }

    public int getFondoAcumulado() {
        return this.fondoAcumulado;
    }
}
