package instrumentos;

import musicos.Musico;

public class Saxo implements Instrumento {

    public int decibeles = 30;

    String material = "Metal";

    public int serTocado() {

        if (material == "Metal") {
            return decibeles * 3;
        }

        return decibeles;

    }
}
