import modelo.aves.AbelPintos;
import modelo.aves.Gorrion;
import modelo.superficie.Superficie;
import modelo.superficie.SuperficieBarro;
import modelo.superficie.SuperficieHielo;
import modelo.superficie.SuperficiePistaAtletismo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class testAbelPintos {

    @Test
    public void testCorreSobreBarro() {
        AbelPintos abelPintos = new AbelPintos();
        Superficie barro = new SuperficieBarro();

        assertEquals("AbelPintos corre sobre barro devuelve lo esperado", 2, abelPintos.correr(barro));
    }

    @Test
    public void testCorreSobreHielo() {
        AbelPintos abelPintos = new AbelPintos();
        Superficie hielo = new SuperficieHielo();

        assertEquals("AbelPintos corre sobre hielo devuelve lo esperado", 0, abelPintos.correr(hielo));
    }

    @Test
    public void testCorreSobrePistaDeAtletismo() {
        AbelPintos abelPintos = new AbelPintos();
        Superficie pistaDeAtletismo = new SuperficiePistaAtletismo();

        assertEquals("AbelPintos corre sobre pista de atletismo devuelve lo esperado", 15, abelPintos.correr(pistaDeAtletismo));
    }


    @Test
    public void testCanto() {
        AbelPintos abelPintos = new AbelPintos();

        assertEquals("Canto de AbelPintos es lo esperado", "vas a entrar sin pedirme la llave...", abelPintos.cantar());
    }

}
