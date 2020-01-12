package fiuba.algo3.tp1.unit.test;

import fiuba.algo3.tp1.Envio;
import fiuba.algo3.tp1.Garantia;
import org.junit.Assert;
import org.junit.Test;

public class AdicionablesTest {

    @Test
    public void testCrearEnvio() {
        Assert.assertNotNull(new Envio());
    }

    @Test
    public void testEnvioSimpleSuma100() {
        Envio envio = new Envio();
        Assert.assertEquals(200.0, envio.calcularPrecio(100.0),0); ;
    }

    @Test
    public void testEnvioNoAplicaEnMayorA5000() {
        Envio envio = new Envio();
        Assert.assertEquals(5000, envio.calcularPrecio(5000),0); ;
    }

    @Test
    public void testCrearGarantia() {
        Assert.assertNotNull(new Garantia());
    }

    @Test
    public void testGarantiaAdiciona10Porciento() {
        Garantia garantia = new Garantia();
        Assert.assertEquals(100*1.1, garantia.calcularPrecio(100.0),1e-15);
    }
}