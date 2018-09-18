/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes;

import pe.com.rhsistemas.sunat.comprobantes.base.AfectacionImptoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoCodigoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoValorDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TotalOperacionDTO;

/**
 * @author Edwin
 *
 */
public class DetalleComprobanteDTO extends BaseDTO {

	private static final long serialVersionUID = 2039211191689087518L;

	private String codigoProducto;
	/**
	 * Unidad de medida por ítem
	 */
	private String unidadMedida;
	/**
	 * Cantidad de unidades por ítem
	 */
	private int cantidad;
	/**
	 * Descripción detallada del servicio prestado, bien vendido o cedido en uso, indicando las características
	 */
	private String descripcionProducto;
	/**
	 * Valor unitario por ítem
	 */
	private MontoValorDTO precioUnitarioSinImptos;
	/**
	 * Precio de venta unitario
	 */
	private MontoCodigoDTO precioVentaUnitario;
	/**
	 * IGV
	 */
	private AfectacionImptoDTO afectacionIgv;
	/**
	 * ISC
	 */
	private AfectacionImptoDTO afectacionIsc;
	/**
	 * Total valor de venta - operaciones gravadas
	 */
	private TotalOperacionDTO totalOperacionGravada;
	/**
	 * Total valor de venta - operaciones inafectas
	 */
	private TotalOperacionDTO totalOperacionInafecta;
	/**
	 * Total valor de venta - operaciones exoneradas
	 */
	private TotalOperacionDTO totalOperacionExoneradas;
	/**
	 * Valor de venta por ítem
	 */
	private MontoValorDTO precioTotalSinImptos;
	/**
	 * Valor referencial unitario 
	 */
	private MontoCodigoDTO valorReferencialUnitario;
	
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
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
	 * @return the precioUnitarioSinImptos
	 */
	public MontoValorDTO getPrecioUnitarioSinImptos() {
		return precioUnitarioSinImptos;
	}
	/**
	 * @param precioUnitarioSinImptos the precioUnitarioSinImptos to set
	 */
	public void setPrecioUnitarioSinImptos(MontoValorDTO precioUnitarioSinImptos) {
		this.precioUnitarioSinImptos = precioUnitarioSinImptos;
	}
	/**
	 * @return the afectacionIgv
	 */
	public AfectacionImptoDTO getAfectacionIgv() {
		return afectacionIgv;
	}
	/**
	 * @param afectacionIgv the afectacionIgv to set
	 */
	public void setAfectacionIgv(AfectacionImptoDTO afectacionIgv) {
		this.afectacionIgv = afectacionIgv;
	}
	/**
	 * @return the afectacionIsc
	 */
	public AfectacionImptoDTO getAfectacionIsc() {
		return afectacionIsc;
	}
	/**
	 * @param afectacionIsc the afectacionIsc to set
	 */
	public void setAfectacionIsc(AfectacionImptoDTO afectacionIsc) {
		this.afectacionIsc = afectacionIsc;
	}
	/**
	 * @return the totalOperacionGravada
	 */
	public TotalOperacionDTO getTotalOperacionGravada() {
		return totalOperacionGravada;
	}
	/**
	 * @param totalOperacionGravada the totalOperacionGravada to set
	 */
	public void setTotalOperacionGravada(TotalOperacionDTO totalOperacionGravada) {
		this.totalOperacionGravada = totalOperacionGravada;
	}
	/**
	 * @return the totalOperacionInafecta
	 */
	public TotalOperacionDTO getTotalOperacionInafecta() {
		return totalOperacionInafecta;
	}
	/**
	 * @param totalOperacionInafecta the totalOperacionInafecta to set
	 */
	public void setTotalOperacionInafecta(TotalOperacionDTO totalOperacionInafecta) {
		this.totalOperacionInafecta = totalOperacionInafecta;
	}
	/**
	 * @return the totalOperacionExoneradas
	 */
	public TotalOperacionDTO getTotalOperacionExoneradas() {
		return totalOperacionExoneradas;
	}
	/**
	 * @param totalOperacionExoneradas the totalOperacionExoneradas to set
	 */
	public void setTotalOperacionExoneradas(TotalOperacionDTO totalOperacionExoneradas) {
		this.totalOperacionExoneradas = totalOperacionExoneradas;
	}
	/**
	 * @return the precioTotalSinImptos
	 */
	public MontoValorDTO getPrecioTotalSinImptos() {
		return precioTotalSinImptos;
	}
	/**
	 * @param precioTotalSinImptos the precioTotalSinImptos to set
	 */
	public void setPrecioTotalSinImptos(MontoValorDTO precioTotalSinImptos) {
		this.precioTotalSinImptos = precioTotalSinImptos;
	}
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
	 * @return the precioVentaUnitario
	 */
	public MontoCodigoDTO getPrecioVentaUnitario() {
		return precioVentaUnitario;
	}
	/**
	 * @param precioVentaUnitario the precioVentaUnitario to set
	 */
	public void setPrecioVentaUnitario(MontoCodigoDTO precioVentaUnitario) {
		this.precioVentaUnitario = precioVentaUnitario;
	}
	/**
	 * @return the valorReferencialUnitario
	 */
	public MontoCodigoDTO getValorReferencialUnitario() {
		return valorReferencialUnitario;
	}
	/**
	 * @param valorReferencialUnitario the valorReferencialUnitario to set
	 */
	public void setValorReferencialUnitario(MontoCodigoDTO valorReferencialUnitario) {
		this.valorReferencialUnitario = valorReferencialUnitario;
	}
}
