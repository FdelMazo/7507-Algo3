import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class PruebaArchivos {
	
	@Test
	public void pruebaComprimirArchivo() {
		Entrada archivo = new Entrada("mi-archivo.x", false, Collections.emptyList());
		CompresorNombres compresor = new CompresorNombres(5);
		Assert.assertEquals("mi-ar", compresor.comprimir(archivo));
	}
	
	@Test
	public void pruebaComprimirDirectorio() {
		Entrada archivo1 = new Entrada("hola.txt", false, Collections.emptyList());
		Entrada archivo2 = new Entrada("chau.txt", false, Collections.emptyList());
		Entrada directorio = new Entrada("carpeta", true, Arrays.asList(archivo1, archivo2));
		CompresorNombres compresor = new CompresorNombres(3);
		Assert.assertEquals("car(hol) car(cha)", compresor.comprimir(directorio));		
	}

	@Test
	public void pruebaComprimirDirectorioAnidado() {
		Entrada archivo1 = new Entrada("hola.txt", false, Collections.emptyList());
		Entrada archivo2 = new Entrada("chau.txt", false, Collections.emptyList());
		Entrada directorio1 = new Entrada("documentos", true, Arrays.asList(archivo1, archivo2));
		Entrada directorio2 = new Entrada("usuario", true, Arrays.asList(directorio1));
		CompresorNombres compresor = new CompresorNombres(3);
		Assert.assertEquals("usu(doc(hol) doc(cha))", compresor.comprimir(directorio2));		
	}

}