package instrumentos;

import musicos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class instrumentosTest {
	
	@Test
	public void testGuitarradePlastico(){
		LucianoPereyra lucianoPereyra = new LucianoPereyra();
        FitoPaez fitoPaez = new FitoPaez();
        RicardoMollo ricardoMollo = new RicardoMollo();
        RobertoPetinatto robertoPetinatto = new RobertoPetinatto();

		GuitarraCriolla guitarraDePlastico = new GuitarraCriolla();
		guitarraDePlastico.material = "Plastico";

        assertEquals(lucianoPereyra.tocar(guitarraDePlastico), 0);
        assertEquals(fitoPaez.tocar(guitarraDePlastico), 0);
        assertEquals(ricardoMollo.tocar(guitarraDePlastico), 17);
        assertEquals(robertoPetinatto.tocar(guitarraDePlastico), 0);


    }

    @Test
	public void testCharangodePlastico(){
		LucianoPereyra lucianoPereyra = new LucianoPereyra();
        FitoPaez fitoPaez = new FitoPaez();
        RicardoMollo ricardoMollo = new RicardoMollo();
        RobertoPetinatto robertoPetinatto = new RobertoPetinatto();

        Charango charangoDePlastico = new Charango();
        charangoDePlastico.material = "Plastico";

        assertEquals(lucianoPereyra.tocar(charangoDePlastico), 10);
        assertEquals(robertoPetinatto.tocar(charangoDePlastico), 0);
        assertEquals(fitoPaez.tocar(charangoDePlastico), 0);
        assertEquals(ricardoMollo.tocar(charangoDePlastico), 0);
	}

	@Test
	public void testPianodePlastico(){
		LucianoPereyra lucianoPereyra = new LucianoPereyra();
        FitoPaez fitoPaez = new FitoPaez();
        RicardoMollo ricardoMollo = new RicardoMollo();
        RobertoPetinatto robertoPetinatto = new RobertoPetinatto();
        Piano pianoDePlastico = new Piano();
        pianoDePlastico.material = "Plastico";

        assertEquals(lucianoPereyra.tocar(pianoDePlastico), 0);
        assertEquals(robertoPetinatto.tocar(pianoDePlastico), 0);
        assertEquals(fitoPaez.tocar(pianoDePlastico), 45);
        assertEquals(ricardoMollo.tocar(pianoDePlastico), 0);
    }

    @Test
    public void testSaxodePlastico(){
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        FitoPaez fitoPaez = new FitoPaez();
        RicardoMollo ricardoMollo = new RicardoMollo();
        RobertoPetinatto robertoPetinatto = new RobertoPetinatto();
        Saxo saxoDePlastico = new Saxo();
        saxoDePlastico.material = "Plastico";

        assertEquals(lucianoPereyra.tocar(saxoDePlastico), 0);
        assertEquals(fitoPaez.tocar(saxoDePlastico), 0);
        assertEquals(ricardoMollo.tocar(saxoDePlastico), 0);
        assertEquals(robertoPetinatto.tocar(saxoDePlastico), 30);
    }
}
