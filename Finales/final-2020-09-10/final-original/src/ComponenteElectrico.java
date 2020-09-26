
public class ComponenteElectrico {

    public String miTIPO = "NADA_POR_DEFAULT";
    public int metros;
    public int precioKw;
    public int calorias;
    public int ambientes;


    public ComponenteElectrico(String type){

        if (type == "LOSA_RADIANTE"){

            this.miTIPO = "LOSA_RADIANTE";

        }else if (type == "CeRcO-ElEcTrIcO"){

            this.miTIPO = "CeRcO-ElEcTrIcO";

        }else if (type == "estufa"){

            this.miTIPO = "estufa";

        }else{
            //Por defualt será nada
        }
    }

    public int getConsumo() {

        if (miTIPO == "LOSA_RADIANTE"){

            return precioKw * metros * metros;

        }else if (miTIPO == "CeRcO-ElEcTrIcO"){

            return metros * precioKw;

        }else if (miTIPO == "estufa"){

            return ambientes * precioKw * calorias;

        }else{
            return 0;
        }

    }
}
