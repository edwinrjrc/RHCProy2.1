/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class MontoCodigoDTO extends BaseDTO {

	private static final long serialVersionUID = -4184400271533740483L;

	private String codigoTipoPrecio;
	private MontoValorDTO monto;
	
	
	/**
	 * @return the codigoTipoPrecio
	 */
	public String getCodigoTipoPrecio() {
		return codigoTipoPrecio;
	}
	/**
	 * @param codigoTipoPrecio the codigoTipoPrecio to set
	 */
	public void setCodigoTipoPrecio(String codigoTipoPrecio) {
		this.codigoTipoPrecio = codigoTipoPrecio;
	}
	/**
	 * @return the monto
	 */
	public MontoValorDTO getMonto() {
		if (monto == null){
			monto = new MontoValorDTO();
		}
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(MontoValorDTO monto) {
		this.monto = monto;
	}
	
	
}