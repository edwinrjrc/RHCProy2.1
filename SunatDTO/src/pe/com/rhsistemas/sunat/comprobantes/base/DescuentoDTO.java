/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;

/**
 * @author Edwin
 *
 */
public class DescuentoDTO extends BaseDTO {

	private static final long serialVersionUID = -4078043161783436604L;

	private boolean flagCargoDescuento;
	private String codigoMotivoCargoDescuento;
	private BigDecimal factorCargoDescuento;
	private MontoValorDTO montoCargoDescuento;
	private MontoValorDTO montoBaseCargoDescuento;
	/**
	 * @return the flagCargoDescuento
	 */
	public boolean isFlagCargoDescuento() {
		return flagCargoDescuento;
	}
	/**
	 * @param flagCargoDescuento the flagCargoDescuento to set
	 */
	public void setFlagCargoDescuento(boolean flagCargoDescuento) {
		this.flagCargoDescuento = flagCargoDescuento;
	}
	/**
	 * @return the codigoMotivoCargoDescuento
	 */
	public String getCodigoMotivoCargoDescuento() {
		return codigoMotivoCargoDescuento;
	}
	/**
	 * @param codigoMotivoCargoDescuento the codigoMotivoCargoDescuento to set
	 */
	public void setCodigoMotivoCargoDescuento(String codigoMotivoCargoDescuento) {
		this.codigoMotivoCargoDescuento = codigoMotivoCargoDescuento;
	}
	/**
	 * @return the factorCargoDescuento
	 */
	public BigDecimal getFactorCargoDescuento() {
		return factorCargoDescuento;
	}
	/**
	 * @param factorCargoDescuento the factorCargoDescuento to set
	 */
	public void setFactorCargoDescuento(BigDecimal factorCargoDescuento) {
		this.factorCargoDescuento = factorCargoDescuento;
	}
	/**
	 * @return the montoCargoDescuento
	 */
	public MontoValorDTO getMontoCargoDescuento() {
		if (montoCargoDescuento == null){
			montoCargoDescuento = new MontoValorDTO();
		}
		return montoCargoDescuento;
	}
	/**
	 * @param montoCargoDescuento the montoCargoDescuento to set
	 */
	public void setMontoCargoDescuento(MontoValorDTO montoCargoDescuento) {
		this.montoCargoDescuento = montoCargoDescuento;
	}
	/**
	 * @return the montoBaseCargoDescuento
	 */
	public MontoValorDTO getMontoBaseCargoDescuento() {
		if (montoBaseCargoDescuento == null){
			montoBaseCargoDescuento = new MontoValorDTO();
		}
		return montoBaseCargoDescuento;
	}
	/**
	 * @param montoBaseCargoDescuento the montoBaseCargoDescuento to set
	 */
	public void setMontoBaseCargoDescuento(MontoValorDTO montoBaseCargoDescuento) {
		this.montoBaseCargoDescuento = montoBaseCargoDescuento;
	}
	
}
