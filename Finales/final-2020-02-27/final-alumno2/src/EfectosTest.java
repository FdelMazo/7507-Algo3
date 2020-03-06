import org.junit.Assert;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
        String cadena = FabricaDeEfectos.CrearEfectoAgregarCincoAlFinal().aplicarA("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
        String cadena = FabricaDeEfectos.CrearEfectoAgregarOchoAlFinal().aplicarA("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        String cadena = FabricaDeEfectos.CrearEfectoDarVueltaYPrimeraMayuscula().aplicarA("algo");
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayuscula() {
        String cadena = FabricaDeEfectos.CrearEfectoPrimeraMayuscula().aplicarA("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        String cadena = FabricaDeEfectos.CrearEfectoPrimeraMayusculaYAgregarOcho().aplicarA("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia() {
        try {
            String cadena = FabricaDeEfectos.CrearEfectoAgregarCincoAlFinal().aplicarA("");
            Assert.fail("no se arrojo exception al aplicar en cadena vacia");
        } catch (RuntimeException exception) {
            Assert.assertEquals("no se puede aplicar efecto a cadena vacia", exception.getMessage());
        }
    }

    @Test
    public void testEfectoPrimeroMinusculaYAgregarTres() {
        String cadena = FabricaDeEfectos.CrearEfectoPrimeroMinusculaYAgregarTres().aplicarA("ALGO");
        Assert.assertEquals("aLGO3", cadena);

    }
    @Test
    public void testEfectoDarVueltaYPrimeraMinusculaYAgregarCuatroAlFinal() {
        String cadena = FabricaDeEfectos.CrearEfectoDarVueltaYPrimeraMinusculaYAgregarCuatroAlFinal().aplicarA("ALGO");
        Assert.assertEquals("oGLA4", cadena);

    }
}
