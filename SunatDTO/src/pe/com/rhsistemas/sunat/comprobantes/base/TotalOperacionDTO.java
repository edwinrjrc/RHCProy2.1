/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

	/**
 * @author Edwin
 *
 */
public class TotalOperacionDTO extends BaseDTO {

	private static final long serialVersionUID = -8790976511508599499L;

	private String codigoTipoMonto;
	private MontoValorDTO monto;
	
	/**
	 * @return the codigoTipoMonto
	 */
	public String getCodigoTipoMonto() {
		return codigoTipoMonto;
	}
	/**
	 * @param codigoTipoMonto the codigoTipoMonto to set
	 */
	public void setCodigoTipoMonto(String codigoTipoMonto) {
		this.codigoTipoMonto = codigoTipoMonto;
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
