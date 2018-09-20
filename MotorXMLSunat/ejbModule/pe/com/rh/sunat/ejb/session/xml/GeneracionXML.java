package pe.com.rh.sunat.ejb.session.xml;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;

import javax.ejb.Stateless;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConfigurationException;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CountryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.FinancialAccountType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.InvoiceLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationCoordinateType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.MonetaryTotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.OrderReferenceType;
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
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.RoadTransportType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ShipmentStageType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ShipmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportEquipmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportHandlingUnitType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportMeansType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AddressTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AllowanceChargeReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AllowanceTotalAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BaseAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeTotalAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CityNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CitySubdivisionNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DistrictType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoiceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoicedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LicensePlateIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineCountNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LocaleCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkAttentionIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MultiplierFactorNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaidAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PayableAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrepaidAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNationalityIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxInclusiveAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxableAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportModeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.ObjectFactory;
import pe.com.rh.sunat.ejb.util.UtilConvertirNumeroLetras;
import pe.com.rh.sunat.ejb.util.UtilEjb;
import pe.com.rhsistemas.sunat.comprobantes.ComprobanteDTO;
import pe.com.rhsistemas.sunat.comprobantes.DetalleComprobanteDTO;
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
			
			StreetNameType nombreCalle = new StreetNameType();
			nombreCalle.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getDireccionCompleta());
			
			CitySubdivisionNameType citySubdivisionName = new CitySubdivisionNameType();
			citySubdivisionName.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getUrbanizacion());
			
			CityNameType cityName = new CityNameType();
			cityName.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getUbigeo().getNombreProvincia());
			
			CountrySubentityType departamento = new CountrySubentityType();
			departamento.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getUbigeo().getNombreDepartamento());
			
			CountrySubentityCodeType countrySubentityCode = new CountrySubentityCodeType();
			countrySubentityCode.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getUbigeo().getCodigoUbigeoInei());
			
			DistrictType distrito = new DistrictType();
			distrito.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getUbigeo().getNombreDistrito());
			
			IdentificationCodeType identificacionCode = new IdentificationCodeType();
			identificacionCode.setValue(comprobante.getEntregaDTO().getDireccionLlegada().getUbigeo().getCodigoPais());
			
			CountryType country = new CountryType();
			country.setIdentificationCode(identificacionCode);
			
			AddressType addressLocation = new AddressType();
			addressLocation.setStreetName(nombreCalle);
			addressLocation.setCitySubdivisionName(citySubdivisionName);
			addressLocation.setCityName(cityName);
			addressLocation.setCountrySubentity(departamento);
			addressLocation.setCountrySubentityCode(countrySubentityCode);
			addressLocation.setDistrict(distrito);
			addressLocation.setCountry(country);
			
			LocationType deliveryLocationTerms = new LocationType();
			deliveryLocationTerms.setAddress(addressLocation);
			
			DeliveryTermsType deliveryTerms = new DeliveryTermsType();
			deliveryTerms.setID(idDeliveryTerms);
			deliveryTerms.setAmount(amountDelivery);
			deliveryTerms.setDeliveryLocation(deliveryLocationTerms);
			
			IDType idFinancial = new IDType();
			idFinancial.setValue(comprobante.getNumeroCuentaBNDetraccion());

			FinancialAccountType payeeFinancialAccount = new FinancialAccountType();
			payeeFinancialAccount.setID(idFinancial);
			
			PaymentMeansType paymentMeans = new PaymentMeansType();
			paymentMeans.setPayeeFinancialAccount(payeeFinancialAccount);
			
			IDType idPrepaid = new IDType();
			idPrepaid.setValue(comprobante.getNumeroComprobanteAnticipo());
			idPrepaid.setSchemeID(comprobante.getCodigoTipoDocumentoAnticipo());
			
			PaidAmountType paidAmount = new PaidAmountType();
			paidAmount.setValue(comprobante.getMontoAnticipo().getMonto());
			paidAmount.setCurrencyID(comprobante.getMontoAnticipo().getMoneda().getCodigoInternacional());
			
			InstructionIDType instructionId = new InstructionIDType();
			instructionId.setValue(comprobante.getDocumentoEmpresaAnticipo().getNumeroDocumento());
			instructionId.setSchemeID(comprobante.getDocumentoEmpresaAnticipo().getTipoDocumento().getCodigo());
			
			PaymentType paymentType = new PaymentType();
			paymentType.setID(idPrepaid);
			paymentType.setPaidAmount(paidAmount);
			paymentType.setInstructionID(instructionId);
			
			ChargeIndicatorType chargeIndicator = new ChargeIndicatorType();
			chargeIndicator.setValue(comprobante.isFlagCargoDescuento());
			
			AllowanceChargeReasonCodeType allowanceChargeReason = new AllowanceChargeReasonCodeType();
			allowanceChargeReason.setValue(comprobante.getCodigoMotivoCargoDescuento());
			
			MultiplierFactorNumericType multiplierFactor = new MultiplierFactorNumericType();
			multiplierFactor.setValue(comprobante.getFactorCargoDescuento());
			
			AmountType montoCargoDescuento = new AmountType();
			montoCargoDescuento.setValue(comprobante.getMontoCargoDescuento().getMonto());
			montoCargoDescuento.setCurrencyID(comprobante.getMontoCargoDescuento().getMoneda().getCodigoInternacional());
			
			BaseAmountType baseAmount = new BaseAmountType();
			baseAmount.setValue(comprobante.getMontoBaseCargoDescuento().getMonto());
			baseAmount.setCurrencyID(comprobante.getMontoBaseCargoDescuento().getMoneda().getCodigoInternacional());
			
			AllowanceChargeType allowanceCharge = new AllowanceChargeType();
			allowanceCharge.setChargeIndicator(chargeIndicator);
			allowanceCharge.setAllowanceChargeReasonCode(allowanceChargeReason);
			allowanceCharge.setMultiplierFactorNumeric(multiplierFactor);
			allowanceCharge.setAmount(montoCargoDescuento);
			allowanceCharge.setBaseAmount(baseAmount);
			
			TaxAmountType taxAmount = new TaxAmountType();
			taxAmount.setValue(comprobante.getMontoTotalImpuestos().getMonto());
			taxAmount.setCurrencyID(comprobante.getMontoTotalImpuestos().getMoneda().getCodigoInternacional());
			
			TaxableAmountType taxableAmount = new TaxableAmountType();
			taxableAmount.setValue(comprobante.getMontoTotalOperaciones().getMonto());
			taxableAmount.setCurrencyID(comprobante.getMontoTotalOperaciones().getMoneda().getCodigoInternacional());
			
			TaxAmountType taxAmountSubtotal = new TaxAmountType();
			taxAmountSubtotal.setValue(comprobante.getMontoTotalImpuestos().getMonto());
			taxAmountSubtotal.setCurrencyID(comprobante.getMontoTotalImpuestos().getMoneda().getCodigoInternacional());
			
			IDType idCategoria = new IDType();
			idCategoria.setValue(comprobante.getCodigoCategoriaImpuesto().getCodigo());
			
			IDType idTaxScheme = new IDType();
			idTaxScheme.setValue(comprobante.getCodigoTributo().getId());
			
			NameType nombreTributo = new NameType();
			nombreTributo.setValue(comprobante.getCodigoTributo().getValor());
			
			TaxTypeCodeType taxTypeCode = new TaxTypeCodeType();
			taxTypeCode.setValue(comprobante.getCodigoTributo().getCodigo());
			
			TaxSchemeType taxScheme = new TaxSchemeType();
			taxScheme.setID(idTaxScheme);
			taxScheme.setName(nombreTributo);
			taxScheme.setTaxTypeCode(taxTypeCode);
			
			TaxCategoryType taxCategory = new TaxCategoryType();
			taxCategory.setID(idCategoria);
			taxCategory.setTaxScheme(taxScheme);
			
			TaxSubtotalType taxSubtotal = new TaxSubtotalType();
			taxSubtotal.setTaxableAmount(taxableAmount);
			taxSubtotal.setTaxAmount(taxAmountSubtotal);
			taxSubtotal.setTaxCategory(taxCategory);
			
			TaxTotalType taxTotal = new TaxTotalType();
			taxTotal.setTaxAmount(taxAmount);
			taxTotal.getTaxSubtotal().add(taxSubtotal);
			
			LineExtensionAmountType lineExtensionAmount = new LineExtensionAmountType();
			lineExtensionAmount.setValue(comprobante.getMontoTotalValorVenta().getMonto());
			lineExtensionAmount.setCurrencyID(comprobante.getMontoTotalValorVenta().getMoneda().getCodigoInternacional());
			
			TaxInclusiveAmountType taxInclusiveAmount = new TaxInclusiveAmountType();
			taxInclusiveAmount.setValue(comprobante.getTotalComprobante().getMonto());
			taxInclusiveAmount.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
			
			AllowanceTotalAmountType allowanceTotalAmount = new AllowanceTotalAmountType();
			allowanceTotalAmount.setValue(comprobante.getTotalDescuentos().getMonto().getMonto());
			allowanceTotalAmount.setCurrencyID(comprobante.getTotalDescuentos().getMonto().getMoneda().getCodigoInternacional());
			
			ChargeTotalAmountType chargeTotalAmount = new ChargeTotalAmountType();
			chargeTotalAmount.setValue(comprobante.getSumaOtrosCargos().getMonto());
			chargeTotalAmount.setCurrencyID(comprobante.getSumaOtrosCargos().getMoneda().getCodigoInternacional());
			
			PrepaidAmountType prepaidAmount = new PrepaidAmountType();
			prepaidAmount.setValue(comprobante.getMontoAnticipo().getMonto());
			prepaidAmount.setCurrencyID(comprobante.getMontoAnticipo().getMoneda().getCodigoInternacional());
			
			PayableAmountType payableAmount = new PayableAmountType();
			payableAmount.setValue(comprobante.getTotalComprobante().getMonto());
			payableAmount.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
			
			MonetaryTotalType monetaryTotal = new MonetaryTotalType();
			monetaryTotal.setLineExtensionAmount(lineExtensionAmount);
			monetaryTotal.setTaxInclusiveAmount(taxInclusiveAmount);
			monetaryTotal.setAllowanceTotalAmount(allowanceTotalAmount);
			monetaryTotal.setChargeTotalAmount(chargeTotalAmount);
			monetaryTotal.setPrepaidAmount(prepaidAmount);
			monetaryTotal.setPayableAmount(payableAmount);
			
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
			invoice.getPaymentMeans().add(paymentMeans);
			PaymentTermsType paymentTerms = null;
			IDType idPaymentTerms = null;
			PaymentPercentType porcentajeDetraccion = null;
			AmountType montoDetraccion = null;
			BigDecimal montoDetra = BigDecimal.ZERO;
			for (DetalleComprobanteDTO detalleComprobante : comprobante.getDetalleComprobante()){
				if (detalleComprobante.getProducto().isAplicaDetraccion()){
					idPaymentTerms = new IDType();
					idPaymentTerms.setValue(detalleComprobante.getProducto().getCodigoProducto());
					
					porcentajeDetraccion = new PaymentPercentType();
					porcentajeDetraccion.setValue(detalleComprobante.getProducto().getPorcentajeDetraccion());
					
					montoDetra = UtilEjb.convertirABigDecimal(detalleComprobante.getCantidad());
					montoDetra = montoDetra.multiply(detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto());
					montoDetra = montoDetra.multiply(detalleComprobante.getProducto().getPorcentajeDetraccion());
					
					montoDetraccion = new AmountType();
					montoDetraccion.setValue(montoDetra);
					
					paymentTerms = new PaymentTermsType();
					paymentTerms.setID(idPaymentTerms);
					paymentTerms.setPaymentPercent(porcentajeDetraccion);
					paymentTerms.setAmount(montoDetraccion);
					invoice.getPaymentTerms().add(paymentTerms);
				}
			}
			invoice.getPrepaidPayment().add(paymentType);
			invoice.getAllowanceCharge().add(allowanceCharge);
			invoice.getTaxTotal().add(taxTotal);
			invoice.setLegalMonetaryTotal(monetaryTotal);
			InvoiceLineType invoiceLine = null;
			IDType idLine = null;
			for (int i=0; i<comprobante.getDetalleComprobante().size(); i++){
				DetalleComprobanteDTO detalleComprobante = comprobante.getDetalleComprobante().get(i);
				idLine = new IDType();
				idLine.setValue(String.valueOf((i+1)));
				
				InvoicedQuantityType cantidad = new InvoicedQuantityType();
				cantidad.setValue(UtilEjb.convertirABigDecimal(detalleComprobante.getCantidad()));
				cantidad.setUnitCode(detalleComprobante.getUnidadMedida());
				
				LineExtensionAmountType lineExtensionAmountDetalle = new LineExtensionAmountType();
				lineExtensionAmountDetalle.setValue(detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto().multiply(UtilEjb.convertirABigDecimal(detalleComprobante.getCantidad())));
				lineExtensionAmountDetalle.setCurrencyID(detalleComprobante.getPrecioVentaUnitario().getMonto().getMoneda().getCodigoInternacional());

				PriceAmountType priceAmountDetalle = new PriceAmountType();
				priceAmountDetalle.setValue(detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto());
				priceAmountDetalle.setCurrencyID(detalleComprobante.getPrecioVentaUnitario().getMonto().getMoneda().getCodigoInternacional());
				
				PriceTypeCodeType priceTypeCode = new PriceTypeCodeType();
				priceTypeCode.setValue(detalleComprobante.getPrecioVentaUnitario().getCodigoTipoPrecio());
				
				PriceType priceType = new PriceType();
				priceType.setPriceAmount(priceAmountDetalle);
				priceType.setPriceTypeCode(priceTypeCode);
				
				PricingReferenceType pricingReference = new PricingReferenceType();
				pricingReference.getAlternativeConditionPrice().add(priceType);
				
				IDType idPartyIdentificacion = new IDType();
				idPartyIdentificacion.setValue(detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento());
				idPartyIdentificacion.setSchemeID(detalleComprobante.getHuesped().getDocumentoIdentidad().getTipoDocumento().getCodigo());
				idPartyIdentificacion.setSchemeAgencyID(detalleComprobante.getHuesped().getDocumentoIdentidad().getTipoDocumento().getAgenciaId());
				
				PartyIdentificationType partyIdentificacion = new PartyIdentificationType();
				partyIdentificacion.setID(idPartyIdentificacion);
				
				PartyType deliveryPartyDetalle = new PartyType();
				deliveryPartyDetalle.getPartyIdentification().add(partyIdentificacion);
				
				DeliveryType deliveryDetalle = new DeliveryType();
				deliveryDetalle.setDeliveryParty(deliveryPartyDetalle);
				
				invoiceLine = new InvoiceLineType();
				invoiceLine.setID(idLine);
				invoiceLine.setInvoicedQuantity(cantidad);
				invoiceLine.setLineExtensionAmount(lineExtensionAmountDetalle);
				invoiceLine.setPricingReference(pricingReference);
				invoiceLine.getDelivery().add(deliveryDetalle);
				
				invoice.getInvoiceLine().add(invoiceLine);
			}
			
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
