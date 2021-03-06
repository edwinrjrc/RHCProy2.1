/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes;

import java.util.ArrayList;
import java.util.List;

import pe.com.rhsistemas.sunat.comprobantes.base.AfectacionImptoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.CantidadDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.DescuentoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoCodigoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoValorDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PersonaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PrecioDetalleDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ProductoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ProductoServicioDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PropiedadesAdicionalesDTO;
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
	 * Unidad de medida por �tem
	 */
	private String unidadMedida;
	/**
	 * Cantidad de unidades por �tem
	 */
	private CantidadDTO cantidad;
	/**
	 * Valor unitario por �tem
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
	 * Valor de venta por �tem
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
	private List<PrecioDetalleDTO> listaPrecios;
	private List<ProductoServicioDTO> listaProductoServicio;
	private List<DescuentoDTO> listaDescuento;
	
	private MontoValorDTO montoTotal;
	
	private List<PropiedadesAdicionalesDTO> listaPropiedadesAdicionales;
	
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
	public CantidadDTO getCantidad() {
		if (cantidad == null){
			cantidad = new CantidadDTO();
		}
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(CantidadDTO cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the precioUnitarioSinImptos
	 */
	public MontoValorDTO getPrecioUnitarioSinImptos() {
		if (precioUnitarioSinImptos == null){
			precioUnitarioSinImptos = new MontoValorDTO();
		}
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
		if (totalOperacionGravada == null){
			totalOperacionGravada = new TotalOperacionDTO();
		}
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
		if (totalOperacionInafecta == null){
			totalOperacionInafecta = new TotalOperacionDTO();
		}
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
		if (totalOperacionExoneradas == null){
			totalOperacionExoneradas = new TotalOperacionDTO();
		}
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
		if (precioTotalSinImptos == null){
			precioTotalSinImptos = new MontoValorDTO();
		}
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
		if (precioVentaUnitario == null){
			precioVentaUnitario = new MontoCodigoDTO();
		}
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
		if (valorReferencialUnitario == null){
			valorReferencialUnitario = new MontoCodigoDTO();
		}
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
		if (producto == null){
			producto = new ProductoDTO();
		}
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
		if (huesped == null){
			huesped = new PersonaDTO();
		}
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
		if (ciudadOrigen == null){
			ciudadOrigen = new UbigeoDTO();
		}
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
		if (ciudadDestino == null){
			ciudadDestino = new UbigeoDTO();
		}
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
	 * @return the montoTotal
	 */
	public MontoValorDTO getMontoTotal() {
		if (montoTotal == null){
			montoTotal = new MontoValorDTO();
		}
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
		if (afectacionImpuestos == null){
			afectacionImpuestos = new ArrayList<AfectacionImptoDTO>();
		}
		return afectacionImpuestos;
	}
	/**
	 * @param afectacionImpuestos the afectacionImpuestos to set
	 */
	public void setAfectacionImpuestos(List<AfectacionImptoDTO> afectacionImpuestos) {
		this.afectacionImpuestos = afectacionImpuestos;
	}
	/**
	 * @return the listaPrecios
	 */
	public List<PrecioDetalleDTO> getListaPrecios() {
		if (listaPrecios == null){
			listaPrecios = new ArrayList<PrecioDetalleDTO>();
		}
		return listaPrecios;
	}
	/**
	 * @param listaPrecios the listaPrecios to set
	 */
	public void setListaPrecios(List<PrecioDetalleDTO> listaPrecios) {
		this.listaPrecios = listaPrecios;
	}
	/**
	 * @return the listaProductoServicio
	 */
	public List<ProductoServicioDTO> getListaProductoServicio() {
		if (listaProductoServicio == null){
			listaProductoServicio = new ArrayList<ProductoServicioDTO>();
		}
		return listaProductoServicio;
	}
	/**
	 * @param listaProductoServicio the listaProductoServicio to set
	 */
	public void setListaProductoServicio(List<ProductoServicioDTO> listaProductoServicio) {
		this.listaProductoServicio = listaProductoServicio;
	}
	/**
	 * @return the listaDescuento
	 */
	public List<DescuentoDTO> getListaDescuento() {
		if (listaDescuento == null){
			listaDescuento = new ArrayList<DescuentoDTO>();
		}
		return listaDescuento;
	}
	/**
	 * @param listaDescuento the listaDescuento to set
	 */
	public void setListaDescuento(List<DescuentoDTO> listaDescuento) {
		this.listaDescuento = listaDescuento;
	}
	/**
	 * @return the listaPropiedadesAdicionales
	 */
	public List<PropiedadesAdicionalesDTO> getListaPropiedadesAdicionales() {
		if (listaPropiedadesAdicionales == null){
			listaPropiedadesAdicionales = new ArrayList<PropiedadesAdicionalesDTO>();
		}
		return listaPropiedadesAdicionales;
	}
	/**
	 * @param listaPropiedadesAdicionales the listaPropiedadesAdicionales to set
	 */
	public void setListaPropiedadesAdicionales(List<PropiedadesAdicionalesDTO> listaPropiedadesAdicionales) {
		this.listaPropiedadesAdicionales = listaPropiedadesAdicionales;
	}
}
