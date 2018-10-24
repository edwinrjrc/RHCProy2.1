/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class UbigeoDTO extends BaseDTO{

	private static final long serialVersionUID = -746426677381809387L;

	private String codigoUbigeoInei;
	private String codigoDepartamento;
	private String nombreDepartamento;
	private String codigoProvincia;
	private String nombreProvincia;
	private String codigoDistrito;
	private String nombreDistrito;
	private CodigoDTO codigoPais;
	
	/**
	 * @return the codigoUbigeoInei
	 */
	public String getCodigoUbigeoInei() {
		return codigoUbigeoInei;
	}
	/**
	 * @param codigoUbigeoInei the codigoUbigeoInei to set
	 */
	public void setCodigoUbigeoInei(String codigoUbigeoInei) {
		this.codigoUbigeoInei = codigoUbigeoInei;
	}
	/**
	 * @return the codigoDepartamento
	 */
	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}
	/**
	 * @param codigoDepartamento the codigoDepartamento to set
	 */
	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}
	/**
	 * @return the nombreDepartamento
	 */
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}
	/**
	 * @param nombreDepartamento the nombreDepartamento to set
	 */
	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	/**
	 * @return the codigoProvincia
	 */
	public String getCodigoProvincia() {
		return codigoProvincia;
	}
	/**
	 * @param codigoProvincia the codigoProvincia to set
	 */
	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}
	/**
	 * @return the nombreProvincia
	 */
	public String getNombreProvincia() {
		return nombreProvincia;
	}
	/**
	 * @param nombreProvincia the nombreProvincia to set
	 */
	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	/**
	 * @return the codigoDistrito
	 */
	public String getCodigoDistrito() {
		return codigoDistrito;
	}
	/**
	 * @param codigoDistrito the codigoDistrito to set
	 */
	public void setCodigoDistrito(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}
	/**
	 * @return the nombreDistrito
	 */
	public String getNombreDistrito() {
		return nombreDistrito;
	}
	/**
	 * @param nombreDistrito the nombreDistrito to set
	 */
	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}
	/**
	 * @return the codigoPais
	 */
	public CodigoDTO getCodigoPais() {
		return codigoPais;
	}
	/**
	 * @param codigoPais the codigoPais to set
	 */
	public void setCodigoPais(CodigoDTO codigoPais) {
		this.codigoPais = codigoPais;
	}
	
}
