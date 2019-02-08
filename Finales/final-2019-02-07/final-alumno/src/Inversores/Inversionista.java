package modelo;

import SistemaDeInversiones.Inversion;

public interface Inversionista {

    public abstract int calcular (int monto, Inversion inversion);
}
