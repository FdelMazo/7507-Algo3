package Efectos;

import Exceptions.CadenaVaciaException;

import java.util.ArrayList;
import java.util.List;

public class ContenedorEfectos {

    private List<Efecto> efectos = new ArrayList<>();

    public String aplicarA(String unaCadena){
        if (unaCadena.equals(""))
            throw new CadenaVaciaException();

        for (Efecto efecto : efectos)
            unaCadena = efecto.aplicarEfecto(unaCadena);

        return unaCadena;
    }

    public void agregarEfecto(Efecto efecto){
        this.efectos.add(efecto);
    }
}
