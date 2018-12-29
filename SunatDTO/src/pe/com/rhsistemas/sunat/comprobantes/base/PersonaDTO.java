/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class PersonaDTO extends BaseDTO {

	private static final long serialVersionUID = -7128952730507179206L;
	
	private String nombrePersona;
	private String nombreComercial;
	private DocumentoIdentidadDTO documentoIdentidad;
	private DireccionDTO direccion;
	
	/**
	 * @return the nombrePersona
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}
	/**
	 * @param nombrePersona the nombrePersona to set
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	/**
	 * @return the documentoIdentidad
	 */
	public DocumentoIdentidadDTO getDocumentoIdentidad() {
		if (documentoIdentidad == null){
			documentoIdentidad = new DocumentoIdentidadDTO();
		}
		return documentoIdentidad;
	}
	/**
	 * @param documentoIdentidad the documentoIdentidad to set
	 */
	public void setDocumentoIdentidad(DocumentoIdentidadDTO documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}
	/**
	 * @return the direccion
	 */
	public DireccionDTO getDireccion() {
		if (direccion == null){
			direccion = new DireccionDTO();
		}
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(DireccionDTO direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the nombreComercial
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}
	/**
	 * @param nombreComercial the nombreComercial to set
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	
}
