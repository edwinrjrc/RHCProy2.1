/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class TributoDTO extends BaseDTO {

	private static final long serialVersionUID = 1429629874219514431L;

	private String codigoInternacional;

	/**
	 * @return the codigoInternacional
	 */
	public String getCodigoInternacional() {
		return codigoInternacional;
	}

	/**
	 * @param codigoInternacional the codigoInternacional to set
	 */
	public void setCodigoInternacional(String codigoInternacional) {
		this.codigoInternacional = codigoInternacional;
	}
}
