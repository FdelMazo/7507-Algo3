package test;

import SistemaDeInversiones.InversionBitcon;
import SistemaDeInversiones.InversionNoNula;
import SistemaDeInversiones.InversionNula;
import modelo.InversionistaArriesgado;
import modelo.InversionistaConservador;
import modelo.InversionistasAgresivos;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class InversionTest {

    @Test
    public void testCreoUnaInversionYSeCreaCorrectamente(){
        InversionNula inversionNula = new InversionNula();
        assertNotNull("Se creo correctamente la inversion", inversionNula);
    }

    @Test
    public void testCreoUnaInversionNoNulaYVerificoQueSeCreoCorrectamente(){
        InversionNoNula inversionNoNula = new InversionNoNula();
        assertNotNull("Se creo correctamente la inversion", inversionNoNula);
    }
    @Test
    public void testCreoUnaInversionBitcoinYVerificoQueSeCreoCorrectamente(){
        InversionBitcon inversionBitcon = new InversionBitcon();
        assertNotNull("Se creo correctamente la inversion", inversionBitcon);
    }

    @Test
    public void testCreoUnInversionistaConservadorYRealizoUnaInversionNoNulaDe100PesosYObtengo100(){
        InversionNoNula inversionNoNula = new InversionNoNula();
        InversionistaConservador conservador = new InversionistaConservador();
        assertEquals("Al hacer una inversion Conservadora no nula de 100 pesos y obtengo 100", 100, inversionNoNula.calcularInversion(100, conservador));
    }

    @Test
    public void testCreoUnInversionistaConservadorYRealizoUnaInversioNulaDe100PesosYObtengo200(){
        InversionNula inversionNula = new InversionNula();
        InversionistaConservador conservador = new InversionistaConservador();
        assertEquals("Al hacer una inversion Conservadora nula de 100 pesos y obtengo 200", 200, inversionNula.calcularInversion(100, conservador));
    }

    @Test
    public void testCreoUnInversionistaConservadorYRealizoUnaInversionBitcoinDe100PesosYObtengo100(){
        InversionBitcon inversionBitcon = new InversionBitcon();
        InversionistaConservador conservador = new InversionistaConservador();
        assertEquals("Al hacer una inversion Conservador bitcon de 100 pesos y obtengo 100", 100, inversionBitcon.calcularInversion(100, conservador));
    }


    @Test
    public void testCreoUnaInversionistaArriesgadoYRealizoUnInversionNulaDe100PesosYObtengo200(){
        InversionNula inversionNula = new InversionNula();
        InversionistaArriesgado arriesgado = new InversionistaArriesgado();
        assertEquals("Al hacer una inversion Arriesgado nula de 100 pesos y obtengo 200", 200, inversionNula.calcularInversion(100, arriesgado));
    }


    @Test
    public void testCreoUnaInversionistaArriesgadoYRealizoUnaInversionNoNulaDe100PesosYObtengo300(){
        InversionNoNula inversionNoNula = new InversionNoNula();
        InversionistaArriesgado arriesgado = new InversionistaArriesgado();
        assertEquals("Al hacer una inversion Arriesgado nula de 100 pesos y obtengo 300", 300, inversionNoNula.calcularInversion(100, arriesgado));
    }

    @Test
    public void testCreoUnaInversionistaArriesgadoBitcoinDe100PesosYObtengo100(){
        InversionBitcon inversionBitcon = new InversionBitcon();
        InversionistaArriesgado arriesgado = new InversionistaArriesgado();
        assertEquals("Al hacer una inversion Arriesgado nula de 100 pesos y obtengo 100", 100, inversionBitcon.calcularInversion(100, arriesgado));
    }


    @Test
    public void testCreoUnInversionistaAgresivoYHagoUnaInversionBitcoinDe100PesosYObtengo400(){
        InversionBitcon inversionBitcon = new InversionBitcon();
        InversionistasAgresivos agresivos = new InversionistasAgresivos();
        assertEquals("Al hacer inversion Agresivo bitcoin de 100 pesos obtengo 400", 400, inversionBitcon.calcularInversion(100,agresivos));
    }

}
