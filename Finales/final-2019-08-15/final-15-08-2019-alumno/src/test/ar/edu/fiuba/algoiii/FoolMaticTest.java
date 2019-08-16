package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.FoolMatic;
import main.ar.edu.fiuba.algoiii.NoExistePartidoException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FoolMaticTest {

    private void resetearPruebas() {
        FoolMatic f = new FoolMatic();
        f.resetear();
    }

    @Test
    public void testContabilizarVotosDeVotantePoR() throws NoExistePartidoException {
        FoolMatic f = new FoolMatic();

        f.votar("PoR");

        int votosParaPoR = 1;

        assertEquals(votosParaPoR, f.escrutinio("PoR"));

        resetearPruebas();
    }

    @Test
    public void testContabilizarVotosDeVotanteTordos() throws NoExistePartidoException {
        FoolMatic f = new FoolMatic();

        f.votar("Tordos");

        int votosParaPoR = 0;
        int votosParaTordos = 1;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));

        resetearPruebas();
    }


    @Test
    public void testDistribuyendoVotosParaEmparejarEleccion() throws NoExistePartidoException {
        FoolMatic f = new FoolMatic();

        f.votar("PoR", 5);
        f.votar("Tordos", 1000);

        int votosParaPoR = 15;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));

        resetearPruebas();
    }

    @Test
    public void testPORAceptaVariosNombres() throws NoExistePartidoException {
        FoolMatic f = new FoolMatic();

        f.votar("PoR", 5);
        f.votar("pOr", 7);
        f.votar("Tordos", 1000);

        int votosParaPoR = 5 + 7 + 10;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));

        resetearPruebas();
    }

    @Test
    public void testTresVotacionesGeneraTrampas() throws NoExistePartidoException {
        FoolMatic f = new FoolMatic();

        f.votar("PoR", 5);
        f.votar("Tordos", 1000);
        f.votar("FIUBA", 9);

        int votosParaPoR = 5 + 10 + 10;
        int votosParaFIUBA = 9 + 10;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));
        assertEquals(votosParaFIUBA, f.escrutinio("FIUBA"));

        resetearPruebas();
    }
}
