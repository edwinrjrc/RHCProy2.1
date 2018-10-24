/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class ComprobanteAnticipoDTO extends BaseDTO {

	private static final long serialVersionUID = 7243215119790171458L;

	private IdDTO numeroComprobanteAnticipo;
	private MontoValorDTO montoComprobante;
	private IdDTO documentoIdentidadEmisor;
	/**
	 * @return the numeroComprobanteAnticipo
	 */
	public IdDTO getNumeroComprobanteAnticipo() {
		return numeroComprobanteAnticipo;
	}
	/**
	 * @param numeroComprobanteAnticipo the numeroComprobanteAnticipo to set
	 */
	public void setNumeroComprobanteAnticipo(IdDTO numeroComprobanteAnticipo) {
		this.numeroComprobanteAnticipo = numeroComprobanteAnticipo;
	}
	/**
	 * @return the montoComprobante
	 */
	public MontoValorDTO getMontoComprobante() {
		return montoComprobante;
	}
	/**
	 * @param montoComprobante the montoComprobante to set
	 */
	public void setMontoComprobante(MontoValorDTO montoComprobante) {
		this.montoComprobante = montoComprobante;
	}
	/**
	 * @return the documentoIdentidadEmisor
	 */
	public IdDTO getDocumentoIdentidadEmisor() {
		return documentoIdentidadEmisor;
	}
	/**
	 * @param documentoIdentidadEmisor the documentoIdentidadEmisor to set
	 */
	public void setDocumentoIdentidadEmisor(IdDTO documentoIdentidadEmisor) {
		this.documentoIdentidadEmisor = documentoIdentidadEmisor;
	}
	
}
