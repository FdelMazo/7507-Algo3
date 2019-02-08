package instrumentos;

import musicos.Musico;

public class GuitarraCriolla implements Instrumento{

	public int decibeles = 20;

    public String material = "Madera";

	public int serTocado() {

	    if (material == "Plastico") {
            return decibeles - 3;
        }

        return decibeles;

    }

}
