package pe.com.rh.sunat.ejb.session.xml;

import javax.ejb.Remote;

import pe.com.rhsistemas.sunat.comprobantes.ComprobanteDTO;

@Remote
public interface GeneracionXMLRemote {

	public void generarXML(ComprobanteDTO comprobante);
}
