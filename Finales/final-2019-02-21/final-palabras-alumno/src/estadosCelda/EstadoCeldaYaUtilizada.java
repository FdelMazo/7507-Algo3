package estadosCelda;

import celdas.ICelda;
import letras.Letra;

public class EstadoCeldaYaUtilizada implements IEstadoCelda {

    private static final int PESO_NULO = 0;

    @Override
    public int obtenerPeso(ICelda celda, Letra letra) {
        return PESO_NULO;
    }
}
