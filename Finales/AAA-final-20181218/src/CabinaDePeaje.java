
public class CabinaDePeaje {

	private int PRECIO_POR_RUEDA = 2;
	
	public int cobrarPeaje(Transporte transporte){
		
		//Verifico que onda el telepase
		//OJO, las motos NO tienen telepase
		if (transporte.getRuedas() == 2){
			
			return PRECIO_POR_RUEDA * transporte.getRuedas();
			
		}else{
			
			if (transporte.tieneTelepase()){
				
				//Para los autos se les hace mitad de precio
				if (transporte.getRuedas() == 4) {
					return (PRECIO_POR_RUEDA * transporte.getRuedas()) / 2;
				}
				
				//Para los camiones un cuarto de lo que pagarian sin telepase (tienen una banda de ruedas) 
				if (transporte.getRuedas() == 18) {
					return (PRECIO_POR_RUEDA * transporte.getRuedas()) / 4;
				}
				
				// y bueno si llego aca es porque vino algun bicho raro como un triciclo Harley Davidson => 10 pesos
				return 10;
				
			}else{
				
				//sin telepase se paga por rueda
				return transporte.getRuedas() * PRECIO_POR_RUEDA;
			}
		}
	}
}
