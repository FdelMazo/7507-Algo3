package casas.estadoConstruccion;

import herramienta.Pulmones;

public class EstaDestruida extends EstadoConstruccion {
    @Override
    public void serAtacadoCon(Pulmones pulmones) {

    }

    @Override
    public boolean estaDestruida() {
        return true;
    }
}
