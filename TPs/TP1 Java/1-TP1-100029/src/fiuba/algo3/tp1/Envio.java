package fiuba.algo3.tp1;

public class Envio implements Adicionable {
    private double valor = 100;

    public double calcularPrecio(double unPrecio){
        if(unPrecio < 5000)
            return unPrecio+valor;
        return unPrecio;
    }
}
