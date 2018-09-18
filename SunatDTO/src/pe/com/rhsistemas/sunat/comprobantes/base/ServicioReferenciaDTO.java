/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class ServicioReferenciaDTO extends BaseDTO {

	private static final long serialVersionUID = 2839493892195704636L;
	
	private BaseVODTO tipoServicio;
	private int codigoServicio;
	private String codigoTipoTarifa;
	
	/**
	 * @return the tipoServicio
	 */
	public BaseVODTO getTipoServicio() {
		return tipoServicio;
	}
	/**
	 * @param tipoServicio the tipoServicio to set
	 */
	public void setTipoServicio(BaseVODTO tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	/**
	 * @return the codigoServicio
	 */
	public int getCodigoServicio() {
		return codigoServicio;
	}
	/**
	 * @param codigoServicio the codigoServicio to set
	 */
	public void setCodigoServicio(int codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	/**
	 * @return the codigoTipoTarifa
	 */
	public String getCodigoTipoTarifa() {
		return codigoTipoTarifa;
	}
	/**
	 * @param codigoTipoTarifa the codigoTipoTarifa to set
	 */
	public void setCodigoTipoTarifa(String codigoTipoTarifa) {
		this.codigoTipoTarifa = codigoTipoTarifa;
	}
	
	
}
