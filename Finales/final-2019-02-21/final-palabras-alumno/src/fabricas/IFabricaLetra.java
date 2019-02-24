package fabricas;

import excepciones.LargoInvalidoExcepcion;
import letras.Letra;

public interface IFabricaLetra {
    Letra crearLetra(String letra, int peso) throws LargoInvalidoExcepcion;
}
