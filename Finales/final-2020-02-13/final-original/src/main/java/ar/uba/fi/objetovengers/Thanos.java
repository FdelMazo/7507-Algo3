package ar.uba.fi.objetovengers;

public class Thanos {
    private double puntosDeVida;
    private boolean tieneGemasDelInfinito;

    public Thanos() {
        this.puntosDeVida = 250;
        this.tieneGemasDelInfinito = false;
    }

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void recibirDanio(double danio) throws Exception {
        this.puntosDeVida -= danio;
    }

    public void atacar(ObjetoVenger ironMan) {
        ironMan.recibirDanio(this.tieneGemasDelInfinito ? 60 : 15);
    }

    public void conseguirLasGemasDelInfinito() {
        this.tieneGemasDelInfinito = true;
    }
}
