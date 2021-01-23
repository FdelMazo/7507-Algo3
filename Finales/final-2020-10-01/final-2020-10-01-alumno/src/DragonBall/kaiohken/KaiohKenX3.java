package DragonBall.kaiohken;

import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;

public class KaiohKenX3 extends KaiohKen{

    private double MULTIPLICADOR_X3 = 0.15;

    public KaiohKenX3(){
        cantidadDeTurnos = 3;
    }

    @Override
    public KaiohKen afectarAtaque(Vegeta enemigo, int valorAtaqueKame, Vitalidad vidaGoku) {
        vidaGoku.afectarAtaque(enemigo,valorAtaqueKame,MULTIPLICADOR_X3);
        this.cantidadDeTurnos--;
        return this.cantidadDeTurnos <= 0 ? new SinKaiohKen() : this;
    }
}
