package fiuba.algo3.tiendaonline;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Pruebas {

    private static final double DELTA = 1e-15;



    @Test
    public void testCompraGrande() {
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);

        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        TiendaOnline tienda = new TiendaOnline();
        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);

        Pedido pedido = new Pedido();

        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioInternacional()); // se le aplica un recargo del 20%

        tienda.agregarCuponDeDescuento(Cupon.CYBER_MONDAY_50, pedido); // se le aplica un descuento del 50%

        assertEquals(6000, tienda.cobrarPedido(pedido), DELTA);
    }
}
