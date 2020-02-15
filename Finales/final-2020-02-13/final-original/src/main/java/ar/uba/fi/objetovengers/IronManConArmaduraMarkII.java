package ar.uba.fi.objetovengers;

public class IronManConArmaduraMarkII extends ObjetoVenger {
    private double puntosDeVida;
    private IronManConArmaduraDeWarMachine warMachine;
    private IronManConArmaduraMarkI markI;

    public IronManConArmaduraMarkII() {
        this.puntosDeVida = 100;
    }

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void atacar(Thanos thanos) {
        try {
            thanos.recibirDanio(12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (this.markI != null) {
            double puntosDeAtaque = this.markI.getPuntosDeAtaque();
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

    public double getPuntosDeAtaque() {
        return 12.0f;
    }

    @Override
    public void recibirDanio(double danio) {
        this.puntosDeVida -= danio;
    }

    public void agregarArmaduraDeWarMachine() {
        this.warMachine = new IronManConArmaduraDeWarMachine();
    }

    public void agregarArmaduraMarkI() {
        this.markI = new IronManConArmaduraMarkI();
    }
}
