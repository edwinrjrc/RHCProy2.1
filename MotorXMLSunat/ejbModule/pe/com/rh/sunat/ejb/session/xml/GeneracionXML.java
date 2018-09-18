package pe.com.rh.sunat.ejb.session.xml;

import java.io.ByteArrayOutputStream;

import javax.ejb.Stateless;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationCoordinateType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.OrderReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyNameType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PersonType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.RoadTransportType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ShipmentStageType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ShipmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportEquipmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportHandlingUnitType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportMeansType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AddressTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoiceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LicensePlateIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineCountNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LocaleCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkAttentionIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNationalityIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportModeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.ObjectFactory;
import pe.com.rh.sunat.ejb.util.UtilConvertirNumeroLetras;
import pe.com.rh.sunat.ejb.util.UtilEjb;
import pe.com.rhsistemas.sunat.comprobantes.ComprobanteDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.PersonaDTO;

/**
 * Session Bean implementation class GeneracionXML
 */
@Stateless
public class GeneracionXML implements GeneracionXMLRemote, GeneracionXMLLocal {

    public GeneracionXML() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public byte[] generarXML(ComprobanteDTO comprobante){
    	try {
			IDType idInvoice = new IDType();
			idInvoice.setValue(comprobante.getNumeroSerie()+"-"+comprobante.getCorrelativo());
			
			UBLVersionIDType versionUbl = new UBLVersionIDType();
			versionUbl.setValue(comprobante.getVersionUBL());
			
			CustomizationIDType customizacionId = new CustomizationIDType();
			customizacionId.setValue(comprobante.getVersionDocumento());
			
			ProfileIDType profileType = new ProfileIDType();
			profileType.setValue(comprobante.getProfileId());
			
			IssueDateType issueDateType = new IssueDateType();
			issueDateType.setValue(UtilEjb.convertirDateAGregorian(comprobante.getFechaEmision()));
			
			IssueTimeType issueTimeType = new IssueTimeType();
			issueTimeType.setValue(UtilEjb.convertirDateAGregorian(comprobante.getFechaEmision()));
			
			DueDateType dueDateType = new DueDateType();
			dueDateType.setValue(UtilEjb.convertirDateAGregorian(comprobante.getFechaVencimiento()));
			
			InvoiceTypeCodeType tipoComprobante = new InvoiceTypeCodeType();
			tipoComprobante.setValue(comprobante.getTipoComprobante().getCodigo());
			
			NoteType noteType = new NoteType();
			noteType.setValue(UtilConvertirNumeroLetras.convertirNumeroALetras(comprobante.getTotalComprobante().getMonto().doubleValue()));
			noteType.setLanguageLocaleID("1000");
			
			DocumentCurrencyCodeType monedaComprobante = new DocumentCurrencyCodeType();
			monedaComprobante.setListID("ISO 4217 Alpha");
			monedaComprobante.setListName("Currency"); 
			monedaComprobante.setListAgencyName(comprobante.getMonedaComprobante().getAgenciaNombre());
			monedaComprobante.setValue(comprobante.getMonedaComprobante().getCodigoInternacional());
			
			LineCountNumericType cantidadEnDetalle = new LineCountNumericType();
			cantidadEnDetalle.setValue(UtilEjb.convertirABigDecimal(comprobante.getDetalleComprobante().size()));

			StartDateType fechaInicio = new StartDateType();
			fechaInicio.setValue(UtilEjb.convertirDateAGregorian(comprobante.getFechaInicioFacturacion()));
			
			EndDateType fechaFin = new EndDateType();
			fechaFin.setValue(UtilEjb.convertirDateAGregorian(comprobante.getFechaFinFacturacion()));
			
			PeriodType periodoTipo = new PeriodType();
			periodoTipo.setStartDate(fechaInicio);
			periodoTipo.setEndDate(fechaFin);
			
			IDType idOrdenCompra = new IDType();
			idOrdenCompra.setValue(comprobante.getNumeroOrdenCompra());
			
			OrderReferenceType orderReference = new OrderReferenceType();
			orderReference.setID(idOrdenCompra);
			
			IDType idDocumentReference = new IDType();
			idDocumentReference.setValue(comprobante.getGuiaRelacionada().getNumeroComprobante());
			
			DocumentTypeCodeType codigoTipoDocRelacionado =  new DocumentTypeCodeType();
			codigoTipoDocRelacionado.setValue(comprobante.getGuiaRelacionada().getTipoComprobante().getCodigo());
			
			DocumentReferenceType documentReference = new DocumentReferenceType();
			documentReference.setID(idDocumentReference);
			documentReference.setDocumentTypeCode(codigoTipoDocRelacionado);
			
			IDType idContratoReference = new IDType();
			idContratoReference.setValue(comprobante.getServicioReferenciaDTO().getId());
			
			DocumentTypeCodeType codigoTipoDocumento = new DocumentTypeCodeType();
			codigoTipoDocumento.setValue(String.valueOf(comprobante.getServicioReferenciaDTO().getTipoServicio().getCodigo()));
			
			DocumentStatusCodeType documentStatus = new DocumentStatusCodeType();
			documentStatus.setValue(comprobante.getServicioReferenciaDTO().getCodigoTipoTarifa());
			
			LocaleCodeType localeCode = new LocaleCodeType();
			localeCode.setValue(String.valueOf(comprobante.getServicioReferenciaDTO().getCodigoServicio()));
			
			DocumentReferenceType contratoReference = new DocumentReferenceType();
			contratoReference.setID(idContratoReference);
			contratoReference.setDocumentTypeCode(codigoTipoDocumento);
			contratoReference.setLocaleCode(localeCode);
			contratoReference.setDocumentStatusCode(documentStatus);
			
			IDType numeroDocumentoRelacionado = new IDType();
			numeroDocumentoRelacionado.setValue(comprobante.getComprobanteRelacionado().getNumeroComprobante());
			
			DocumentTypeCodeType tipoDocumentoRelacionado = new DocumentTypeCodeType();
			tipoDocumentoRelacionado.setValue(comprobante.getComprobanteRelacionado().getTipoComprobante().getCodigo());
			
			DocumentReferenceType addDocumentReference = new DocumentReferenceType();
			addDocumentReference.setID(numeroDocumentoRelacionado);
			addDocumentReference.setDocumentTypeCode(tipoDocumentoRelacionado);
			
			NameType nombreEmisor = new NameType();
			nombreEmisor.setValue(comprobante.getEmisor().getNombreComercial());
			
			PartyNameType partyNameEmisor = new PartyNameType();
			partyNameEmisor.setName(nombreEmisor);
			
			RegistrationNameType registrationNameEmisor = new RegistrationNameType();
			registrationNameEmisor.setValue(comprobante.getEmisor().getNombrePersona());
			
			CompanyIDType companyIdEmisor = new CompanyIDType();
			companyIdEmisor.setValue(comprobante.getEmisor().getDocumentoIdentidad().getNumeroDocumento());
			companyIdEmisor.setSchemeID(comprobante.getEmisor().getDocumentoIdentidad().getTipoDocumento().getCodigo());
			
			AddressTypeCodeType codigoTipoDireccion = new AddressTypeCodeType();
			codigoTipoDireccion.setValue(comprobante.getEmisor().getDireccion().getId()==null?"0000":comprobante.getEmisor().getDireccion().getId());
			
			AddressType direccionEmisor = new AddressType();
			direccionEmisor.setAddressTypeCode(codigoTipoDireccion);
			
			PartyTaxSchemeType partyTaxSchemaEmisor = new PartyTaxSchemeType();
			partyTaxSchemaEmisor.setRegistrationName(registrationNameEmisor);
			partyTaxSchemaEmisor.setCompanyID(companyIdEmisor);
			partyTaxSchemaEmisor.setRegistrationAddress(direccionEmisor);
			
			PartyType partyEmisor = new PartyType();
			partyEmisor.getPartyName().add(partyNameEmisor);
			partyEmisor.getPartyTaxScheme().add(partyTaxSchemaEmisor);
			
			SupplierPartyType emisor = new SupplierPartyType();
			emisor.setParty(partyEmisor);
			
			RegistrationNameType registrationNameAdquiriente = new RegistrationNameType();
			registrationNameAdquiriente.setValue(comprobante.getAdquiriente().getNombrePersona());
			
			CompanyIDType companyIdAdquiriente = new CompanyIDType();
			companyIdAdquiriente.setValue(comprobante.getAdquiriente().getDocumentoIdentidad().getNumeroDocumento());
			companyIdAdquiriente.setSchemeID(comprobante.getAdquiriente().getDocumentoIdentidad().getTipoDocumento().getCodigo());
			
			PartyTaxSchemeType partyTaxSchemaAdquiriente = new PartyTaxSchemeType();
			partyTaxSchemaAdquiriente.setRegistrationName(registrationNameAdquiriente);
			partyTaxSchemaAdquiriente.setCompanyID(companyIdAdquiriente);
			
			PartyType partyAdquiriente = new PartyType();
			partyAdquiriente.getPartyTaxScheme().add(partyTaxSchemaAdquiriente);
			
			CustomerPartyType adquiriente = new CustomerPartyType();
			adquiriente.setParty(partyAdquiriente);
			
			IDType idDelivery = new IDType();
			idDelivery.setValue(comprobante.getEntregaDTO().getId());
			
			QuantityType cantidadConsumo = new QuantityType();
			cantidadConsumo.setValue(UtilEjb.convertirABigDecimal(comprobante.getEntregaDTO().getCantidad()));
			
			MaximumQuantityType maximaCantidad = new MaximumQuantityType();
			maximaCantidad.setValue(UtilEjb.convertirABigDecimal(comprobante.getEntregaDTO().getPotenciaContratada()));
			
			LatitudeDirectionCodeType latitudeDirection = new LatitudeDirectionCodeType();
			latitudeDirection.setValue(comprobante.getEntregaDTO().getLatitud());
			
			LongitudeDirectionCodeType longitudDirection = new LongitudeDirectionCodeType();
			longitudDirection.setValue(comprobante.getEntregaDTO().getLongitud());
			
			LocationCoordinateType locacion = new LocationCoordinateType();
			locacion.setLatitudeDirectionCode(latitudeDirection);
			locacion.setLongitudeDirectionCode(longitudDirection);
			
			LocationType deliveryLocation = new LocationType();
			deliveryLocation.getLocationCoordinate().add(locacion);
			
			CompanyIDType companyIdDestinatario = new CompanyIDType();
			companyIdDestinatario.setValue(comprobante.getDestinatario().getDocumentoIdentidad().getNumeroDocumento());
			companyIdDestinatario.setSchemeID(comprobante.getDestinatario().getDocumentoIdentidad().getTipoDocumento().getCodigo());
			
			RegistrationNameType registrationDestinatario = new RegistrationNameType();
			registrationDestinatario.setValue(comprobante.getDestinatario().getNombrePersona());
			
			PartyLegalEntityType partyLegalEntity = new PartyLegalEntityType();
			partyLegalEntity.setCompanyID(companyIdDestinatario);
			partyLegalEntity.setRegistrationName(registrationDestinatario);
			
			PartyType deliveryParty = new PartyType();
			deliveryParty.getPartyLegalEntity().add(partyLegalEntity);
			
			HandlingCodeType handlingCode = new HandlingCodeType();
			handlingCode.setValue(comprobante.getEntregaDTO().getMotivoTraslado().getCodigo());
			
			GrossWeightMeasureType pesoBruto = new GrossWeightMeasureType();
			pesoBruto.setValue(comprobante.getEntregaDTO().getPesoBruto());
			pesoBruto.setUnitCode(comprobante.getEntregaDTO().getUnidadMedida());
			
			TransportModeCodeType transportModeCode = new TransportModeCodeType();
			transportModeCode.setValue(comprobante.getEntregaDTO().getModalidadTraslado());
			
			StartDateType fechaInicioType = new StartDateType();
			fechaInicioType.setValue(UtilEjb.convertirDateAGregorian(comprobante.getEntregaDTO().getFechaInicioTraslado()));
			
			PeriodType fechaInicioTraslado = new PeriodType();
			fechaInicioTraslado.setStartDate(fechaInicioType);
			
			CompanyIDType documentoTransportista = new CompanyIDType();
			documentoTransportista.setValue(comprobante.getEntregaDTO().getTransportista().getDocumentoIdentidad().getNumeroDocumento());
			documentoTransportista.setSchemeID(comprobante.getEntregaDTO().getTransportista().getDocumentoIdentidad().getTipoDocumento().getCodigo());

			RegistrationNameType registrationNameTransportista = new RegistrationNameType();
			registrationNameTransportista.setValue(comprobante.getEntregaDTO().getTransportista().getNombrePersona());
			
			PartyLegalEntityType carrierLegalEntity = new PartyLegalEntityType();
			carrierLegalEntity.setCompanyID(documentoTransportista);
			carrierLegalEntity.setRegistrationName(registrationNameTransportista);
			
			PartyType carrierParty = new PartyType();
			carrierParty.getPartyLegalEntity().add(carrierLegalEntity);
			
			RegistrationNationalityIDType registracionNacionalidad = new RegistrationNationalityIDType();
			registracionNacionalidad.setValue(comprobante.getEntregaDTO().getTransportista().getNumeroHabilitacionVehicular());
			
			LicensePlateIDType placaCarro = new LicensePlateIDType();
			placaCarro.setValue(comprobante.getEntregaDTO().getTransportista().getNumeroPlacaVehiculo());
			
			RoadTransportType roadTransport = new RoadTransportType();
			roadTransport.setLicensePlateID(placaCarro);
			
			TransportMeansType transportMeans = new TransportMeansType();
			transportMeans.setRegistrationNationalityID(registracionNacionalidad);
			transportMeans.setRoadTransport(roadTransport);
			
			ShipmentStageType shipmentStage = new ShipmentStageType();
			shipmentStage.setTransportModeCode(transportModeCode);
			shipmentStage.setTransitPeriod(fechaInicioTraslado);
			shipmentStage.getCarrierParty().add(carrierParty);
			shipmentStage.setTransportMeans(transportMeans);
			PersonType conductor = null;
			IDType idNumeroDocumento = null;
			for (PersonaDTO personaConduce : comprobante.getEntregaDTO().getTransportista().getConductores()){
				idNumeroDocumento = new IDType();
				idNumeroDocumento.setValue(personaConduce.getDocumentoIdentidad().getNumeroDocumento());
				idNumeroDocumento.setSchemeID(personaConduce.getDocumentoIdentidad().getTipoDocumento().getCodigo());
				
				conductor = new PersonType();
				conductor.setID(idNumeroDocumento);
				shipmentStage.getDriverPerson().add(conductor);
			}
			CountrySubentityCodeType countrySubentity = new CountrySubentityCodeType();
			countrySubentity.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getCodigoUbigeo());
			
			LineType lineDireccion = new LineType();
			lineDireccion.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getDireccionCompleta());
			
