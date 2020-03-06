package Efectos;

public class EfectoPrimeraMinsucula extends Efecto {
    @Override
    public String aplicarEfecto(String unaCadena) {
        return unaCadena.substring(0,1).toLowerCase() + unaCadena.substring(1);
    }
}
