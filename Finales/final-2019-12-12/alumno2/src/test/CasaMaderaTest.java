package test;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeMadera;
import herramienta.Hacha;
import org.junit.Assert;
import org.junit.Test;
import Bosque;
import personajes.Chanchito;
import personajes.Lobo;

public class CasaMaderaTest {
    @Test
    public void loboAtacaCasaDeMaderaSinHerramientaYNoLaDestruye() {
        Lobo lobo = new Lobo();
        CasaDelChanchito casa = new CasaDelChanchitoDeMadera();
        Chanchito chanchito = new Chanchito(casa);
        Bosque bosque = new Bosque(lobo, chanchito);

        bosque.loboAtacarCasaDelChanchito();

        Assert.assertFalse(casa.estaDestruida());

    }

    @Test
    public void loboAtacaCasaDeMaderaConHachaYLaDestruye() {
        Lobo lobo = new Lobo();
        CasaDelChanchito casa = new CasaDelChanchitoDeMadera();
        Chanchito chanchito = new Chanchito(casa);
        Bosque bosque = new Bosque(lobo, chanchito);

        bosque.loboAtacarCasaDelChanchito();
        Assert.assertFalse(casa.estaDestruida());

        lobo.cambiarHerramienta(new Hacha());
        bosque.loboAtacarCasaDelChanchito();

        Assert.assertTrue(casa.estaDestruida());
    }
}
