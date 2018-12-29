/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edwin
 *
 */
public class EntregaDTO extends BaseDTO {

	private static final long serialVersionUID = -939742341838241369L;

	private IdDTO numeroMedidor;
	private CantidadDTO cantidad;
	private String codigoUnidadMedida;
	private CantidadDTO potenciaContratada;
	private List<UbicacionMedidorDTO> listaUbicacionesMedidor;
	private List<PersonaDTO> listaDestinatarios;
	private String codigoUnidadMedidaPotenciaContratada;
	private CodigoDTO motivoTraslado;
	private MedidaDTO pesoBruto;
	private String unidadMedida;
	private boolean flagSubcontratacion;
	
	/**
	 * @return the codigoUnidadMedida
	 */
	public String getCodigoUnidadMedida() {
		return codigoUnidadMedida;
	}
	/**
	 * @param codigoUnidadMedida the codigoUnidadMedida to set
	 */
	public void setCodigoUnidadMedida(String codigoUnidadMedida) {
		this.codigoUnidadMedida = codigoUnidadMedida;
	}
	/**
	 * @return the potenciaContratada
	 */
	public CantidadDTO getPotenciaContratada() {
		if (potenciaContratada == null){
			potenciaContratada = new CantidadDTO();
		}
		return potenciaContratada;
	}
	/**
	 * @param potenciaContratada the potenciaContratada to set
	 */
	public void setPotenciaContratada(CantidadDTO potenciaContratada) {
		this.potenciaContratada = potenciaContratada;
	}
	/**
	 * @return the codigoUnidadMedidaPotenciaContratada
	 */
	public String getCodigoUnidadMedidaPotenciaContratada() {
		return codigoUnidadMedidaPotenciaContratada;
	}
	/**
	 * @param codigoUnidadMedidaPotenciaContratada the codigoUnidadMedidaPotenciaContratada to set
	 */
	public void setCodigoUnidadMedidaPotenciaContratada(String codigoUnidadMedidaPotenciaContratada) {
		this.codigoUnidadMedidaPotenciaContratada = codigoUnidadMedidaPotenciaContratada;
	}
	/**
	 * @return the motivoTraslado
	 */
	public CodigoDTO getMotivoTraslado() {
		if (motivoTraslado == null){
			motivoTraslado = new CodigoDTO();
		}
		return motivoTraslado;
	}
	/**
	 * @param motivoTraslado the motivoTraslado to set
	 */
	public void setMotivoTraslado(CodigoDTO motivoTraslado) {
		this.motivoTraslado = motivoTraslado;
	}
	/**
	 * @return the pesoBruto
	 */
	public MedidaDTO getPesoBruto() {
		if (pesoBruto == null){
			pesoBruto = new MedidaDTO();
		}
		return pesoBruto;
	}
	/**
	 * @param pesoBruto the pesoBruto to set
	 */
	public void setPesoBruto(MedidaDTO pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	/**
	 * @return the unidadMedida
	 */
	public String getUnidadMedida() {
		return unidadMedida;
	}
	/**
	 * @param unidadMedida the unidadMedida to set
	 */
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	/**
	 * @return the flagSubcontratacion
	 */
	public boolean isFlagSubcontratacion() {
		return flagSubcontratacion;
	}
	/**
	 * @param flagSubcontratacion the flagSubcontratacion to set
	 */
	public void setFlagSubcontratacion(boolean flagSubcontratacion) {
		this.flagSubcontratacion = flagSubcontratacion;
	}
	/**
	 * @return the numeroMedidor
	 */
	public IdDTO getNumeroMedidor() {
		if (numeroMedidor == null){
			numeroMedidor = new IdDTO();
		}
		return numeroMedidor;
	}
	/**
	 * @param numeroMedidor the numeroMedidor to set
	 */
	public void setNumeroMedidor(IdDTO numeroMedidor) {
		this.numeroMedidor = numeroMedidor;
	}
	/**
	 * @return the cantidad
	 */
	public CantidadDTO getCantidad() {
		if (cantidad == null){
			cantidad = new CantidadDTO();
		}
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(CantidadDTO cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the listaUbicacionesMedidor
	 */
	public List<UbicacionMedidorDTO> getListaUbicacionesMedidor() {
		if (listaUbicacionesMedidor == null){
			listaUbicacionesMedidor = new ArrayList<UbicacionMedidorDTO>();
		}
		return listaUbicacionesMedidor;
	}
	/**
	 * @param listaUbicacionesMedidor the listaUbicacionesMedidor to set
	 */
	public void setListaUbicacionesMedidor(List<UbicacionMedidorDTO> listaUbicacionesMedidor) {
		this.listaUbicacionesMedidor = listaUbicacionesMedidor;
	}
	/**
	 * @return the listaDestinatarios
	 */
	public List<PersonaDTO> getListaDestinatarios() {
		if (listaDestinatarios == null){
			listaDestinatarios = new ArrayList<PersonaDTO>();
		}
		return listaDestinatarios;
	}
	/**
	 * @param listaDestinatarios the listaDestinatarios to set
	 */
	public void setListaDestinatarios(List<PersonaDTO> listaDestinatarios) {
		this.listaDestinatarios = listaDestinatarios;
	}
}
