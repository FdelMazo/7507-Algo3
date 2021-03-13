package DragonBall.personajes;

import DragonBall.ataques.AtaqueGoku;
import DragonBall.kaiohken.KaiohKen;
import DragonBall.kaiohken.SinKaiohKen;
import DragonBall.vitalidad.Vivo;

public class Goku extends Personaje{

    private static final double VIDA_INICIAL_GOKU = 5000;
    private KaiohKen kaiohKen;

    public Goku(){
        vida = new Vivo(VIDA_INICIAL_GOKU);
        kaiohKen = new SinKaiohKen();
    }


    public void aplicarKaiohKen(KaiohKen unKaiohKen) {
        kaiohKen = unKaiohKen;
    }

    public void atacar(Vegeta enemigo, AtaqueGoku ataque) {
        kaiohKen = ataque.atacar(enemigo,kaiohKen,vida);
    }

}
