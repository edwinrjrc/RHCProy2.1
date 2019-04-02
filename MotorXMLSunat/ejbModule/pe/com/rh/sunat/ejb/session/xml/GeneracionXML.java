package pe.com.rh.sunat.ejb.session.xml;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

import javax.ejb.Stateless;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommodityClassificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CountryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.FinancialAccountType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.InvoiceLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationCoordinateType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.MonetaryTotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyNameType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PaymentMeansType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PaymentTermsType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PaymentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PersonType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PriceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PricingReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ShipmentStageType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ShipmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportEventType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportHandlingUnitType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportMeansType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AddressTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AllowanceTotalAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BaseAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeTotalAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OccurrenceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OccurrenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaidAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PayableAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrepaidAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxInclusiveAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxableAmountType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.ObjectFactory;
import pe.com.rh.sunat.ejb.util.UtilEjb;
import pe.com.rh.sunat.ejb.util.UtilUBL;
import pe.com.rhsistemas.sunat.comprobantes.ComprobanteDTO;
import pe.com.rhsistemas.sunat.comprobantes.DetalleComprobanteDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.AfectacionImptoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.BaseVODTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ComprobanteAnticipoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ComprobanteRelacionadoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.DescuentoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.DireccionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.EntregaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MontoOperacionDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PeriodoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PersonaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PrecioDetalleDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.ProductoServicioDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PropiedadesAdicionalesDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TransporteDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.TransportistaDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.UbicacionMedidorDTO;

/**
 * Session Bean implementation class GeneracionXML
 */
@Stateless
public class GeneracionXML implements GeneracionXMLRemote, GeneracionXMLLocal {

