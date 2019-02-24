package palabras;

import celdas.Celda;
import celdas.ICelda;
import letras.Consonante;
import letras.Letra;
import org.junit.Test;
import reglas.IRegla;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PalabraTest {

    @Test
    public void testAgregarDosVecesLaMismaCeldaYRetornaUnaSolaVezSuValorEnElPuntajeFinal(){
        int peso = 1;
        Letra letra = new Consonante("b", 1, new ArrayList<IRegla>());
        ICelda celda = new Celda(letra);
        Palabra palabra = new Palabra();
        palabra.agregarCelda(celda);
        palabra.agregarCelda(celda);
        assertEquals(peso * Consonante.CONSTANTE_AUMENTO, palabra.puntaje());
    }
}
