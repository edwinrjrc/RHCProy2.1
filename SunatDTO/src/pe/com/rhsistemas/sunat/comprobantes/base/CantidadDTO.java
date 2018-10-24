/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;

/**
 * @author Edwin
 *
 */
public class CantidadDTO extends BaseDTO {

	private static final long serialVersionUID = -2596146939978266808L;
	
	private String valor;
	private BigDecimal valorNumerico;
	private String unidadMedida;
	private String unidadListaAgencia;
	private String unidadListaId;
	
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
	/**
	 * @return the valorNumerico
	 */
	public BigDecimal getValorNumerico() {
		return valorNumerico;
	}
	/**
	 * @param valorNumerico the valorNumerico to set
	 */
	public void setValorNumerico(BigDecimal valorNumerico) {
		this.valorNumerico = valorNumerico;
	}
	/**
	 * @return the unidadMedida
	 */
	public String getUnidadMedida() {
		return unidadMedida;
	}
	/**
	 * @param unidadMedida the unidadMedida to set
	 */
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	/**
	 * @return the unidadListaAgencia
	 */
	public String getUnidadListaAgencia() {
		return unidadListaAgencia;
	}
	/**
	 * @param unidadListaAgencia the unidadListaAgencia to set
	 */
	public void setUnidadListaAgencia(String unidadListaAgencia) {
		this.unidadListaAgencia = unidadListaAgencia;
	}
	/**
	 * @return the unidadListaId
	 */
	public String getUnidadListaId() {
		return unidadListaId;
	}
	/**
	 * @param unidadListaId the unidadListaId to set
	 */
	public void setUnidadListaId(String unidadListaId) {
		this.unidadListaId = unidadListaId;
	}
	
	
}
