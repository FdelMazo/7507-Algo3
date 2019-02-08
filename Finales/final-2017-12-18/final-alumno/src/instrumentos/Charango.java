package instrumentos;

import musicos.Musico;

public class Charango implements Instrumento {
	
	public int decibeles = 10;

    public String material = "Madera";

	public int serTocado(){
        if (material == "Madera"){
            return decibeles * 2;
        }

        return decibeles;

    }
}