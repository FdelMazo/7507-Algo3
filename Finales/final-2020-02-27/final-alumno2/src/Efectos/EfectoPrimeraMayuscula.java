package Efectos;

public class EfectoPrimeraMayuscula extends Efecto {
    @Override
    public String aplicarEfecto(String unaCadena) {
        return unaCadena.substring(0,1).toUpperCase() + unaCadena.substring(1);
    }
}
