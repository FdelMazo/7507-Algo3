import casas.CasaDelChanchitoDePaja;
import org.junit.Assert;
import org.junit.Test;
import personajes.Hacha;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public class CasaDeMaderaTest {

    @Test
    public void casaDePajaNoResistePulmones() {
        CasaDelChanchitoDePaja casa = new CasaDelChanchitoDePaja();
        casa.esAtacadaCon(new Pulmones());
        Assert.assertTrue(casa.estaDestruida());
    }

    @Test
    public void casaDePajaNoResistHacha() {
        CasaDelChanchitoDePaja casa = new CasaDelChanchitoDePaja();
        casa.esAtacadaCon(new Hacha());
        Assert.assertTrue(casa.estaDestruida());
    }

    @Test
    public void casaDePajaNoResisteTaladro() {
        CasaDelChanchitoDePaja casa = new CasaDelChanchitoDePaja();
        casa.esAtacadaCon(new TaladroRotopercutor());
        Assert.assertTrue(casa.estaDestruida());
    }
}
