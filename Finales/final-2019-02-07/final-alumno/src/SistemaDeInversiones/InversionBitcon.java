package SistemaDeInversiones;

import modelo.Inversionista;
import modelo.InversionistaArriesgado;
import modelo.InversionistaConservador;
import modelo.InversionistasAgresivos;

public class InversionBitcon extends Inversion {

    public InversionBitcon(){
    }

    @Override
    public int calcularInversion (int monto, Inversionista inversionista) {
       return inversionista.calcular(monto, this);
    }

    @Override
    public int calcularInversion (int monto, InversionistaArriesgado inversionistaArriesgado) {
        return monto;
    }

    @Override
    public int calcularInversion (int monto, InversionistaConservador inversionistaConservador) {
        return monto;
    }

    @Override
    public int calcularInversion (int monto, InversionistasAgresivos inversionistasAgresivos) {
        return monto *4;
    }
}
