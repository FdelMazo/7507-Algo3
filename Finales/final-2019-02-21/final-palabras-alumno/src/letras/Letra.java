package letras;
import reglas.IRegla;

import java.util.List;

public abstract class Letra {

    protected String letra;
    protected int peso;

    public Letra(String letra, int peso, List<IRegla> reglas){
        for(IRegla regla : reglas) regla.verificar(letra, peso);
        this.letra = letra;
        this.peso = peso;
    }

    public int obtenerPeso(){
        return this.peso;
    }
}
