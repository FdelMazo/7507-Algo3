package musicos;

import instrumentos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class musicosTest {

	@Test
	public void testLucianoPereyra() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        assertEquals(lucianoPereyra.tocar(new Charango()), 20);
    }

    @Test
	public void testLucianoPereyraTrivial(){
		LucianoPereyra lucianoPereyra = new LucianoPereyra();
		assertEquals(lucianoPereyra.tocar(new GuitarraCriolla()), 0);
        assertEquals(lucianoPereyra.tocar(new Piano()), 0);
        assertEquals(lucianoPereyra.tocar(new Saxo()), 0);
    }

    @Test
	public void testRicardoMollo() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        assertEquals(ricardoMollo.tocar(new GuitarraCriolla()), 20);
    }
    @Test
    public void testRicardoMolloTrivial(){
        RicardoMollo ricardoMollo = new RicardoMollo();
        assertEquals(ricardoMollo.tocar(new Charango()), 0);
        assertEquals(ricardoMollo.tocar(new Piano()), 0);
        assertEquals(ricardoMollo.tocar(new Saxo()), 0);
    }

    @Test
	public void testFitoPaez() {
        FitoPaez fitoPaez = new FitoPaez();
        assertEquals(fitoPaez.tocar(new Piano()), 150);
    }

    @Test
    public void testFitoPaezTrivial(){
        FitoPaez fitoPaez = new FitoPaez();
        assertEquals(fitoPaez.tocar(new GuitarraCriolla()), 0);
        assertEquals(fitoPaez.tocar(new Saxo()), 0);
        assertEquals(fitoPaez.tocar(new Charango()), 0);

    }

	@Test
	public void testRobertoPetinato() {
        RobertoPetinatto robertoPetinatto = new RobertoPetinatto();
        assertEquals(robertoPetinatto.tocar(new Saxo()), 90);
    }

    @Test
    public void testRobertoPetinatoTrivial(){
        RobertoPetinatto robertoPetinatto = new RobertoPetinatto();
		assertEquals(robertoPetinatto.tocar(new Charango()), 0);
		assertEquals(robertoPetinatto.tocar(new GuitarraCriolla()), 0);
		assertEquals(robertoPetinatto.tocar(new Piano()), 0);
	}

}
