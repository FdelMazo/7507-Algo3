package fiuba.algo3.tiendaonline;

public class EnvioLocal extends Envio {

    @Override
    public double getRecargo() {
        return 1.1;
    }

    @Override
    public double agregarRecargo(double precioDelPedido) {
        return 1.1 * precioDelPedido;
    }
}
