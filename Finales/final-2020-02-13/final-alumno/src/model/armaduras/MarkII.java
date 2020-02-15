package model.armaduras;

public class MarkII extends Armadura {

    public MarkII(){
        puntos_ataque = 12;
    }

    @Override
    public int atacar() {
        return puntos_ataque;
    }

}
