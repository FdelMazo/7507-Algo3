package finales;

import java.util.Collection;

public class ServicioSMS {
	
	private class SMS {
		private String telefono;
		private String mensaje;
		private SMS (String telefono, String mensaje) {
			this.telefono = telefono;
			this.mensaje = mensaje;
		}
	}
	
	public void enviarVariosSMS (Collection<Alumno> lista, String mensaje) {
		for (Alumno destinatario : lista) {
			SMS sms = new SMS (destinatario.getTelefono(), mensaje);
			enviarSMS(sms);
		}
	}
	

	private void enviarSMS(SMS mensaje) {
		// TODO Este método envía 1 SMS
	}

}
