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

	private IdDTO codigoInternacional;
	private String nombre;
	private String codigo;

	/**
	 * @return the codigoInternacional
	 */
	public IdDTO getCodigoInternacional() {
		if (codigoInternacional == null){
			codigoInternacional = new IdDTO();
		}
		return codigoInternacional;
	}
	/**
	 * @param codigoInternacional the codigoInternacional to set
	 */
	public void setCodigoInternacional(IdDTO codigoInternacional) {
		this.codigoInternacional = codigoInternacional;
	}
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
