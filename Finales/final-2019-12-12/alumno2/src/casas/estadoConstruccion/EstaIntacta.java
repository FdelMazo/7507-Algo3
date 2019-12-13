package casas.estadoConstruccion;

import herramienta.Pulmones;

public class EstaIntacta extends EstadoConstruccion {
    @Override
    public void serAtacadoCon(Pulmones pulmones) {

    }

    @Override
    public boolean estaDestruida() {
        return false;
    }
}
