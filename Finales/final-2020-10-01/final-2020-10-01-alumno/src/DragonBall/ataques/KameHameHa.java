package DragonBall.ataques;

import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;
import DragonBall.kaiohken.KaiohKen;

public class KameHameHa implements AtaqueGoku{

    static private int VALOR_ATAQUE_KAME = 100;

    @Override
    public KaiohKen atacar(Vegeta enemigo, KaiohKen kaiohKen, Vitalidad vidaGoku) {
        return kaiohKen.afectarAtaque(enemigo,VALOR_ATAQUE_KAME,vidaGoku);
    }
}
