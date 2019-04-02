/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Edwin
 *
 */
public class ProductoDTO extends BaseDTO {

	private static final long serialVersionUID = -7312404520348374935L;
	
	private IdDTO codigoProducto;
	private CodigoDTO codigoProductoSunat;
	private List<String> listaDescripcionProducto;
	private boolean aplicaDetraccion;
	private BigDecimal porcentajeDetraccion;
	
	/**
	 * @return the codigoProducto
	 */
	public IdDTO getCodigoProducto() {
		if (codigoProducto == null){
			codigoProducto = new IdDTO();
		}
		return codigoProducto;
	}
	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(IdDTO codigoProducto) {
		this.codigoProducto = codigoProducto;
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
	public CodigoDTO getCodigoProductoSunat() {
		if (codigoProductoSunat == null){
			codigoProductoSunat = new CodigoDTO(); 
		}
		return codigoProductoSunat;
	}
	/**
	 * @param codigoProductoSunat the codigoProductoSunat to set
	 */
	public void setCodigoProductoSunat(CodigoDTO codigoProductoSunat) {
		this.codigoProductoSunat = codigoProductoSunat;
	}
	/**
	 * @return the listaDescripcionProducto
	 */
	public List<String> getListaDescripcionProducto() {
		if (listaDescripcionProducto == null){
			listaDescripcionProducto = new ArrayList<String>();
		}
		return listaDescripcionProducto;
	}
	/**
	 * @param listaDescripcionProducto the listaDescripcionProducto to set
	 */
	public void setListaDescripcionProducto(List<String> listaDescripcionProducto) {
		this.listaDescripcionProducto = listaDescripcionProducto;
	}
}
