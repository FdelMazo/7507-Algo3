import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VehiculosTest {

    @Test
    public void test() {
        Auto auto = new Auto();

        auto.cargar(Cargas.HELATODO);

        assertEquals(auto.descargar(), Cargas.HELATODO);
        assertThrows(EmptyStackException.class, () -> {
            auto.descargar();
        });

        assertThrows(RuntimeException.class, () -> {
            auto.cargar(Cargas.BICI);
        });

        // Moto
        Moto moto = new Moto();
        moto.cargar(Cargas.HELATODO);
        assertEquals(moto.descargar(), Cargas.HELATODO);
    }

}
