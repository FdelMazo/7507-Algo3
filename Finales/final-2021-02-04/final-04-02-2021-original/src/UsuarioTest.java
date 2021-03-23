
import org.junit.Test;


public class UsuarioTest {

    @Test
    public void usuarioCompraTimbreNuevoAunNoDeberiaRecibirUnTimbrazo() {
        Usuario jorge = new Usuario("Jorge");
        DispositivoInteligente timbre = new DispositivoInteligente(jorge);
        org.junit.Assert.assertEquals(jorge.CANTIDAD_DE_TIMBRAZOS, 0);
    }

    @Test
    public void usuarioCompraTimbreSuenanElTimbreUnaVezUsuarioDeberiaHaberRecibidoUnTimbrazo() {
        Usuario jorge = new Usuario("Jorge");
        DispositivoInteligente timbre = new DispositivoInteligente(jorge);
        timbre.sonar();
        org.junit.Assert.assertEquals(jorge.CANTIDAD_DE_TIMBRAZOS, 1);
    }
    @Test
    public void usuarioCompraTimbreSuenanElTimbreDosVeceUsuarioDeberiaHaberRecibidoDosTimbrazos() {
        Usuario jorge = new Usuario("Jorge");
        DispositivoInteligente timbre = new DispositivoInteligente(jorge);
        timbre.sonar();
        timbre.sonar();
        org.junit.Assert.assertEquals(jorge.CANTIDAD_DE_TIMBRAZOS, 2);
    }
}
