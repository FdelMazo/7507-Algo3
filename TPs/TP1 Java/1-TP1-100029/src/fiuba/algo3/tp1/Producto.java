package fiuba.algo3.tp1;

public class Producto {
    private String nombre = null;
    private int precio = 0;

    public Producto(String unNombre, int unPrecio){
        if (unPrecio < 0)
            throw new ProductoPrecioNegativoError();
        nombre = unNombre;
        precio = unPrecio;
    }

    public int getPrecio(){
        return precio;
    }

}