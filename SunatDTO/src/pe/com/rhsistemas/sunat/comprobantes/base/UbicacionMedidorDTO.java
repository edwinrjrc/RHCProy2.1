/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class UbicacionMedidorDTO extends BaseDTO {

	private static final long serialVersionUID = 1164771225499506106L;
	
	private String longitud;
	private String latitud;
	private UbigeoDTO ubigeo;
	
	
	/**
	 * @return the longitud
	 */
	public String getLongitud() {
		return longitud;
	}
	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	/**
	 * @return the latitud
	 */
	public String getLatitud() {
		return latitud;
	}
	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(String latitud) {
		this.latitud = latitud;
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

	
}
