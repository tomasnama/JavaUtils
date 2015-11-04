package es.tnm.util;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		 //System.out.println(Fechas.diasParaFinDeMes());
		 //Ficheros.listarDirectorio("C:\\");
		try {
			Ficheros.eliminarDirectorio("C:\\Test\\");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	 

}
