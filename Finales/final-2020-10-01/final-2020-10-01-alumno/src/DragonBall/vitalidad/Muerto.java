package DragonBall.vitalidad;

import DragonBall.personajes.Personaje;

public class Muerto implements Vitalidad{

    private static final double SIN_VIDA = 0;

    @Override
    public Vitalidad recibirAtaque(double danioRecibido) {
        return this;
    }

    @Override
    public double valorVida() {
        return SIN_VIDA;
    }

    @Override
    public void afectarAtaque(Personaje enemigo, int danioBase, double multiplicadorAtaque) {
        // Esta muerto, por lo que no lo afecta
    }
}
