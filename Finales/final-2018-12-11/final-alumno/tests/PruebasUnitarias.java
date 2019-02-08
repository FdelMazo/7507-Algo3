import fiuba.algo3.tiendaonline.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PruebasUnitarias {
    private static final double DELTA = 1e-15;

    @Test
    public void testCrearTiendaGrabaElNombre() {
        TiendaOnline tienda = new TiendaOnline();

        tienda.setNombre("Lo de Carlos");

        assertEquals("Lo de Carlos", tienda.getNombre());
    }

    @Test
    public void testTiendaGuardaProductosCorrectamente() {
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);

        TiendaOnline tienda = new TiendaOnline();

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);

        assertNotEquals(tienda.getStockProductos("Raspberry Pi 3"), null);
        assertNotEquals(tienda.getPrecioProducto("Raspberry Pi 3"), null);
    }

    @Test
    public void testEnvioInternacional() {
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        TiendaOnline tienda = new TiendaOnline();

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);

        Pedido pedido = new Pedido();

        tienda.agregarProductoAlPedido(pedido, "Raspberry Pi 3", 1);

        tienda.agregarEnvio(pedido, new EnvioInternacional());

        assertEquals(4200.00, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testEnvioLocal() {
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        TiendaOnline tienda = new TiendaOnline();

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);

        Pedido pedido = new Pedido();

        tienda.agregarProductoAlPedido(pedido, "Raspberry Pi 3", 1);

        tienda.agregarEnvio(pedido, new EnvioLocal());

        assertEquals(3850.0000000000005, tienda.cobrarPedido(pedido), DELTA);

    }

    @Test
    public void testEnvioDomicilioLocal() {
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        TiendaOnline tienda = new TiendaOnline();

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);

        Pedido pedido = new Pedido();

        tienda.agregarProductoAlPedido(pedido, "Raspberry Pi 3", 1);

        tienda.agregarEnvio(pedido, new EnvioDomicilioLocal());

        assertEquals(3500, tienda.cobrarPedido(pedido), DELTA);

    }
}
