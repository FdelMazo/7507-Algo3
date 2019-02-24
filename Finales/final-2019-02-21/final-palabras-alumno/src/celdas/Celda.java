package celdas;

import estadosCelda.EstadoCeldaDisponible;
import estadosCelda.IEstadoCelda;
import letras.Letra;

public class Celda implements  ICelda{

    IEstadoCelda estado;
    private Letra letra;

    public Celda(Letra letra) {
        this.letra = letra;
        this.estado = new EstadoCeldaDisponible();
    }

    @Override
    public void setEstadoCelda(IEstadoCelda estadoCelda) {
        this.estado = estadoCelda;
    }

    @Override
    public int obtenerPesoCelda() {
        return this.estado.obtenerPeso(this, this.letra);
    }
}
