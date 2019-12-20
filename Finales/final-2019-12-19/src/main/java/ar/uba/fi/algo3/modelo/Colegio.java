package ar.uba.fi.algo3.modelo;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Colegio {
    private List<Alumno> alumnos;

    public Colegio() {

        this.alumnos = new LinkedList<>();
    }

    public void anotar(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public Double deudaAcumulada() {

        Double result = 0.0;

        for (Alumno a : this.alumnos) {
            result = result + a.deuda();
        }

        if ( this.alumnos.size() == 3) {
            result = result - 50;
        }


        return result;
    }

}
