package test;

import static org.junit.Assert.*;

import org.junit.Test;

import personajes.*;

public class BosqueTest {

	@Test
	public void jueguemosEnElBosqueMientrasLoboNoEstaLoboEsta() {

		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		
		// 1. LA CASA NO ESTA DESTRUIDA
		assertFalse(bosque.casaDestruida());
		
		// 2. LOBO ATACA LA CASA SOPLANDO
		bosque.loboAtacarCasaDelChanchito();
		
		// 3. LA CASA ESTA DESTRUIDA
		assertTrue(bosque.casaDestruida());
		
		// 4. LOS CHANCHITOS HUYEN A LA CASA DE MADERA
		bosque.huirHaciaUnaCasaDeMadera();
		
		// 5. LA CASA DE MADERA NO ESTA DESTRUIDA
		assertFalse(bosque.casaDestruida());

		// 6. LOBO INTENTA DESTRUIR LA CASA DE MADERA SOPLANDO, NO LO LOGRA
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());

		// 7. LOBO CAMBIA DE HERRAMIENTA Y DESTRUYE LA CASA DE MADERA
		lobo.cambiarHerramienta(new Hacha());
		bosque.loboAtacarCasaDelChanchito();
		assertTrue(bosque.casaDestruida());

		// 8. LOS CHANCHITOS HUYEN A LA CASA DE CEMENTO
		bosque.huirHaciaUnaCasaDeCemento();
		
		// 9. LOBO NO PUEDE DESTRUIRLA
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());
		
		// 10. SOPLANDO MUCHO MENOS...
		lobo.cambiarHerramienta(new Pulmones());
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());

	}

}