			AddressLineType addressLine = new AddressLineType();
			addressLine.setLine(lineDireccion);
			
			AddressType deliveryAdress = new AddressType();
			deliveryAdress.setCountrySubentityCode(countrySubentity);
			deliveryAdress.getAddressLine().add(addressLine);
			
			MarkAttentionIndicatorType markAttention = new MarkAttentionIndicatorType();
			markAttention.setValue(comprobante.getEntregaDTO().isFlagSubcontratacion());
			
			PartyType deliveryShipmentParty = new PartyType();
			deliveryShipmentParty.setMarkAttentionIndicator(markAttention);
			
			DeliveryType deliveryShipment = new DeliveryType();
			deliveryShipment.setDeliveryAddress(deliveryAdress);
			deliveryShipment.setDeliveryParty(deliveryShipmentParty);
			
			IDType idTransport = new IDType();
			idTransport.setValue(comprobante.getEntregaDTO().getTransportista().getNumeroPlacaVehiculo());
			
			TransportEquipmentType transportEquiment = new TransportEquipmentType();
			transportEquiment.setID(idTransport);
			
			TransportHandlingUnitType transportHandling = new TransportHandlingUnitType();
			transportHandling.getTransportEquipment().add(transportEquiment);
			
			LineType origenLine = new LineType();
			origenLine.setValue(comprobante.getEntregaDTO().getDireccionPartida().getDireccionCompleta());
			
