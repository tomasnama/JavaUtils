package es.tnm.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ficheros {
	
	/**Lista los ficheros de una carpeta
	 * @param sDir ruta de la carpeta a listar
	 */
	public static void listarDirectorio(String sDir) {
		File dir = new File(sDir);
		if (dir.exists()) {
			File[] ficheros = dir.listFiles();
			for (int x=0;x<ficheros.length;x++){
			  System.out.println(ficheros[x].getName());
			}
		}
		
	}
	
	/**Elimina una carpeta, si la carpeta tiene dicheros o más carpetas utiliza el método
	 * eliminarContenidoDirectorio para eliminar recursivamente
	 * @param sDir ruta de la carpeta a eliminar
	 * @throws IOException
	 */
	public static void eliminarDirectorio(String sDir) throws IOException {
		File dir = new File(sDir);
		if (dir.isDirectory()) {
			eliminarContenidoDirectorio(dir);
			if (dir.delete()) {
				System.out.println(dir.getName() + " eliminado correctamente.");
			} else {
				throw new FileNotFoundException("Error al eliminar: " + sDir);
			}
		}
	}
	
	/**Elimina recursivamente todo el contenido de una carpeta
	 * @param dir carpeta File 
	 * @throws IOException
	 */
	public static void eliminarContenidoDirectorio(File dir) throws IOException {
		File[] ficheros = dir.listFiles();
		for (int x = 0; x < ficheros.length; x++) {
			if (ficheros[x].isDirectory()) {
				eliminarContenidoDirectorio(ficheros[x]);
			}
			if (ficheros[x].delete()) {
				System.out.println(ficheros[x].getName() + " eliminado correctamente.");
			} else {
				throw new FileNotFoundException("Error al eliminar: " + ficheros[x].getName());
			}
		}
	}
	
	

}
