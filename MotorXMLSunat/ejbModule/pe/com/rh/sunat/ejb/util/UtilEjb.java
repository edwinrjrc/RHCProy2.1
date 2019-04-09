/**
 * 
 */
package pe.com.rh.sunat.ejb.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

/**
 * @author Edwin
 *
 */
public class UtilEjb {

	public static XMLGregorianCalendar convertirDateAGregorian(Date fecha) throws DatatypeConfigurationException{
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(fecha);
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
	}
	
	public static BigDecimal convertirABigDecimal(int numero){
		return BigDecimal.valueOf(Long.valueOf(numero));
	}
	
	public static BigDecimal convertirABigDecimal(String numero){
		return BigDecimal.valueOf(Long.valueOf(numero));
	}
	
	public static Date parseaFecha(String fecha, String pattern) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(fecha);
	}
	
	public static String parseaFecha(Date fecha, String pattern) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(fecha);
	}
	
	public static boolean validaDatoEsBlancoNullo(Object objeto){
		if (objeto instanceof String){
			if (StringUtils.isBlank(objeto.toString())){
				return true;
			}
		}
		else{
			if (objeto == null){
				return true;
			}
		}
		return false;
	}
	
	public static long diferenciaFechas(Date fechaInicio, Date fechaFin) throws ParseException{
		String feInicio = parseaFecha(fechaInicio,"dd/MM/yyyy");
		String feFin    = parseaFecha(fechaFin,"dd/MM/yyyy");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ChronoLocalDate from = ChronoLocalDate.from(formatter.parse(feInicio));
        ChronoLocalDate to = ChronoLocalDate.from(formatter.parse(feFin));
        ChronoPeriod period = ChronoPeriod.between(from, to);
        
        long diferencia = period.get(ChronoUnit.DAYS);
		return diferencia;
	}
}
