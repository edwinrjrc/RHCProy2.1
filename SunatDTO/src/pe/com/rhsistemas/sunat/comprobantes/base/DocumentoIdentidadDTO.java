/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class DocumentoIdentidadDTO extends BaseDTO {

	private static final long serialVersionUID = 1570084034418433204L;

	private String numeroDocumento;
	private BaseVODTO tipoDocumento;
	
	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	/**
	 * @return the tipoDocumento
	 */
	public BaseVODTO getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(BaseVODTO tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
}
