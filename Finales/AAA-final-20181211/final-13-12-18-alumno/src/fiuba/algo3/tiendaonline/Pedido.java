package fiuba.algo3.tiendaonline;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<String> productos = new ArrayList<String>();
    private double precioDelPedido = 0;

    public void agregarProductoAlPedido(String nombreDelProducto, double precio){
        productos.add(nombreDelProducto);
        precioDelPedido += precio;
        System.out.println("Se ha agregado un producto al pedido.");
    }

    public void agregarCupon(Cupon cupon) {
        if (cupon == Cupon.BLACK_FRIDAY_85) {
            precioDelPedido *= 0.15; // se aplica descuento del 85%
        } else if (cupon == Cupon.CYBER_MONDAY_50) {
            precioDelPedido *= 0.5;  // se aplica descuento del 50%
        } else if (cupon == Cupon.MERRY_CHRISTMAS_25) {
            precioDelPedido *= 0.75; // se aplica descuento del 25%
        } else {
            System.out.println("ERROR: Cupon invalido!");
        }
        System.out.println("Se ha agregado un descuento al pedido.");
    }

    public double cobrar() {
        productos.clear();
        double precioDelPedido = this.precioDelPedido;
        this.precioDelPedido = 0;
        System.out.println("Se ha cobrado el pedido");
        return precioDelPedido;
    }

    public void agregarEnvio(Envio envio) {
        precioDelPedido = envio.agregarRecargo(this.precioDelPedido);
        System.out.println("Se ha agregado un envio al pedido");
    }
}


