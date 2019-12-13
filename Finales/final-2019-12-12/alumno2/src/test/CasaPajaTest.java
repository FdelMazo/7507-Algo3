package test;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDePaja;
import org.junit.Assert;
import org.junit.Test;
import Bosque;
import personajes.Chanchito;
import personajes.Lobo;

public class CasaPajaTest {
    @Test
    public void loboAtacaCasaDePajaYLaDestruye() {
        Lobo lobo = new Lobo();
        CasaDelChanchito casa = new CasaDelChanchitoDePaja();
        Chanchito chanchito = new Chanchito(casa);
        Bosque bosque = new Bosque(lobo, chanchito);

        bosque.loboAtacarCasaDelChanchito();

        Assert.assertTrue(casa.estaDestruida());

    }
}
