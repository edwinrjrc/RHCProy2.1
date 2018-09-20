/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.io.Serializable;

/**
 * @author Edwin
 *
 */
public abstract class BaseDTO implements Serializable{

	private static final long serialVersionUID = -3990799620647383663L;
	
	private String id;
	private String agenciaNombre;
	private String agenciaId;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the agenciaNombre
	 */
	public String getAgenciaNombre() {
		return agenciaNombre;
	}

	/**
	 * @param agenciaNombre the agenciaNombre to set
	 */
	public void setAgenciaNombre(String agenciaNombre) {
		this.agenciaNombre = agenciaNombre;
	}

	/**
	 * @return the agenciaId
	 */
	public String getAgenciaId() {
		return agenciaId;
	}

	/**
	 * @param agenciaId the agenciaId to set
	 */
	public void setAgenciaId(String agenciaId) {
		this.agenciaId = agenciaId;
	}
	
	
}
