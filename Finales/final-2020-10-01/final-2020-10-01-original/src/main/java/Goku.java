public class Goku {

    private KaiohKen kaiohKen = KaiohKen.SIN_KAIOH_KEN;
    protected int cantidadKaiohKen = 0;
    private double vida = 5000;

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return this.vida;
    }

    public void aplicarKaiohKen(String tipo) {
        if (tipo == "KAIOH-KEN") {
            this.kaiohKen = KaiohKen.KAIOH_KEN; // El Kaioh Ken permite que pueda atacar con más poder
            this.cantidadKaiohKen = 4; // le va a durar cuatro turnos
        } else if (tipo == "KAIOH-KEN-X3") {
            this.kaiohKen = KaiohKen.KAIOH_KEN_X3; // El triple de poder
            this.cantidadKaiohKen = 3; // este dura solo tres turnos
        }
    }

    public void atacar(Vegeta enemigo, String ataque) {
        if (this.vida <= 0) {
            System.out.println("Vegeta está muerto. No puede atacar.");
            return;
        }
        if (enemigo.getVida() <= 0) {
            System.out.println("Enemigo está muerto. No se puede seguir atacándolo");
            return;
        }
        if (ataque == "KAME-HAME-HA") {
            if (this.kaiohKen == KaiohKen.SIN_KAIOH_KEN) {
                enemigo.setVida(enemigo.getVida() - 100);
            } else if (this.kaiohKen == KaiohKen.KAIOH_KEN) {
                enemigo.setVida(enemigo.getVida() - 100 - this.vida * 0.05); // Con KaiohKen ataco un 5% de mi vida más
                this.cantidadKaiohKen--;
                if (this.cantidadKaiohKen == 0) this.kaiohKen = KaiohKen.SIN_KAIOH_KEN;
            } else if (this.kaiohKen == KaiohKen.KAIOH_KEN_X3) {
                enemigo.setVida(enemigo.getVida() - 100 - this.vida * 0.15); // Con KaiohKenX3 ataco un 5% de mi vida más
                this.cantidadKaiohKen--;
                if (this.cantidadKaiohKen == 0) this.kaiohKen = KaiohKen.SIN_KAIOH_KEN;
            }
        } else if (ataque == "BOLA-DE-ENERGIA") {
            enemigo.setVida(enemigo.getVida() - 50); // Ataque bien bàsico que quita siempre 50 independientemente de si tengo o no Kaioh-Ken
        } else {
            System.out.println("Goku no puede atacar con " + ataque);
        }
    }
}
