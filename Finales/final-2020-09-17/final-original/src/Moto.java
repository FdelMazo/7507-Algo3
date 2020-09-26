import java.util.Stack;

public class Moto {
    Stack<Cargas> cargas;

    public Moto() {

        this.cargas = new Stack<>();
    }

    public void cargar(Cargas carga) {
        this.cargas.push(carga);
    }

    public Cargas descargar() {

        return this.cargas.pop();
    }

}
