package celdas;

import estadosCelda.IEstadoCelda;

public interface ICelda {
    void setEstadoCelda(IEstadoCelda estadoCelda);
    int obtenerPesoCelda();
}
