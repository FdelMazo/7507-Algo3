package herramientasFabricas;

public class DetectorLetra implements IHerramientaDetectorLetra {
    @Override
    public boolean esVocal(String letra) {
        if(letra.toLowerCase().equals("a")) return true;
        if(letra.toLowerCase().equals("e")) return true;
        if(letra.toLowerCase().equals("i")) return true;
        if(letra.toLowerCase().equals("o")) return true;
        if(letra.toLowerCase().equals("u")) return true;
        return false;
    }
}
