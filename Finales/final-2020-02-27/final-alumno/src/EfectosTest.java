import org.junit.Assert;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
        EfectosCompuestos efectos = new EfectosCompuestos(new AgregarAlFinal('5'));
        String cadena = efectos.aplicarA("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
        EfectosCompuestos efectos = new EfectosCompuestos(new AgregarAlFinal('8'));
        String cadena = efectos.aplicarA("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        EfectosCompuestos efectos = new EfectosCompuestos(new DarVuelta());
        efectos.aniadirEfecto(new CambiarPrimera(new MayusculaState()));
        String cadena =  efectos.aplicarA("algo");
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayuscula() {
        EfectosCompuestos efectos = new EfectosCompuestos(new CambiarPrimera(new MayusculaState()));
        String cadena = efectos.aplicarA("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        EfectosCompuestos efectos = new EfectosCompuestos(new CambiarPrimera(new MayusculaState()));
        efectos.aniadirEfecto(new AgregarAlFinal('8'));
        String cadena = efectos.aplicarA("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testAgregar3YPrimeraMinuscula() {
        EfectosCompuestos efectos = new EfectosCompuestos(new AgregarAlFinal('3'));
        efectos.aniadirEfecto(new CambiarPrimera(new MinusculaState()));
        String cadena = efectos.aplicarA("ALGO");
        Assert.assertEquals("aLGO3", cadena);
    }

    @Test
    public void testDarVueltaPrimeraMinusculaYAgregar4AlFinal() {
        EfectosCompuestos efectos = new EfectosCompuestos(new DarVuelta());
        efectos.aniadirEfecto(new CambiarPrimera(new MinusculaState()));
        efectos.aniadirEfecto(new AgregarAlFinal('4'));
        String cadena = efectos.aplicarA("ALGO");
        Assert.assertEquals("oGLA4", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia() {
        try {
            EfectosCompuestos efectos = new EfectosCompuestos(new AgregarAlFinal('5'));
            efectos.aplicarA("");
            Assert.fail("no se arrojo exception al aplicar en cadena vacia");
        } catch (RuntimeException exception) {
            Assert.assertEquals("no se puede aplicar efecto a cadena vacia", exception.getMessage());
        }
    }

}
