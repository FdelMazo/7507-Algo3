public class EfectoAgregarOchoAlFinal {

    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        String nuevoString = unaCadena + "8";

        return nuevoString;
    }

}
