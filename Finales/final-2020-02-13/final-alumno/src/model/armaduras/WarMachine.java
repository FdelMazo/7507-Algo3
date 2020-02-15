package model.armaduras;

import model.entidades.ObjetoVenger;

public class WarMachine extends Armadura {

    private static final int INDICE_CURACION = 10;

    public WarMachine(){
        puntos_ataque = 10;
    }

    @Override
    public int atacar() {
        return puntos_ataque;
    }

    public void usarEstrategia(ObjetoVenger alguien){
        alguien.curar(INDICE_CURACION);
    }
}
