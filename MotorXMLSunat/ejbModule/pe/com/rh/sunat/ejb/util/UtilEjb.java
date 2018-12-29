/**
 * 
 */
package pe.com.rh.sunat.ejb.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
}
