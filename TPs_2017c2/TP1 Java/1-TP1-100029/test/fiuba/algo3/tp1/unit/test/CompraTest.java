package fiuba.algo3.tp1.unit.test;

import fiuba.algo3.tp1.Compra;
import fiuba.algo3.tp1.Envio;
import fiuba.algo3.tp1.Cupon;
import fiuba.algo3.tp1.Garantia;
import org.junit.Assert;
import org.junit.Test;

public class CompraTest {

    @Test
    public void testCrearCompra(){
        Assert.assertNotNull(new Compra());    }

    @Test
    public void testCalcularPrecioTotalCompraSimple() {
        Compra compra = new Compra();
        compra.agregarPrecio(10);
        compra.agregarPrecio(10);
        Assert.assertEquals(20, compra.calcularPrecioTotal(),0);
    }

    @Test
    public void testCalcularPrecioCompraConEnvio() {
        Compra compra = new Compra();
        compra.agregarAdicionable(new Envio());
        compra.agregarPrecio(100);
        Assert.assertEquals(200, compra.calcularPrecioTotal(), 0);
    }
    @Test
    public void testCalcularPrecioCompraConGarantia() {
        Compra compra = new Compra();
        compra.agregarAdicionable(new Garantia());
        compra.agregarPrecio(100);
        Assert.assertEquals(100*1.1, compra.calcularPrecioTotal(), 0);
    }

    @Test
    public void testConservarMayorCupon() {
        Compra compra = new Compra();
        compra.agregarCupon(new Cupon(10));
        compra.agregarCupon(new Cupon(20));
        compra.agregarPrecio(100);
        Assert.assertEquals(80, compra.calcularPrecioTotal(), 0);
    }
}
