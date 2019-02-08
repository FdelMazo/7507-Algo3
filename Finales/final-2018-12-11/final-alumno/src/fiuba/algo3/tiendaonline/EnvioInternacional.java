package fiuba.algo3.tiendaonline;

public class EnvioInternacional extends Envio {

    @Override
    public double getRecargo() {
        return 1.2;
    }

    @Override
    public double agregarRecargo(double precioDelPedido) {
        return 1.2*precioDelPedido;
    }
}
