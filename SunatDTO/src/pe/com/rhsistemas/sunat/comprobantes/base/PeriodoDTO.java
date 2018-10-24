/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.util.Date;

/**
 * @author Edwin
 *
 */
public class PeriodoDTO extends BaseDTO {

	private static final long serialVersionUID = 7386453685184921046L;

	private Date fechaInicioFacturacion;
	private Date fechaFinFacturacion;
	
	/**
	 * @return the fechaInicioFacturacion
	 */
	public Date getFechaInicioFacturacion() {
		return fechaInicioFacturacion;
	}
	/**
	 * @param fechaInicioFacturacion the fechaInicioFacturacion to set
	 */
	public void setFechaInicioFacturacion(Date fechaInicioFacturacion) {
		this.fechaInicioFacturacion = fechaInicioFacturacion;
	}
	/**
	 * @return the fechaFinFacturacion
	 */
	public Date getFechaFinFacturacion() {
		return fechaFinFacturacion;
	}
	/**
	 * @param fechaFinFacturacion the fechaFinFacturacion to set
	 */
	public void setFechaFinFacturacion(Date fechaFinFacturacion) {
		this.fechaFinFacturacion = fechaFinFacturacion;
	}
	
	
}
