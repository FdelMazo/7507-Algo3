package modelo;

public class PlanetaAgricola {

    private int produccionPorHabitante;
    private int poblacion;

    public PlanetaAgricola(int produccionPorHabitante, int poblacion) {
        this.produccionPorHabitante = produccionPorHabitante;
        this.poblacion = poblacion;
    }

    public int producir() {
        return this.produccionPorHabitante * this.poblacion;
    }
}
