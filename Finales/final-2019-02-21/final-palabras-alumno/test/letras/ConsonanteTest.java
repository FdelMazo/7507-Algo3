package letras;

import excepciones.PesoNoPuedeSerNegativoExcepcion;
import org.junit.Test;
import reglas.IRegla;
import reglas.ReglaPeso;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ConsonanteTest {

    @Test
    public void crearConsonanteYModificaPesoAcordeAUnaCOnsonante(){
        int peso = 1;
        Letra letra = new Consonante("b", peso, new ArrayList<IRegla>());
        assertEquals(peso * Consonante.CONSTANTE_AUMENTO, letra.obtenerPeso());
    }

    @Test(expected = PesoNoPuedeSerNegativoExcepcion.class)
    public void crearLetraConUnPesoMEnorA0NoEsPosibleSiLePasoEsaRegla(){
        int pesoNegativo = -2;
        List<IRegla> reglas = new ArrayList<IRegla>();
        reglas.add(new ReglaPeso());
        Letra letra = new Consonante("b", pesoNegativo, reglas);
    }
}
