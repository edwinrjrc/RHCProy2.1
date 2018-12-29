/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.util.Date;

/**
 * @author Edwin
 *
 */
public class PropiedadesAdicionalesDTO extends BaseDTO {

	private static final long serialVersionUID = 3007415158254908767L;
	
	private String nombreConceptoTributario;
	private CodigoDTO codigoConceptoTributario;
	
	private BaseVODTO item;
	
	private Date fechaInicio;
	private Date fechaFin;
	

	/**
	 * @return the nombreConceptoTributario
	 */
	public String getNombreConceptoTributario() {
		return nombreConceptoTributario;
	}

	/**
	 * @param nombreConceptoTributario the nombreConceptoTributario to set
	 */
	public void setNombreConceptoTributario(String nombreConceptoTributario) {
		this.nombreConceptoTributario = nombreConceptoTributario;
	}

	/**
	 * @return the codigoConceptoTributario
	 */
	public CodigoDTO getCodigoConceptoTributario() {
		if (codigoConceptoTributario == null){
			codigoConceptoTributario = new CodigoDTO();
		}
		return codigoConceptoTributario;
	}

	/**
	 * @param codigoConceptoTributario the codigoConceptoTributario to set
	 */
	public void setCodigoConceptoTributario(CodigoDTO codigoConceptoTributario) {
		this.codigoConceptoTributario = codigoConceptoTributario;
	}

	/**
	 * @return the item
	 */
	public BaseVODTO getItem() {
		if (item == null){
			item = new BaseVODTO();
		}
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
