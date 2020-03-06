package Exceptions;

public class CadenaVaciaException extends RuntimeException{
    public CadenaVaciaException(){
        super("no se puede aplicar efecto a cadena vacia");
    }
}
