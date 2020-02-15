package model.entidades;

import model.armaduras.Armadura;
import model.armaduras.MarkI;

import java.util.ArrayList;
import java.util.Iterator;

public class IronMan extends ObjetoVenger {

    private ArrayList<Armadura> armaduras = new ArrayList<>();

    public IronMan(){
        this.puntosDeVida = 100;
        this.armaduras.add(new MarkI());
    }
    public IronMan(Armadura unaArmadura) {
        this.puntosDeVida = 100;
        this.armaduras.add(unaArmadura);
    }

    public void agregarArmadura(Armadura unaArmadura) {
        this.armaduras.add(unaArmadura);
    }

    @Override
    public void atacar(ObjetoVenger otroVenger) {

        for (Armadura armaduraActual : armaduras) {
            otroVenger.recibirDanio(armaduraActual.atacar());
            armaduraActual.usarEstrategia(this);
        }
    }
}
