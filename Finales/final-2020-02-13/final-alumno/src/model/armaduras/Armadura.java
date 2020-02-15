package model.armaduras;

import model.entidades.ObjetoVenger;

public abstract class Armadura implements Estrategia {

    protected int puntos_ataque = 0;

    public abstract int atacar();
    public void usarEstrategia(ObjetoVenger alguien){

    }
}
