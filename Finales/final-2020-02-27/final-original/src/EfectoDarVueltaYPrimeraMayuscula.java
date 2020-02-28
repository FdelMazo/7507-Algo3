public class EfectoDarVueltaYPrimeraMayuscula {

    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        String nuevoString = new StringBuffer(unaCadena).reverse().toString();

        nuevoString = nuevoString.substring(0,1).toUpperCase() + nuevoString.substring(1);

        return nuevoString;
    }

}
