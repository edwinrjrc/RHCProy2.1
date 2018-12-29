/**
 * 
 */
package pe.com.rhsistemas.sunat.comprobantes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pe.com.rhsistemas.sunat.comprobantes.base.AfectacionImptoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseVODTO;
import pe.com.rhsistemas.sunat.comprobantes.base.CodigoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ComprobanteAnticipoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ComprobanteRelacionadoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.DescuentoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.DireccionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.EntregaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.IdDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MedidaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MonedaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoOperacionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoValorDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PercepcionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PeriodoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PersonaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ServicioReferenciaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TotalOperacionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TransporteDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TransportistaDTO;

/**
 * @author Edwin
 *
 */
public class ComprobanteDTO extends BaseDTO {

	private static final long serialVersionUID = -1452858841181093723L;
	
	private Date fechaEmision;
	private Date fechaVencimiento;
	private List<PersonaDTO> listaEmisores;
	private List<PersonaDTO> listaAdquiriente;
	private CodigoDTO tipoComprobante;
	private String numeroSerie;
	private String correlativo;
	private List<BaseVODTO> listaNotas;
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
	private List<ComprobanteRelacionadoDTO> listaGuiaRelacionada;
	private List<ComprobanteRelacionadoDTO> listaComprobanteRelacionado;
	private List<BaseVODTO> leyendas;
	private PercepcionDTO percepcion;
	private String versionUBL;
	private String versionDocumento;
	
	private IdDTO profileId;
	private int cantidadItemsComprobante;
	private List<PeriodoDTO> periodoFacturacion;
	private String numeroOrdenCompra;
	
	private String numeroCuentaBancoNacion;
	private String codigoBienDetraccion;
	private MontoValorDTO porcentajeDetraccion;
	private ServicioReferenciaDTO servicioReferenciaDTO;
	private List<ComprobanteAnticipoDTO> listaComprobantesAnticipo;
	private List<EntregaDTO> listaEntregas;
	private List<TransporteDTO> listaTransportes;
	private List<TransportistaDTO> listaTransportista;
	private List<PersonaDTO> listaChoferes;
	private List<DireccionDTO> listaDireccionLlegada;
	private List<DireccionDTO> listaDireccionPartida;
	
	private String numeroCuentaBNDetraccion;
	
	private MontoValorDTO montoTotalImpuestos;
	private BaseVODTO codigoCategoriaImpuesto;
	private BaseVODTO codigoTributo;
	
	private MontoValorDTO montoTotalValorVenta;
	private String numeroRegistroMTC;
	
	private List<String> listaNumeroCuentaDetraccion;
	private List<DescuentoDTO> listaDescuentos;
	private List<MontoOperacionDTO> listaMontoOperaciones;
	
