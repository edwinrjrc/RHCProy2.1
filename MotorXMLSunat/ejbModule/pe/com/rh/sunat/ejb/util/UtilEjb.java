/**
 * 
 */
package pe.com.rh.sunat.ejb.util;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

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
}
