package modelo.superficie;

import modelo.acciones.Corredor;

public class SuperficieBarro implements Superficie {

    @Override
    public int deslizar(Corredor corredor) {
        return corredor.correr(this);
    }
}
