package DragonBall.ataques;

import DragonBall.personajes.Goku;
import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;
import DragonBall.kaiohken.KaiohKen;

public class BolaDeEnergia implements AtaqueVegeta,AtaqueGoku{

    static final int DANIO_BOLA_ENERGIA = 50;
    static final int SIN_MULTIPLICADOR = 0;

    @Override
    public KaiohKen atacar(Vegeta enemigo, KaiohKen kaiohKen, Vitalidad vida) {
        enemigo.recibirDanio(DANIO_BOLA_ENERGIA);
        return kaiohKen;
    }

    @Override
    public void atacar(Goku enemigo, Vitalidad vida) {
        vida.afectarAtaque(enemigo, DANIO_BOLA_ENERGIA, SIN_MULTIPLICADOR);
    }
}
