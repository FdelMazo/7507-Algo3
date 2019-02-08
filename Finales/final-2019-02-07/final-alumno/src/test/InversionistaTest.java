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

public class InversionistaTest {

    @Test
    public void testCreoUnInversionistaArriesgadoYSeCreaCorrectamente(){
        InversionistaArriesgado inversionistaArriesgado = new InversionistaArriesgado();
        assertNotNull("Se creo correctamente el inversionista", inversionistaArriesgado);
    }

    @Test
    public void testCreoUnaInversionistaConservadorYVerificoQueSeCreoCorrectamente(){
        InversionistaConservador inversionistaConservador = new InversionistaConservador();
        assertNotNull("Se creo correctamente el inversionista", inversionistaConservador);
    }
    @Test
    public void testCreoUnaInversionistaAgresivoYVerificoQueSeCreoCorrectamente(){
        InversionistasAgresivos inversionistasAgresivos = new InversionistasAgresivos();
        assertNotNull("Se creo correctamente el inversionista", inversionistasAgresivos);
    }

    @Test
    public void testCreoUnInversionistaConservadorYRealizoUnaInversionNoNulaDe100PesosYObtengo100(){
        InversionistaConservador conservador = new InversionistaConservador();
        InversionNoNula inversionNoNula = new InversionNoNula();
        assertEquals("Al hacer una inversion Conservadora no nula de 100 pesos y obtengo 100", 100, conservador.calcular(100, inversionNoNula));
    }

    @Test
    public void testCreoUnInversionistaConservadorYRealizoUnaInversioNulaDe100PesosYObtengo200(){
        InversionistaConservador conservador = new InversionistaConservador();
        InversionNula inversionNula = new InversionNula();
        assertEquals("Al hacer una inversion Conservadora nula de 100 pesos y obtengo 200", 200, conservador.calcular(100, inversionNula));
    }

    @Test
    public void testCreoUnInversionistaConservadorYRealizoUnaInversionBitcoinDe100PesosYObtengo100(){
        InversionistaConservador conservador = new InversionistaConservador();
        InversionBitcon inversionBitcon = new InversionBitcon();
        assertEquals("Al hacer una inversion Conservador bitcon de 100 pesos y obtengo 100", 100, conservador.calcular(100, inversionBitcon));
    }


    @Test
    public void testCreoUnaInversionistaArriesgadoYRealizoUnInversionNulaDe100PesosYObtengo200(){
        InversionistaArriesgado arriesgado = new InversionistaArriesgado();
        InversionNula inversionNula = new InversionNula();
        assertEquals("Al hacer una inversion Arriesgado nula de 100 pesos y obtengo 200", 200, arriesgado.calcular(100, inversionNula));
    }


    @Test
    public void testCreoUnaInversionistaArriesgadoYRealizoUnaInversionNoNulaDe100PesosYObtengo300(){
        InversionistaArriesgado arriesgado = new InversionistaArriesgado();
        InversionNoNula inversionNoNula = new InversionNoNula();
        assertEquals("Al hacer una inversion Arriesgado nula de 100 pesos y obtengo 300", 300, arriesgado.calcular(100, inversionNoNula));
    }

    @Test
    public void testCreoUnaInversionistaArriesgadoBitcoinDe100PesosYObtengo100(){
        InversionistaArriesgado arriesgado = new InversionistaArriesgado();
        InversionBitcon inversionBitcon = new InversionBitcon();
        assertEquals("Al hacer una inversion Arriesgado nula de 100 pesos y obtengo 100", 100, arriesgado.calcular(100, inversionBitcon));
    }


    @Test
    public void testCreoUnInversionistaAgresivoYHagoUnaInversionBitcoinDe100PesosYObtengo400(){
        InversionistasAgresivos agresivos = new InversionistasAgresivos();
        InversionBitcon inversionBitcon = new InversionBitcon();
        assertEquals("Al hacer inversion Agresivo bitcoin de 100 pesos obtengo 400", 400, agresivos.calcular(100, inversionBitcon));
    }

}
