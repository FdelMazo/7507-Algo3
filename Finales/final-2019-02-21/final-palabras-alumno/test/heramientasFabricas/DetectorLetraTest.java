package heramientasFabricas;

import herramientasFabricas.DetectorLetra;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class DetectorLetraTest {

    @Test
    public void pasoUnaVocalYDeberiaRenortarQueSiLoEs(){
        DetectorLetra detectorLetra = new DetectorLetra();
        assertTrue(detectorLetra.esVocal("a"));
    }

    @Test
    public void pasoUnaVocalEnMayusculasYDeberiaRenortarQueSiLoEs(){
        DetectorLetra detectorLetra = new DetectorLetra();
        assertTrue(detectorLetra.esVocal("A"));
    }

    @Test
    public void pasoUnaConsonanteYDeberiaRetornarQueNoEsUnaVocal(){
        DetectorLetra detectorLetra = new DetectorLetra();
        assertFalse(detectorLetra.esVocal("b"));
    }

    @Test
    public void pasoUnaConsonanteEnMayusculaYDeberiaRetornarQueNoEsUnaVocal(){
        DetectorLetra detectorLetra = new DetectorLetra();
        assertFalse(detectorLetra.esVocal("B"));
    }
}
