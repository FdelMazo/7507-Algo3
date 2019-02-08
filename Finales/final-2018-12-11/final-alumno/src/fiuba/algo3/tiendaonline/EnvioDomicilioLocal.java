package fiuba.algo3.tiendaonline;

public class EnvioDomicilioLocal extends Envio {

    @Override
    public double getRecargo() {
        return 0;
    }

    @Override
    public double agregarRecargo(double precioDelPedido) {
        return precioDelPedido;
    }
}