	private MedidaDTO pesoBruto;
	
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
		if (sumaIGV == null){
			sumaIGV = new AfectacionImptoDTO();
		}
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
		if (sumaISC == null){
			sumaISC = new AfectacionImptoDTO();
		}
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
		if (sumaOtrosTributos == null){
			sumaOtrosTributos = new AfectacionImptoDTO();
		}
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
		if (sumaOtrosCargos == null){
			sumaOtrosCargos = new MontoValorDTO();
		}
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
		if (totalDescuentos == null){
			totalDescuentos = new TotalOperacionDTO();
		}
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
		if (totalComprobante == null){
			totalComprobante = new MontoValorDTO();
		}
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
		if (monedaComprobante == null){
			monedaComprobante = new MonedaDTO();
		}
		return monedaComprobante;
	}
	/**
	 * @param monedaComprobante the monedaComprobante to set
	 */
	public void setMonedaComprobante(MonedaDTO monedaComprobante) {
		this.monedaComprobante = monedaComprobante;
	}
	/**
	 * @return the leyendas
	 */
	public List<BaseVODTO> getLeyendas() {
		if (leyendas == null){
			leyendas = new ArrayList<BaseVODTO>();
		}
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
		if (percepcion == null){
			percepcion = new PercepcionDTO();
		}
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
		if (porcentajeDetraccion == null){
			porcentajeDetraccion = new MontoValorDTO();
		}
		return porcentajeDetraccion;
	}
	/**
	 * @param porcentajeDetraccion the porcentajeDetraccion to set
	 */
	public void setPorcentajeDetraccion(MontoValorDTO porcentajeDetraccion) {
		this.porcentajeDetraccion = porcentajeDetraccion;
	}
	/**
	 * @return the detalleComprobante
	 */
	public List<DetalleComprobanteDTO> getDetalleComprobante() {
		if (detalleComprobante == null){
			detalleComprobante = new ArrayList<DetalleComprobanteDTO>();
		}
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
		if (servicioReferenciaDTO == null){
			servicioReferenciaDTO = new ServicioReferenciaDTO();
		}
		return servicioReferenciaDTO;
	}
	/**
	 * @param servicioReferenciaDTO the servicioReferenciaDTO to set
	 */
	public void setServicioReferenciaDTO(ServicioReferenciaDTO servicioReferenciaDTO) {
		this.servicioReferenciaDTO = servicioReferenciaDTO;
	}
	/**
	 * @return the numeroCuentaBNDetraccion
	 */
	public String getNumeroCuentaBNDetraccion() {
		return numeroCuentaBNDetraccion;
	}
	/**
	 * @param numeroCuentaBNDetraccion the numeroCuentaBNDetraccion to set
	 */
	public void setNumeroCuentaBNDetraccion(String numeroCuentaBNDetraccion) {
		this.numeroCuentaBNDetraccion = numeroCuentaBNDetraccion;
	}
	/**
	 * @return the montoTotalImpuestos
	 */
	public MontoValorDTO getMontoTotalImpuestos() {
		if (montoTotalImpuestos == null){
			montoTotalImpuestos = new MontoValorDTO();
		}
		return montoTotalImpuestos;
	}
	/**
	 * @param montoTotalImpuestos the montoTotalImpuestos to set
	 */
	public void setMontoTotalImpuestos(MontoValorDTO montoTotalImpuestos) {
		this.montoTotalImpuestos = montoTotalImpuestos;
	}
	/**
	 * @return the codigoCategoriaImpuesto
	 */
	public BaseVODTO getCodigoCategoriaImpuesto() {
		if (codigoCategoriaImpuesto == null){
			codigoCategoriaImpuesto = new BaseVODTO();
		}
		return codigoCategoriaImpuesto;
	}
	/**
	 * @param codigoCategoriaImpuesto the codigoCategoriaImpuesto to set
	 */
	public void setCodigoCategoriaImpuesto(BaseVODTO codigoCategoriaImpuesto) {
		this.codigoCategoriaImpuesto = codigoCategoriaImpuesto;
	}
	/**
	 * @return the codigoTributo
	 */
	public BaseVODTO getCodigoTributo() {
		if (codigoTributo == null){
			codigoTributo = new BaseVODTO();
		}
		return codigoTributo;
	}
	/**
	 * @param codigoTributo the codigoTributo to set
	 */
	public void setCodigoTributo(BaseVODTO codigoTributo) {
		this.codigoTributo = codigoTributo;
	}
	/**
	 * @return the montoTotalValorVenta
	 */
	public MontoValorDTO getMontoTotalValorVenta() {
		if (montoTotalValorVenta == null){
			montoTotalValorVenta = new MontoValorDTO();
		}
		return montoTotalValorVenta;
	}
	/**
	 * @param montoTotalValorVenta the montoTotalValorVenta to set
	 */
	public void setMontoTotalValorVenta(MontoValorDTO montoTotalValorVenta) {
		this.montoTotalValorVenta = montoTotalValorVenta;
	}
	/**
	 * @return the profileId
	 */
	public IdDTO getProfileId() {
		if (profileId == null){
			profileId = new IdDTO();
		}
		return profileId;
	}
	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(IdDTO profileId) {
		this.profileId = profileId;
	}
	/**
	 * @return the tipoComprobante
	 */
	public CodigoDTO getTipoComprobante() {
		if (tipoComprobante == null){
			tipoComprobante = new CodigoDTO();
		}
		return tipoComprobante;
	}
	/**
	 * @param tipoComprobante the tipoComprobante to set
	 */
	public void setTipoComprobante(CodigoDTO tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	/**
	 * @return the listaNotas
	 */
	public List<BaseVODTO> getListaNotas() {
		if (listaNotas == null){
			listaNotas = new ArrayList<BaseVODTO>();
		}
		return listaNotas;
	}
	/**
	 * @param listaNotas the listaNotas to set
	 */
	public void setListaNotas(List<BaseVODTO> listaNotas) {
		this.listaNotas = listaNotas;
	}
	/**
	 * @return the periodoFacturacion
	 */
	public List<PeriodoDTO> getPeriodoFacturacion() {
		if (periodoFacturacion == null){
			periodoFacturacion = new ArrayList<PeriodoDTO>(); 
		}
		return periodoFacturacion;
	}
	/**
	 * @param periodoFacturacion the periodoFacturacion to set
	 */
	public void setPeriodoFacturacion(List<PeriodoDTO> periodoFacturacion) {
		this.periodoFacturacion = periodoFacturacion;
	}
	/**
	 * @return the listaGuiaRelacionada
	 */
	public List<ComprobanteRelacionadoDTO> getListaGuiaRelacionada() {
		if (listaGuiaRelacionada == null){
			listaGuiaRelacionada = new ArrayList<ComprobanteRelacionadoDTO>();
		}
		return listaGuiaRelacionada;
	}
	/**
	 * @param listaGuiaRelacionada the listaGuiaRelacionada to set
	 */
	public void setListaGuiaRelacionada(List<ComprobanteRelacionadoDTO> listaGuiaRelacionada) {
		this.listaGuiaRelacionada = listaGuiaRelacionada;
	}
	/**
	 * @return the listaEmisores
	 */
	public List<PersonaDTO> getListaEmisores() {
		if (listaEmisores == null){
			listaEmisores = new ArrayList<PersonaDTO>();
		}
		return listaEmisores;
	}
	/**
	 * @param listaEmisores the listaEmisores to set
	 */
	public void setListaEmisores(List<PersonaDTO> listaEmisores) {
		this.listaEmisores = listaEmisores;
	}
	/**
	 * @return the listaAdquiriente
	 */
	public List<PersonaDTO> getListaAdquiriente() {
		if (listaAdquiriente == null){
			listaAdquiriente = new ArrayList<PersonaDTO>();
		}
		return listaAdquiriente;
	}
	/**
	 * @param listaAdquiriente the listaAdquiriente to set
	 */
	public void setListaAdquiriente(List<PersonaDTO> listaAdquiriente) {
		this.listaAdquiriente = listaAdquiriente;
	}
	/**
	 * @return the listaEntregas
	 */
	public List<EntregaDTO> getListaEntregas() {
		if (listaEntregas == null){
			listaEntregas = new ArrayList<EntregaDTO>();
		}
		return listaEntregas;
	}
	/**
	 * @param listaEntregas the listaEntregas to set
	 */
	public void setListaEntregas(List<EntregaDTO> listaEntregas) {
		this.listaEntregas = listaEntregas;
	}
	/**
	 * @return the listaTransportes
	 */
	public List<TransporteDTO> getListaTransportes() {
		if (listaTransportes == null){
			listaTransportes = new ArrayList<TransporteDTO>();
		}
		return listaTransportes;
	}
	/**
	 * @param listaTransportes the listaTransportes to set
	 */
	public void setListaTransportes(List<TransporteDTO> listaTransportes) {
		this.listaTransportes = listaTransportes;
	}
	/**
	 * @return the listaDireccionLlegada
	 */
	public List<DireccionDTO> getListaDireccionLlegada() {
		if (listaDireccionLlegada == null){
			listaDireccionLlegada = new ArrayList<DireccionDTO>();
		}
		return listaDireccionLlegada;
	}
	/**
	 * @param listaDireccionLlegada the listaDireccionLlegada to set
	 */
	public void setListaDireccionLlegada(List<DireccionDTO> listaDireccionLlegada) {
		this.listaDireccionLlegada = listaDireccionLlegada;
	}
	/**
	 * @return the listaDireccionPartida
	 */
	public List<DireccionDTO> getListaDireccionPartida() {
		if (listaDireccionPartida == null){
			listaDireccionPartida = new ArrayList<DireccionDTO>();
		}
		return listaDireccionPartida;
	}
	/**
	 * @param listaDireccionPartida the listaDireccionPartida to set
	 */
	public void setListaDireccionPartida(List<DireccionDTO> listaDireccionPartida) {
		this.listaDireccionPartida = listaDireccionPartida;
	}
	/**
	 * @return the listaTransportista
	 */
	public List<TransportistaDTO> getListaTransportista() {
		if (listaTransportista == null){
			listaTransportista = new ArrayList<TransportistaDTO>();
		}
		return listaTransportista;
	}
	/**
	 * @param listaTransportista the listaTransportista to set
	 */
	public void setListaTransportista(List<TransportistaDTO> listaTransportista) {
		this.listaTransportista = listaTransportista;
	}
	/**
	 * @return the listaChoferes
	 */
	public List<PersonaDTO> getListaChoferes() {
		if (listaChoferes == null){
			listaChoferes = new ArrayList<PersonaDTO>();
		}
		return listaChoferes;
	}
	/**
	 * @param listaChoferes the listaChoferes to set
	 */
	public void setListaChoferes(List<PersonaDTO> listaChoferes) {
		this.listaChoferes = listaChoferes;
	}
	/**
	 * @return the numeroRegistroMTC
	 */
	public String getNumeroRegistroMTC() {
		return numeroRegistroMTC;
	}
	/**
	 * @param numeroRegistroMTC the numeroRegistroMTC to set
	 */
	public void setNumeroRegistroMTC(String numeroRegistroMTC) {
		this.numeroRegistroMTC = numeroRegistroMTC;
	}
	/**
	 * @return the listaNumeroCuentaDetraccion
	 */
	public List<String> getListaNumeroCuentaDetraccion() {
		if (listaNumeroCuentaDetraccion == null){
			listaNumeroCuentaDetraccion = new ArrayList<String>();
		}
		return listaNumeroCuentaDetraccion;
	}
	/**
	 * @param listaNumeroCuentaDetraccion the listaNumeroCuentaDetraccion to set
	 */
	public void setListaNumeroCuentaDetraccion(List<String> listaNumeroCuentaDetraccion) {
		this.listaNumeroCuentaDetraccion = listaNumeroCuentaDetraccion;
	}
	/**
	 * @return the listaDescuentos
	 */
	public List<DescuentoDTO> getListaDescuentos() {
		if (listaDescuentos == null){
			listaDescuentos = new ArrayList<DescuentoDTO>();
		}
		return listaDescuentos;
	}
	/**
	 * @param listaDescuentos the listaDescuentos to set
	 */
	public void setListaDescuentos(List<DescuentoDTO> listaDescuentos) {
		this.listaDescuentos = listaDescuentos;
	}
	/**
	 * @return the listaComprobantesAnticipo
	 */
	public List<ComprobanteAnticipoDTO> getListaComprobantesAnticipo() {
		if (listaComprobantesAnticipo == null){
			listaComprobantesAnticipo = new ArrayList<ComprobanteAnticipoDTO>();
		}
		return listaComprobantesAnticipo;
	}
	/**
	 * @param listaComprobantesAnticipo the listaComprobantesAnticipo to set
	 */
	public void setListaComprobantesAnticipo(List<ComprobanteAnticipoDTO> listaComprobantesAnticipo) {
		this.listaComprobantesAnticipo = listaComprobantesAnticipo;
	}
	/**
	 * @return the listaMontoOperaciones
	 */
	public List<MontoOperacionDTO> getListaMontoOperaciones() {
		if (listaMontoOperaciones == null){
			listaMontoOperaciones = new ArrayList<MontoOperacionDTO>();
		}
		return listaMontoOperaciones;
	}
	/**
	 * @param listaMontoOperaciones the listaMontoOperaciones to set
	 */
	public void setListaMontoOperaciones(List<MontoOperacionDTO> listaMontoOperaciones) {
		this.listaMontoOperaciones = listaMontoOperaciones;
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
	 * @return the listacCmprobanteRelacionado
	 */
	public List<ComprobanteRelacionadoDTO> getListaComprobanteRelacionado() {
		if (listaComprobanteRelacionado == null){
			listaComprobanteRelacionado = new ArrayList<ComprobanteRelacionadoDTO>();
		}
		return listaComprobanteRelacionado;
	}
	/**
	 * @param listacCmprobanteRelacionado the listacCmprobanteRelacionado to set
	 */
	public void setListaComprobanteRelacionado(List<ComprobanteRelacionadoDTO> listacCmprobanteRelacionado) {
		this.listaComprobanteRelacionado = listacCmprobanteRelacionado;
	}
}
