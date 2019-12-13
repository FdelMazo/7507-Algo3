package casas.estadoConstruccion;

import herramienta.Pulmones;

public abstract class EstadoConstruccion {
    public abstract void serAtacadoCon(Pulmones pulmones);

    public abstract boolean estaDestruida();
}
