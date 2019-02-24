package palabras;

import celdas.ICelda;

import java.util.ArrayList;
import java.util.List;

public class Palabra implements IPalabra {

    private static final int PUNTAJE_INICIAL = 0;
    private List<ICelda> celdas;

    public Palabra() {
    	this.celdas = new ArrayList<ICelda>();
    }

    @Override
    public void agregarCelda(ICelda celda){
        this.celdas.add(celda);
    }

    @Override
    public int puntaje() {
        int puntajeFinal = PUNTAJE_INICIAL;
        for (ICelda celda : this.celdas) {
    		puntajeFinal += celda.obtenerPesoCelda();
        }
        return puntajeFinal;
    }
}
 
