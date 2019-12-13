package casas;

import casas.estadoConstruccion.EstaIntacta;
import casas.estadoConstruccion.EstadoConstruccion;
import herramienta.Hacha;
import herramienta.Herramienta;
import herramienta.Pulmones;
import herramienta.TaladroRotopercutor;
import material.Material;

public abstract class CasaDelChanchito {

	Material material;
	EstadoConstruccion estadoConstruccion = new EstaIntacta();

    public void serAtacadaCon(Herramienta herramienta){
        herramienta.atacar(this);
    }

    public abstract void serAtacadaConPulmones(Pulmones pulmones);

    public abstract void serAtacadaConHacha(Hacha hacha);

    public abstract void serAtacadoConTaladro(TaladroRotopercutor taladroRotopercutor);

    public boolean estaDestruida(){
        return estadoConstruccion.estaDestruida();
    }
}
