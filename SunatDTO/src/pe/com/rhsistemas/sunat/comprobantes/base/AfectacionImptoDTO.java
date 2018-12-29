/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;

/**
 * @author Edwin
 *
 */
public class AfectacionImptoDTO extends BaseDTO {

	private static final long serialVersionUID = 3327809610517051317L;

	private IdDTO codigoCategoria;
	private MontoValorDTO totalImpuesto;
	private CodigoDTO afectacion;
	private TributoDTO tributo;
	
	private BigDecimal porcentaje;
	private BaseVODTO codigoSistemaIsc;
	
	/**
	 * @return the totalImpuesto
	 */
	public MontoValorDTO getTotalImpuesto() {
		if (totalImpuesto == null){
			totalImpuesto = new MontoValorDTO();
		}
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
	public CodigoDTO getAfectacion() {
		if (afectacion == null){
			afectacion = new CodigoDTO();
		}
		return afectacion;
	}
	/**
	 * @param afectacion the afectacion to set
	 */
	public void setAfectacion(CodigoDTO afectacion) {
		this.afectacion = afectacion;
	}
	/**
	 * @return the tributo
	 */
	public TributoDTO getTributo() {
		if (tributo == null){
			tributo = new TributoDTO();
		}
		return tributo;
	}
	/**
	 * @param tributo the tributo to set
	 */
	public void setTributo(TributoDTO tributo) {
		this.tributo = tributo;
	}
	/**
	 * @return the porcentaje
	 */
	public BigDecimal getPorcentaje() {
		return porcentaje;
	}
	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}
	/**
	 * @return the codigoSistemaIsc
	 */
	public BaseVODTO getCodigoSistemaIsc() {
		if (codigoSistemaIsc == null){
			codigoSistemaIsc = new BaseVODTO();
		}
		return codigoSistemaIsc;
	}
	/**
	 * @param codigoSistemaIsc the codigoSistemaIsc to set
	 */
	public void setCodigoSistemaIsc(BaseVODTO codigoSistemaIsc) {
		this.codigoSistemaIsc = codigoSistemaIsc;
	}
	/**
	 * @return the codigoCategoria
	 */
	public IdDTO getCodigoCategoria() {
		if (codigoCategoria == null){
			codigoCategoria = new IdDTO();
		}
		return codigoCategoria;
	}
	/**
	 * @param codigoCategoria the codigoCategoria to set
	 */
	public void setCodigoCategoria(IdDTO codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
		
}
