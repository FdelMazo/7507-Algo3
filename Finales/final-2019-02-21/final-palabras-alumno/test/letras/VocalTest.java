package letras;

import org.junit.Test;
import reglas.IRegla;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class VocalTest {

    @Test
    public void crearConsonanteYModificaPesoAcordeAUnaVocal(){
        int peso = 1;
        Letra letra = new Vocal("a", peso, new ArrayList<IRegla>());
        assertEquals(peso * Vocal.CONSTANTE_AUMENTO, letra.obtenerPeso());
    }
}
