package DragonBall.vitalidad;

import DragonBall.personajes.Personaje;

public class Vivo implements Vitalidad{
    private double vida;
    public Vivo(double vidaInicial) {
        vida = vidaInicial;
    }

    @Override
    public Vitalidad recibirAtaque(double danioRecibido) {
        vida -= danioRecibido;
        return vida<=0 ? new Muerto():this;
    }

    @Override
    public double valorVida() {
        return vida;
    }

    @Override
    public void afectarAtaque(Personaje enemigo, int danioBase, double multiplicadorAtaque) {
        enemigo.recibirDanio(danioBase + vida * multiplicadorAtaque);
    }
}
