/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.util.Date;

/**
 * @author Edwin
 *
 */
public class TrasladoDTO extends BaseDTO {

	private static final long serialVersionUID = -5696332262625650935L;

	private String modalidad;
	private Date fechaInicio;
	private DocumentoIdentidadDTO documentoTransportista;
	private String nombreTransportista;
	private String numeroInscripcionVehiculo;
	private String numeroPlaca;
	private DireccionDTO direccionLlegada;
	private String flagSubcontratacion;
	private DireccionDTO direccionPartida;
	private String registroMTC;
	private MontoValorDTO montoReferencial;
	
	/**
	 * @return the modalidad
	 */
	public String getModalidad() {
		return modalidad;
	}
	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
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
	 * @return the documentoTransportista
	 */
	public DocumentoIdentidadDTO getDocumentoTransportista() {
		return documentoTransportista;
	}
	/**
	 * @param documentoTransportista the documentoTransportista to set
	 */
	public void setDocumentoTransportista(DocumentoIdentidadDTO documentoTransportista) {
		this.documentoTransportista = documentoTransportista;
	}
	/**
	 * @return the nombreTransportista
	 */
	public String getNombreTransportista() {
		return nombreTransportista;
	}
	/**
	 * @param nombreTransportista the nombreTransportista to set
	 */
	public void setNombreTransportista(String nombreTransportista) {
		this.nombreTransportista = nombreTransportista;
	}
	/**
	 * @return the numeroInscripcionVehiculo
	 */
	public String getNumeroInscripcionVehiculo() {
		return numeroInscripcionVehiculo;
	}
	/**
	 * @param numeroInscripcionVehiculo the numeroInscripcionVehiculo to set
	 */
	public void setNumeroInscripcionVehiculo(String numeroInscripcionVehiculo) {
		this.numeroInscripcionVehiculo = numeroInscripcionVehiculo;
	}
	/**
	 * @return the numeroPlaca
	 */
	public String getNumeroPlaca() {
		return numeroPlaca;
	}
	/**
	 * @param numeroPlaca the numeroPlaca to set
	 */
	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
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
	public String getFlagSubcontratacion() {
		return flagSubcontratacion;
	}
	/**
	 * @param flagSubcontratacion the flagSubcontratacion to set
	 */
	public void setFlagSubcontratacion(String flagSubcontratacion) {
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
	 * @return the registroMTC
	 */
	public String getRegistroMTC() {
		return registroMTC;
	}
	/**
	 * @param registroMTC the registroMTC to set
	 */
	public void setRegistroMTC(String registroMTC) {
		this.registroMTC = registroMTC;
	}
	/**
	 * @return the montoReferencial
	 */
	public MontoValorDTO getMontoReferencial() {
		return montoReferencial;
	}
	/**
	 * @param montoReferencial the montoReferencial to set
	 */
	public void setMontoReferencial(MontoValorDTO montoReferencial) {
		this.montoReferencial = montoReferencial;
	}
	
	
}
