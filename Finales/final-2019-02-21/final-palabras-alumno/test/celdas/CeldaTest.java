package celdas;

import letras.Consonante;
import letras.Letra;
import org.junit.Test;
import reglas.IRegla;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class CeldaTest {

    @Test
    public void testearCeldaCreadaCorrectamente(){
        Letra letra = new Consonante("b", 1, new ArrayList<IRegla>());
        ICelda celda = new Celda(letra);
        assertNotNull(celda);
    }

    @Test
    public void testeoUsoUnaVezUnaCeldaYMeRetornaSuPeso(){
        int peso = 1;
        Letra letra = new Consonante("b", peso, new ArrayList<IRegla>());
        ICelda celda = new Celda(letra);
        assertEquals(peso, celda.obtenerPesoCelda());
    }

    @Test
    public void UsoDosVecesLaCeldaYMeRetornaUnValorNulo(){
        int peso = 1;
        Letra letra = new Consonante("b", peso, new ArrayList<IRegla>());
        ICelda celda = new Celda(letra);
        celda.obtenerPesoCelda();
        assertEquals(0, celda.obtenerPesoCelda());
    }
}
