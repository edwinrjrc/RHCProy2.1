/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class MonedaDTO extends CodigoDTO {

	private static final long serialVersionUID = 1745334653156745167L;

	private String nombre;
	private String simbolo;
	private String codigoInternacional;
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the simbolo
	 */
	public String getSimbolo() {
		return simbolo;
	}
	/**
	 * @param simbolo the simbolo to set
	 */
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
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
