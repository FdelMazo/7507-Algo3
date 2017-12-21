package fiuba.algo3.tp1.unit.test;

import fiuba.algo3.tp1.AlgoBay;
import fiuba.algo3.tp1.CuponPorcentajeInvalidoError;
import fiuba.algo3.tp1.Producto;
import fiuba.algo3.tp1.ProductoNoPresenteError;
import org.junit.Assert;
import org.junit.Test;

public class AlgoBayTest {

    @Test
    public void testCrearAlgoBay(){
        Assert.assertNotNull(new AlgoBay());
    }

    @Test
    public void testCrearCompraDesdeAlgoBay() {
        AlgoBay unAlgoBay = new AlgoBay();
        Assert.assertNotNull(unAlgoBay.crearNuevaCompra());
    }

    @Test
    public void testGetProducto() {
        AlgoBay unAlgoBay = new AlgoBay();
        Producto unProducto = unAlgoBay.agregarProductoConPrecio("unNombre", 100);
        Assert.assertEquals(unProducto, unAlgoBay.getProducto("unNombre"));
    }
    @Test(expected = ProductoNoPresenteError.class)
    public void testGetProductoInexistenteLanzaErrorProductoNoPresente() {
        AlgoBay unAlgoBay = new AlgoBay();
        unAlgoBay.getProducto("unNombre");
    }

    @Test
    public void testGetCantidadDeProductos() {
        AlgoBay unAlgoBay = new AlgoBay();
        unAlgoBay.agregarProductoConPrecio("unNombre", 100);
        unAlgoBay.agregarProductoConPrecio("otroNombre", 100);
        Assert.assertEquals(2, unAlgoBay.getCantidadDeProductos());
    }

    @Test(expected = CuponPorcentajeInvalidoError.class)
    public void testCrearCuponConPrecioNegativoDesdeAlgoBayLanzaError() {
        AlgoBay unAlgoBay = new AlgoBay();
        Assert.assertNotNull(unAlgoBay.crearCuponConPorcentaje(-10));
    }


}
