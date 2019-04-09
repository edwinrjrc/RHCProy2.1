/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class MontoOperacionDTO extends BaseDTO {

	private static final long serialVersionUID = 2380268545301988084L;
	
	private MontoValorDTO montoOperacion;
	private IdDTO codigoTributo;
	private String nombreTributo;
	private BaseVODTO tipoOperacion;
	private MontoValorDTO montoImpuesto;
	private IdDTO codigoCategoriaImpuesto;
	private CodigoDTO codigoInternacionalTributo;
	
	/**
	 * @return the montoOperacion
	 */
	public MontoValorDTO getMontoOperacion() {
		if (montoOperacion == null){
			montoOperacion = new MontoValorDTO();
		}
		return montoOperacion;
	}
	/**
	 * @param montoOperacion the montoOperacion to set
	 */
	public void setMontoOperacion(MontoValorDTO montoOperacion) {
		this.montoOperacion = montoOperacion;
	}
	/**
	 * @return the tipoOperacion
	 */
	public BaseVODTO getTipoOperacion() {
		if (tipoOperacion == null){
			tipoOperacion = new BaseVODTO();
		}
		return tipoOperacion;
	}
	/**
	 * @param tipoOperacion the tipoOperacion to set
	 */
	public void setTipoOperacion(BaseVODTO tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
	/**
	 * @return the montoImpuesto
	 */
	public MontoValorDTO getMontoImpuesto() {
		if (montoImpuesto == null){
			montoImpuesto = new MontoValorDTO();
		}
		return montoImpuesto;
	}
	/**
	 * @param montoImpuesto the montoImpuesto to set
	 */
	public void setMontoImpuesto(MontoValorDTO montoImpuesto) {
		this.montoImpuesto = montoImpuesto;
	}
	/**
	 * @return the codigoTributo
	 */
	public IdDTO getCodigoTributo() {
		if (codigoTributo == null){
			codigoTributo = new IdDTO();
		}
		return codigoTributo;
	}
	/**
	 * @param codigoTributo the codigoTributo to set
	 */
	public void setCodigoTributo(IdDTO codigoTributo) {
		this.codigoTributo = codigoTributo;
	}
	/**
	 * @return the codigoCategoriaImpuesto
	 */
	public IdDTO getCodigoCategoriaImpuesto() {
		if (codigoCategoriaImpuesto == null){
			codigoCategoriaImpuesto = new IdDTO();
		}
		return codigoCategoriaImpuesto;
	}
	/**
	 * @param codigoCategoriaImpuesto the codigoCategoriaImpuesto to set
	 */
	public void setCodigoCategoriaImpuesto(IdDTO codigoCategoriaImpuesto) {
		this.codigoCategoriaImpuesto = codigoCategoriaImpuesto;
	}
	/**
	 * @return the nombreTributo
	 */
	public String getNombreTributo() {
		return nombreTributo;
	}
	/**
	 * @param nombreTributo the nombreTributo to set
	 */
	public void setNombreTributo(String nombreTributo) {
		this.nombreTributo = nombreTributo;
	}
	/**
	 * @return the codigoInternacionalTributo
	 */
	public CodigoDTO getCodigoInternacionalTributo() {
		if (codigoInternacionalTributo == null){
			codigoInternacionalTributo = new CodigoDTO();
		}
		return codigoInternacionalTributo;
	}
	/**
	 * @param codigoInternacionalTributo the codigoInternacionalTributo to set
	 */
	public void setCodigoInternacionalTributo(CodigoDTO codigoInternacionalTributo) {
		this.codigoInternacionalTributo = codigoInternacionalTributo;
	}
	
	
}
