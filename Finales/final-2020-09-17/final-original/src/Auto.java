import java.util.Stack;

public class Auto {
    Stack<Cargas> cargas;

    public Auto() {

        this.cargas = new Stack<>();
    }

    public void cargar(Cargas carga) {

        if (carga == Cargas.BICI) {
            throw new RuntimeException();
        }
        this.cargas.add(carga);
    }

    public Cargas descargar() {
        return this.cargas.pop();
    }

}
