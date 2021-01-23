package DragonBall.kaiohken;

import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;

public class SinKaiohKen extends KaiohKen{

    private int SIN_MULTIPLICADOR = 0;

    public SinKaiohKen(){
        cantidadDeTurnos = 0;
    }

    @Override
    public KaiohKen afectarAtaque(Vegeta enemigo, int valorAtaqueKame, Vitalidad vidaGoku) {
        vidaGoku.afectarAtaque(enemigo, valorAtaqueKame, SIN_MULTIPLICADOR);
        return this;
    }
}
