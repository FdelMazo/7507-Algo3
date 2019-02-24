package reglas;

public interface IRegla {
    boolean verificar(String letra, int peso) throws RuntimeException;
}
