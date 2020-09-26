import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Casa {

    public List<ComponenteElectrico> estufas = new ArrayList<ComponenteElectrico>();
    public List<ComponenteElectrico> cercos = new ArrayList<ComponenteElectrico>();
    public List<ComponenteElectrico> losas = new ArrayList<ComponenteElectrico>();

    public int getGastoTotal() {

        int gasto = 0;

        Iterator<ComponenteElectrico> iterador = estufas.iterator();

        while (iterador.hasNext()){
            ComponenteElectrico estufa = iterador.next();
            gasto = gasto + estufa.getConsumo();
        }

        iterador = cercos.iterator();

        while (iterador.hasNext()){
            ComponenteElectrico cerco = iterador.next();
            gasto = gasto + cerco.getConsumo();
        }

        iterador = losas.iterator();

        while (iterador.hasNext()){
            ComponenteElectrico losa = iterador.next();
            gasto = gasto + losa.getConsumo();
        }

        return gasto;
    }

}

