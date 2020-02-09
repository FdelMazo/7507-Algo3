package modelo;

public interface Cobrador {
    void calcularImpuesto(PlanetaAgricola planetaAgricola, int prodPlaneta);
    void calcularImpuesto(PlanetaMinero planetaMinero, int prodPlaneta);
}
