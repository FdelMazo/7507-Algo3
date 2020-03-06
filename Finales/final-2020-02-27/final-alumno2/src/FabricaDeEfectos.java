import Efectos.*;

public class FabricaDeEfectos {

    public static ContenedorEfectos CrearEfectoAgregarCincoAlFinal() {
        ContenedorEfectos contenedorEfectos = new ContenedorEfectos();
        contenedorEfectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(5));
        return contenedorEfectos;
    }

    public static ContenedorEfectos CrearEfectoAgregarOchoAlFinal() {
        ContenedorEfectos contenedorEfectos = new ContenedorEfectos();
        contenedorEfectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(8));
        return contenedorEfectos;
    }

    public static ContenedorEfectos CrearEfectoDarVueltaYPrimeraMayuscula() {
        ContenedorEfectos contenedorEfectos = new ContenedorEfectos();
        contenedorEfectos.agregarEfecto(new EfectoDarVuelta());
        contenedorEfectos.agregarEfecto((new EfectoPrimeraMayuscula()));
        return contenedorEfectos;
    }

    public static ContenedorEfectos CrearEfectoPrimeraMayuscula() {
        ContenedorEfectos contenedorEfectos = new ContenedorEfectos();
        contenedorEfectos.agregarEfecto((new EfectoPrimeraMayuscula()));
        return contenedorEfectos;    }

    public static ContenedorEfectos CrearEfectoPrimeraMayusculaYAgregarOcho() {
        ContenedorEfectos contenedorEfectos = new ContenedorEfectos();
        contenedorEfectos.agregarEfecto((new EfectoPrimeraMayuscula()));
        contenedorEfectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(8));
        return contenedorEfectos;
    }

    public static ContenedorEfectos CrearEfectoPrimeroMinusculaYAgregarTres() {
        ContenedorEfectos contenedorEfectos = new ContenedorEfectos();
        contenedorEfectos.agregarEfecto(new EfectoPrimeraMinsucula());
        contenedorEfectos.agregarEfecto((new EfectoAgregarNumeroAlFinal(3)));
        return contenedorEfectos;
    }

    public static ContenedorEfectos CrearEfectoDarVueltaYPrimeraMinusculaYAgregarCuatroAlFinal(){
        ContenedorEfectos contenedorEfectos = new ContenedorEfectos();
        contenedorEfectos.agregarEfecto(new EfectoDarVuelta());
        contenedorEfectos.agregarEfecto(new EfectoPrimeraMinsucula());
        contenedorEfectos.agregarEfecto((new EfectoAgregarNumeroAlFinal(4)));
        return contenedorEfectos;
    }

}