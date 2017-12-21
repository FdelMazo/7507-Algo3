package fiuba.algo3.tp1.unit.test;

import fiuba.algo3.tp1.Producto;
import fiuba.algo3.tp1.ProductoPrecioNegativoError;
import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {

    @Test
    public void testCrearProducto() {
        Assert.assertNotNull(new Producto("unProducto", 10));
    }

    @Test(expected = ProductoPrecioNegativoError.class)
    public void testCrearProductoConPrecioNegativoLanzaError() {
        new Producto("unProducto", -10);
    }

    @Test
    public void testGetPrecioProducto() {
        Producto producto = new Producto("unProducto", 110);
        Assert.assertEquals(110, producto.getPrecio(), 0);
    }
}
