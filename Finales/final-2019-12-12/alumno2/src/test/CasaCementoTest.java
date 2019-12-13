package test;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeCemento;
import herramienta.Hacha;
import herramienta.TaladroRotopercutor;
import org.junit.Assert;
import org.junit.Test;
import Bosque;
import personajes.Chanchito;
import personajes.Lobo;

public class CasaCementoTest {
    @Test
    public void loboAtacaCasaDeCementoSinHerramientaYNoLaDestruye() {
        Lobo lobo = new Lobo();
        CasaDelChanchito casa = new CasaDelChanchitoDeCemento();
        Chanchito chanchito = new Chanchito(casa);
        Bosque bosque = new Bosque(lobo, chanchito);

        bosque.loboAtacarCasaDelChanchito();

        Assert.assertFalse(casa.estaDestruida());
    }

    @Test
    public void loboAtacaCasaDeCementoConHachaYNoLaDestruye() {
        Lobo lobo = new Lobo();
        CasaDelChanchito casa = new CasaDelChanchitoDeCemento();
        Chanchito chanchito = new Chanchito(casa);
        Bosque bosque = new Bosque(lobo, chanchito);

        bosque.loboAtacarCasaDelChanchito();
        Assert.assertFalse(casa.estaDestruida());

        lobo.cambiarHerramienta(new Hacha());
        bosque.loboAtacarCasaDelChanchito();

        Assert.assertFalse(casa.estaDestruida());
    }

    @Test
    public void loboAtacaCasaDeCementoConTaladroYLaDestruye() {
        Lobo lobo = new Lobo();
        CasaDelChanchito casa = new CasaDelChanchitoDeCemento();
        Chanchito chanchito = new Chanchito(casa);
        Bosque bosque = new Bosque(lobo, chanchito);

        bosque.loboAtacarCasaDelChanchito();
        Assert.assertFalse(casa.estaDestruida());

        lobo.cambiarHerramienta(new TaladroRotopercutor());
        bosque.loboAtacarCasaDelChanchito();

        Assert.assertTrue(casa.estaDestruida());
    }
}
