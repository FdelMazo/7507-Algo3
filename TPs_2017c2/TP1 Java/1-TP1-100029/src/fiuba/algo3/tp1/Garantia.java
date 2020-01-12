package fiuba.algo3.tp1;

public class Garantia implements Adicionable {
    private double valor = 10;

    public double calcularPrecio(double unPrecio){
        return unPrecio*( (100+valor) /100);
    }
}


