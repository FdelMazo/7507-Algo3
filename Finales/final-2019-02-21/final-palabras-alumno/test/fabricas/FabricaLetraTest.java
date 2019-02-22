package fabricas;

import excepciones.LargoInvalidoExcepcion;
import letras.Consonante;
import letras.Letra;
import letras.Vocal;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class FabricaLetraTest {

    @Test
    public void crearUnaLetraConVocalYRetornaVocal(){
        FabricaLetra fabricaLetra = new FabricaLetra();
        Letra letra = fabricaLetra.crearLetra("a", 1);
        assertTrue(letra.getClass() ==  Vocal.class);
    }

    @Test
    public void crearUnaLetraConConsonanteYRetornaConsonante(){
        FabricaLetra fabricaLetra = new FabricaLetra();
        Letra letra = fabricaLetra.crearLetra("b", 1);
        assertTrue(letra.getClass() ==  Consonante.class);
    }
}
