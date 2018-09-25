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

	private BaseVODTO codigoInternacional;

	/**
	 * @return the codigoInternacional
	 */
	public BaseVODTO getCodigoInternacional() {
		return codigoInternacional;
	}

	/**
	 * @param codigoInternacional the codigoInternacional to set
	 */
	public void setCodigoInternacional(BaseVODTO codigoInternacional) {
		this.codigoInternacional = codigoInternacional;
	}
	
}
