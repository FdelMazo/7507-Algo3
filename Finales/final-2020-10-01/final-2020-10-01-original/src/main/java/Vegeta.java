public class Vegeta {

    private double vida = 6000;

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return this.vida;
    }

    public void aplicarKaiohKen(String tipo) {
        System.out.println("Vegeta no sabe usar el Kaioh-Ken");
    }

    public void atacar(Goku enemigo, String ataque) {
        if (this.vida <= 0) {
            System.out.println("Vegeta está muerto. No puede atacar.");
            return;
        }
        if (enemigo.getVida() <= 0) {
            System.out.println("Enemigo está muerto. No se puede seguir atacándolo");
            return;
        }
        if (ataque == "GALICK-HO") {
            enemigo.setVida(enemigo.getVida() - (100  + this.vida * 0.1));
        } else if (ataque.equals("BOLA-DE-ENERGIA")) {
            enemigo.setVida(enemigo.getVida() - 50); // Ataque bien bàsico que quita siempre 50
        } else {
            System.out.println("Vegeta no puede atacar con " + ataque);
        }
    }
}
