package model.entidades;

public class Thanos extends ObjetoVenger {

    private boolean tieneGemasDelInfinito;


    public Thanos() {
        this.puntosDeVida = 250;
        this.tieneGemasDelInfinito = false;
    }

    public void atacar(ObjetoVenger ironMan) {
        ironMan.recibirDanio(this.tieneGemasDelInfinito ? 60 : 15);
    }

    public void conseguirLasGemasDelInfinito() {
        this.tieneGemasDelInfinito = true;
    }
}
