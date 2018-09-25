/**
 * 
 */
package pe.com.rh.sunat.ejb.util;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineType;

/**
 * @author Edwin
 *
 */
public class UtilUBL {

	public static IDType generarIdType(String valor) {
		IDType idValor = new IDType();
		idValor.setValue(valor);
		return idValor;
	}
	
	public static LineType generarLineType(String valor){
		LineType tipoLinea = new LineType();
		tipoLinea.setValue(valor);
		return tipoLinea;
	}
	
	public static DocumentTypeCodeType generarDocCodeType(String valor){
		DocumentTypeCodeType doc = new DocumentTypeCodeType();
		doc.setValue(valor);
		return doc;
	}
}
