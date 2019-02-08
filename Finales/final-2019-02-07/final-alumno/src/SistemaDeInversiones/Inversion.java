package SistemaDeInversiones;

import modelo.Inversionista;
import modelo.InversionistaArriesgado;
import modelo.InversionistaConservador;
import modelo.InversionistasAgresivos;

public abstract class Inversion {

	public abstract int calcularInversion (int monto, Inversionista inversionista);
	public abstract int calcularInversion (int monto, InversionistaArriesgado inversionistaArriesgado);
	public abstract int calcularInversion (int monto, InversionistaConservador inversionistaConservador);
	public abstract int calcularInversion (int monto, InversionistasAgresivos inversionistasAgresivos);


}
