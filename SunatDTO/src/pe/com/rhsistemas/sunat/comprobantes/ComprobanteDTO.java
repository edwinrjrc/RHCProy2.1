/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import pe.com.rhsistemas.sunat.comprobantes.base.AfectacionImptoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseVODTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ComprobanteRelacionadoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.DocumentoIdentidadDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.EntregaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MonedaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoValorDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PercepcionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PersonaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ServicioReferenciaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TotalOperacionDTO;

/**
 * @author Edwin
 *
 */
public class ComprobanteDTO extends BaseDTO {

	private static final long serialVersionUID = -1452858841181093723L;
	
	private Date fechaEmision;
	private Date fechaVencimiento;
	private PersonaDTO emisor;
	private PersonaDTO adquiriente;
	private PersonaDTO destinatario;
	private BaseVODTO tipoComprobante;
	private String numeroSerie;
	private String correlativo;
	private AfectacionImptoDTO sumaIGV;
	private AfectacionImptoDTO sumaISC;
	private AfectacionImptoDTO sumaOtrosTributos;
	private MontoValorDTO sumaOtrosCargos;
	private TotalOperacionDTO totalDescuentos;
	/**
	 * Importe total de la venta, cesión en uso o del servicio prestado
	 */
	private MontoValorDTO totalComprobante;
	private MonedaDTO monedaComprobante;
	private ComprobanteRelacionadoDTO guiaRelacionada;
	private ComprobanteRelacionadoDTO comprobanteRelacionado;
	private List<BaseVODTO> leyendas;
	private PercepcionDTO percepcion;
	private String versionUBL;
	private String versionDocumento;
	
	private String profileId;
	private int cantidadItemsComprobante;
	private Date fechaInicioFacturacion;
	private Date fechaFinFacturacion;
	private String numeroOrdenCompra;
	
	private String numeroCuentaBancoNacion;
	private String codigoBienDetraccion;
	private MontoValorDTO porcentajeDetraccion;
	private String numeroComprobanteAnticipo;
	private String codigoTipoDocumentoAnticipo;
	private MontoValorDTO montoAnticipo;
	private DocumentoIdentidadDTO documentoEmpresaAnticipo;
	private String flagCargoDescuento;
	private String codigoMotivoCargoDescuento;
	private BigDecimal factorCargoDescuento;
	private MontoValorDTO montoCargoDescuento;
	private MontoValorDTO montoBaseCargoDescuento;
	private ServicioReferenciaDTO servicioReferenciaDTO;
	private EntregaDTO entregaDTO;
	
	private List<DetalleComprobanteDTO> detalleComprobante;
	
