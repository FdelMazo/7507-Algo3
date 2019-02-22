package main;

public class Celda {
    private boolean yaSeContabilizo;

    private String letra;
    private int pesoLetra;

    public Celda() {

        this.yaSeContabilizo = false;
    }

    public void setLetra(String letra) {
    	
        this.letra = letra;
    }
    
    public void setPeso(int peso) {

    	if (peso < 0 ) {
    		System.out.println("El peso no puede ser negativo");
    		return ;
    	}
    	this.pesoLetra = peso;
    }

    public int getPesoLetra() {
        int result = 0;


        if (!this.yaSeContabilizo) {
            this.yaSeContabilizo = true;
            result = this.pesoLetra;
        } else {
            result = 0;
        }

        return result;
    }

}
