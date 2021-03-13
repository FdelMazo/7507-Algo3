package DragonBall.personajes;

import DragonBall.vitalidad.Vitalidad;

public abstract class Personaje {

    protected Vitalidad vida;

    public void recibirDanio(double danioRecibido) {
        vida = vida.recibirAtaque(danioRecibido);
    }

    public double getVida() {
        return this.vida.valorVida();
    }

}
