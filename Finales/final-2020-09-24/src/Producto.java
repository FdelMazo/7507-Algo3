public class Producto {

    private String nombre;
    private float precio;
    private String categoria;

    public Producto(String nombre, float precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

}
