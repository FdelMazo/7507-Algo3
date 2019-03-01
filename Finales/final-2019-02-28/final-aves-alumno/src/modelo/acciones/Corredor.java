package modelo.acciones;

import modelo.superficie.Superficie;
import modelo.superficie.SuperficieBarro;
import modelo.superficie.SuperficieHielo;
import modelo.superficie.SuperficiePistaAtletismo;

public interface Corredor {

    int correr(Superficie superficie);
    int correr(SuperficieBarro superficie);
    int correr(SuperficieHielo superficie);
    int correr(SuperficiePistaAtletismo superficie);


}
