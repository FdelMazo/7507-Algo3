public class DispositivoInteligente {
    CentralUnicaGlobalDeNotificaciones central;
    Usuario duenio;

    public DispositivoInteligente(Usuario usuario) {
        this.duenio = usuario;
        this.central = new CentralUnicaGlobalDeNotificaciones();
    }

    public void sonar() {
        this.central.notificarSonido(this.duenio);
    }
}
