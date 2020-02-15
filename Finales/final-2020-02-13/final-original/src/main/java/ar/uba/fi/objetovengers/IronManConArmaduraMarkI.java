package ar.uba.fi.objetovengers;

public class IronManConArmaduraMarkI extends ObjetoVenger {
    private double puntosDeVida;
    private IronManConArmaduraDeWarMachine warMachine;
    private IronManConArmaduraMarkII markII;

    public IronManConArmaduraMarkI() {
        this.puntosDeVida = 100;
    }

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void atacar(Thanos thanos) {
        try {
            thanos.recibirDanio(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.markII != null) {
            double puntosDeAtaque = this.markII.getPuntosDeAtaque();
            try {
                thanos.recibirDanio(puntosDeAtaque);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.warMachine != null) {
            double puntosDeAtaque = this.warMachine.getPuntosDeAtaque();
            try {
                thanos.recibirDanio(puntosDeAtaque);
                this.puntosDeVida += puntosDeAtaque;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void agregarArmaduraDeWarMachine() {
        this.warMachine = new IronManConArmaduraDeWarMachine();
    }
    
    public void agregarArmaduraMarkII() {
        this.markII = new IronManConArmaduraMarkII();
    }

    @Override
    public void recibirDanio(double danio) {
        this.puntosDeVida -= danio;
    }

    public double getPuntosDeAtaque() {
        return 10.0f;
    }
}
