/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

/**
 * @author Edwin
 *
 */
public class PercepcionDTO extends BaseDTO {

	private static final long serialVersionUID = -5411486118764380131L;
	
	private String codigo;
	private MontoValorDTO baseImponible;
	private MontoValorDTO monto;
	private MontoValorDTO montoTotalIncluido;
	
	
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the baseImponible
	 */
	public MontoValorDTO getBaseImponible() {
		return baseImponible;
	}
	/**
	 * @param baseImponible the baseImponible to set
	 */
	public void setBaseImponible(MontoValorDTO baseImponible) {
		this.baseImponible = baseImponible;
	}
	/**
	 * @return the monto
	 */
	public MontoValorDTO getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(MontoValorDTO monto) {
		this.monto = monto;
	}
	/**
	 * @return the montoTotalIncluido
	 */
	public MontoValorDTO getMontoTotalIncluido() {
		return montoTotalIncluido;
	}
	/**
	 * @param montoTotalIncluido the montoTotalIncluido to set
	 */
	public void setMontoTotalIncluido(MontoValorDTO montoTotalIncluido) {
		this.montoTotalIncluido = montoTotalIncluido;
	}

	
}