	public void generarXML(ComprobanteDTO comprobante) {
		try {
			byte[] bytes = generadorXML(comprobante);
			String nombreArchivo = comprobante.getNumeroSerie() + "-";
			nombreArchivo = nombreArchivo + comprobante.getCorrelativo() + ".xml";
			FileOutputStream fos = new FileOutputStream("D:\\" + nombreArchivo);
			fos.write(bytes);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private byte[] generadorXML(ComprobanteDTO comprobante) {
		try {
			ObjectFactory factory = new ObjectFactory();
			InvoiceType invoice = factory.createInvoiceType();
			if (StringUtils.isNotBlank(comprobante.getNumeroSerie())
					&& StringUtils.isNotBlank(comprobante.getCorrelativo())) {
				invoice.setID(UtilUBL.generarIdType(comprobante.getNumeroSerie() + "-" + comprobante.getCorrelativo()));
			}
			if (StringUtils.isNotBlank(comprobante.getVersionUBL())) {
				invoice.setUBLVersionID(UtilUBL.generarUBLVersion(comprobante.getVersionUBL()));
			}
			if (StringUtils.isNotBlank(comprobante.getVersionDocumento())) {
				invoice.setCustomizationID(UtilUBL.generarCustomizationId(comprobante.getVersionDocumento()));
			}
			if (comprobante.getProfileId() != null && StringUtils.isNotBlank(comprobante.getProfileId().getValor())) {
				invoice.setProfileID(UtilUBL.generarProfileId(comprobante.getProfileId()));
			}
			if (comprobante.getFechaEmision() != null) {
				invoice.setIssueDate(UtilUBL.generarIssueDate(comprobante.getFechaEmision()));
			}
			if (comprobante.getFechaEmision() != null) {
				invoice.setIssueTime(UtilUBL.generarIssueTime(comprobante.getFechaEmision()));
			}
			if (comprobante.getFechaVencimiento() != null) {
				invoice.setDueDate(UtilUBL.generarDueDate(comprobante.getFechaVencimiento()));
			}
			if (comprobante.getTipoComprobante() != null) {
				invoice.setInvoiceTypeCode(UtilUBL.generarInvoiceTypeCode(comprobante.getTipoComprobante()));
			}

			invoice = generarNoteInvoice(invoice, comprobante);
			if (comprobante.getMonedaComprobante() != null
					&& StringUtils.isNotBlank(comprobante.getMonedaComprobante().getValor())) {
				invoice.setDocumentCurrencyCode(
						UtilUBL.generarDocumentCurrencyCode(comprobante.getMonedaComprobante()));
			}

			if (comprobante.getDetalleComprobante() != null && !comprobante.getDetalleComprobante().isEmpty()) {
				invoice.setLineCountNumeric(UtilUBL.generarLineCount(comprobante.getDetalleComprobante().size()));
			}

			invoice = generarPeriodos(invoice, comprobante);
			if (StringUtils.isNotBlank(comprobante.getNumeroOrdenCompra())) {
				invoice.setOrderReference(UtilUBL.generarOrderReference(comprobante.getNumeroOrdenCompra()));
			}

			invoice = generarDocumentoReferencia(invoice, comprobante);
			invoice = generarDocumentReference(invoice, comprobante);
			invoice = generarAdicionalDocumento(invoice, comprobante);
			invoice.setAccountingSupplierParty(generarSupplierParty(comprobante));
			invoice.setAccountingCustomerParty(generarCustomerParty(comprobante));
			invoice = generarDelivery(invoice, comprobante);
			invoice.setDeliveryTerms(generarDeliveryTerms(comprobante));
			invoice = generarPaymentMeans(invoice, comprobante);
			invoice = generarPaymentTerms(invoice, comprobante);
			invoice = generarPrepaidPayment(invoice, comprobante);
			invoice = generarAllowanceCharge(invoice, comprobante);
			invoice = generarTaxtotal(invoice, comprobante);
			invoice.setLegalMonetaryTotal(generarMonetaryTotal(comprobante));
			invoice = generarInvoiceLine(invoice, comprobante);

			JAXBContext context = JAXBContext.newInstance(InvoiceType.class);
			JAXBElement<InvoiceType> element = factory.createInvoice(invoice);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			marshaller.marshal(element, baos);

			return baos.toByteArray();
		} catch (PropertyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private InvoiceType generarNoteInvoice(InvoiceType invoice, ComprobanteDTO comprobante) {
		NoteType nota = null;
		for (BaseVODTO baseVO : comprobante.getListaNotas()) {
			if (baseVO != null && StringUtils.isNotBlank(baseVO.getValor())) {
				nota = new NoteType();
				nota.setLanguageID(baseVO.getCodigo());
				nota.setValue(baseVO.getValor());
				invoice.getNote().add(nota);
			}
		}
		return invoice;
	}

	private InvoiceType generarPeriodos(InvoiceType invoice, ComprobanteDTO comprobante)
			throws DatatypeConfigurationException {
		PeriodType periodoTipo = null;
		for (PeriodoDTO periodo : comprobante.getPeriodoFacturacion()) {
			if (periodo.getFechaInicioFacturacion() != null && periodo.getFechaFinFacturacion() != null) {
				periodoTipo = new PeriodType();
				periodoTipo.setStartDate(UtilUBL.generarStartDate(periodo.getFechaInicioFacturacion()));
				periodoTipo.setEndDate(UtilUBL.generarEndDate(periodo.getFechaFinFacturacion()));
				invoice.getInvoicePeriod().add(periodoTipo);
			}
		}
		return invoice;
	}

	private InvoiceType generarDocumentoReferencia(InvoiceType invoice, ComprobanteDTO comprobante) {
		DocumentReferenceType documentReference = null;
		for (ComprobanteRelacionadoDTO compro : comprobante.getListaGuiaRelacionada()) {
			if (StringUtils.isNotBlank(compro.getNumeroComprobante()) && compro.getTipoComprobante() != null
					&& StringUtils.isNotBlank(compro.getTipoComprobante().getValor())) {
				documentReference = new DocumentReferenceType();
				documentReference.setID(UtilUBL.generarIdType(compro.getNumeroComprobante()));
				documentReference.setDocumentTypeCode(UtilUBL.generarDocumentTypeCode(compro.getTipoComprobante()));
				invoice.getDespatchDocumentReference().add(documentReference);
			}
		}
		return invoice;
	}

	private InvoiceType generarDocumentReference(InvoiceType invoice, ComprobanteDTO comprobante) {
		if (StringUtils.isBlank(comprobante.getServicioReferenciaDTO().getNumeroSuministro())
				&& StringUtils.isNotBlank(comprobante.getServicioReferenciaDTO().getTipoServicio().getValor())
				&& comprobante.getServicioReferenciaDTO().getCodigoServicio() == null
				&& comprobante.getServicioReferenciaDTO().getCodigoTipoTarifa() == null) {
			return null;
		}
		boolean existeDato = false;

		DocumentReferenceType contratoReference = new DocumentReferenceType();
		if (StringUtils.isNotBlank(comprobante.getServicioReferenciaDTO().getNumeroSuministro())) {
			contratoReference
					.setID(UtilUBL.generarIdType(comprobante.getServicioReferenciaDTO().getNumeroSuministro()));
			existeDato = true;
		}
		if (StringUtils.isNotBlank(comprobante.getServicioReferenciaDTO().getTipoServicio().getValor())) {
			contratoReference.setDocumentTypeCode(
					UtilUBL.generarDocumentTypeCode(comprobante.getServicioReferenciaDTO().getTipoServicio()));
			existeDato = true;
		}
		if (comprobante.getServicioReferenciaDTO().getCodigoServicio() == null) {
			contratoReference.setLocaleCode(
					UtilUBL.generarLocaleCode(comprobante.getServicioReferenciaDTO().getCodigoServicio()));
			existeDato = true;
		}
		if (comprobante.getServicioReferenciaDTO().getCodigoTipoTarifa() == null) {
			contratoReference.setDocumentStatusCode(
					UtilUBL.generarDocumentStatusCode(comprobante.getServicioReferenciaDTO().getCodigoTipoTarifa()));
			existeDato = true;
		}
		if (existeDato) {
			invoice.getContractDocumentReference().add(contratoReference);
		}

		return invoice;
	}

	private InvoiceType generarAdicionalDocumento(InvoiceType invoice, ComprobanteDTO comprobante) {
		DocumentReferenceType addDocumentReference = null;
		DocumentTypeCodeType codigoTipoDocumento = null;
		boolean agregar = false;
		for (ComprobanteRelacionadoDTO relacionado : comprobante.getListaComprobanteRelacionado()) {
			addDocumentReference = new DocumentReferenceType();
			agregar = false;
			if (StringUtils.isNotBlank(relacionado.getNumeroComprobante()) && relacionado.getTipoComprobante() != null
					&& StringUtils.isNotBlank(relacionado.getTipoComprobante().getValor())) {
				addDocumentReference.setID(UtilUBL.generarIdType(relacionado.getNumeroComprobante()));
				codigoTipoDocumento = new DocumentTypeCodeType();
				codigoTipoDocumento.setValue(relacionado.getTipoComprobante().getValor());
				addDocumentReference
						.setDocumentTypeCode(UtilUBL.generarDocumentTypeCode(relacionado.getTipoComprobante()));
				agregar = true;
			}

			if (agregar) {
				invoice.getAdditionalDocumentReference().add(addDocumentReference);
			}
		}

		return invoice;
	}

	private InvoiceType generarDelivery(InvoiceType invoice, ComprobanteDTO comprobante)
			throws DatatypeConfigurationException {
		DeliveryType delivery = null;
		LocationType deliveryLocation = null;
		ShipmentType shipment = new ShipmentType();
		ShipmentStageType shipmentStage = null;
		TransportMeansType transportMeans = null;
		PersonType conductor = null;
		PartyType carrierParty = null;
		PartyLegalEntityType carrierLegalEntity = null;
		boolean valorDato = false;
		boolean datoBien = false;
		for (EntregaDTO entrega : comprobante.getListaEntregas()) {
			for (TransporteDTO transporte : entrega.getListaTransporte()) {
				shipmentStage = new ShipmentStageType();
				if (transporte.getModalidadTraslado() != null) {
					shipmentStage.setTransportModeCode(UtilUBL.generarTransportMode(transporte.getModalidadTraslado()));
					datoBien = true;
				}
				if (transporte.getFechaInicioTraslado() != null) {
					shipmentStage.setTransitPeriod(UtilUBL.generarPeriod(transporte.getFechaInicioTraslado()));
					datoBien = true;
				}
				boolean datoTransportista = false;
				if (!transporte.getListaTransportista().isEmpty()) {
					carrierParty = new PartyType();
					for (TransportistaDTO transportista : transporte.getListaTransportista()) {
						carrierLegalEntity = new PartyLegalEntityType();
						valorDato = false;
						if (transportista.getDocumentoIdentidad().getNumeroDocumento() != null && StringUtils
								.isNotBlank(transportista.getDocumentoIdentidad().getNumeroDocumento().getValor())) {
							carrierLegalEntity.setCompanyID(UtilUBL
									.generarCompanyId(transportista.getDocumentoIdentidad().getNumeroDocumento()));
							valorDato = true;
						}
						if (StringUtils.isNotBlank(transportista.getNombrePersona())) {
							carrierLegalEntity.setRegistrationName(
									UtilUBL.generarRegistrationName(transportista.getNombrePersona()));
							valorDato = true;
						}

						if (valorDato) {
							carrierParty.getPartyLegalEntity().add(carrierLegalEntity);
						}
					}
					if (!carrierParty.getPartyLegalEntity().isEmpty()) {
						shipmentStage.getCarrierParty().add(carrierParty);
						datoTransportista = true;
					}
				}
				boolean datoTransporte = false;
				transportMeans = new TransportMeansType();
				if (StringUtils.isNotBlank(transporte.getNumeroPlaca())) {
					transportMeans.setRoadTransport(UtilUBL.generarRoadTransport(transporte.getNumeroPlaca()));
					datoTransporte = true;
				}
				if (StringUtils.isNotBlank(transporte.getNumeroRegistroMTC())) {
					transportMeans.setRegistrationNationalityID(
							UtilUBL.generarRegistrationNationality(transporte.getNumeroRegistroMTC()));
					datoTransporte = true;
				}
				if (datoTransporte) {
					shipmentStage.setTransportMeans(transportMeans);
				}

				for (PersonaDTO personaConduce : transporte.getListaConductores()) {
					if (personaConduce.getDocumentoIdentidad().getNumeroDocumento() != null && StringUtils
							.isNotBlank(personaConduce.getDocumentoIdentidad().getNumeroDocumento().getValor())) {
						conductor = new PersonType();
						conductor.setID(UtilUBL.generarId(personaConduce.getDocumentoIdentidad().getNumeroDocumento()));
						shipmentStage.getDriverPerson().add(conductor);
					}
				}
				if (datoTransporte || datoTransportista || datoBien) {
					shipment.getShipmentStage().add(shipmentStage);
				}
			}

			int canti = entrega.getListaDireccionLlegada().size();
			DeliveryType deliveryShipment = new DeliveryType();
			AddressType deliveryAdress = null;
			if (canti > 0) {
				deliveryAdress = new AddressType();
				deliveryAdress.setCountrySubentityCode(UtilUBL
						.generarCountrySubentityCode(entrega.getListaDireccionLlegada().get(0).getCodigoUbigeo()));
				for (DireccionDTO direccion : entrega.getListaDireccionLlegada()) {
					deliveryAdress.getAddressLine().add(UtilUBL.generarAddressLine(direccion.getDireccionCompleta()));
				}
			}
			deliveryShipment.setDeliveryAddress(deliveryAdress);
			canti = comprobante.getListaEntregas().size();
			if (canti > 0) {
				deliveryShipment.setDeliveryParty(
						UtilUBL.generarParty(comprobante.getListaEntregas().get(0).isFlagSubcontratacion()));
			}
			shipment.setDelivery(deliveryShipment);

			canti = comprobante.getListaTransportes().size();
			if (canti > 0) {
				if (StringUtils.isNotBlank(comprobante.getListaTransportes().get(0).getNumeroPlaca())) {
					TransportHandlingUnitType transportHandling = new TransportHandlingUnitType();
					transportHandling.getTransportEquipment().add(UtilUBL
							.generarTransportEquipment(comprobante.getListaTransportes().get(0).getNumeroPlaca()));
					shipment.getTransportHandlingUnit().add(transportHandling);
				}
			}

			canti = comprobante.getListaDireccionPartida().size();
			if (canti > 0) {
				AddressType originAddress = new AddressType();
				originAddress.setCountrySubentityCode(UtilUBL
						.generarCountrySubentityCode(comprobante.getListaDireccionPartida().get(0).getCodigoUbigeo()));
				for (DireccionDTO direccion : comprobante.getListaDireccionPartida()) {
					originAddress.getAddressLine().add(UtilUBL.generarAddressLine(direccion.getDireccionCompleta()));
				}
				shipment.setOriginAddress(originAddress);
			}

			delivery = new DeliveryType();
			if (entrega.getNumeroMedidor() != null && StringUtils.isNotBlank(entrega.getNumeroMedidor().getValor())) {
				delivery.setID(UtilUBL.generarId(entrega.getNumeroMedidor()));
			}
			if (entrega.getCantidad() != null && StringUtils.isNotBlank(entrega.getCantidad().getValor())) {
				delivery.setQuantity(UtilUBL.generarCantidad(entrega.getCantidad()));
			}
			if (entrega.getPotenciaContratada() != null
					&& StringUtils.isNotBlank(entrega.getPotenciaContratada().getValor())) {
				delivery.setMaximumQuantity(UtilUBL.generarMaximunQuantity(entrega.getPotenciaContratada()));
			}

			LocationCoordinateType locacion = null;
			deliveryLocation = new LocationType();
			for (UbicacionMedidorDTO ubicacion : entrega.getListaUbicacionesMedidor()) {
				locacion = new LocationCoordinateType();
				boolean dato = false;
				if (StringUtils.isNotBlank(ubicacion.getLatitud())) {
					locacion.setLatitudeDirectionCode(UtilUBL.generarLatitudeDirection(ubicacion.getLatitud()));
					dato = true;
				}
				if (StringUtils.isNotBlank(ubicacion.getLongitud())) {
					locacion.setLongitudeDirectionCode(UtilUBL.generarLongitudDirection(ubicacion.getLongitud()));
					dato = true;
				}
				if (dato) {
					deliveryLocation.getLocationCoordinate().add(locacion);
				}
			}
			delivery.setDeliveryLocation(deliveryLocation);

			PartyType deliveryParty = new PartyType();
			PartyLegalEntityType partyLegalEntity = null;
			for (PersonaDTO destinatario : entrega.getListaDestinatarios()) {
				partyLegalEntity = new PartyLegalEntityType();
				partyLegalEntity.setCompanyID(
						UtilUBL.generarCompanyId(destinatario.getDocumentoIdentidad().getNumeroDocumento()));
				partyLegalEntity.setRegistrationName(UtilUBL.generarRegistrationName(destinatario.getNombrePersona()));
				deliveryParty.getPartyLegalEntity().add(partyLegalEntity);
			}
			delivery.setDeliveryParty(deliveryParty);

			boolean dato = false;
			if (entrega.getMotivoTraslado() != null && StringUtils.isNotBlank(entrega.getMotivoTraslado().getValor())) {
				shipment.setHandlingCode(UtilUBL.generarHandlingCode(entrega.getMotivoTraslado()));
				dato = true;
			}
			if (entrega.getPesoBruto() != null && entrega.getPesoBruto().getValor() != null) {
				shipment.setGrossWeightMeasure(UtilUBL.generarWeightMeasure(entrega.getPesoBruto()));
				dato = true;
			}
			if (dato) {
				delivery.setShipment(shipment);
			}
			invoice.getDelivery().add(delivery);
		}

		return invoice;
	}

	private DeliveryTermsType generarDeliveryTerms(ComprobanteDTO comprobante) {
		int canti = comprobante.getListaDireccionLlegada().size();
		AddressType addressLocation = null;
		LocationType deliveryLocationTerms = new LocationType();
		boolean dato = false;
		if (canti > 0) {
			DireccionDTO direccionLlegada = comprobante.getListaDireccionLlegada().get(0);
			CountryType country = null;
			addressLocation = new AddressType();
			if (direccionLlegada.getUbigeo().getCodigoPais() != null
					&& StringUtils.isNotBlank(direccionLlegada.getUbigeo().getCodigoPais().getValor())) {
				country = new CountryType();
				country.setIdentificationCode(
						UtilUBL.generarIdentificationCode(direccionLlegada.getUbigeo().getCodigoPais()));
				addressLocation.setCountry(country);
				dato = true;
			}
			if (StringUtils.isNotBlank(direccionLlegada.getDireccionCompleta())) {
				addressLocation.setStreetName(UtilUBL.generarStreetName(direccionLlegada.getDireccionCompleta()));
				dato = true;
			}
			if (StringUtils.isNotBlank(direccionLlegada.getUrbanizacion())) {
				addressLocation
						.setCitySubdivisionName(UtilUBL.generarCitySubdivision(direccionLlegada.getUrbanizacion()));
				dato = true;
			}
			if (StringUtils.isNotBlank(direccionLlegada.getUbigeo().getNombreProvincia())) {
				addressLocation.setCityName(UtilUBL.generarCityName(direccionLlegada.getUbigeo().getNombreProvincia()));
				dato = true;
			}
			if (StringUtils.isNotBlank(direccionLlegada.getUbigeo().getNombreDepartamento())) {
				addressLocation.setCountrySubentity(
						UtilUBL.generarCountrySubentity(direccionLlegada.getUbigeo().getNombreDepartamento()));
				dato = true;
			}
			if (StringUtils.isNotBlank(direccionLlegada.getUbigeo().getCodigoUbigeoInei())) {
				addressLocation.setCountrySubentityCode(
						UtilUBL.generarCountrySubentityCode(direccionLlegada.getUbigeo().getCodigoUbigeoInei()));
				dato = true;
			}
			if (StringUtils.isNotBlank(direccionLlegada.getUbigeo().getNombreDistrito())) {
				addressLocation.setDistrict(UtilUBL.generarDistrict(direccionLlegada.getUbigeo().getNombreDistrito()));
				dato = true;
			}
			if (dato) {
				deliveryLocationTerms.setAddress(addressLocation);
			}
		}
		boolean datoAmountDelivery = false;
		AmountType amountDelivery = new AmountType();
		if (comprobante.getTotalComprobante().getMonto() != null) {
			amountDelivery.setValue(comprobante.getTotalComprobante().getMonto());
			datoAmountDelivery = true;
		}
		if (StringUtils.isNotBlank(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional())) {
			amountDelivery.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
			datoAmountDelivery = true;
		}
		if (!datoAmountDelivery) {
			amountDelivery = null;
		}

		boolean datoDeliveryTerms = false;
		DeliveryTermsType deliveryTerms = new DeliveryTermsType();
		if (StringUtils.isNotBlank(comprobante.getNumeroRegistroMTC())) {
			deliveryTerms.setID(UtilUBL.generarIdType(comprobante.getNumeroRegistroMTC()));
			datoDeliveryTerms = true;
		}
		if (datoAmountDelivery) {
			deliveryTerms.setAmount(amountDelivery);
			datoDeliveryTerms = true;
		}
		if (dato) {
			deliveryTerms.setDeliveryLocation(deliveryLocationTerms);
			datoDeliveryTerms = true;
		}
		if (!datoDeliveryTerms) {
			deliveryTerms = null;
		}

		return deliveryTerms;
	}

	private InvoiceType generarPaymentMeans(InvoiceType invoice, ComprobanteDTO comprobante) {
		FinancialAccountType payeeFinancialAccount = null;
		PaymentMeansType paymentMeans = null;
		for (String numeroCuenta : comprobante.getListaNumeroCuentaDetraccion()) {
			if (StringUtils.isNotBlank(numeroCuenta)) {
				payeeFinancialAccount = new FinancialAccountType();
				payeeFinancialAccount.setID(UtilUBL.generarIdType(numeroCuenta));

				paymentMeans = new PaymentMeansType();
				paymentMeans.setPayeeFinancialAccount(payeeFinancialAccount);

				invoice.getPaymentMeans().add(paymentMeans);
			}
		}

		return invoice;
	}

	private InvoiceType generarPaymentTerms(InvoiceType invoice, ComprobanteDTO comprobante) {
		PaymentTermsType paymentTerms = null;
		PaymentPercentType porcentajeDetraccion = null;
		AmountType montoDetraccion = null;
		BigDecimal montoDetra = BigDecimal.ZERO;
		for (DetalleComprobanteDTO detalleComprobante : comprobante.getDetalleComprobante()) {
			if (detalleComprobante.getProducto().isAplicaDetraccion()) {
				if (detalleComprobante.getProducto().getPorcentajeDetraccion() != null) {
					porcentajeDetraccion = new PaymentPercentType();
					porcentajeDetraccion.setValue(detalleComprobante.getProducto().getPorcentajeDetraccion());
				}

				if (StringUtils.isNotBlank(detalleComprobante.getCantidad().getValor())) {
					montoDetra = UtilEjb.convertirABigDecimal(detalleComprobante.getCantidad().getValor());
					if (detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto() != null) {
						montoDetra = montoDetra
								.multiply(detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto());
						if (detalleComprobante.getProducto().getPorcentajeDetraccion() != null) {
							montoDetraccion = new AmountType();
							montoDetra = montoDetra
									.multiply(detalleComprobante.getProducto().getPorcentajeDetraccion());
							montoDetraccion.setValue(montoDetra);
						}
					}
				}
				boolean dato = false;
				paymentTerms = new PaymentTermsType();
				if (detalleComprobante.getProducto().getCodigoProducto() != null
						&& StringUtils.isNotBlank(detalleComprobante.getProducto().getCodigoProducto().getValor())
						&& detalleComprobante.getProducto().isAplicaDetraccion()) {
					paymentTerms.setID(UtilUBL.generarId(detalleComprobante.getProducto().getCodigoProducto()));
					dato = true;
				}
				if (porcentajeDetraccion != null) {
					paymentTerms.setPaymentPercent(porcentajeDetraccion);
					dato = true;
				}
				if (montoDetraccion != null) {
					paymentTerms.setAmount(montoDetraccion);
					dato = true;
				}
				if (dato) {
					invoice.getPaymentTerms().add(paymentTerms);
				}
			}
		}

		return invoice;
	}

	private InvoiceType generarPrepaidPayment(InvoiceType invoice, ComprobanteDTO comprobante) {
		PaidAmountType paidAmount = null;
		PaymentType paymentType = null;
		for (ComprobanteAnticipoDTO comproAnticipo : comprobante.getListaComprobantesAnticipo()) {
			if (comproAnticipo.getMontoComprobante().getMonto() != null) {
				paidAmount = new PaidAmountType();
				paidAmount.setValue(comproAnticipo.getMontoComprobante().getMonto());
				paidAmount.setCurrencyID(comproAnticipo.getMontoComprobante().getMoneda().getCodigoInternacional());
			}
			boolean dato = false;
			paymentType = new PaymentType();
			if (comproAnticipo.getNumeroComprobanteAnticipo() != null
					&& StringUtils.isNotBlank(comproAnticipo.getNumeroComprobanteAnticipo().getValor())) {
				paymentType.setID(UtilUBL.generarId(comproAnticipo.getNumeroComprobanteAnticipo()));
				dato = true;
			}
			if (paidAmount != null) {
				paymentType.setPaidAmount(paidAmount);
				dato = true;
			}
			if (comproAnticipo.getDocumentoIdentidadEmisor() != null
					&& StringUtils.isNotBlank(comproAnticipo.getDocumentoIdentidadEmisor().getValor())) {
				paymentType
						.setInstructionID(UtilUBL.generarInstructionId(comproAnticipo.getDocumentoIdentidadEmisor()));
				dato = true;
			}
			if (dato) {
				invoice.getPrepaidPayment().add(paymentType);
			}
		}
		return invoice;
	}

	private InvoiceType generarAllowanceCharge(InvoiceType invoice, ComprobanteDTO comprobante) {
		AmountType montoCargoDescuento = null;
		BaseAmountType baseAmount = null;
		AllowanceChargeType allowanceCharge = null;
		for (DescuentoDTO descuento : comprobante.getListaDescuentos()) {
			if (descuento.getMontoCargoDescuento() != null && descuento.getMontoCargoDescuento().getMonto() != null) {
				montoCargoDescuento = new AmountType();
				montoCargoDescuento.setValue(descuento.getMontoCargoDescuento().getMonto());
				montoCargoDescuento
						.setCurrencyID(descuento.getMontoCargoDescuento().getMoneda().getCodigoInternacional());
			}
			if (descuento.getMontoBaseCargoDescuento() != null
					&& descuento.getMontoBaseCargoDescuento().getMonto() != null) {
				baseAmount = new BaseAmountType();
				baseAmount.setValue(descuento.getMontoBaseCargoDescuento().getMonto());
				baseAmount.setCurrencyID(descuento.getMontoBaseCargoDescuento().getMoneda().getCodigoInternacional());
			}

			allowanceCharge = new AllowanceChargeType();
			allowanceCharge.setChargeIndicator(UtilUBL.generarChargeIndicator(descuento.isFlagCargoDescuento()));
			if (StringUtils.isNotBlank(descuento.getCodigoMotivoCargoDescuento())) {
				allowanceCharge.setAllowanceChargeReasonCode(
						UtilUBL.generarAllowanceChargeReasonCode(descuento.getCodigoMotivoCargoDescuento()));
			}
			if (descuento.getFactorCargoDescuento() != null) {
				allowanceCharge.setMultiplierFactorNumeric(
						UtilUBL.generarMultiplierFactorNumeric(descuento.getFactorCargoDescuento()));
			}
			if (montoCargoDescuento != null) {
				allowanceCharge.setAmount(montoCargoDescuento);
			}
			if (baseAmount != null) {
				allowanceCharge.setBaseAmount(baseAmount);
			}

			invoice.getAllowanceCharge().add(allowanceCharge);
		}
		return invoice;
	}

	private InvoiceType generarTaxtotal(InvoiceType invoice, ComprobanteDTO comprobante) {
		TaxAmountType taxAmount = null;
		TaxTotalType taxTotal = null;
		boolean datoTax = false;
		
		if (comprobante.getMontoTotalImpuestos() != null && comprobante.getMontoTotalImpuestos().getMonto() != null) {
			taxAmount = new TaxAmountType();
			taxAmount.setValue(comprobante.getMontoTotalImpuestos().getMonto());
			taxAmount.setCurrencyID(comprobante.getMontoTotalImpuestos().getMoneda().getCodigoInternacional());

			taxTotal = new TaxTotalType();
			taxTotal.setTaxAmount(taxAmount);
			datoTax = true;
		}

		TaxableAmountType taxableAmount = null;
		TaxAmountType taxAmountSubtotal = null;
		TaxSchemeType taxScheme = null;
		TaxCategoryType taxCategory = null;
		TaxSubtotalType taxSubtotal = null;
		for (MontoOperacionDTO montoOperacion : comprobante.getListaMontoOperaciones()) {
			if (montoOperacion.getMontoOperacion() != null && montoOperacion.getMontoOperacion().getMonto() != null) {
				taxableAmount = new TaxableAmountType();
				taxableAmount.setValue(montoOperacion.getMontoOperacion().getMonto());
				taxableAmount.setCurrencyID(montoOperacion.getMontoOperacion().getMoneda().getCodigoInternacional());
			}
			if (comprobante.getMontoTotalImpuestos() != null
					&& comprobante.getMontoTotalImpuestos().getMonto() != null) {
				taxAmountSubtotal = new TaxAmountType();
				taxAmountSubtotal.setValue(comprobante.getMontoTotalImpuestos().getMonto());
				taxAmountSubtotal
						.setCurrencyID(comprobante.getMontoTotalImpuestos().getMoneda().getCodigoInternacional());
			}

			if (montoOperacion.getCodigoTributo() != null
					&& StringUtils.isNotBlank(comprobante.getCodigoTributo().getValor())
					&& StringUtils.isNotBlank(comprobante.getCodigoTributo().getCodigo())) {
				taxScheme = new TaxSchemeType();
				taxScheme.setID(UtilUBL.generarId(montoOperacion.getCodigoTributo()));
				taxScheme.setName(UtilUBL.generarName(comprobante.getCodigoTributo().getValor()));
				taxScheme.setTaxTypeCode(UtilUBL.generarTaxTypeCode(comprobante.getCodigoTributo().getCodigo()));

				if (comprobante.getCodigoCategoriaImpuesto() != null
						&& StringUtils.isNotBlank(comprobante.getCodigoCategoriaImpuesto().getCodigo())) {
					taxCategory = new TaxCategoryType();
					taxCategory.setID(UtilUBL.generarIdType(comprobante.getCodigoCategoriaImpuesto().getCodigo()));
					taxCategory.setTaxScheme(taxScheme);
				}
			}

			boolean dato = false;
			taxSubtotal = new TaxSubtotalType();
			if (taxableAmount != null) {
				taxSubtotal.setTaxableAmount(taxableAmount);
				dato = true;
			}
			if (taxAmountSubtotal != null) {
				taxSubtotal.setTaxAmount(taxAmountSubtotal);
				dato = true;
			} 
			if (taxCategory != null) {
				taxSubtotal.setTaxCategory(taxCategory);
				dato = true;
			}
			
			if (dato){
				taxTotal.getTaxSubtotal().add(taxSubtotal);
			}

			if (dato || datoTax) {
				invoice.getTaxTotal().add(taxTotal);
			}
		}
		return invoice;
	}

	private MonetaryTotalType generarMonetaryTotal(ComprobanteDTO comprobante) {
		ChargeTotalAmountType chargeTotalAmount = null;
		if (comprobante.getSumaOtrosCargos() != null && comprobante.getSumaOtrosCargos().getMonto() != null) {
			chargeTotalAmount = new ChargeTotalAmountType();
			chargeTotalAmount.setValue(comprobante.getSumaOtrosCargos().getMonto());
			chargeTotalAmount.setCurrencyID(comprobante.getSumaOtrosCargos().getMoneda().getCodigoInternacional());
		}

		PayableAmountType payableAmount = null;
		if (comprobante.getTotalComprobante() != null && comprobante.getTotalComprobante().getMonto() != null) {
			payableAmount = new PayableAmountType();
			payableAmount.setValue(comprobante.getTotalComprobante().getMonto());
			payableAmount.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
		}

		LineExtensionAmountType lineExtensionAmount = null;
		if (comprobante.getMontoTotalValorVenta() != null && comprobante.getMontoTotalValorVenta().getMonto() != null) {
			lineExtensionAmount = new LineExtensionAmountType();
			lineExtensionAmount.setValue(comprobante.getMontoTotalValorVenta().getMonto());
			lineExtensionAmount
					.setCurrencyID(comprobante.getMontoTotalValorVenta().getMoneda().getCodigoInternacional());
		}

		TaxInclusiveAmountType taxInclusiveAmount = null;
		if (comprobante.getTotalComprobante() != null && comprobante.getTotalComprobante().getMonto() != null) {
			taxInclusiveAmount = new TaxInclusiveAmountType();
			taxInclusiveAmount.setValue(comprobante.getTotalComprobante().getMonto());
			taxInclusiveAmount.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
		}

		AllowanceTotalAmountType allowanceTotalAmount = null;
		if (comprobante.getTotalDescuentos() != null && comprobante.getTotalDescuentos().getMonto() != null
				&& comprobante.getTotalDescuentos().getMonto().getMonto() != null) {
			allowanceTotalAmount = new AllowanceTotalAmountType();
			allowanceTotalAmount.setValue(comprobante.getTotalDescuentos().getMonto().getMonto());
			allowanceTotalAmount
					.setCurrencyID(comprobante.getTotalDescuentos().getMonto().getMoneda().getCodigoInternacional());
		}

		int canti = comprobante.getListaComprobantesAnticipo().size();
		PrepaidAmountType prepaidAmount = null;
		if (canti > 0) {
			ComprobanteAnticipoDTO comprobanteAnticipo = comprobante.getListaComprobantesAnticipo().get(0);
			prepaidAmount = new PrepaidAmountType();
			prepaidAmount.setValue(comprobanteAnticipo.getMontoComprobante().getMonto());
			prepaidAmount.setCurrencyID(comprobanteAnticipo.getMontoComprobante().getMoneda().getCodigoInternacional());
		}
		boolean dato = false;
		MonetaryTotalType monetaryTotal = new MonetaryTotalType();
		if (lineExtensionAmount != null) {
			monetaryTotal.setLineExtensionAmount(lineExtensionAmount);
			dato = true;
		}
		if (taxInclusiveAmount != null) {
			monetaryTotal.setTaxInclusiveAmount(taxInclusiveAmount);
			dato = true;
		}
		if (allowanceTotalAmount != null) {
			monetaryTotal.setAllowanceTotalAmount(allowanceTotalAmount);
			dato = true;
		}
		if (chargeTotalAmount != null) {
			monetaryTotal.setChargeTotalAmount(chargeTotalAmount);
			dato = true;
		}
		if (prepaidAmount != null) {
			monetaryTotal.setPrepaidAmount(prepaidAmount);
			dato = true;
		}
		if (payableAmount != null) {
			monetaryTotal.setPayableAmount(payableAmount);
			dato = true;
		}

		return dato ? monetaryTotal : null;
	}

	private CustomerPartyType generarCustomerParty(ComprobanteDTO comprobante) {
		PartyTaxSchemeType partyTaxSchemaAdquiriente = null;
		AddressTypeCodeType codigoTipoDireccionAdquiriente = null;
		AddressType direccionAdquiriente = null;
		PartyType partyAdquiriente = null;
		CustomerPartyType adquiriente = null;
		for (PersonaDTO persona : comprobante.getListaAdquiriente()) {
			codigoTipoDireccionAdquiriente = new AddressTypeCodeType();
			codigoTipoDireccionAdquiriente
					.setValue(UtilUBL.parsearDatoSiNull(persona.getDireccion().getCodigo(), "0000"));

			direccionAdquiriente = new AddressType();
			direccionAdquiriente.setAddressTypeCode(codigoTipoDireccionAdquiriente);

			partyTaxSchemaAdquiriente = new PartyTaxSchemeType();
			if (StringUtils.isNotBlank(persona.getNombrePersona())) {
				partyTaxSchemaAdquiriente
						.setRegistrationName(UtilUBL.generarRegistrationName(persona.getNombrePersona()));
			}
			partyTaxSchemaAdquiriente.setRegistrationAddress(direccionAdquiriente);
			if (persona.getDocumentoIdentidad().getNumeroDocumento() != null
					&& StringUtils.isNotBlank(persona.getDocumentoIdentidad().getNumeroDocumento().getValor())) {
				partyTaxSchemaAdquiriente
						.setCompanyID(UtilUBL.generarCompanyId(persona.getDocumentoIdentidad().getNumeroDocumento()));
			}
			partyAdquiriente = new PartyType();
			partyAdquiriente.getPartyTaxScheme().add(partyTaxSchemaAdquiriente);
		}
		if (partyAdquiriente != null) {
			adquiriente = new CustomerPartyType();
			adquiriente.setParty(partyAdquiriente);
		}

		return adquiriente;
	}

	private SupplierPartyType generarSupplierParty(ComprobanteDTO comprobante) {
		AddressTypeCodeType codigoTipoDireccion = new AddressTypeCodeType();
		AddressType direccionEmisor = null;
		PartyType partyEmisor = null;
		if (comprobante.getListaEmisores() != null && !comprobante.getListaEmisores().isEmpty()) {
			partyEmisor = new PartyType();
			for (PersonaDTO emisor : comprobante.getListaEmisores()) {
				if (StringUtils.isNotBlank(emisor.getNombreComercial())) {
					partyEmisor.getPartyName().add(UtilUBL.generarPartyName(emisor.getNombreComercial()));
				}
			}
		}

		PartyTaxSchemeType partyTaxSchemaEmisor = null;
		for (PersonaDTO emisor : comprobante.getListaEmisores()) {
			if (emisor.getDireccion() != null && StringUtils.isNotBlank(emisor.getDireccion().getCodigo())) {
				direccionEmisor = new AddressType();
				codigoTipoDireccion.setValue(UtilUBL.parsearDatoSiNull(emisor.getDireccion().getCodigo(), "0000"));
				direccionEmisor.setAddressTypeCode(codigoTipoDireccion);
			}
			boolean dato = false;
			partyTaxSchemaEmisor = new PartyTaxSchemeType();
			if (StringUtils.isNotBlank(emisor.getNombrePersona())) {
				partyTaxSchemaEmisor.setRegistrationName(UtilUBL.generarRegistrationName(emisor.getNombrePersona()));
				dato = true;
			}
			if (emisor.getDocumentoIdentidad() != null && emisor.getDocumentoIdentidad().getNumeroDocumento() != null) {
				partyTaxSchemaEmisor
						.setCompanyID(UtilUBL.generarCompanyId(emisor.getDocumentoIdentidad().getNumeroDocumento()));
				dato = true;
			}
			if (direccionEmisor != null) {
				partyTaxSchemaEmisor.setRegistrationAddress(direccionEmisor);
				dato = true;
			}
			if (dato) {
				partyEmisor.getPartyTaxScheme().add(partyTaxSchemaEmisor);
			}
		}
		if (partyEmisor != null) {
			SupplierPartyType emisor = new SupplierPartyType();
			emisor.setParty(partyEmisor);
			return emisor;
		}
		return null;
	}

	private InvoiceType generarInvoiceLine(InvoiceType invoice, ComprobanteDTO comprobante)
			throws DatatypeConfigurationException, ParseException {
		InvoiceLineType invoiceLine = null;
		PricingReferenceType pricingReference = null;
		PartyIdentificationType partyIdentificacion = null;
		CountryType pais = null;
		AllowanceChargeType allowanceChargeDetalle = null;
		AmountType montoCargoDescuentoDetalle = null;
		BaseAmountType baseMontoCargoDescuento = null;
		DetalleComprobanteDTO detalleComprobante = null;
		for (int i = 0; i < comprobante.getDetalleComprobante().size(); i++) {
			detalleComprobante = comprobante.getDetalleComprobante().get(i);

			LineExtensionAmountType lineExtensionAmountDetalle = null;
			BigDecimal totalCalculo = null;
			if (detalleComprobante.getPrecioVentaUnitario() != null
					&& detalleComprobante.getPrecioVentaUnitario().getMonto() != null
					&& detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto() != null
					&& detalleComprobante.getCantidad() != null
					&& StringUtils.isNotBlank(detalleComprobante.getCantidad().getValor())) {
				totalCalculo = detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto()
						.multiply(UtilEjb.convertirABigDecimal(detalleComprobante.getCantidad().getValor()));

				lineExtensionAmountDetalle = new LineExtensionAmountType();
				lineExtensionAmountDetalle.setValue(totalCalculo);

				lineExtensionAmountDetalle.setCurrencyID(
						detalleComprobante.getPrecioVentaUnitario().getMonto().getMoneda().getCodigoInternacional());
			}

			PriceType priceType = null;
			PriceAmountType priceAmountDetalle = null;
			if (detalleComprobante.getListaPrecios() != null && !detalleComprobante.getListaPrecios().isEmpty()) {
				for (PrecioDetalleDTO precio : detalleComprobante.getListaPrecios()) {
					if (precio.getPrecio() != null && precio.getPrecio().getMonto() != null) {
						priceAmountDetalle = new PriceAmountType();
						priceAmountDetalle.setValue(precio.getPrecio().getMonto());
						priceAmountDetalle.setCurrencyID(precio.getPrecio().getMoneda().getCodigoInternacional());
					}

					boolean dato = false;
					priceType = new PriceType();
					if (priceAmountDetalle != null) {
						priceType.setPriceAmount(priceAmountDetalle);
						dato = true;
					}
					if (precio.getTipoPrecio() != null) {
						priceType.setPriceTypeCode(UtilUBL.generarPriceTypeCode(precio.getTipoPrecio()));
						dato = true;
					}
					if (dato) {
						pricingReference = new PricingReferenceType();
						pricingReference.getAlternativeConditionPrice().add(priceType);
					}
				}
			}
			if (detalleComprobante.getHuesped() != null
					&& detalleComprobante.getHuesped().getDocumentoIdentidad() != null
					&& detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento() != null
					&& StringUtils.isNotBlank(
							detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento().getValor())) {
				partyIdentificacion = new PartyIdentificationType();
				partyIdentificacion.setID(UtilUBL
						.generarId(detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento()));
			}
			if (detalleComprobante.getHuesped() != null
					&& StringUtils.isNotBlank(detalleComprobante.getHuesped().getNombrePersona())) {
				PartyNameType partyNameHuesped = new PartyNameType();
				partyNameHuesped.setName(UtilUBL.generarName(detalleComprobante.getHuesped().getNombrePersona()));
			}
			AddressType postalAdress = null;
			if (detalleComprobante.getHuesped() != null && detalleComprobante.getHuesped().getDireccion() != null
					&& detalleComprobante.getHuesped().getDireccion().getUbigeo() != null
					&& detalleComprobante.getHuesped().getDireccion().getUbigeo().getCodigoPais() != null
					&& StringUtils.isNotBlank(
							detalleComprobante.getHuesped().getDireccion().getUbigeo().getCodigoPais().getValor())) {
				pais = new CountryType();
				pais.setIdentificationCode(UtilUBL.generarIdentificationCode(
						detalleComprobante.getHuesped().getDireccion().getUbigeo().getCodigoPais()));

				postalAdress = new AddressType();
				postalAdress.setCountry(pais);
			}
			PersonType personHuesped = new PersonType();
			boolean idHuesped = false;
			if (detalleComprobante.getHuesped() != null
					&& detalleComprobante.getHuesped().getDocumentoIdentidad() != null
					&& detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento() != null
					&& StringUtils.isNotBlank(
							detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento().getValor())) {
				personHuesped.setID(UtilUBL
						.generarId(detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento()));
				idHuesped = true;
			}
			boolean nombreHuesped = false;
			if (detalleComprobante.getHuesped() != null
					&& StringUtils.isNotBlank(detalleComprobante.getHuesped().getNombrePersona())) {
				personHuesped
						.setFirstName(UtilUBL.generarFirstName(detalleComprobante.getHuesped().getNombrePersona()));
				nombreHuesped = true;
			}
			boolean dato4 = false;
			PartyType deliveryPartyDetalle = null;
			if (partyIdentificacion != null) {
				if (deliveryPartyDetalle == null) {
					deliveryPartyDetalle = new PartyType();
				}
				deliveryPartyDetalle.getPartyIdentification().add(partyIdentificacion);
				dato4 = true;
			}
			if (detalleComprobante.getHuesped() != null
					&& StringUtils.isNotBlank(detalleComprobante.getHuesped().getNombrePersona())) {
				if (deliveryPartyDetalle == null) {
					deliveryPartyDetalle = new PartyType();
				}
				deliveryPartyDetalle.getPartyName()
						.add(UtilUBL.generarPartyName(detalleComprobante.getHuesped().getNombrePersona()));
				dato4 = true;
			}
			if (postalAdress != null) {
				if (deliveryPartyDetalle == null) {
					deliveryPartyDetalle = new PartyType();
				}
				deliveryPartyDetalle.setPostalAddress(postalAdress);
				dato4 = true;
			}
			if (nombreHuesped || idHuesped) {
				if (deliveryPartyDetalle == null) {
					deliveryPartyDetalle = new PartyType();
				}
				deliveryPartyDetalle.getPerson().add(personHuesped);
				dato4 = true;
			}

			DeliveryType deliveryPasajero = null;
			if (detalleComprobante.getCiudadDestino() != null
					&& StringUtils.isNotBlank(detalleComprobante.getCiudadDestino().getCodigoUbigeoInei())) {
				deliveryPasajero = new DeliveryType();
				deliveryPasajero.setDeliveryAddress(
						UtilUBL.generarAddress(detalleComprobante.getCiudadDestino().getCodigoUbigeoInei()));
			}
			AddressType originAddressPasajero = null;
			if (detalleComprobante.getCiudadOrigen() != null
					&& StringUtils.isNotBlank(detalleComprobante.getCiudadOrigen().getCodigoUbigeoInei())) {
				originAddressPasajero = new AddressType();
				originAddressPasajero.setCountrySubentityCode(UtilUBL
						.generarCountrySubentityCode(detalleComprobante.getCiudadOrigen().getCodigoUbigeoInei()));
			}
			ShipmentType shipmentDelivery = new ShipmentType();
			ShipmentStageType shipmentStagePasajero = null;
			TransportEventType departureTransport = null;
			OccurrenceDateType fechaOcurencia = null;
			PersonType pasajero = null;
			FirstNameType nombrePasajero = null;
			boolean dato3 = false;
			for (ProductoServicioDTO proServicio : detalleComprobante.getListaProductoServicio()) {
				if (proServicio.getFechaInicioProgramado() != null) {
					fechaOcurencia = new OccurrenceDateType();
					
					Date fecha = UtilEjb.parseaFecha(UtilEjb.parseaFecha(proServicio.getFechaInicioProgramado(),"dd/MM/yyyy"),"dd/MM/yyyy");
					XMLGregorianCalendar fecha2 = UtilEjb.convertirDateAGregorian(fecha);
					fechaOcurencia.setValue(fecha2);
					
					fecha = UtilEjb.parseaFecha(UtilEjb.parseaFecha(proServicio.getFechaInicioProgramado(),"hh:mm:ss.SSSS"),"hh:mm:ss.SSSS");
					
					OccurrenceTimeType timeOcurencia = new OccurrenceTimeType();
					timeOcurencia.setValue(UtilEjb.convertirDateAGregorian(fecha));
					departureTransport = new TransportEventType();
					departureTransport.setOccurrenceDate(fechaOcurencia);
					departureTransport.setOccurrenceTime(timeOcurencia);
				}
				boolean dato2 = false;
				shipmentStagePasajero = new ShipmentStageType();
				if (proServicio.getNumeroAsiento() != null) {
					shipmentStagePasajero.setID(UtilUBL.generarId(proServicio.getNumeroAsiento()));
					dato2 = true;
				}
				if (departureTransport != null) {
					shipmentStagePasajero.setPlannedDepartureTransportEvent(departureTransport);
					dato2 = true;
				}

				for (PersonaDTO paxs : proServicio.getListaPasajeros()) {
					if (StringUtils.isNotBlank(paxs.getNombrePersona())) {
						nombrePasajero = new FirstNameType();
						nombrePasajero.setValue(paxs.getNombrePersona());
					}

					pasajero = new PersonType();
					boolean dato = false;
					if (paxs.getDocumentoIdentidad() != null
							&& paxs.getDocumentoIdentidad().getNumeroDocumento() != null) {
						pasajero.setID(UtilUBL.generarId(paxs.getDocumentoIdentidad().getNumeroDocumento()));
						dato = true;
					}
					if (nombrePasajero != null) {
						pasajero.setFirstName(nombrePasajero);
						dato = true;
					}
					if (dato) {
						shipmentStagePasajero.getPassengerPerson().add(pasajero);
						dato2 = true;
					}
				}
				if (dato2) {
					shipmentDelivery.getShipmentStage().add(shipmentStagePasajero);
					dato3 = true;
				}
			}
			if (deliveryPasajero != null) {
				shipmentDelivery.setDelivery(deliveryPasajero);
				dato3 = true;
			}
			if (originAddressPasajero != null) {
				shipmentDelivery.setOriginAddress(originAddressPasajero);
				dato3 = true;
			}

			boolean dato5 = false;
			DeliveryType deliveryDetalle = null;
			if (dato4) {
				if (deliveryDetalle == null) {
					deliveryDetalle = new DeliveryType();
				}
				deliveryDetalle.setDeliveryParty(deliveryPartyDetalle);
				dato5 = true;
			}
			if (dato3) {
				if (deliveryDetalle == null) {
					deliveryDetalle = new DeliveryType();
				}
				deliveryDetalle.setShipment(shipmentDelivery);
				dato5 = true;
			}

			invoiceLine = new InvoiceLineType();
			invoiceLine.setID(UtilUBL.generarIdType(String.valueOf((i + 1))));
			if (detalleComprobante.getCantidad() != null) {
				invoiceLine.setInvoicedQuantity(UtilUBL.generarInvoicedQuantity(detalleComprobante.getCantidad()));
			}
			if (lineExtensionAmountDetalle != null) {
				invoiceLine.setLineExtensionAmount(lineExtensionAmountDetalle);
			}
			if (pricingReference != null) {
				invoiceLine.setPricingReference(pricingReference);
			}
			if (dato5) {
				invoiceLine.getDelivery().add(deliveryDetalle);
			}

			if (detalleComprobante.getListaDescuento() != null && !detalleComprobante.getListaDescuento().isEmpty()) {
				for (DescuentoDTO dscto : detalleComprobante.getListaDescuento()) {
					montoCargoDescuentoDetalle = new AmountType();
					if (dscto.getMontoCargoDescuento() != null && dscto.getMontoCargoDescuento().getMonto() != null) {
						montoCargoDescuentoDetalle.setValue(dscto.getMontoCargoDescuento().getMonto());
					}
					if (dscto.getMontoCargoDescuento() != null && dscto.getMontoCargoDescuento().getMoneda() != null
							&& StringUtils
									.isNotBlank(dscto.getMontoCargoDescuento().getMoneda().getCodigoInternacional())) {
						montoCargoDescuentoDetalle
								.setCurrencyID(dscto.getMontoCargoDescuento().getMoneda().getCodigoInternacional());
					}

					baseMontoCargoDescuento = new BaseAmountType();
					if (dscto.getMontoBaseCargoDescuento() != null
							&& dscto.getMontoBaseCargoDescuento().getMonto() != null) {
						baseMontoCargoDescuento.setValue(dscto.getMontoBaseCargoDescuento().getMonto());
					}
					if (dscto.getMontoBaseCargoDescuento() != null
							&& dscto.getMontoBaseCargoDescuento().getMoneda() != null && StringUtils.isNotBlank(
									dscto.getMontoBaseCargoDescuento().getMoneda().getCodigoInternacional())) {
						baseMontoCargoDescuento
								.setCurrencyID(dscto.getMontoBaseCargoDescuento().getMoneda().getCodigoInternacional());
					}

					allowanceChargeDetalle = new AllowanceChargeType();
					allowanceChargeDetalle
							.setChargeIndicator(UtilUBL.generarChargeIndicator(dscto.isFlagCargoDescuento()));
					if (StringUtils.isNotBlank(dscto.getCodigoMotivoCargoDescuento())) {
						allowanceChargeDetalle.setAllowanceChargeReasonCode(
								UtilUBL.generarAllowanceChargeReasonCode(dscto.getCodigoMotivoCargoDescuento()));
					}
					if (dscto.getFactorCargoDescuento() != null) {
						allowanceChargeDetalle.setMultiplierFactorNumeric(
								UtilUBL.generarMultiplierFactorNumeric(dscto.getFactorCargoDescuento()));
					}
					allowanceChargeDetalle.setAmount(montoCargoDescuentoDetalle);
					allowanceChargeDetalle.setBaseAmount(baseMontoCargoDescuento);

					invoiceLine.getAllowanceCharge().add(allowanceChargeDetalle);
				}
			}

			TaxTotalType taxTotalDetalle = null;
			TaxAmountType taxAmountDetalle = null;
			TaxableAmountType taxableAmountDetalle = null;
			TaxAmountType taxAmountSubtotal2 = null;
			TaxCategoryType taxCategoryDetalle = null;
			TaxSchemeType taxSchemeCategory = null;
			for (AfectacionImptoDTO afecImpto : detalleComprobante.getAfectacionImpuestos()) {
				if (afecImpto.getTotalImpuesto() != null && afecImpto.getTotalImpuesto().getMonto() != null) {
					taxAmountDetalle = new TaxAmountType();
					taxAmountDetalle.setValue(afecImpto.getTotalImpuesto().getMonto());
					taxAmountDetalle.setCurrencyID(afecImpto.getTotalImpuesto().getMoneda().getCodigoInternacional());
				}

				if (detalleComprobante.getMontoTotal() != null
						&& detalleComprobante.getMontoTotal().getMonto() != null) {
					taxableAmountDetalle = new TaxableAmountType();
					taxableAmountDetalle.setValue(detalleComprobante.getMontoTotal().getMonto());
					taxableAmountDetalle
							.setCurrencyID(detalleComprobante.getMontoTotal().getMoneda().getCodigoInternacional());
				}

				if (afecImpto.getTotalImpuesto() != null && afecImpto.getTotalImpuesto().getMonto() != null) {
					taxAmountSubtotal2 = new TaxAmountType();
					taxAmountSubtotal2.setValue(afecImpto.getTotalImpuesto().getMonto());
					taxAmountSubtotal2.setCurrencyID(afecImpto.getTotalImpuesto().getMoneda().getCodigoInternacional());
				}

				if (afecImpto.getTributo().getCodigoInternacional() != null && StringUtils.isNotBlank(afecImpto.getTributo().getCodigoInternacional().getValor())) {
					taxSchemeCategory = new TaxSchemeType();
					taxSchemeCategory.setID(UtilUBL.generarId(afecImpto.getTributo().getCodigoInternacional()));
					taxSchemeCategory.setName(UtilUBL.generarName(afecImpto.getTributo().getNombre()));
					taxSchemeCategory.setTaxTypeCode(UtilUBL.generarTaxTypeCode(afecImpto.getTributo().getCodigo()));
				}

				if (afecImpto.getCodigoCategoria() != null && StringUtils.isNotBlank(afecImpto.getCodigoCategoria().getValor())) {
					if (taxCategoryDetalle == null){
						taxCategoryDetalle = new TaxCategoryType();
					}
					taxCategoryDetalle.setID(UtilUBL.generarId(afecImpto.getCodigoCategoria()));
				}
				if (afecImpto.getPorcentaje() != null) {
					if (taxCategoryDetalle == null){
						taxCategoryDetalle = new TaxCategoryType();
					}
					taxCategoryDetalle.setPercent(UtilUBL.generarPercent(afecImpto.getPorcentaje()));
				}
				if (afecImpto.getAfectacion() != null && StringUtils.isNotBlank(afecImpto.getAfectacion().getValor())) {
					if (taxCategoryDetalle == null){
						taxCategoryDetalle = new TaxCategoryType();
					}
					taxCategoryDetalle.setTaxExemptionReasonCode(
							UtilUBL.generarTaxExemptionReasonCode(afecImpto.getAfectacion()));
				}
				if (afecImpto.getCodigoSistemaIsc() != null
						&& StringUtils.isNotBlank(afecImpto.getCodigoSistemaIsc().getCodigo())) {
					if (taxCategoryDetalle == null){
						taxCategoryDetalle = new TaxCategoryType();
					}
					taxCategoryDetalle
							.setTierRange(UtilUBL.generarTierRange(afecImpto.getCodigoSistemaIsc().getCodigo()));
				}
				if (taxSchemeCategory != null) {
					if (taxCategoryDetalle == null){
						taxCategoryDetalle = new TaxCategoryType();
					}
					taxCategoryDetalle.setTaxScheme(taxSchemeCategory);
				}

				TaxSubtotalType taxSubtotalDetalle = new TaxSubtotalType();
				if (taxableAmountDetalle != null) {
					taxSubtotalDetalle.setTaxableAmount(taxableAmountDetalle);
				}
				if (taxAmountSubtotal2 != null) {
					taxSubtotalDetalle.setTaxAmount(taxAmountSubtotal2);
				}
				if (taxCategoryDetalle != null) {
					taxSubtotalDetalle.setTaxCategory(taxCategoryDetalle);
				}

				taxTotalDetalle = new TaxTotalType();
				if (taxAmountDetalle != null) {
					taxTotalDetalle.setTaxAmount(taxAmountDetalle);
				}
				if (taxSubtotalDetalle != null) {
					taxTotalDetalle.getTaxSubtotal().add(taxSubtotalDetalle);
				}

				invoiceLine.getTaxTotal().add(taxTotalDetalle);
			}
			ItemIdentificationType sellersItemIdentification = null;

			if (detalleComprobante.getProducto() != null
					&& detalleComprobante.getProducto().getCodigoProducto() != null) {
				sellersItemIdentification = new ItemIdentificationType();
				sellersItemIdentification
						.setID(UtilUBL.generarId(detalleComprobante.getProducto().getCodigoProducto()));
			}

			CommodityClassificationType commodityClassification = null;

			if (detalleComprobante.getProducto() != null
					&& detalleComprobante.getProducto().getCodigoProductoSunat() != null) {
				commodityClassification = new CommodityClassificationType();
				commodityClassification.setItemClassificationCode(UtilUBL
						.generarItemClassificationCode(detalleComprobante.getProducto().getCodigoProductoSunat()));
			}

			ItemType itemDetalle = null;
			if (detalleComprobante.getProducto() != null
					&& detalleComprobante.getProducto().getListaDescripcionProducto() != null
					&& !detalleComprobante.getProducto().getListaDescripcionProducto().isEmpty()) {
				for (String descripcion : detalleComprobante.getProducto().getListaDescripcionProducto()) {
					itemDetalle = new ItemType();
					if (StringUtils.isNotBlank(descripcion)) {
						itemDetalle.getDescription().add(UtilUBL.generarDescription(descripcion));
					}
					if (commodityClassification != null) {
						itemDetalle.getCommodityClassification().add(commodityClassification);
					}
				}
				if (sellersItemIdentification != null) {
					itemDetalle.setSellersItemIdentification(sellersItemIdentification);
				}
			}

			PeriodType usabilityPeriodo = null;
			ItemPropertyType adicionalProperty = null;
			for (PropiedadesAdicionalesDTO propiedad : detalleComprobante.getListaPropiedadesAdicionales()) {
				if (propiedad.getFechaInicio() != null) {
					if (usabilityPeriodo == null){
						usabilityPeriodo = new PeriodType();
					}
					usabilityPeriodo.setStartDate(UtilUBL.generarStartDate(propiedad.getFechaInicio()));
				}
				if (propiedad.getFechaFin() != null) {
					if (usabilityPeriodo == null){
						usabilityPeriodo = new PeriodType();
					}
					usabilityPeriodo.setEndDate(UtilUBL.generarEndDate(propiedad.getFechaFin()));
				}

				adicionalProperty = new ItemPropertyType();
				if (StringUtils.isNotBlank(propiedad.getNombreConceptoTributario())) {
					adicionalProperty.setName(UtilUBL.generarName(propiedad.getNombreConceptoTributario()));
				}
				if (propiedad.getCodigoConceptoTributario() != null) {
					adicionalProperty.setNameCode(UtilUBL.generarNameCode(propiedad.getCodigoConceptoTributario()));
				}
				if (propiedad.getItem() != null && StringUtils.isNotBlank(propiedad.getItem().getValor())) {
					adicionalProperty.setValue(UtilUBL.generarValue(propiedad.getItem().getValor()));
				}
				if (propiedad.getItem() != null && StringUtils.isNotBlank(propiedad.getItem().getCodigo())) {
					adicionalProperty.getValueQualifier()
							.add(UtilUBL.generarValueQualifier(propiedad.getItem().getCodigo()));
				}
				adicionalProperty.setUsabilityPeriod(usabilityPeriodo);
				if (itemDetalle != null) {
					itemDetalle.getAdditionalItemProperty().add(adicionalProperty);
				}
			}
			PriceAmountType priceAmountDetalle2 = null;
			if (detalleComprobante.getMontoTotal() != null && detalleComprobante.getMontoTotal().getMonto() != null) {
				priceAmountDetalle2 = new PriceAmountType();
				priceAmountDetalle2.setValue(detalleComprobante.getMontoTotal().getMonto());
				priceAmountDetalle2
						.setCurrencyID(detalleComprobante.getMontoTotal().getMoneda().getCodigoInternacional());
			}
			PriceType price = null;
			if (priceAmountDetalle2 != null) {
				price = new PriceType();
				price.setPriceAmount(priceAmountDetalle2);
			}
			if (itemDetalle != null) {
				invoiceLine.setItem(itemDetalle);
			}
			if (price != null) {
				invoiceLine.setPrice(price);
			}
			if (invoiceLine != null) {
				invoice.getInvoiceLine().add(invoiceLine);
			}
		}

		return invoice;
	}
}
