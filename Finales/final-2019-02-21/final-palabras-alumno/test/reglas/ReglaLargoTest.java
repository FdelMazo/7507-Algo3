package reglas;

import excepciones.LargoInvalidoExcepcion;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class ReglaLargoTest {

    @Test(expected = LargoInvalidoExcepcion.class)
    public void pasoUnaPalabraConUnLargoInvalidoYRetornaExcepcion(){
        ReglaLargo reglaLargo = new ReglaLargo();
        reglaLargo.verificar("AA", 1);
    }

    @Test
    public void palabraConLargoValidoYRetornaCorrecto(){
        ReglaLargo reglaLargo = new ReglaLargo();
        assertTrue(reglaLargo.verificar("A", 1));
    }

    @Test
    public void palabraConLargoValidoYUnPesoNuloNoAfectaALaVerificacionDelLargo(){
        ReglaLargo reglaLargo = new ReglaLargo();
        assertTrue(reglaLargo.verificar("A", -1));
    }
}
