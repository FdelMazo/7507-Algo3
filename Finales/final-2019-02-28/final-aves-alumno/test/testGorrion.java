import modelo.aves.Avestruz;
import modelo.aves.Gorrion;
import modelo.superficie.Superficie;
import modelo.superficie.SuperficieBarro;
import modelo.superficie.SuperficieHielo;
import modelo.superficie.SuperficiePistaAtletismo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class testGorrion {

    @Test
    public void testCanto() {
        Gorrion gorrion = new Gorrion();

        assertEquals("Canto de gorrion es lo esperado", "pio pio", gorrion.cantar());
    }

    @Test
    public void testVuelo() {
        Gorrion gorrion = new Gorrion();

        assertEquals("Vuelo de gorrion es lo esperado", 50, gorrion.volar());
    }

}
