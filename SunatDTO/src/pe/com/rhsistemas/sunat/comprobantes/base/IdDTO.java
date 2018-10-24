/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class IdDTO extends BaseDTO {

	private static final long serialVersionUID = -8697700184843888181L;
	
	private String esquemaNombre;
	private String esquemaNombreAgencia;
	private String esquemaURI;
	private String esquemaId;
	private String esquemaIdAgencia;
	private String valor;
	
	
	/**
	 * @return the esquemaNombre
	 */
	public String getEsquemaNombre() {
		return esquemaNombre;
	}
	/**
	 * @param esquemaNombre the esquemaNombre to set
	 */
	public void setEsquemaNombre(String esquemaNombre) {
		this.esquemaNombre = esquemaNombre;
	}
	/**
	 * @return the esquemaNombreAgencia
	 */
	public String getEsquemaNombreAgencia() {
		return esquemaNombreAgencia;
	}
	/**
	 * @param esquemaNombreAgencia the esquemaNombreAgencia to set
	 */
	public void setEsquemaNombreAgencia(String esquemaNombreAgencia) {
		this.esquemaNombreAgencia = esquemaNombreAgencia;
	}
	/**
	 * @return the esquemaURI
	 */
	public String getEsquemaURI() {
		return esquemaURI;
	}
	/**
	 * @param esquemaURI the esquemaURI to set
	 */
	public void setEsquemaURI(String esquemaURI) {
		this.esquemaURI = esquemaURI;
	}
	/**
	 * @return the esquemaId
	 */
	public String getEsquemaId() {
		return esquemaId;
	}
	/**
	 * @param esquemaId the esquemaId to set
	 */
	public void setEsquemaId(String esquemaId) {
		this.esquemaId = esquemaId;
	}
	/**
	 * @return the esquemaIdAgencia
	 */
	public String getEsquemaIdAgencia() {
		return esquemaIdAgencia;
	}
	/**
	 * @param esquemaIdAgencia the esquemaIdAgencia to set
	 */
	public void setEsquemaIdAgencia(String esquemaIdAgencia) {
		this.esquemaIdAgencia = esquemaIdAgencia;
	}
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
}
