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
public class ProductoServicioDTO extends BaseDTO {

	private static final long serialVersionUID = -7426366536777715718L;
	
	private IdDTO numeroAsiento;
	private Date fechaInicioProgramado;
	
	private List<PersonaDTO> listaPasajeros;

	/**
	 * @return the numeroAsiento
	 */
	public IdDTO getNumeroAsiento() {
		if (numeroAsiento == null){
			numeroAsiento = new IdDTO();
		}
		return numeroAsiento;
	}

	/**
	 * @param numeroAsiento the numeroAsiento to set
	 */
	public void setNumeroAsiento(IdDTO numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	/**
	 * @return the fechaInicioProgramado
	 */
	public Date getFechaInicioProgramado() {
		return fechaInicioProgramado;
	}

	/**
	 * @param fechaInicioProgramado the fechaInicioProgramado to set
	 */
	public void setFechaInicioProgramado(Date fechaInicioProgramado) {
		this.fechaInicioProgramado = fechaInicioProgramado;
	}

	/**
	 * @return the listaPasajeros
	 */
	public List<PersonaDTO> getListaPasajeros() {
		if (listaPasajeros == null){
			listaPasajeros = new ArrayList<PersonaDTO>();
		}
		return listaPasajeros;
	}

	/**
	 * @param listaPasajeros the listaPasajeros to set
	 */
	public void setListaPasajeros(List<PersonaDTO> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
}
