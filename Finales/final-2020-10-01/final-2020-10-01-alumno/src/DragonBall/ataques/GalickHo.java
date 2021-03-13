package DragonBall.ataques;

import DragonBall.personajes.Goku;
import DragonBall.vitalidad.Vitalidad;

public class GalickHo implements AtaqueVegeta{

    private static final double MULTIPLICADOR_ATAQUE_GALICK = 0.1;
    private static final int DANIO_BASE_GALICK = 100;

    public void atacar(Goku enemigo, Vitalidad vidaVegeta) {
        vidaVegeta.afectarAtaque(enemigo,DANIO_BASE_GALICK,MULTIPLICADOR_ATAQUE_GALICK);
    }
}
