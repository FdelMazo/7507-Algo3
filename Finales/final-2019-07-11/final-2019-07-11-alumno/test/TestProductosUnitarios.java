import Productos.Alfajor;
import Tradeable.Dolar;
import Tradeable.Moneda;
import Tradeable.Pesos;
import Productos.Gaseosa;
import DosPorUno.DosPorUno;
import Tradeable.Vaca;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestProductosUnitarios {

		@Test
		public void testGaseosaPesos() {
			Gaseosa gaseosa = new Gaseosa(100);
			Moneda pesos = new Pesos();

			double renta = gaseosa.setPrecio(200,pesos);
			assertEquals(renta, 100.0);
		}

		@Test
		public void testComboDosGaseosas() {
			Gaseosa gaseosa01 = new Gaseosa(100);
			Gaseosa gaseosa02 = new Gaseosa(100);

			DosPorUno combo = new DosPorUno(gaseosa01,gaseosa02);
			Moneda pesos = new Pesos();

			double renta = combo.setPrecio(1200, pesos);

			assertEquals(1000.0, renta);
		}

		@Test
		public void testGaseosaDolar() {
			Gaseosa gaseosa = new Gaseosa(100);
			Moneda dolar = new Dolar();

			double renta = gaseosa.setPrecio(10, dolar);

			assertEquals(400.0, renta);
		}

		@Test
	public void testAlfajorDevuelveLaRentaEnVacas() {
			Alfajor alfajor =  new Alfajor(new Vaca());
			Vaca renta = alfajor.setPrecio(new Vaca());

			assertEquals(alfajor.getCosto(),renta);
		}

}
