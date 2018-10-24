/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class CodigoDTO extends BaseDTO {

	private static final long serialVersionUID = -3473958494153515141L;

	private String valor;
	private String listNombreAgencia;
	private String listNombre;
	private String listId;
	private String listURI;
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
	/**
	 * @return the listNombreAgencia
	 */
	public String getListNombreAgencia() {
		return listNombreAgencia;
	}
	/**
	 * @param listNombreAgencia the listNombreAgencia to set
	 */
	public void setListNombreAgencia(String listNombreAgencia) {
		this.listNombreAgencia = listNombreAgencia;
	}
	/**
	 * @return the listNombre
	 */
	public String getListNombre() {
		return listNombre;
	}
	/**
	 * @param listNombre the listNombre to set
	 */
	public void setListNombre(String listNombre) {
		this.listNombre = listNombre;
	}
	/**
	 * @return the listId
	 */
	public String getListId() {
		return listId;
	}
	/**
	 * @param listId the listId to set
	 */
	public void setListId(String listId) {
		this.listId = listId;
	}
	/**
	 * @return the listURI
	 */
	public String getListURI() {
		return listURI;
	}
	/**
	 * @param listURI the listURI to set
	 */
	public void setListURI(String listURI) {
		this.listURI = listURI;
	}
}
