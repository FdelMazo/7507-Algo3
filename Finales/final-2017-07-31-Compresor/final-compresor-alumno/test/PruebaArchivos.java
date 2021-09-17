package test;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import compresor.CompresorNombres;
import entrada.Archivo;
import entrada.Directorio;
import entrada.Entrada;

public class PruebaArchivos {
	
	@Test
	public void pruebaComprimirArchivo() {
		Entrada archivo = new Archivo("mi-archivo.x");
		CompresorNombres compresor = new CompresorNombres(5);
		Assert.assertEquals("mi-ar", compresor.comprimir(archivo));
	}
	
	@Test
	public void pruebaComprimirDirectorio() {
		Entrada archivo1 = new Archivo("hola.txt");
		Entrada archivo2 = new Archivo("chau.txt");
		Entrada directorio = new Directorio("carpeta", Arrays.asList(archivo1, archivo2));
		CompresorNombres compresor = new CompresorNombres(3);
		Assert.assertEquals("car(hol) car(cha)", compresor.comprimir(directorio));		
	}

	@Test
	public void pruebaComprimirDirectorioAnidado() {
		Entrada archivo1 = new Archivo("hola.txt");
		Entrada archivo2 = new Archivo("chau.txt");
		Entrada directorio1 = new Directorio("documentos", Arrays.asList(archivo1, archivo2));
		Entrada directorio2 = new Directorio("usuario", Arrays.asList(directorio1));
		CompresorNombres compresor = new CompresorNombres(3);
		Assert.assertEquals("usu(doc(hol) doc(cha))", compresor.comprimir(directorio2));		
	}

}