package main.ar.edu.fiuba.algoiii;

import java.util.List;

public class DosPorUno  implements Productos {
    private List<Productos> productos;

    public DosPorUno(List<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public void setCosto(int i) throws Exception {
        throw new Exception();
    }

    @Override
    public int getCosto() {
        int result = 0;

        for (Productos p: productos) {
            result += p.getCosto();
        }

        return result;
    }

    @Override
    public double setPrecio(int i, Moneda dollars) {


        return valorCotizacion(i, dollars) - getCosto();
    }

    private double valorCotizacion(int i, Moneda dollars) {
        if (dollars == Moneda.DOLLARS) {
            return i * 50;
        }

        return i;
    }
}
