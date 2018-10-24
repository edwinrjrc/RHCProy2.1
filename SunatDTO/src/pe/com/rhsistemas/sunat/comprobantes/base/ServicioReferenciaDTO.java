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
	
	private String numeroSuministro;
	private CodigoDTO tipoServicio;
	private CodigoDTO codigoServicio;
	private CodigoDTO codigoTipoTarifa;
	
	
	/**
	 * @return the tipoServicio
	 */
	public CodigoDTO getTipoServicio() {
		return tipoServicio;
	}
	/**
	 * @param tipoServicio the tipoServicio to set
	 */
	public void setTipoServicio(CodigoDTO tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	/**
	 * @return the codigoServicio
	 */
	public CodigoDTO getCodigoServicio() {
		return codigoServicio;
	}
	/**
	 * @param codigoServicio the codigoServicio to set
	 */
	public void setCodigoServicio(CodigoDTO codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	/**
	 * @return the codigoTipoTarifa
	 */
	public CodigoDTO getCodigoTipoTarifa() {
		return codigoTipoTarifa;
	}
	/**
	 * @param codigoTipoTarifa the codigoTipoTarifa to set
	 */
	public void setCodigoTipoTarifa(CodigoDTO codigoTipoTarifa) {
		this.codigoTipoTarifa = codigoTipoTarifa;
	}
	/**
	 * @return the numeroSuministro
	 */
	public String getNumeroSuministro() {
		return numeroSuministro;
	}
	/**
	 * @param numeroSuministro the numeroSuministro to set
	 */
	public void setNumeroSuministro(String numeroSuministro) {
		this.numeroSuministro = numeroSuministro;
	}
	
}
