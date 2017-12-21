package musicos;

import instrumentos.Piano;

public class FitoPaez {
	
	public int tocar(Object i){
		try {
			Piano p = (Piano) i;
			
			if (p.material == "Madera"){
				return p.decibeles  * 3;
			}
		
			if (p.material == "Plastico"){
				return p.decibeles  - 5;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}
}
