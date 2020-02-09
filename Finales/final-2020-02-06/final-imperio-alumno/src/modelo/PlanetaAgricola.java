package modelo;

public class PlanetaAgricola implements Planeta {

    private int produccionPorHabitante;
    private int poblacion;

    public PlanetaAgricola(int produccionPorHabitante, int poblacion) {
        this.produccionPorHabitante = produccionPorHabitante;
        this.poblacion = poblacion;
    }

    public void calcularImpuesto(Imperio imperio) {
        imperio.calcularImpuesto(this, this.produccionPorHabitante * this.poblacion);
    }
}
