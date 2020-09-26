import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BuscadorTest {

    @Test
    public void testBusquedaPorNombreExacto() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultados = buscador.buscarPorNombre("lapiz", true);

        Assert.assertEquals(Arrays.asList(lapiz), resultados);
    }

    @Test
    public void testBusquedaPorNombreAproximado() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultados = buscador.buscarPorNombre("pelo", false);

        Assert.assertEquals(Arrays.asList(pelota, pelopincho), resultados);
    }

    @Test
    public void testBusquedaPorCategoriaAproximada() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultados = buscador.buscarPorCategoria("aire", false);

        Assert.assertEquals(Arrays.asList(pelota, pelopincho), resultados);
    }

    @Test
    public void testBusquedaPorPrecio() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultados = buscador.buscarPorPrecio(30, 600);

        Assert.assertEquals(Arrays.asList(pelota, lapiz), resultados);
    }

}
