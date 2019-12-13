import org.junit.Assert;
import org.junit.Test;
import personajes.Bosque;
import personajes.Hacha;
import personajes.Lobo;
import personajes.TaladroRotopercutor;

import static org.junit.Assert.assertTrue;

public class bosqueTest {

    @Test
    public void laCasasInicialmenteNoEstaDestruida() {

        Lobo lobo = new Lobo();
        Bosque bosque = new Bosque(lobo);
        Assert.assertFalse(bosque.casaDestruida());
    }

    @Test
    public void laCasaDePajaSeRompeConHerramientaPredeterminada() {

        Lobo lobo = new Lobo();
        Bosque bosque = new Bosque(lobo);
        bosque.loboAtacarCasaDelChanchito();
        Assert.assertTrue(bosque.casaDestruida());
    }

    @Test
    public void laCasaDePajaSeRompeConHerramientaHacha() {

        Lobo lobo = new Lobo();
        lobo.cambiarHerramienta(new Hacha());
        Bosque bosque = new Bosque(lobo);
        bosque.loboAtacarCasaDelChanchito();
        Assert.assertTrue(bosque.casaDestruida());
    }


    @Test
    public void laCasaDePajaSeRompeConHerramientaTaladroPercutor() {

        Lobo lobo = new Lobo();
        lobo.cambiarHerramienta(new TaladroRotopercutor());
        Bosque bosque = new Bosque(lobo);
        bosque.loboAtacarCasaDelChanchito();
        Assert.assertTrue(bosque.casaDestruida());
    }

    @Test
    public void laCasaDeMaderaNoSeRompeConHerramientPulmones() {

        Lobo lobo = new Lobo();
        Bosque bosque = new Bosque(lobo);
        bosque.huirHaciaUnaCasaDeMadera();
        bosque.loboAtacarCasaDelChanchito();
        Assert.assertFalse(bosque.casaDestruida());
    }

    @Test
    public void laCasaDeMaderaSeRompeConHerramientHacha() {

        Lobo lobo = new Lobo();
        lobo.cambiarHerramienta(new Hacha());
        Bosque bosque = new Bosque(lobo);
        bosque.huirHaciaUnaCasaDeMadera();
        bosque.loboAtacarCasaDelChanchito();
        Assert.assertTrue(bosque.casaDestruida());
    }

    @Test
    public void laCasaDeMaderaSeRompeConHerramientTaladro() {

        Lobo lobo = new Lobo();
        lobo.cambiarHerramienta(new TaladroRotopercutor());
        Bosque bosque = new Bosque(lobo);
        bosque.huirHaciaUnaCasaDeMadera();
        bosque.loboAtacarCasaDelChanchito();
        Assert.assertTrue(bosque.casaDestruida());
    }
}
