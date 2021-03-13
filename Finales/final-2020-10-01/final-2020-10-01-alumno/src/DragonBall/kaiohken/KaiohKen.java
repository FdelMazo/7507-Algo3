package DragonBall.kaiohken;

import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;

public abstract class KaiohKen {
    protected int cantidadDeTurnos;

    public abstract KaiohKen afectarAtaque(Vegeta enemigo, int valorAtaqueKame, Vitalidad vidaGoku);
}
