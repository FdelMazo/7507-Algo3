package Efectos;

public class EfectoDarVuelta extends Efecto {
    @Override
    public String aplicarEfecto(String unaCadena) {
        return new StringBuffer(unaCadena).reverse().toString();
    }
}
