package ar.uba.fi.objetovengers;

public class IronManConArmaduraDeWarMachine extends ObjetoVenger {
    private double puntosDeVida;
    private IronManConArmaduraMarkI markI;
    private IronManConArmaduraMarkII markII;

    public IronManConArmaduraDeWarMachine() {
        this.puntosDeVida = 100;
    }

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void atacar(Thanos thanos) {
        try {
            thanos.recibirDanio(10);
            this.puntosDeVida += 10;
            if (this.markI != null) {
                double puntosDeAtaque = this.markI.getPuntosDeAtaque();
                thanos.recibirDanio(puntosDeAtaque);
            }
            if (this.markII != null) {
                double puntosDeAtaque = this.markII.getPuntosDeAtaque();
                thanos.recibirDanio(puntosDeAtaque);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getPuntosDeAtaque() {
        return 10.0f;
    }

    @Override
    public void recibirDanio(double danio) {
        this.puntosDeVida -= danio;
    }

    public void agregarArmaduraMarkI() {
        this.markI = new IronManConArmaduraMarkI();
    }

    public void agregarArmaduraMarkII() {
        this.markII = new IronManConArmaduraMarkII();
    }
}
