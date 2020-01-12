package fiuba.algo3.tp1;

import java.util.Hashtable;

public class AlgoBay {
    private Hashtable<String, Producto> productos = new Hashtable<String, Producto>();

    public int getCantidadDeProductos(){
        return productos.size();
    }

    public Producto agregarProductoConPrecio(String unNombre, int unPrecio){
        Producto producto = new Producto(unNombre, unPrecio);
        productos.put(unNombre, producto);
        return producto;
    }

    public Producto getProducto(String unNombre) throws ProductoNoPresenteError{
        if (!productos.containsKey(unNombre))
            throw new ProductoNoPresenteError();
        return productos.get(unNombre);
    }

    public Compra crearNuevaCompra(){
        return new Compra();
    }

    public Compra crearNuevaCompraConEnvio(){
        Compra compra = new Compra();
        compra.agregarAdicionable(new Envio());
        return compra;
    }

    public Compra crearNuevaCompraConGarantia(){
        Compra compra = new Compra();
        compra.agregarAdicionable(new Garantia());
        return compra;
    }

    public Compra crearNuevaCompraConEnvioYGarantia(){
        Compra compra = new Compra();
        compra.agregarAdicionable(new Garantia());
        compra.agregarAdicionable(new Envio());
        return compra;
    }

    public void agregarProductoEnCompra(Producto unProducto, Compra unaCompra){
        unaCompra.agregarPrecio(unProducto.getPrecio());
    }

    public double getPrecioTotalDe(Compra unaCompra){
        return unaCompra.calcularPrecioTotal();
    }

    public Cupon crearCuponConPorcentaje(double unPorcentaje){
        return new Cupon(unPorcentaje);
    }

    public void agregarCuponEnCompra(Cupon unCupon, Compra unaCompra){
        unaCompra.agregarCupon(unCupon);
    }

}
