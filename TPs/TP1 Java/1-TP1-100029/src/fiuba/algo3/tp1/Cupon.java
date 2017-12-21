package fiuba.algo3.tp1;

public class Cupon {
    private double valor = 0;

    public Cupon(double unPorcentaje){
        if(unPorcentaje < 0 || unPorcentaje > 100)
            throw new CuponPorcentajeInvalidoError();
        valor = unPorcentaje;
    }

    public double calcularPrecio(double unPrecio){
       return unPrecio - (unPrecio * (valor/100));
    }

    public boolean esMayorQue(Cupon otroCupon){
       return valor >= otroCupon.valor;
    }
}
