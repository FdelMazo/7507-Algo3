package reglas;

import excepciones.PesoNoPuedeSerNegativoExcepcion;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ReglaPesoTest {

    @Test
    public void verificacionCorrectaConPesoMayorACero(){
        ReglaPeso reglaPeso = new ReglaPeso();
        assertTrue(reglaPeso.verificar("A",10));
    }

    @Test(expected = PesoNoPuedeSerNegativoExcepcion.class)
    public void lanzaExcepcionConPesoMenorA0(){
        ReglaPeso reglaPeso = new ReglaPeso();
        reglaPeso.verificar("A",-10);
    }

    @Test
    public void noLanzaExcepcionConPesoCero(){
        ReglaPeso reglaPeso = new ReglaPeso();
        assertTrue(reglaPeso.verificar("A",0));
    }
}
