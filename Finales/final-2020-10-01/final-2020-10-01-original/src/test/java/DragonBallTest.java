import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragonBallTest {

    @Test
    public void test() {
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.atacar(vegeta, "BOLA-DE-ENERGIA");

        assertEquals(5950, vegeta.getVida()); // 6000 - 50

        goku.atacar(vegeta, "KAME-HAME-HA");

        assertEquals(5850, vegeta.getVida()); // 5950 - 100

        goku.aplicarKaiohKen("KAIOH-KEN");

        goku.atacar(vegeta, "KAME-HAME-HA");

        assertEquals(5500, vegeta.getVida()); // 5850 - 100 - 5000 * 0.05

        vegeta.atacar(goku, "GALICK-HO");

        assertEquals(4350, goku.getVida()); // 5000 - 100 - 5500 * 0.1
    }
}
