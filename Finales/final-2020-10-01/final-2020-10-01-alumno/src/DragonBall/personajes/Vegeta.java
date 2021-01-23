package DragonBall.personajes;

import DragonBall.ataques.AtaqueVegeta;
import DragonBall.vitalidad.Vivo;

public class Vegeta extends Personaje{

    private static final double VIDA_INICIAL_VEGETA = 6000;

    public Vegeta(){
        vida = new Vivo(VIDA_INICIAL_VEGETA);
    }

    public void atacar(Goku enemigo, AtaqueVegeta ataque) {
        ataque.atacar(enemigo,vida);
    }
}
