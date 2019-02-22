package estadosCelda;

import celdas.ICelda;
import letras.Letra;

public interface IEstadoCelda {
    int obtenerPeso(ICelda celda, Letra letra);
}
