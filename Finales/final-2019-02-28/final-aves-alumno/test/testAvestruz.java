import modelo.aves.Avestruz;
import modelo.superficie.Superficie;
import modelo.superficie.SuperficieBarro;
import modelo.superficie.SuperficieHielo;
import modelo.superficie.SuperficiePistaAtletismo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class testAvestruz {

    @Test
    public void testCorreSobreBarro() {
        Avestruz avestruz = new Avestruz();
        Superficie barro = new SuperficieBarro();

        assertEquals("Avestruz corre sobre barro devuelve lo esperado", 70, avestruz.correr(barro));
    }

    @Test
    public void testCorreSobreHielo() {
        Avestruz avestruz = new Avestruz();
        Superficie hielo = new SuperficieHielo();

        assertEquals("Avestruz corre sobre hielo devuelve lo esperado", 0, avestruz.correr(hielo));
    }

    @Test
    public void testCorreSobrePistaDeAtletismo() {
        Avestruz avestruz = new Avestruz();
        Superficie pistaDeAtletismo = new SuperficiePistaAtletismo();

        assertEquals("Avestruz corre sobre pista de atletismo devuelve lo esperado", 70, avestruz.correr(pistaDeAtletismo));
    }

}
