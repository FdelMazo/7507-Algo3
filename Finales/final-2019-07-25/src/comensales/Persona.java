package comensales;

public class Persona {
	
	public int calorias;
	boolean celiaca;
	
	public Persona(boolean celiaca){
		this.calorias = 0;
		this.celiaca = celiaca;
	}

	public void comer(String algo){
		
		/************************************************
		 * PAN
		 ************************************************/
		if (algo.contains("pan")) {
			
			if (algo.contains("gluten")){
				
				if (this.celiaca){
					//Esta todo bien
					this.calorias += 10;
				}else{
					// Esta todo bien tambien, 
					// no soy celiaca, pero comer pan celiaco no pasa nada
					this.calorias += 10;
				}
			}else{
				
				if (this.celiaca){
					//DANGER !!!! Soy celiaca y como pan comun !!!!
					System.out.println("ERROR: celiaca come pan comun");
				}else{
					this.calorias += 10;
				}
			}
		}
		
		
		/************************************************
		 * EMPANADA
		 ************************************************/
		if (algo.contains("EMPANADA")){
			
			if (algo.contains("gluten")){
				
				if (this.celiaca){
					//Esta todo bien
					this.calorias += 15;
				}else{
					// Esta todo bien tambien, 
					// no soy celiaca, pero comer empanada celiaca no pasa nada
					this.calorias += 15;
				}
			}else{
				
				if (this.celiaca){
					//DANGER !!!! Soy celiaca y como empanada comun !!!!
					System.out.println("ERROR: celiaca come empanada comun");
				}else{
					this.calorias += 15;
				}
				
			}
		}
	}
}
