/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class DireccionDTO extends BaseDTO {

	private static final long serialVersionUID = 888364242656127995L;
	
	private String codigoUbigeo;
	private String direccionCompleta;
	private String urbanizacion;
	private UbigeoDTO ubigeo;
	private String codigoPais;
	
	/**
	 * @return the codigoUbigeo
	 */
	public String getCodigoUbigeo() {
		return codigoUbigeo;
	}
	/**
	 * @param codigoUbigeo the codigoUbigeo to set
	 */
	public void setCodigoUbigeo(String codigoUbigeo) {
		this.codigoUbigeo = codigoUbigeo;
	}
	/**
	 * @return the direccionCompleta
	 */
	public String getDireccionCompleta() {
		return direccionCompleta;
	}
	/**
	 * @param direccionCompleta the direccionCompleta to set
	 */
	public void setDireccionCompleta(String direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}
	/**
	 * @return the urbanizacion
	 */
	public String getUrbanizacion() {
		return urbanizacion;
	}
	/**
	 * @param urbanizacion the urbanizacion to set
	 */
	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}
	/**
	 * @return the ubigeo
	 */
	public UbigeoDTO getUbigeo() {
		return ubigeo;
	}
	/**
	 * @param ubigeo the ubigeo to set
	 */
	public void setUbigeo(UbigeoDTO ubigeo) {
		this.ubigeo = ubigeo;
	}
	/**
	 * @return the codigoPais
	 */
	public String getCodigoPais() {
		return codigoPais;
	}
	/**
	 * @param codigoPais the codigoPais to set
	 */
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	
	
}
