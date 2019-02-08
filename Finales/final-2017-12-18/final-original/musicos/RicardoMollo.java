package musicos;

import instrumentos.GuitarraCriolla;

public class RicardoMollo {

	public int tocar(Object i){
		try {
			GuitarraCriolla g = (GuitarraCriolla) i;
			
			if (g.material == "Madera"){
				return g.decibeles;
			}
		
			if (g.material == "Plastico"){
				return g.decibeles  - 3;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}
}