			AddressLineType origenAddressLine = new AddressLineType();
			origenAddressLine.setLine(origenLine);
			
			AddressType originAddress = new AddressType();
			originAddress.getAddressLine().add(origenAddressLine);
			
			ShipmentType shipment = new ShipmentType();
			shipment.setHandlingCode(handlingCode);
			shipment.setGrossWeightMeasure(pesoBruto);
			shipment.getShipmentStage().add(shipmentStage);
			shipment.setDelivery(deliveryShipment);
			shipment.getTransportHandlingUnit().add(transportHandling);
			shipment.setOriginAddress(originAddress);
			
			DeliveryType delivery = new DeliveryType();
			delivery.setID(idDelivery);
			delivery.setQuantity(cantidadConsumo);
			delivery.setMaximumQuantity(maximaCantidad);
			delivery.setDeliveryLocation(deliveryLocation);
			delivery.setDeliveryParty(deliveryParty);
			delivery.setShipment(shipment);
			
			IDType idDeliveryTerms = new IDType();
			idDeliveryTerms.setValue(comprobante.getEntregaDTO().getNumeroRegistroMTC());
			
			AmountType amountDelivery = new AmountType();
			amountDelivery.setValue(comprobante.getTotalComprobante().getMonto());
			amountDelivery.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
			
