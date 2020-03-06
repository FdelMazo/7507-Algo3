import java.util.ArrayList;
public class EfectosCompuestos implements Efecto {

    ArrayList<Efecto> efectos = new ArrayList<>();

    public EfectosCompuestos(Efecto efecto) {
        this.efectos.add(efecto);
    }

    public void aniadirEfecto(Efecto efecto) {
        this.efectos.add(efecto);
    }

    @Override
    public String aplicarA(String unaCadena) {
        String cadenaFinal = unaCadena;
        for(Efecto efecto : efectos){
            cadenaFinal = efecto.aplicarA(cadenaFinal);
        }
        return cadenaFinal;
    }
}
