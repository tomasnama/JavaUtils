package es.tnm.util;

/**
 * @author Tomas Navarro Martinez
 * Utilidades para manejar Strings
 */
public class StrUtil {

	public StrUtil() {
		super();
	}
	
	/** Compara dos versiones de software, la mínima y la actual, numéricos separados por puntos xx.xx.xx...xx 
	 * @param minVersion versión mínima
	 * @param currentVersion versión actual
	 * @return FALSE si la versión actual es menor que la mínima, TRUE si la versión actual es mayor o igual a la mínima
	 */
	public boolean esVersionCorrecta(String minVersion, String currentVersion) {
		boolean equals = Boolean.TRUE;
		String[] minNumList = minVersion.split("\\.");
		String[] verNumList = currentVersion.split("\\.");
		for (int i = 0; i < minNumList.length; i++) {
			Integer minNum = 0;
			Integer verNum = 0;
			try {
				minNum = Integer.parseInt(minNumList[i]);
				verNum = Integer.parseInt(verNumList[i]);
			} catch (NumberFormatException e) {
			} catch (ArrayIndexOutOfBoundsException e) {
				return !equals;
			}
			if (minNum > verNum) {
				return Boolean.FALSE;
			} else if (minNum < verNum) {
				equals = Boolean.FALSE;
			}
		}

		return Boolean.TRUE;
	}

}
