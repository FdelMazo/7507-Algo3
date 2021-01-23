package DragonBall.kaiohken;

import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;

public class KaiohKenX4 extends KaiohKen{

    private static final double MULTIPLICADOR_X4 = 0;
    private static final int DANIO_KAIOKEN_X4 = 800;
    private static final int COSTO_DEL_KAIOKEN_X4 = 300;


    public KaiohKenX4(){
        cantidadDeTurnos = 2;
    }

    @Override
    public KaiohKen afectarAtaque(Vegeta enemigo, int valorAtaqueKame, Vitalidad vidaGoku) {
        vidaGoku.afectarAtaque(enemigo,DANIO_KAIOKEN_X4,MULTIPLICADOR_X4);
        Vitalidad vida = vidaGoku.recibirAtaque(COSTO_DEL_KAIOKEN_X4);
        if(vida.valorVida()<=0){
            throw new GokuMurioAplicandoKaiohKenExcepcion();
        }
        this.cantidadDeTurnos--;
        return this.cantidadDeTurnos <= 0 ? new SinKaiohKen() : this;
    }
}
