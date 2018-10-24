/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;

/**
 * @author Edwin
 *
 */
public class MedidaDTO extends BaseDTO {

	private static final long serialVersionUID = 6262525315492180736L;
	
	private BigDecimal valor;
	private String codigoUnidad;
	private String codigoListaVersionId;
	
	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	/**
	 * @return the codigoUnidad
	 */
	public String getCodigoUnidad() {
		return codigoUnidad;
	}
	/**
	 * @param codigoUnidad the codigoUnidad to set
	 */
	public void setCodigoUnidad(String codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}
	/**
	 * @return the codigoListaVersionId
	 */
	public String getCodigoListaVersionId() {
		return codigoListaVersionId;
	}
	/**
	 * @param codigoListaVersionId the codigoListaVersionId to set
	 */
	public void setCodigoListaVersionId(String codigoListaVersionId) {
		this.codigoListaVersionId = codigoListaVersionId;
	}

	
}