	/**
	 * @return the fechaEmision
	 */
	public Date getFechaEmision() {
		return fechaEmision;
	}
	/**
	 * @param fechaEmision the fechaEmision to set
	 */
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	/**
	 * @return the adquiriente
	 */
	public PersonaDTO getAdquiriente() {
		return adquiriente;
	}
	/**
	 * @param adquiriente the adquiriente to set
	 */
	public void setAdquiriente(PersonaDTO adquiriente) {
		this.adquiriente = adquiriente;
	}
	/**
	 * @return the tipoComprobante
	 */
	public BaseVODTO getTipoComprobante() {
		return tipoComprobante;
	}
	/**
	 * @param tipoComprobante the tipoComprobante to set
	 */
	public void setTipoComprobante(BaseVODTO tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	/**
	 * @return the fechaVencimiento
	 */
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	/**
	 * @param fechaVencimiento the fechaVencimiento to set
	 */
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	/**
	 * @return the emisor
	 */
	public PersonaDTO getEmisor() {
		return emisor;
	}
	/**
	 * @param emisor the emisor to set
	 */
	public void setEmisor(PersonaDTO emisor) {
		this.emisor = emisor;
	}
	/**
	 * @return the numeroSerie
	 */
	public String getNumeroSerie() {
		return numeroSerie;
	}
	/**
	 * @param numeroSerie the numeroSerie to set
	 */
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	/**
	 * @return the correlativo
	 */
	public String getCorrelativo() {
		return correlativo;
	}
	/**
	 * @param correlativo the correlativo to set
	 */
	public void setCorrelativo(String correlativo) {
		this.correlativo = correlativo;
	}
	/**
	 * @return the sumaIGV
	 */
	public AfectacionImptoDTO getSumaIGV() {
		return sumaIGV;
	}
	/**
	 * @param sumaIGV the sumaIGV to set
	 */
	public void setSumaIGV(AfectacionImptoDTO sumaIGV) {
		this.sumaIGV = sumaIGV;
	}
	/**
	 * @return the sumaISC
	 */
	public AfectacionImptoDTO getSumaISC() {
		return sumaISC;
	}
	/**
	 * @param sumaISC the sumaISC to set
	 */
	public void setSumaISC(AfectacionImptoDTO sumaISC) {
		this.sumaISC = sumaISC;
	}
	/**
	 * @return the sumaOtrosTributos
	 */
	public AfectacionImptoDTO getSumaOtrosTributos() {
		return sumaOtrosTributos;
	}
	/**
	 * @param sumaOtrosTributos the sumaOtrosTributos to set
	 */
	public void setSumaOtrosTributos(AfectacionImptoDTO sumaOtrosTributos) {
		this.sumaOtrosTributos = sumaOtrosTributos;
	}
	/**
	 * @return the sumaOtrosCargos
	 */
	public MontoValorDTO getSumaOtrosCargos() {
		return sumaOtrosCargos;
	}
	/**
	 * @param sumaOtrosCargos the sumaOtrosCargos to set
	 */
	public void setSumaOtrosCargos(MontoValorDTO sumaOtrosCargos) {
		this.sumaOtrosCargos = sumaOtrosCargos;
	}
	/**
	 * @return the totalDescuentos
	 */
	public TotalOperacionDTO getTotalDescuentos() {
		return totalDescuentos;
	}
	/**
	 * @param totalDescuentos the totalDescuentos to set
	 */
	public void setTotalDescuentos(TotalOperacionDTO totalDescuentos) {
		this.totalDescuentos = totalDescuentos;
	}
	/**
	 * @return the totalComprobante
	 */
	public MontoValorDTO getTotalComprobante() {
		return totalComprobante;
	}
	/**
	 * @param totalComprobante the totalComprobante to set
	 */
	public void setTotalComprobante(MontoValorDTO totalComprobante) {
		this.totalComprobante = totalComprobante;
	}
	/**
	 * @return the monedaComprobante
	 */
	public MonedaDTO getMonedaComprobante() {
		return monedaComprobante;
	}
	/**
	 * @param monedaComprobante the monedaComprobante to set
	 */
	public void setMonedaComprobante(MonedaDTO monedaComprobante) {
		this.monedaComprobante = monedaComprobante;
	}
	/**
	 * @return the guiaRelacionada
	 */
	public ComprobanteRelacionadoDTO getGuiaRelacionada() {
		return guiaRelacionada;
	}
	/**
	 * @param guiaRelacionada the guiaRelacionada to set
	 */
	public void setGuiaRelacionada(ComprobanteRelacionadoDTO guiaRelacionada) {
		this.guiaRelacionada = guiaRelacionada;
	}
	/**
	 * @return the comprobanteRelacionado
	 */
	public ComprobanteRelacionadoDTO getComprobanteRelacionado() {
		return comprobanteRelacionado;
	}
	/**
	 * @param comprobanteRelacionado the comprobanteRelacionado to set
	 */
	public void setComprobanteRelacionado(ComprobanteRelacionadoDTO comprobanteRelacionado) {
		this.comprobanteRelacionado = comprobanteRelacionado;
	}
	/**
	 * @return the leyendas
	 */
	public List<BaseVODTO> getLeyendas() {
		return leyendas;
	}
	/**
	 * @param leyendas the leyendas to set
	 */
	public void setLeyendas(List<BaseVODTO> leyendas) {
		this.leyendas = leyendas;
	}
	/**
	 * @return the percepcion
	 */
	public PercepcionDTO getPercepcion() {
		return percepcion;
	}
	/**
	 * @param percepcion the percepcion to set
	 */
	public void setPercepcion(PercepcionDTO percepcion) {
		this.percepcion = percepcion;
	}
	/**
	 * @return the versionUBL
	 */
	public String getVersionUBL() {
		return versionUBL;
	}
	/**
	 * @param versionUBL the versionUBL to set
	 */
	public void setVersionUBL(String versionUBL) {
		this.versionUBL = versionUBL;
	}
	/**
	 * @return the versionDocumento
	 */
	public String getVersionDocumento() {
		return versionDocumento;
	}
	/**
	 * @param versionDocumento the versionDocumento to set
	 */
	public void setVersionDocumento(String versionDocumento) {
		this.versionDocumento = versionDocumento;
	}
	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}
	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	/**
	 * @return the cantidadItemsComprobante
	 */
	public int getCantidadItemsComprobante() {
		return cantidadItemsComprobante;
	}
	/**
	 * @param cantidadItemsComprobante the cantidadItemsComprobante to set
	 */
	public void setCantidadItemsComprobante(int cantidadItemsComprobante) {
		this.cantidadItemsComprobante = cantidadItemsComprobante;
	}
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
	/**
	 * @return the numeroOrdenCompra
	 */
	public String getNumeroOrdenCompra() {
		return numeroOrdenCompra;
	}
	/**
	 * @param numeroOrdenCompra the numeroOrdenCompra to set
	 */
	public void setNumeroOrdenCompra(String numeroOrdenCompra) {
		this.numeroOrdenCompra = numeroOrdenCompra;
	}
	/**
	 * @return the numeroCuentaBancoNacion
	 */
	public String getNumeroCuentaBancoNacion() {
		return numeroCuentaBancoNacion;
	}
	/**
	 * @param numeroCuentaBancoNacion the numeroCuentaBancoNacion to set
	 */
	public void setNumeroCuentaBancoNacion(String numeroCuentaBancoNacion) {
		this.numeroCuentaBancoNacion = numeroCuentaBancoNacion;
	}
	/**
	 * @return the codigoBienDetraccion
	 */
	public String getCodigoBienDetraccion() {
		return codigoBienDetraccion;
	}
	/**
	 * @param codigoBienDetraccion the codigoBienDetraccion to set
	 */
	public void setCodigoBienDetraccion(String codigoBienDetraccion) {
		this.codigoBienDetraccion = codigoBienDetraccion;
	}
	/**
	 * @return the porcentajeDetraccion
	 */
	public MontoValorDTO getPorcentajeDetraccion() {
		return porcentajeDetraccion;
	}
	/**
	 * @param porcentajeDetraccion the porcentajeDetraccion to set
	 */
	public void setPorcentajeDetraccion(MontoValorDTO porcentajeDetraccion) {
		this.porcentajeDetraccion = porcentajeDetraccion;
	}
	/**
	 * @return the numeroComprobanteAnticipo
	 */
	public String getNumeroComprobanteAnticipo() {
		return numeroComprobanteAnticipo;
	}
	/**
	 * @param numeroComprobanteAnticipo the numeroComprobanteAnticipo to set
	 */
	public void setNumeroComprobanteAnticipo(String numeroComprobanteAnticipo) {
		this.numeroComprobanteAnticipo = numeroComprobanteAnticipo;
	}
	/**
	 * @return the codigoTipoDocumentoAnticipo
	 */
	public String getCodigoTipoDocumentoAnticipo() {
		return codigoTipoDocumentoAnticipo;
	}
	/**
	 * @param codigoTipoDocumentoAnticipo the codigoTipoDocumentoAnticipo to set
	 */
	public void setCodigoTipoDocumentoAnticipo(String codigoTipoDocumentoAnticipo) {
		this.codigoTipoDocumentoAnticipo = codigoTipoDocumentoAnticipo;
	}
	/**
	 * @return the montoAnticipo
	 */
	public MontoValorDTO getMontoAnticipo() {
		return montoAnticipo;
	}
	/**
	 * @param montoAnticipo the montoAnticipo to set
	 */
	public void setMontoAnticipo(MontoValorDTO montoAnticipo) {
		this.montoAnticipo = montoAnticipo;
	}
	/**
	 * @return the documentoEmpresaAnticipo
	 */
	public DocumentoIdentidadDTO getDocumentoEmpresaAnticipo() {
		return documentoEmpresaAnticipo;
	}
	/**
	 * @param documentoEmpresaAnticipo the documentoEmpresaAnticipo to set
	 */
	public void setDocumentoEmpresaAnticipo(DocumentoIdentidadDTO documentoEmpresaAnticipo) {
		this.documentoEmpresaAnticipo = documentoEmpresaAnticipo;
	}
	/**
	 * @return the flagCargoDescuento
	 */
	public String getFlagCargoDescuento() {
		return flagCargoDescuento;
	}
	/**
	 * @param flagCargoDescuento the flagCargoDescuento to set
	 */
	public void setFlagCargoDescuento(String flagCargoDescuento) {
		this.flagCargoDescuento = flagCargoDescuento;
	}
	/**
	 * @return the codigoMotivoCargoDescuento
	 */
	public String getCodigoMotivoCargoDescuento() {
		return codigoMotivoCargoDescuento;
	}
	/**
	 * @param codigoMotivoCargoDescuento the codigoMotivoCargoDescuento to set
	 */
	public void setCodigoMotivoCargoDescuento(String codigoMotivoCargoDescuento) {
		this.codigoMotivoCargoDescuento = codigoMotivoCargoDescuento;
	}
	/**
	 * @return the factorCargoDescuento
	 */
	public BigDecimal getFactorCargoDescuento() {
		return factorCargoDescuento;
	}
	/**
	 * @param factorCargoDescuento the factorCargoDescuento to set
	 */
	public void setFactorCargoDescuento(BigDecimal factorCargoDescuento) {
		this.factorCargoDescuento = factorCargoDescuento;
	}
	/**
	 * @return the montoCargoDescuento
	 */
	public MontoValorDTO getMontoCargoDescuento() {
		return montoCargoDescuento;
	}
	/**
	 * @param montoCargoDescuento the montoCargoDescuento to set
	 */
	public void setMontoCargoDescuento(MontoValorDTO montoCargoDescuento) {
		this.montoCargoDescuento = montoCargoDescuento;
	}
	/**
	 * @return the montoBaseCargoDescuento
	 */
	public MontoValorDTO getMontoBaseCargoDescuento() {
		return montoBaseCargoDescuento;
	}
	/**
	 * @param montoBaseCargoDescuento the montoBaseCargoDescuento to set
	 */
	public void setMontoBaseCargoDescuento(MontoValorDTO montoBaseCargoDescuento) {
		this.montoBaseCargoDescuento = montoBaseCargoDescuento;
	}
	/**
	 * @return the detalleComprobante
	 */
	public List<DetalleComprobanteDTO> getDetalleComprobante() {
		return detalleComprobante;
	}
	/**
	 * @param detalleComprobante the detalleComprobante to set
	 */
	public void setDetalleComprobante(List<DetalleComprobanteDTO> detalleComprobante) {
		this.detalleComprobante = detalleComprobante;
	}
	/**
	 * @return the servicioReferenciaDTO
	 */
	public ServicioReferenciaDTO getServicioReferenciaDTO() {
		return servicioReferenciaDTO;
	}
	/**
	 * @param servicioReferenciaDTO the servicioReferenciaDTO to set
	 */
	public void setServicioReferenciaDTO(ServicioReferenciaDTO servicioReferenciaDTO) {
		this.servicioReferenciaDTO = servicioReferenciaDTO;
	}
	/**
	 * @return the entregaDTO
	 */
	public EntregaDTO getEntregaDTO() {
		return entregaDTO;
	}
	/**
	 * @param entregaDTO the entregaDTO to set
	 */
	public void setEntregaDTO(EntregaDTO entregaDTO) {
		this.entregaDTO = entregaDTO;
	}
	/**
	 * @return the destinatario
	 */
	public PersonaDTO getDestinatario() {
		return destinatario;
	}
	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(PersonaDTO destinatario) {
		this.destinatario = destinatario;
	}
	
}
