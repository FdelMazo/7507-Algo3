import org.junit.Test;

public class CasaTest {

    @Test
    public void test() {
        Casa casa =  new Casa();

        ComponenteElectrico estufaDelBanio = new ComponenteElectrico("estufa");
        estufaDelBanio.ambientes = 1;
        estufaDelBanio.precioKw = 10;
        estufaDelBanio.calorias = 1000;

        casa.estufas.add(estufaDelBanio);

        ComponenteElectrico losaComedor = new ComponenteElectrico("LOSA_RADIANTE");
        losaComedor.metros = 10;
        losaComedor.precioKw = 10;

        casa.losas.add(losaComedor);

        ComponenteElectrico cercoFondo = new ComponenteElectrico("CeRcO-ElEcTrIcO");
        cercoFondo.metros = 10;
        cercoFondo.precioKw = 10;

        casa.cercos.add(cercoFondo);

        org.junit.Assert.assertEquals(11100, casa.getGastoTotal());
    }

}
