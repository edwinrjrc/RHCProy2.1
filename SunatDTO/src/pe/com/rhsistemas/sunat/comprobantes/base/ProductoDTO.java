/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;

/**
 * @author Edwin
 *
 */
public class ProductoDTO extends BaseDTO {

	private static final long serialVersionUID = -7312404520348374935L;
	
	private String codigoProducto;
	private String codigoProductoSunat;
	private String descripcionProducto;
	private boolean aplicaDetraccion;
	private BigDecimal porcentajeDetraccion;
	
	/**
	 * @return the codigoProducto
	 */
	public String getCodigoProducto() {
		return codigoProducto;
	}
	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	/**
	 * @return the descripcionProducto
	 */
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	/**
	 * @param descripcionProducto the descripcionProducto to set
	 */
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	/**
	 * @return the aplicaDetraccion
	 */
	public boolean isAplicaDetraccion() {
		return aplicaDetraccion;
	}
	/**
	 * @param aplicaDetraccion the aplicaDetraccion to set
	 */
	public void setAplicaDetraccion(boolean aplicaDetraccion) {
		this.aplicaDetraccion = aplicaDetraccion;
	}
	/**
	 * @return the porcentajeDetraccion
	 */
	public BigDecimal getPorcentajeDetraccion() {
		return porcentajeDetraccion;
	}
	/**
	 * @param porcentajeDetraccion the porcentajeDetraccion to set
	 */
	public void setPorcentajeDetraccion(BigDecimal porcentajeDetraccion) {
		this.porcentajeDetraccion = porcentajeDetraccion;
	}
	/**
	 * @return the codigoProductoSunat
	 */
	public String getCodigoProductoSunat() {
		return codigoProductoSunat;
	}
	/**
	 * @param codigoProductoSunat the codigoProductoSunat to set
	 */
	public void setCodigoProductoSunat(String codigoProductoSunat) {
		this.codigoProductoSunat = codigoProductoSunat;
	}

	
}
