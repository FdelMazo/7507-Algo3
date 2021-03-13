package DragonBall.vitalidad;

import DragonBall.personajes.Personaje;

public interface Vitalidad {
    Vitalidad recibirAtaque(double danioRecibido);

    double valorVida();

    void afectarAtaque(Personaje enemigo, int danioBase, double multiplicadorAtaque);

}
