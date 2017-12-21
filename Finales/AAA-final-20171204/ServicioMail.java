package finales;

import java.util.Collection;

public class ServicioMail {
	
	private class EMail {
		private String direccion;
		private String asunto;
		private String contenido;
		private EMail (String direccion, String asunto, String contenido) {
			this.direccion = direccion;
			this.asunto = asunto;
			this.contenido = contenido;
		}
	}
	
	public void enviarMails (Collection<Alumno> lista, String asunto, String mensaje) {
		for (Alumno destinatario : lista) {
			String contenido = "Estimado " + destinatario.getNombre() + mensaje;
			EMail email = new EMail (destinatario.getEmail(), asunto, contenido);
			enviarMail(email);
		}
	
	}

	private void enviarMail(EMail email) {
		// TODO Este método envía 1 e-mail
	}

}
