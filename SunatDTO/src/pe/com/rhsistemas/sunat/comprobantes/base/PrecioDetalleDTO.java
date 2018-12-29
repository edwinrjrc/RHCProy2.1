/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class PrecioDetalleDTO extends BaseDTO {

	private static final long serialVersionUID = 6317512338221870374L;
	
	private MontoValorDTO precio;
	private CodigoDTO tipoPrecio;
	
	
	/**
	 * @return the precio
	 */
	public MontoValorDTO getPrecio() {
		if (precio == null){
			precio = new MontoValorDTO();
		}
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(MontoValorDTO precio) {
		this.precio = precio;
	}
	/**
	 * @return the tipoPrecio
	 */
	public CodigoDTO getTipoPrecio() {
		if (tipoPrecio == null){
			tipoPrecio = new CodigoDTO();
		}
		return tipoPrecio;
	}
	/**
	 * @param tipoPrecio the tipoPrecio to set
	 */
	public void setTipoPrecio(CodigoDTO tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}
}
