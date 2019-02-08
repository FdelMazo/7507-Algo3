package SistemaDeInversiones;


import modelo.Inversionista;
import modelo.InversionistaArriesgado;
import modelo.InversionistaConservador;
import modelo.InversionistasAgresivos;

public class InversionNula extends Inversion {

    public InversionNula(){
    }

    @Override
    public int calcularInversion (int monto, Inversionista inversionista) {
        return inversionista.calcular(monto, this);
    }

    @Override
    public int calcularInversion (int monto, InversionistaArriesgado inversionistaArriesgado) {
        return monto * 2;
    }

    @Override
    public int calcularInversion (int monto, InversionistaConservador inversionistaConservador) {
        return monto * 2;
    }

    @Override
    public int calcularInversion (int monto, InversionistasAgresivos inversionistasAgresivos) {
        return monto;
    }


}
