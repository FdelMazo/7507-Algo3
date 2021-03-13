package DragonBall.kaiohken;

import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;

public class KaiohKenNormal extends KaiohKen{

    private static final double MULTIPLICADOR_NORMAL = 0.05;

    public KaiohKenNormal(){
        cantidadDeTurnos = 4;
    }

    @Override
    public KaiohKen afectarAtaque(Vegeta enemigo, int valorAtaqueKame, Vitalidad vidaGoku) {
        vidaGoku.afectarAtaque(enemigo, valorAtaqueKame, MULTIPLICADOR_NORMAL);
        this.cantidadDeTurnos--;
        return cantidadDeTurnos <= 0 ? new SinKaiohKen():this;
    }
}
