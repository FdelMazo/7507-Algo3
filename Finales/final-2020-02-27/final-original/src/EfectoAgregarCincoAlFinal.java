public class EfectoAgregarCincoAlFinal {

    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        String nuevoString = unaCadena + "5";

        return nuevoString;
    }

}