			DeliveryTermsType deliveryTerms = new DeliveryTermsType();
			deliveryTerms.setID(idDeliveryTerms);
			deliveryTerms.setAmount(amountDelivery);
			
			ObjectFactory factory = new ObjectFactory();
			InvoiceType invoice = factory.createInvoiceType();
			invoice.setID(idInvoice);
			invoice.setUBLVersionID(versionUbl);
			invoice.setCustomizationID(customizacionId);
			invoice.setProfileID(profileType);
			invoice.setIssueDate(issueDateType);
			invoice.setIssueTime(issueTimeType);
			invoice.setDueDate(dueDateType);
			invoice.setInvoiceTypeCode(tipoComprobante);
			invoice.getNote().add(noteType);
			invoice.setDocumentCurrencyCode(monedaComprobante);
			invoice.setLineCountNumeric(cantidadEnDetalle);
			invoice.getInvoicePeriod().add(periodoTipo);
			invoice.setOrderReference(orderReference);
			invoice.getDespatchDocumentReference().add(documentReference);
			invoice.getContractDocumentReference().add(contratoReference);
			invoice.getAdditionalDocumentReference().add(addDocumentReference);
			invoice.setAccountingSupplierParty(emisor);
			invoice.setAccountingCustomerParty(adquiriente);
			invoice.getDelivery().add(delivery);
			invoice.setDeliveryTerms(deliveryTerms);
			
			
			JAXBContext context = JAXBContext.newInstance("generated");
			JAXBElement<InvoiceType> element = factory.createInvoice(invoice);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			marshaller.marshal(element,baos);
			
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
		}
    	return null;
    }
}
