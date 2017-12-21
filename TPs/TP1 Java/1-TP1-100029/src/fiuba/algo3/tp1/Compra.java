package fiuba.algo3.tp1;

import java.util.ArrayList;

public class Compra {
    private int precioBruto;
    private ArrayList<Adicionable> adicionables = new ArrayList<Adicionable>();
    private Cupon cupon = null;

    public void agregarPrecio(int unPrecio){
        precioBruto+=unPrecio;
    }

    public double calcularPrecioTotal(){
        double precioTotal = precioBruto;
        for (Adicionable adicionable : adicionables)
                precioTotal = adicionable.calcularPrecio(precioTotal);
        if(cupon != null)
            precioTotal = cupon.calcularPrecio(precioTotal);
        return precioTotal;
    }

    public void agregarAdicionable(Adicionable unAdicionable){
        adicionables.add(unAdicionable);
    }

    private Cupon elegirMejorCupon(Cupon unCupon, Cupon otroCupon){
        return (otroCupon == null||unCupon.esMayorQue(otroCupon)) ? unCupon : otroCupon;

}
    public void agregarCupon(Cupon unCupon){
        cupon = this.elegirMejorCupon(unCupon, cupon);
    }
}
