import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ComparadorTest {
	
	@Test
	public void numeros_iguales() {
		ComparadorDeValores valorEsperado = new ComparadorDeValores(5);
					
        assertEquals(valorEsperado, new ComparadorDeValores(5));
	}

	@Test
	public void numeros_diferentes() {
		ComparadorDeValores valorEsperado = new ComparadorDeValores(5);
			
		assertNotEquals(valorEsperado, new ComparadorDeValores(10));
	}

}
