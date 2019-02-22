package estadosCelda;
import celdas.ICelda;
import letras.Letra;

public class EstadoCeldaDisponible implements IEstadoCelda {

    @Override
    public int obtenerPeso(ICelda celda, Letra letra) {
        celda.setEstadoCelda(new EstadoCeldaYaUtilizada());
        return letra.obtenerPeso();
    }
}
