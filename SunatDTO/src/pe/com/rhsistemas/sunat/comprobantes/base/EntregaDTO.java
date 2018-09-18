/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Edwin
 *
 */
public class EntregaDTO extends BaseDTO {

	private static final long serialVersionUID = -939742341838241369L;

	private int cantidad;
	private String codigoUnidadMedida;
	private String potenciaContratada;
	private String codigoUnidadMedidaPotenciaContratada;
	private String longitud;
	private String latitud;
	private BaseVODTO motivoTraslado;
	private BigDecimal pesoBruto;
	private String unidadMedida;
	private String modalidadTraslado;
	private Date fechaInicioTraslado;
	private TransportistaDTO transportista;
	private DireccionDTO direccionLlegada;
	private DireccionDTO direccionPartida;
	private boolean flagSubcontratacion;
	
	private String numeroRegistroMTC;
	
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
	 * @return the codigoUnidadMedida
	 */
	public String getCodigoUnidadMedida() {
		return codigoUnidadMedida;
	}
	/**
	 * @param codigoUnidadMedida the codigoUnidadMedida to set
	 */
	public void setCodigoUnidadMedida(String codigoUnidadMedida) {
		this.codigoUnidadMedida = codigoUnidadMedida;
	}
	/**
	 * @return the potenciaContratada
	 */
	public String getPotenciaContratada() {
		return potenciaContratada;
	}
	/**
	 * @param potenciaContratada the potenciaContratada to set
	 */
	public void setPotenciaContratada(String potenciaContratada) {
		this.potenciaContratada = potenciaContratada;
	}
	/**
	 * @return the codigoUnidadMedidaPotenciaContratada
	 */
	public String getCodigoUnidadMedidaPotenciaContratada() {
		return codigoUnidadMedidaPotenciaContratada;
	}
	/**
	 * @param codigoUnidadMedidaPotenciaContratada the codigoUnidadMedidaPotenciaContratada to set
	 */
	public void setCodigoUnidadMedidaPotenciaContratada(String codigoUnidadMedidaPotenciaContratada) {
		this.codigoUnidadMedidaPotenciaContratada = codigoUnidadMedidaPotenciaContratada;
	}
	/**
	 * @return the longitud
	 */
	public String getLongitud() {
		return longitud;
	}
	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	/**
	 * @return the latitud
	 */
	public String getLatitud() {
		return latitud;
	}
	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	/**
	 * @return the motivoTraslado
	 */
	public BaseVODTO getMotivoTraslado() {
		return motivoTraslado;
	}
	/**
	 * @param motivoTraslado the motivoTraslado to set
	 */
	public void setMotivoTraslado(BaseVODTO motivoTraslado) {
		this.motivoTraslado = motivoTraslado;
	}
	/**
	 * @return the pesoBruto
	 */
	public BigDecimal getPesoBruto() {
		return pesoBruto;
	}
	/**
	 * @param pesoBruto the pesoBruto to set
	 */
	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
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
	 * @return the modalidadTraslado
	 */
	public String getModalidadTraslado() {
		return modalidadTraslado;
	}
	/**
	 * @param modalidadTraslado the modalidadTraslado to set
	 */
	public void setModalidadTraslado(String modalidadTraslado) {
		this.modalidadTraslado = modalidadTraslado;
	}
	/**
	 * @return the fechaInicioTraslado
	 */
	public Date getFechaInicioTraslado() {
		return fechaInicioTraslado;
	}
	/**
	 * @param fechaInicioTraslado the fechaInicioTraslado to set
	 */
	public void setFechaInicioTraslado(Date fechaInicioTraslado) {
		this.fechaInicioTraslado = fechaInicioTraslado;
	}
	/**
	 * @return the transportista
	 */
	public TransportistaDTO getTransportista() {
		return transportista;
	}
	/**
	 * @param transportista the transportista to set
	 */
	public void setTransportista(TransportistaDTO transportista) {
		this.transportista = transportista;
	}
	/**
	 * @return the direccionLlegada
	 */
	public DireccionDTO getDireccionLlegada() {
		return direccionLlegada;
	}
	/**
	 * @param direccionLlegada the direccionLlegada to set
	 */
	public void setDireccionLlegada(DireccionDTO direccionLlegada) {
		this.direccionLlegada = direccionLlegada;
	}
	/**
	 * @return the flagSubcontratacion
	 */
	public boolean isFlagSubcontratacion() {
		return flagSubcontratacion;
	}
	/**
	 * @param flagSubcontratacion the flagSubcontratacion to set
	 */
	public void setFlagSubcontratacion(boolean flagSubcontratacion) {
		this.flagSubcontratacion = flagSubcontratacion;
	}
	/**
	 * @return the direccionPartida
	 */
	public DireccionDTO getDireccionPartida() {
		return direccionPartida;
	}
	/**
	 * @param direccionPartida the direccionPartida to set
	 */
	public void setDireccionPartida(DireccionDTO direccionPartida) {
		this.direccionPartida = direccionPartida;
	}
	/**
	 * @return the numeroRegistroMTC
	 */
	public String getNumeroRegistroMTC() {
		return numeroRegistroMTC;
	}
	/**
	 * @param numeroRegistroMTC the numeroRegistroMTC to set
	 */
	public void setNumeroRegistroMTC(String numeroRegistroMTC) {
		this.numeroRegistroMTC = numeroRegistroMTC;
	}
	
}
