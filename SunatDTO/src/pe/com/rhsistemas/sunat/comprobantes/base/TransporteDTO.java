/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Edwin
 *
 */
public class TransporteDTO extends BaseDTO {

	private static final long serialVersionUID = 3597467928354135256L;

	private CodigoDTO modalidadTraslado;
	private Date fechaInicioTraslado;
	private String numeroRegistroMTC;
	private String numeroPlaca;
	private List<TransportistaDTO> listaTransportista;
	private String numeroCertificadoHabilitacionVehicular;
	private List<PersonaDTO> listaConductores;
	
	
	/**
	 * @return the listaConductores
	 */
	public List<PersonaDTO> getListaConductores() {
		if (listaConductores == null){
			listaConductores = new ArrayList<PersonaDTO>();
		}
		return listaConductores;
	}
	/**
	 * @param listaConductores the listaConductores to set
	 */
	public void setListaConductores(List<PersonaDTO> listaConductores) {
		this.listaConductores = listaConductores;
	}
	/**
	 * @return the modalidadTraslado
	 */
	public CodigoDTO getModalidadTraslado() {
		if (modalidadTraslado == null){
			modalidadTraslado = new CodigoDTO();
		}
		return modalidadTraslado;
	}
	/**
	 * @param modalidadTraslado the modalidadTraslado to set
	 */
	public void setModalidadTraslado(CodigoDTO modalidadTraslado) {
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
	 * @return the listaTransportista
	 */
	public List<TransportistaDTO> getListaTransportista() {
		if (listaTransportista == null){
			listaTransportista = new ArrayList<TransportistaDTO>();
		}
		return listaTransportista;
	}
	/**
	 * @param listaTransportista the listaTransportista to set
	 */
	public void setListaTransportista(List<TransportistaDTO> listaTransportista) {
		this.listaTransportista = listaTransportista;
	}
	/**
	 * @return the numeroCertificadoHabilitacionVehicular
	 */
	public String getNumeroCertificadoHabilitacionVehicular() {
		return numeroCertificadoHabilitacionVehicular;
	}
	/**
	 * @param numeroCertificadoHabilitacionVehicular the numeroCertificadoHabilitacionVehicular to set
	 */
	public void setNumeroCertificadoHabilitacionVehicular(String numeroCertificadoHabilitacionVehicular) {
		this.numeroCertificadoHabilitacionVehicular = numeroCertificadoHabilitacionVehicular;
	}
}
