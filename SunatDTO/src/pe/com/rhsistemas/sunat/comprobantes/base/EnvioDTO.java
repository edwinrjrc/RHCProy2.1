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
public class EnvioDTO extends BaseDTO {

	private static final long serialVersionUID = -3426526251813674429L;
	
	private List<TransporteDTO> listaTransportes;
	private List<DireccionDTO> listaDireccionLlegada;
	private String numeroPlaca;
	private boolean indicadorSubcontratacion;
	private List<DireccionDTO> listaDireccionPartida;
	
	
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
	 * @return the numeroPlaca
	 */
	public String getNumeroPlaca() {
		return numeroPlaca;
	}
	/**
	 * @param numeroPlaca the numeroPlaca to set
	 */
	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}
	/**
	 * @return the indicadorSubcontratacion
	 */
	public boolean isIndicadorSubcontratacion() {
		return indicadorSubcontratacion;
	}
	/**
	 * @param indicadorSubcontratacion the indicadorSubcontratacion to set
	 */
	public void setIndicadorSubcontratacion(boolean indicadorSubcontratacion) {
		this.indicadorSubcontratacion = indicadorSubcontratacion;
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
	
	
}
