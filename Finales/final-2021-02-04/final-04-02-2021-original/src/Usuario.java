public class Usuario {

    String nombre;

    int CANTIDAD_DE_TIMBRAZOS = 0;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void recibir(String notificacion) {
        if (notificacion.equals("timbre")) {
            this.CANTIDAD_DE_TIMBRAZOS = this.CANTIDAD_DE_TIMBRAZOS + 1;
        }
    }

}
