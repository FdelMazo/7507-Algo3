package DragonBall.ataques;

import DragonBall.personajes.Vegeta;
import DragonBall.vitalidad.Vitalidad;
import DragonBall.kaiohken.KaiohKen;

public interface AtaqueGoku {
    KaiohKen atacar(Vegeta enemigo, KaiohKen kaiohKen, Vitalidad vida);
}
