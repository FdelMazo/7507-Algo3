package fabricas;

import excepciones.LargoInvalidoExcepcion;
import herramientasFabricas.DetectorLetra;
import herramientasFabricas.IHerramientaDetectorLetra;
import letras.Consonante;
import letras.Letra;
import letras.Vocal;
import reglas.IRegla;
import reglas.ReglaLargo;
import reglas.ReglaPeso;

import java.util.ArrayList;
import java.util.List;

public class FabricaLetra implements IFabricaLetra {

    private IHerramientaDetectorLetra herramientaDetectorLetra;

    public FabricaLetra(){
        this.herramientaDetectorLetra = new DetectorLetra();
    }

    @Override
    public Letra crearLetra(String letra, int peso) throws LargoInvalidoExcepcion {
        if (this.herramientaDetectorLetra.esVocal(letra)) return new Vocal(letra, peso, this.generarReglasNecesarias());
        return new Consonante(letra, peso, this.generarReglasNecesarias());
    }

    private List<IRegla> generarReglasNecesarias(){
        List<IRegla> reglas = new ArrayList<>();
        reglas.add(new ReglaLargo());
        reglas.add(new ReglaPeso());
        return reglas;
    }
}
