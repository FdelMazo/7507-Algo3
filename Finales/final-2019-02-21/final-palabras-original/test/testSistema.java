package test;

import main.Celda;
import main.Palabra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class testSistema {

    @Test
    public void testPitufo() {

    	// Tablero
        Celda celda_1_1 = new Celda();
        Celda celda_1_2 = new Celda();
        Celda celda_2_2 = new Celda();

        // Primera Palabra
        Palabra primera = new Palabra();
        celda_1_1.setLetra("A");
        celda_1_1.setPeso(1);
        primera.celdas.add(celda_1_1);
        celda_1_2.setLetra("L");
        celda_1_2.setPeso(1);
        primera.celdas.add(celda_1_2);
        
        assertEquals(2, primera.puntaje());

        // Segunda palabra
        Palabra segunda = new Palabra();
        celda_1_2.setLetra("L");
        celda_1_2.setPeso(1);
        segunda.celdas.add(celda_1_2);
        celda_2_2.setLetra("O");
        celda_2_2.setPeso(1);
        segunda.celdas.add(celda_2_2);
       
        assertEquals(1, segunda.puntaje());


        // @TODO Cambio de requermiento: Si la celda contiene un vocal -> duplica el peso

    }
}

