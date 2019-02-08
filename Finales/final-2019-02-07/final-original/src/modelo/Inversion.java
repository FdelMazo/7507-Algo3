package modelo;

public class Inversion {

	private int type;
	// 0 = plazo fijo
	// 1 = lebac
	
	public Inversion(int type){
		
		if(type != 0 && type != 1){
		    throw new Error("No conozco esa inversion.");
		}
		
		this.type = type;
	}
	
	public int calcularPlata(int monto, Inversionista inversionista) {
		
		 switch (type) {
		     case 0:  
		    	 if (inversionista instanceof InversionistaConservador || inversionista instanceof InversionistaArriesgado){
		    		 monto = monto * 2;
		    	 }
		         break;
		     case 1:  
		    	 if (inversionista instanceof InversionistaArriesgado){
			    	 monto = monto * 3;
		    	 }
		    	 break;      
		     default:
		    	 // ni idea quien soy, pero por las dudas no hago nada
		    	 break;
		 }
		
		return monto;
	}
	
}
