package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.DosPorUno;
import main.ar.edu.fiuba.algoiii.Gaseosa;
import main.ar.edu.fiuba.algoiii.Moneda;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class PitufosTest {
    @Test
    public void test2() {
        Gaseosa c = new Gaseosa();

        c.setCosto(100);

        double renta = c.setPrecio(200, Moneda.PESOS);

        assertEquals(renta, 100.0);
    }

    @Test
    public void test3() {
        Gaseosa gaseosa01 = new Gaseosa();
        Gaseosa gaseosa02 = new Gaseosa();
        DosPorUno combo = new DosPorUno(Arrays.asList(gaseosa01, gaseosa02));

        // combo.setCosto(200);
        gaseosa01.setCosto(100);
        gaseosa02.setCosto(100);

        double renta = combo.setPrecio(1200, Moneda.PESOS);

        assertEquals(1000.0, renta);
    }

    @Test
    public void test4() {
        Gaseosa gaseosa = new Gaseosa();
        gaseosa.setCosto(100);

        double renta = gaseosa.setPrecio(10, Moneda.DOLLARS);

        assertEquals(400.0, renta);
    }

}
