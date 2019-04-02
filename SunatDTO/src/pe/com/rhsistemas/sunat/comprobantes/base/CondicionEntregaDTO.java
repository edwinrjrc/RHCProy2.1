/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class CondicionEntregaDTO extends BaseDTO {

	private static final long serialVersionUID = -2746224742960416973L;
	
	private String numeroRegistroMTC;
	private MontoValorDTO montoReferencial;
	private DireccionDTO direccionLlegada;
	private DireccionDTO direccionOrigen;
	
	
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
	 * @return the direccionOrigen
	 */
	public DireccionDTO getDireccionOrigen() {
		return direccionOrigen;
	}
	/**
	 * @param direccionOrigen the direccionOrigen to set
	 */
	public void setDireccionOrigen(DireccionDTO direccionOrigen) {
		this.direccionOrigen = direccionOrigen;
	}

}
