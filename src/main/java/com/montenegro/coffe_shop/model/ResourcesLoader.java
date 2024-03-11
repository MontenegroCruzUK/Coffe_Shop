package com.montenegro.coffe_shop.model;

import java.io.InputStream;
import java.net.URL;

/**
 * Clase de utilidad para cargar recursos del classpath.
 * Esta clase no debe ser instanciada.
 */
public class ResourcesLoader {
	
	/**
	 * Constructor privado para prevenir la creación de instancias de esta clase.
	 */
	private ResourcesLoader () {
	}
	
	/**
	 * Carga un recurso del classpath y devuelve su URL.
	 *
	 * @param path La ruta del recurso en el classpath.
	 * @return La URL del recurso, o null si el recurso no se encuentra.
	 */
	public static URL loadUrl (String path) {
		return ResourcesLoader.class.getResource (path);
	}
	
	/**
	 * Carga un recurso del classpath y devuelve su URL como una cadena.
	 *
	 * @param path La ruta del recurso en el classpath.
	 * @return La URL del recurso como una cadena, o null si el recurso no se encuentra.
	 */
	public static String load (String path) {
		return loadUrl (path).toString ();
	}
	
	/**
	 * Carga un recurso del classpath y devuelve un InputStream para leerlo.
	 *
	 * @param name El nombre del recurso en el classpath.
	 * @return Un InputStream para leer el recurso, o null si el recurso no se encuentra.
	 */
	public static InputStream loadStream (String name) {
		return ResourcesLoader.class.getResourceAsStream (name);
	}
	
}
