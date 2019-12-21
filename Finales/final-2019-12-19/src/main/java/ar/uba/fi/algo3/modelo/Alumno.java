package ar.uba.fi.algo3.modelo;

public class Alumno {
    private static final double CUOTA = 100.0;

    private final Alumno hermano;
    private String nombre;
    private String apellido;

    public Alumno() {
        this.nombre = "NN";
        this.apellido = "NN";

        this.hermano = null;
    }

    public Alumno(String nombre, Alumno hermano) {
        this.nombre = nombre;
        this.apellido = hermano.apellido;
        this.hermano = hermano;
    }

    public Alumno(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.hermano = null;
    }

    public Alumno(Alumno hermano) {

        this.hermano = hermano;

    }

    public Double deuda() {

        if (this.hermano == null) {
            return CUOTA;
        }

        if ( this.hermano != null &&
            this.apellido.equals(this.hermano.apellido)
        ) {
            return .75 * CUOTA;
        }

        return CUOTA;
    }
}
