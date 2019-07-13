package main.ar.edu.fiuba.algoiii;

public class Gaseosa implements Productos {
    private int costo;

    @Override
    public double setPrecio(int i, Moneda dollars) {
        return valorCotizacion(i,dollars) - costo;
    }

    @Override
    public void setCosto(int i) {
        costo = i;
    }

    @Override
    public int getCosto() {
        return costo;
    }


    private double valorCotizacion(int i, Moneda dollars) {
        if ( dollars == Moneda.DOLLARS) {
            return i * 50;
        }

        return i;
    }
}
