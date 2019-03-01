package modelo.superficie;


import modelo.acciones.Corredor;

public class SuperficieHielo implements Superficie {

    @Override
    public int deslizar(Corredor corredor) {
        return corredor.correr(this);
    }

}
