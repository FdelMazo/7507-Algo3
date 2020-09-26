import java.util.ArrayList;
import java.util.List;

public class Buscador {

    private List<Producto> productos;

    public Buscador() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> buscarPorNombre(String nombreBuscado, boolean exacto) {
        List<Producto> resultados = new ArrayList<Producto>();
        for (Producto producto: this.productos) {
            if (exacto) {
                if (producto.getNombre().equals(nombreBuscado)) {
                    resultados.add(producto);
                }
            } else {
                if (producto.getNombre().startsWith(nombreBuscado)) {
                    resultados.add(producto);
                }
            }
        }
        return resultados;
    }

    public List<Producto> buscarPorCategoria(String nombreBuscado, boolean exacto) {
        List<Producto> resultados = new ArrayList<Producto>();
        for (Producto producto: this.productos) {
            if (exacto) {
                if (producto.getCategoria().equals(nombreBuscado)) {
                    resultados.add(producto);
                }
            } else {
                if (producto.getCategoria().contains(nombreBuscado)) {
                    resultados.add(producto);
                }
            }
        }
        return resultados;
    }

    public List<Producto> buscarPorPrecio(float precioDesde, float precioHasta) {
        List<Producto> resultados = new ArrayList<Producto>();
        for (Producto producto: this.productos) {
            if (producto.getPrecio() >= precioDesde && producto.getPrecio() <= precioHasta) {
                resultados.add(producto);
            }
        }
        return resultados;
    }

}
