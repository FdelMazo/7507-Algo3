package ar.uba.fi.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {

    @Test
    public void unAlumnoPagaCuotaCompleta()
    {
        Alumno a = new Alumno();

        assertEquals(100, a.deuda());
    }

    @Test
    public void unAlmnoTieneUnHermanoEntoncesElHermanoPaga75PdeCuota() {
        Alumno ova = new Alumno("ova", new Alumno("gabi", "sabatini"));

        assertEquals(75, ova.deuda());
    }
}
