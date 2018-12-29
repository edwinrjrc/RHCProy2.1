/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class ComprobanteRelacionadoDTO extends BaseDTO {

	private static final long serialVersionUID = -517682235036451379L;

	private String numeroComprobante;
	private CodigoDTO tipoComprobante;
	
	/**
	 * @return the numeroComprobante
	 */
	public String getNumeroComprobante() {
		return numeroComprobante;
	}
	/**
	 * @param numeroComprobante the numeroComprobante to set
	 */
	public void setNumeroComprobante(String numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}
	/**
	 * @return the tipoComprobante
	 */
	public CodigoDTO getTipoComprobante() {
		if (tipoComprobante == null){
			tipoComprobante = new CodigoDTO();
		}
		return tipoComprobante;
	}
	/**
	 * @param tipoComprobante the tipoComprobante to set
	 */
	public void setTipoComprobante(CodigoDTO tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	
	
}
