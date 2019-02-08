package modelo;

import SistemaDeInversiones.Inversion;

public class InversionistaArriesgado implements Inversionista {

    public int calcular (int monto, Inversion inversion) {
        return inversion.calcularInversion(monto, this);
    }
}
