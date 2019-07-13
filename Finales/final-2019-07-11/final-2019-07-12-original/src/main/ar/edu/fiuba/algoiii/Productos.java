package main.ar.edu.fiuba.algoiii;

public interface Productos {
    void setCosto(int i) throws Exception;

    int getCosto();

    double setPrecio(int i, Moneda dollars);
}