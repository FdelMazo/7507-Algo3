package fiuba.algo3.tp1.unit.test;

import fiuba.algo3.tp1.Cupon;
import fiuba.algo3.tp1.CuponPorcentajeInvalidoError;
import org.junit.Assert;
import org.junit.Test;

public class CuponTest {

    @Test
    public void testCrearCupon() {
        Assert.assertNotNull(new Cupon(10));
    }

    @Test(expected = CuponPorcentajeInvalidoError.class)
    public void testCrearCuponConPorcentajeInvalidoLanzaError() {
        new Cupon(-10);
    }

    @Test
    public void testCuponDescuentaUnPorcentaje() {
        Cupon cupon10 = new Cupon(10);
        Assert.assertEquals(90.0, cupon10.calcularPrecio(100), 0);
    }

    @Test
    public void testCupon10EsMayorACupon5() {
        Cupon cupon10 = new Cupon(10);
        Cupon cupon5 = new Cupon(5);
        Assert.assertTrue(cupon10.esMayorQue(cupon5));
    }
}