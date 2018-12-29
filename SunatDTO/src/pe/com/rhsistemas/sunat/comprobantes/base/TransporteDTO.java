/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.util.Date;

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
}
