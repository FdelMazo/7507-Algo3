import modelo.aves.Pinguino;
import modelo.superficie.Superficie;
import modelo.superficie.SuperficieBarro;
import modelo.superficie.SuperficieHielo;
import modelo.superficie.SuperficiePistaAtletismo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class testPinguino {

    @Test
    public void testCorreSobreBarro() {
        Pinguino pinguino = new Pinguino();
        Superficie barro = new SuperficieBarro();

        assertEquals("Pinguino corre sobre barro devuelve lo esperado", 0, pinguino.correr(barro));
    }

    @Test
    public void testCorreSobreHielo() {
        Pinguino pinguino = new Pinguino();
        Superficie hielo = new SuperficieHielo();

        assertEquals("Pinguino corre sobre hielo devuelve lo esperado", 5, pinguino.correr(hielo));
    }

    @Test
    public void testCorreSobrePistaDeAtletismo() {
        Pinguino pinguino = new Pinguino();
        Superficie pistaDeAtletismo = new SuperficiePistaAtletismo();

        assertEquals("Pinguino corre sobre pista de atletismo devuelve lo esperado", 0, pinguino.correr(pistaDeAtletismo));
    }

    @Test
    public void testNadar() {
        Pinguino pinguino = new Pinguino();

        assertEquals("Pinguino nada a la velocidad esperada", 5, pinguino.nadar());
    }
}
