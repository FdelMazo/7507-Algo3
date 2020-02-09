package modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Imperio implements Cobrador {

    private Collection<Planeta> planetas = new ArrayList<>();

    private int fondoAcumulado = 0;

    public void solicitarRemesaDeProduccion() {
        for (Planeta planetaAgricola : planetas) {
            planetaAgricola.calcularImpuesto(this);
        }
    }

    public void agregarPlaneta(Planeta planeta) {
        this.planetas.add(planeta);
    }

    public int getFondoAcumulado() {
        return this.fondoAcumulado;
    }

    public void calcularImpuesto(PlanetaAgricola planetaAgricola, int prodPlaneta){
        int remesa = (int) (prodPlaneta * 0.5);
        this.fondoAcumulado = this.fondoAcumulado + remesa;
    }

    public void calcularImpuesto(PlanetaMinero planetaMinero, int prodPlaneta){
        int remesa = (int) (prodPlaneta * 0.3);
        this.fondoAcumulado = this.fondoAcumulado + remesa;
    }

    public int robarPorcentajeDeRecaudacion(double porcentaje){
        int montoRobado = (int) (this.fondoAcumulado * porcentaje);
        this.fondoAcumulado -= montoRobado;
        return montoRobado;
    }
}
