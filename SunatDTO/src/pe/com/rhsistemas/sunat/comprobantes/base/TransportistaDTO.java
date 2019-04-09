/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class TransportistaDTO extends PersonaDTO {

	private static final long serialVersionUID = 598451909560592337L;
	
	private String numeroHabilitacionVehicular;
	private String numeroPlacaVehiculo;

	/**
	 * @return the numeroHabilitacionVehicular
	 */
	public String getNumeroHabilitacionVehicular() {
		return numeroHabilitacionVehicular;
	}

	/**
	 * @param numeroHabilitacionVehicular the numeroHabilitacionVehicular to set
	 */
	public void setNumeroHabilitacionVehicular(String numeroHabilitacionVehicular) {
		this.numeroHabilitacionVehicular = numeroHabilitacionVehicular;
	}

	/**
	 * @return the numeroPlacaVehiculo
	 */
	public String getNumeroPlacaVehiculo() {
		return numeroPlacaVehiculo;
	}

	/**
	 * @param numeroPlacaVehiculo the numeroPlacaVehiculo to set
	 */
	public void setNumeroPlacaVehiculo(String numeroPlacaVehiculo) {
		this.numeroPlacaVehiculo = numeroPlacaVehiculo;
	}
}
