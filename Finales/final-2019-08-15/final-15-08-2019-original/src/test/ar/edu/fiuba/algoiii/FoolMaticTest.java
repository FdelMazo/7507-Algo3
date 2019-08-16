package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.FoolMatic;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FoolMaticTest {
    @Test
    public void testContabilizarVotosDeVotantePoR() {
        FoolMatic f = new FoolMatic();

        f.votar("PoR");

        int votosParaPoR = 1;

        assertEquals(votosParaPoR, f.escrutinio("PoR"));
    }

    @Test
    public void testContabilizarVotosDeVotanteTordos() {
        FoolMatic f = new FoolMatic();

        f.votar("Tordos");

        int votosParaPoR = 0;
        int votosParaTordos = 1;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));
    }


    @Test
    public void testDistribuyendoVotosParaEmparejarEleccion() {
        FoolMatic f = new FoolMatic();

        f.votar("PoR", 5);
        f.votar("Tordos", 1000);

        int votosParaPoR = 15;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));
    }
}
