package es.tnm.util;

/**
 * @author Tomas Navarro Martinez
 *
 */
public class Dni {
	
	/**Calcula la letra del DNI
	 * @param dni
	 * @return
	 */
	public static char calculaLetra(int dni) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKET";
		int modulo = dni % 23;
		char letra = juegoCaracteres.charAt(modulo);
		return letra;
	}

}
