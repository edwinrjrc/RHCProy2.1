/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import pe.com.rhsistemas.sunat.comprobantes.base.AfectacionImptoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseVODTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoCodigoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoValorDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PersonaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ProductoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TotalOperacionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.UbigeoDTO;

/**
 * @author Edwin
 *
 */
public class DetalleComprobanteDTO extends BaseDTO {

	private static final long serialVersionUID = 2039211191689087518L;

	private ProductoDTO producto;
	/**
	 * Unidad de medida por ítem
	 */
	private String unidadMedida;
	/**
	 * Cantidad de unidades por ítem
	 */
	private int cantidad;
	/**
	 * Valor unitario por ítem
	 */
	private MontoValorDTO precioUnitarioSinImptos;
	/**
	 * Precio de venta unitario
	 */
	private MontoCodigoDTO precioVentaUnitario;
	
	private List<AfectacionImptoDTO> afectacionImpuestos;
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
	
	private PersonaDTO huesped;
	
	private UbigeoDTO ciudadOrigen;
	private UbigeoDTO ciudadDestino;
	private boolean flagCargoDescuento;
	
	private String codigoCargoDescuento;
	private BigDecimal factorCargoDescuento;
	private MontoValorDTO montoCargoDescuento;
	private MontoValorDTO montoBaseCargoDescuento;
	
	private MontoValorDTO montoTotal;
	
	private BaseVODTO conceptoTributario;
	private BaseVODTO item;
	
	private Date fechaInicio;
	private Date fechaFin;
	
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
	/**
	 * @return the producto
	 */
	public ProductoDTO getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(ProductoDTO producto) {
		this.producto = producto;
	}
	/**
	 * @return the huesped
	 */
	public PersonaDTO getHuesped() {
		return huesped;
	}
	/**
	 * @param huesped the huesped to set
	 */
	public void setHuesped(PersonaDTO huesped) {
		this.huesped = huesped;
	}
	/**
	 * @return the ciudadOrigen
	 */
	public UbigeoDTO getCiudadOrigen() {
		return ciudadOrigen;
	}
	/**
	 * @param ciudadOrigen the ciudadOrigen to set
	 */
	public void setCiudadOrigen(UbigeoDTO ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	/**
	 * @return the ciudadDestino
	 */
	public UbigeoDTO getCiudadDestino() {
		return ciudadDestino;
	}
	/**
	 * @param ciudadDestino the ciudadDestino to set
	 */
	public void setCiudadDestino(UbigeoDTO ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
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
	 * @return the codigoCargoDescuento
	 */
	public String getCodigoCargoDescuento() {
		return codigoCargoDescuento;
	}
	/**
	 * @param codigoCargoDescuento the codigoCargoDescuento to set
	 */
	public void setCodigoCargoDescuento(String codigoCargoDescuento) {
		this.codigoCargoDescuento = codigoCargoDescuento;
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
		return montoBaseCargoDescuento;
	}
	/**
	 * @param montoBaseCargoDescuento the montoBaseCargoDescuento to set
	 */
	public void setMontoBaseCargoDescuento(MontoValorDTO montoBaseCargoDescuento) {
		this.montoBaseCargoDescuento = montoBaseCargoDescuento;
	}
	/**
	 * @return the montoTotal
	 */
	public MontoValorDTO getMontoTotal() {
		return montoTotal;
	}
	/**
	 * @param montoTotal the montoTotal to set
	 */
	public void setMontoTotal(MontoValorDTO montoTotal) {
		this.montoTotal = montoTotal;
	}
	/**
	 * @return the afectacionImpuestos
	 */
	public List<AfectacionImptoDTO> getAfectacionImpuestos() {
		return afectacionImpuestos;
	}
	/**
	 * @param afectacionImpuestos the afectacionImpuestos to set
	 */
	public void setAfectacionImpuestos(List<AfectacionImptoDTO> afectacionImpuestos) {
		this.afectacionImpuestos = afectacionImpuestos;
	}
	/**
	 * @return the conceptoTributario
	 */
	public BaseVODTO getConceptoTributario() {
		return conceptoTributario;
	}
	/**
	 * @param conceptoTributario the conceptoTributario to set
	 */
	public void setConceptoTributario(BaseVODTO conceptoTributario) {
		this.conceptoTributario = conceptoTributario;
	}
	/**
	 * @return the item
	 */
	public BaseVODTO getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(BaseVODTO item) {
		this.item = item;
	}
	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
}
