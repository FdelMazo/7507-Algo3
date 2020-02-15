package model.entidades;

public abstract class ObjetoVenger {


    protected double puntosDeVida;

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void recibirDanio(double danio){
        this.puntosDeVida -= danio;
    }

    public void curar(int masVida) {
        puntosDeVida += masVida;
    }

    //A implementar por cada entidad
    public abstract void atacar(ObjetoVenger otroVenger);

}

