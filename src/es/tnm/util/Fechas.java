package es.tnm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author tomas.navarro@gmail.com
 *
 */
public class Fechas {
	
	/**Calcula la diferencia entre meses
	 */
	public static void diferenciaMeses() {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int meses = 0;
		String sdate = "2013-06-08 00:00:00";
		Date date;
		try {
			date = formatoDelTexto.parse(sdate);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			Calendar now = Calendar.getInstance();
			now.set(Calendar.HOUR, 0);
			now.set(Calendar.HOUR_OF_DAY, 0);
			now.set(Calendar.MINUTE, 0);
			now.set(Calendar.SECOND, 0);
			now.set(Calendar.MILLISECOND, 0);
			
			
			while (now.compareTo(cal) > 0) {
				cal.add(Calendar.MONTH,1); 
				
				System.out.println(now.get(Calendar.YEAR)+" == " +cal.get(Calendar.YEAR));
				System.out.println(now.get(Calendar.MONTH)+" == " +cal.get(Calendar.MONTH));
				
				if (now.get(Calendar.YEAR) == cal.get(Calendar.YEAR) && now.get(Calendar.MONTH) == cal.get(Calendar.MONTH)) {
					if (now.get(Calendar.DAY_OF_MONTH)<=cal.get(Calendar.DAY_OF_MONTH)) {
						meses ++;
					}
					break;
				} else {
					meses ++;
				}
				
				System.out.println(meses);
			}
			
			System.out.println("Return: "+meses);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    /**Calcula los días para llegar a final de mes
     * @return número de días
     */
    public static int diasParaFinDeMes() {
        Calendar cal = Calendar.getInstance();
        int today = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(today);
        cal.set(cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.getActualMaximum(Calendar.DAY_OF_MONTH),
                cal.getMaximum(Calendar.HOUR_OF_DAY),
                cal.getMaximum(Calendar.MINUTE),
                cal.getMaximum(Calendar.SECOND));
        int lastday = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(lastday);
        return lastday-today;
    }

}
