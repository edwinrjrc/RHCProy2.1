package pe.com.rh.sunat.ejb.session.xml;

import javax.ejb.Local;

import pe.com.rhsistemas.sunat.comprobantes.ComprobanteDTO;

@Local
public interface GeneracionXMLLocal {

	public byte[] generarXML(ComprobanteDTO comprobante);
}
