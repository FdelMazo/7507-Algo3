package main;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

    public List<Celda> celdas;

    public Palabra() {

    	this.celdas = new ArrayList<Celda>();
    }


    public int puntaje() {

        int result = 0;

        for (Celda c : this.celdas) {
        	
    		result += c.getPesoLetra();

        }

        return result;
    }
}
 
