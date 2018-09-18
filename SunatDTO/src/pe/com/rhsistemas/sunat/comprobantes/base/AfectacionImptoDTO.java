/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class AfectacionImptoDTO extends BaseDTO {

	private static final long serialVersionUID = 3327809610517051317L;

	private MonedaDTO moneda;
	private MontoValorDTO totalImpuesto;
	private BaseVODTO afectacion;
	private TributoDTO tributo;
	
	
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
	/**
	 * @return the totalImpuesto
	 */
	public MontoValorDTO getTotalImpuesto() {
		return totalImpuesto;
	}
	/**
	 * @param totalImpuesto the totalImpuesto to set
	 */
	public void setTotalImpuesto(MontoValorDTO totalImpuesto) {
		this.totalImpuesto = totalImpuesto;
	}
	/**
	 * @return the afectacion
	 */
	public BaseVODTO getAfectacion() {
		return afectacion;
	}
	/**
	 * @param afectacion the afectacion to set
	 */
	public void setAfectacion(BaseVODTO afectacion) {
		this.afectacion = afectacion;
	}
	/**
	 * @return the tributo
	 */
	public TributoDTO getTributo() {
		return tributo;
	}
	/**
	 * @param tributo the tributo to set
	 */
	public void setTributo(TributoDTO tributo) {
		this.tributo = tributo;
	}
		
}
