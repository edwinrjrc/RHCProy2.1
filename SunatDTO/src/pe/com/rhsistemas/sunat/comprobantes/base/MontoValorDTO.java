/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;

/**
 * @author Edwin
 *
 */
public class MontoValorDTO extends BaseDTO {

	private static final long serialVersionUID = 4466172182088262400L;

	private BigDecimal monto;
	private MonedaDTO moneda;
	
	
	/**
	 * @return the monto
	 */
	public BigDecimal getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	/**
	 * @return the moneda
	 */
	public MonedaDTO getMoneda() {
		return moneda;
	}
	/**
	 * @param moneda the moneda to set
	 */
	public void setMoneda(MonedaDTO moneda) {
		this.moneda = moneda;
	}
	
	
}
