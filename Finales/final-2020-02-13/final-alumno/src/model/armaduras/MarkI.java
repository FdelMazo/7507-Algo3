package model.armaduras;


public class MarkI extends Armadura {

    public MarkI(){
        puntos_ataque = 10;
    }

    @Override
    public int atacar() {
        return puntos_ataque;
    }

}
