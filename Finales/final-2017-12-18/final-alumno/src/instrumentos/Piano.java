package instrumentos;

import musicos.Musico;

public class Piano implements Instrumento {
	
	public String material = "Madera";
	
	public int decibeles = 50;

    public int serTocado(){

        if (material == "Madera") {
            return decibeles * 3;
        }

        if (material == "Plastico") {
            return decibeles - 5;
        }

        return decibeles;

    }
}
