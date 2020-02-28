public class EfectoPrimeraMayuscula {

    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        String nuevoString = unaCadena.substring(0,1).toUpperCase() + unaCadena.substring(1);

        return nuevoString;
    }

}
