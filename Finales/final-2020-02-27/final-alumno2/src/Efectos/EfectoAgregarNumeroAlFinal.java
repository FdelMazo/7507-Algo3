package Efectos;

public class EfectoAgregarNumeroAlFinal extends Efecto{
    private int numero;
    public EfectoAgregarNumeroAlFinal(int numero){
        this.numero = numero;
    }
    @Override
    public String aplicarEfecto(String unaCadena) {
        return unaCadena + this.numero;
    }
}
