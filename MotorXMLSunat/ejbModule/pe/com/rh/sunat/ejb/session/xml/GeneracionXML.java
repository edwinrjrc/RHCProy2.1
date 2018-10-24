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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OccurrenceDateType;
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
import pe.com.rh.sunat.ejb.util.UtilConvertirNumeroLetras;
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
    
    @Override
    public byte[] generarXML(ComprobanteDTO comprobante){
    	try {
			NoteType noteType = new NoteType();
			noteType.setValue(UtilConvertirNumeroLetras.convertirNumeroALetras(comprobante.getTotalComprobante().getMonto().doubleValue()));
			noteType.setLanguageLocaleID("1000");
			
			DocumentReferenceType contratoReference = new DocumentReferenceType();
			contratoReference.setID(UtilUBL.generarIdType(comprobante.getServicioReferenciaDTO().getNumeroSuministro()));
			contratoReference.setDocumentTypeCode(UtilUBL.generarDocumentTypeCode(comprobante.getServicioReferenciaDTO().getTipoServicio()));
			contratoReference.setLocaleCode(UtilUBL.generarLocaleCode(comprobante.getServicioReferenciaDTO().getCodigoServicio()));
			contratoReference.setDocumentStatusCode(UtilUBL.generarDocumentStatusCode(comprobante.getServicioReferenciaDTO().getCodigoTipoTarifa()));
			
			DocumentReferenceType addDocumentReference = new DocumentReferenceType();
			addDocumentReference.setID(UtilUBL.generarIdType(comprobante.getComprobanteRelacionado().getNumeroComprobante()));
			addDocumentReference.setDocumentTypeCode(UtilUBL.generarDocumentTypeCode(comprobante.getComprobanteRelacionado().getTipoComprobante()));
			
			AddressTypeCodeType codigoTipoDireccion = new AddressTypeCodeType();
			AddressType direccionEmisor = new AddressType();
			
			PartyType partyEmisor = new PartyType();
			for (PersonaDTO emisor : comprobante.getListaEmisores()){
				partyEmisor.getPartyName().add(UtilUBL.generarPartyName(emisor.getNombreComercial()));
			}
			PartyTaxSchemeType partyTaxSchemaEmisor = null;
			for (PersonaDTO emisor : comprobante.getListaEmisores()){
				codigoTipoDireccion.setValue(UtilUBL.parsearDatoSiNull(emisor.getDireccion().getCodigo(), "0000"));
				direccionEmisor.setAddressTypeCode(codigoTipoDireccion);
				
				partyTaxSchemaEmisor = new PartyTaxSchemeType();
				partyTaxSchemaEmisor.setRegistrationName(UtilUBL.generarRegistrationName(emisor.getNombrePersona()));
				partyTaxSchemaEmisor.setCompanyID(UtilUBL.generarCompanyId(emisor.getDocumentoIdentidad().getNumeroDocumento()));
				partyTaxSchemaEmisor.setRegistrationAddress(direccionEmisor);
				partyEmisor.getPartyTaxScheme().add(partyTaxSchemaEmisor);
			}
			SupplierPartyType emisor = new SupplierPartyType();
			emisor.setParty(partyEmisor);
			
			PartyTaxSchemeType partyTaxSchemaAdquiriente = null;
			
			AddressTypeCodeType codigoTipoDireccionAdquiriente = new AddressTypeCodeType();
			AddressType direccionAdquiriente = new AddressType();
			
			PartyType partyAdquiriente = new PartyType();
			for (PersonaDTO persona : comprobante.getListaAdquiriente()){
				codigoTipoDireccionAdquiriente.setValue(UtilUBL.parsearDatoSiNull(persona.getDireccion().getCodigo(), "0000"));
				direccionAdquiriente.setAddressTypeCode(codigoTipoDireccion);
				
				partyTaxSchemaAdquiriente = new PartyTaxSchemeType();
				partyTaxSchemaAdquiriente.setRegistrationName(UtilUBL.generarRegistrationName(persona.getNombrePersona()));
				partyTaxSchemaAdquiriente.setRegistrationAddress(direccionAdquiriente);
				partyTaxSchemaAdquiriente.setCompanyID(UtilUBL.generarCompanyId(persona.getDocumentoIdentidad().getNumeroDocumento()));
				
				partyAdquiriente.getPartyTaxScheme().add(partyTaxSchemaAdquiriente);
			}
			
			CustomerPartyType adquiriente = new CustomerPartyType();
			adquiriente.setParty(partyAdquiriente);
			
			AmountType amountDelivery = new AmountType();
			amountDelivery.setValue(comprobante.getTotalComprobante().getMonto());
			amountDelivery.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
			
			DireccionDTO direccionLlegada = comprobante.getListaDireccionLlegada().get(0);
			CountryType country = new CountryType();
			country.setIdentificationCode(UtilUBL.generarIdentificationCode(direccionLlegada.getUbigeo().getCodigoPais()));
			
			AddressType addressLocation = new AddressType();
			addressLocation.setStreetName(UtilUBL.generarStreetName(direccionLlegada.getDireccionCompleta()));
			addressLocation.setCitySubdivisionName(UtilUBL.generarCitySubdivision(direccionLlegada.getUrbanizacion()));
			addressLocation.setCityName(UtilUBL.generarCityName(direccionLlegada.getUbigeo().getNombreProvincia()));
			addressLocation.setCountrySubentity(UtilUBL.generarCountrySubentity(direccionLlegada.getUbigeo().getNombreDepartamento()));
			addressLocation.setCountrySubentityCode(UtilUBL.generarCountrySubentityCode(direccionLlegada.getUbigeo().getCodigoUbigeoInei()));
			addressLocation.setDistrict(UtilUBL.generarDistrict(direccionLlegada.getUbigeo().getNombreDistrito()));
			addressLocation.setCountry(country);
			
			LocationType deliveryLocationTerms = new LocationType();
			deliveryLocationTerms.setAddress(addressLocation);
			
			DeliveryTermsType deliveryTerms = new DeliveryTermsType();
			deliveryTerms.setID(UtilUBL.generarIdType(comprobante.getNumeroRegistroMTC()));
			deliveryTerms.setAmount(amountDelivery);
			deliveryTerms.setDeliveryLocation(deliveryLocationTerms);

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
			
			PayableAmountType payableAmount = new PayableAmountType();
			payableAmount.setValue(comprobante.getTotalComprobante().getMonto());
			payableAmount.setCurrencyID(comprobante.getTotalComprobante().getMoneda().getCodigoInternacional());
			
			ObjectFactory factory = new ObjectFactory();
			InvoiceType invoice = factory.createInvoiceType();
			invoice.setID(UtilUBL.generarIdType(comprobante.getNumeroSerie()+"-"+comprobante.getCorrelativo()));
			invoice.setUBLVersionID(UtilUBL.generarUBLVersion(comprobante.getVersionUBL()));
			invoice.setCustomizationID(UtilUBL.generarCustomizationId(comprobante.getVersionDocumento()));
			invoice.setProfileID(UtilUBL.generarProfileId(comprobante.getProfileId()));
			invoice.setIssueDate(UtilUBL.generarIssueDate(comprobante.getFechaEmision()));
			invoice.setIssueTime(UtilUBL.generarIssueTime(comprobante.getFechaEmision()));
			invoice.setDueDate(UtilUBL.generarDueDate(comprobante.getFechaVencimiento()));
			invoice.setInvoiceTypeCode(UtilUBL.generarInvoiceTypeCode(comprobante.getTipoComprobante()));
			NoteType nota = null;
			for (BaseVODTO baseVO : comprobante.getListaNotas()){
				nota = new NoteType();
				nota.setLanguageID(baseVO.getCodigo());
				nota.setValue(baseVO.getValor());
				invoice.getNote().add(nota);
			}
			invoice.setDocumentCurrencyCode(UtilUBL.generarDocumentCurrencyCode(comprobante.getMonedaComprobante()));
			invoice.setLineCountNumeric(UtilUBL.generarLineCount(comprobante.getDetalleComprobante().size()));
			PeriodType periodoTipo = null;
			for (PeriodoDTO periodo : comprobante.getPeriodoFacturacion()){
				periodoTipo = new PeriodType();
				periodoTipo.setStartDate(UtilUBL.generarStartDate(periodo.getFechaInicioFacturacion()));
				periodoTipo.setEndDate(UtilUBL.generarEndDate(periodo.getFechaFinFacturacion()));
				invoice.getInvoicePeriod().add(periodoTipo);
			}
			invoice.setOrderReference(UtilUBL.generarOrderReference(comprobante.getNumeroOrdenCompra()));
			DocumentReferenceType documentReference = null;
			for (ComprobanteRelacionadoDTO compro : comprobante.getListaGuiaRelacionada()){
				documentReference = new DocumentReferenceType();
				documentReference.setID(UtilUBL.generarIdType(compro.getNumeroComprobante()));
				documentReference.setDocumentTypeCode(UtilUBL.generarDocumentTypeCode(compro.getTipoComprobante()));
				invoice.getDespatchDocumentReference().add(documentReference);
			}
			invoice.getContractDocumentReference().add(contratoReference);
			invoice.getAdditionalDocumentReference().add(addDocumentReference);
			invoice.setAccountingSupplierParty(emisor);
			invoice.setAccountingCustomerParty(adquiriente);
			
			DeliveryType delivery = null;
			LocationType deliveryLocation = null;
			ShipmentType shipment = null;
			ShipmentStageType shipmentStage = null;
			TransportMeansType transportMeans = null;
			PersonType conductor = null;
			PartyType carrierParty = null;
			PartyLegalEntityType carrierLegalEntity = null;
			for (EntregaDTO entrega : comprobante.getListaEntregas()){
				for (TransporteDTO transporte : comprobante.getListaTransportes()){
					shipmentStage = new ShipmentStageType();
					shipmentStage.setTransportModeCode(UtilUBL.generarTransportMode(transporte.getModalidadTraslado()));
					shipmentStage.setTransitPeriod(UtilUBL.generarPeriod(transporte.getFechaInicioTraslado()));
					
					carrierParty = new PartyType();
					for (TransportistaDTO transportista : comprobante.getListaTransportista()){
						carrierLegalEntity = new PartyLegalEntityType();
						carrierLegalEntity.setCompanyID(UtilUBL.generarCompanyId(transportista.getDocumentoIdentidad().getNumeroDocumento()));
						carrierLegalEntity.setRegistrationName(UtilUBL.generarRegistrationName(transportista.getNombrePersona()));
						
						carrierParty.getPartyLegalEntity().add(carrierLegalEntity);
					}
					shipmentStage.getCarrierParty().add(carrierParty);
					transportMeans = new TransportMeansType();
					transportMeans.setRoadTransport(UtilUBL.generarRoadTransport(transporte.getNumeroPlaca()));
					transportMeans.setRegistrationNationalityID(UtilUBL.generarRegistrationNationality(transporte.getNumeroRegistroMTC()));
					shipmentStage.setTransportMeans(transportMeans);
					for (PersonaDTO personaConduce : comprobante.getListaChoferes()){
						conductor = new PersonType();
						conductor.setID(UtilUBL.generarId(personaConduce.getDocumentoIdentidad().getNumeroDocumento()));
						shipmentStage.getDriverPerson().add(conductor);
					}
					shipment.getShipmentStage().add(shipmentStage);
				}
				
				AddressType deliveryAdress = new AddressType();
				deliveryAdress.setCountrySubentityCode(UtilUBL.generarCountrySubentityCode(comprobante.getListaDireccionLlegada().get(0).getCodigoUbigeo()));
				for (DireccionDTO direccion : comprobante.getListaDireccionLlegada()){
					deliveryAdress.getAddressLine().add(UtilUBL.generarAddressLine(direccion.getDireccionCompleta()));
				}
				DeliveryType deliveryShipment = new DeliveryType();
				deliveryShipment.setDeliveryAddress(deliveryAdress);
				deliveryShipment.setDeliveryParty(UtilUBL.generarParty(comprobante.getListaEntregas().get(0).isFlagSubcontratacion()));
				shipment.setDelivery(deliveryShipment);
				
				TransportHandlingUnitType transportHandling = new TransportHandlingUnitType();
				transportHandling.getTransportEquipment().add(UtilUBL.generarTransportEquipment(comprobante.getListaTransportes().get(0).getNumeroPlaca()));
				shipment.getTransportHandlingUnit().add(transportHandling);
				
				AddressType originAddress = new AddressType();
				originAddress.setCountrySubentityCode(UtilUBL.generarCountrySubentityCode(comprobante.getListaDireccionPartida().get(0).getCodigoUbigeo()));
				for (DireccionDTO direccion : comprobante.getListaDireccionPartida()){
					originAddress.getAddressLine().add(UtilUBL.generarAddressLine(direccion.getDireccionCompleta()));
				}
				shipment.setOriginAddress(originAddress);
				
				delivery = new DeliveryType();
				delivery.setID(UtilUBL.generarId(entrega.getNumeroMedidor()));
				delivery.setQuantity(UtilUBL.generarCantidad(entrega.getCantidad()));
				delivery.setMaximumQuantity(UtilUBL.generarMaximunQuantity(entrega.getPotenciaContratada()));
				
				LocationCoordinateType locacion = null;
				deliveryLocation = new LocationType();
				for (UbicacionMedidorDTO ubicacion : entrega.getListaUbicacionesMedidor()){
					locacion = new LocationCoordinateType();
					locacion.setLatitudeDirectionCode(UtilUBL.generarLatitudeDirection(ubicacion.getLatitud()));
					locacion.setLongitudeDirectionCode(UtilUBL.generarLongitudDirection(ubicacion.getLongitud()));
					deliveryLocation.getLocationCoordinate().add(locacion);
				}
				delivery.setDeliveryLocation(deliveryLocation);
				
				PartyType deliveryParty = new PartyType();
				PartyLegalEntityType partyLegalEntity = null;
				for (PersonaDTO destinatario : entrega.getListaDestinatarios()){
					partyLegalEntity = new PartyLegalEntityType();
					partyLegalEntity.setCompanyID(UtilUBL.generarCompanyId(destinatario.getDocumentoIdentidad().getNumeroDocumento()));
					partyLegalEntity.setRegistrationName(UtilUBL.generarRegistrationName(destinatario.getNombrePersona()));
					deliveryParty.getPartyLegalEntity().add(partyLegalEntity);
				}
				delivery.setDeliveryParty(deliveryParty);
				
				shipment = new ShipmentType();
				shipment.setHandlingCode(UtilUBL.generarHandlingCode(entrega.getMotivoTraslado()));
				shipment.setGrossWeightMeasure(UtilUBL.generarWeightMeasure(entrega.getPesoBruto()));
				delivery.setShipment(shipment);
				invoice.getDelivery().add(delivery);
			}
			
			invoice.setDeliveryTerms(deliveryTerms);
			FinancialAccountType payeeFinancialAccount = null;
			PaymentMeansType paymentMeans = null;
			for (String numeroCuenta : comprobante.getListaNumeroCuentaDetraccion()){
				payeeFinancialAccount = new FinancialAccountType();
				payeeFinancialAccount.setID(UtilUBL.generarIdType(numeroCuenta));
				paymentMeans = new PaymentMeansType();
				paymentMeans.setPayeeFinancialAccount(payeeFinancialAccount);
				
				invoice.getPaymentMeans().add(paymentMeans);
			}
			PaymentTermsType paymentTerms = null;
			PaymentPercentType porcentajeDetraccion = null;
			AmountType montoDetraccion = null;
			BigDecimal montoDetra = BigDecimal.ZERO;
			for (DetalleComprobanteDTO detalleComprobante : comprobante.getDetalleComprobante()){
				if (detalleComprobante.getProducto().isAplicaDetraccion()){
					porcentajeDetraccion = new PaymentPercentType();
					porcentajeDetraccion.setValue(detalleComprobante.getProducto().getPorcentajeDetraccion());
					
					montoDetra = UtilEjb.convertirABigDecimal(detalleComprobante.getCantidad().getValor());
					montoDetra = montoDetra.multiply(detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto());
					montoDetra = montoDetra.multiply(detalleComprobante.getProducto().getPorcentajeDetraccion());
					
					montoDetraccion = new AmountType();
					montoDetraccion.setValue(montoDetra);
					
					paymentTerms = new PaymentTermsType();
					paymentTerms.setID(UtilUBL.generarId(detalleComprobante.getProducto().getCodigoProducto()));
					paymentTerms.setPaymentPercent(porcentajeDetraccion);
					paymentTerms.setAmount(montoDetraccion);
					invoice.getPaymentTerms().add(paymentTerms);
				}
			}
			PaidAmountType paidAmount = null;
			PaymentType paymentType = null;
			for (ComprobanteAnticipoDTO comproAnticipo : comprobante.getListaComprobantesAnticipo()){
				paidAmount = new PaidAmountType();
				paidAmount.setValue(comproAnticipo.getMontoComprobante().getMonto());
				paidAmount.setCurrencyID(comproAnticipo.getMontoComprobante().getMoneda().getCodigoInternacional());
				
				paymentType = new PaymentType();
				paymentType.setID(UtilUBL.generarId(comproAnticipo.getNumeroComprobanteAnticipo()));
				paymentType.setPaidAmount(paidAmount);
				paymentType.setInstructionID(UtilUBL.generarInstructionId(comproAnticipo.getDocumentoIdentidadEmisor()));
				
				invoice.getPrepaidPayment().add(paymentType);
			}
			
			AmountType montoCargoDescuento = null;
			BaseAmountType baseAmount = null;
			AllowanceChargeType allowanceCharge = null;
			for (DescuentoDTO descuento : comprobante.getListaDescuentos()){
				montoCargoDescuento = new AmountType();
				montoCargoDescuento.setValue(descuento.getMontoCargoDescuento().getMonto());
				montoCargoDescuento.setCurrencyID(descuento.getMontoCargoDescuento().getMoneda().getCodigoInternacional());
				
				baseAmount = new BaseAmountType();
				baseAmount.setValue(descuento.getMontoBaseCargoDescuento().getMonto());
				baseAmount.setCurrencyID(descuento.getMontoBaseCargoDescuento().getMoneda().getCodigoInternacional());
				
				allowanceCharge = new AllowanceChargeType();
				allowanceCharge.setChargeIndicator(UtilUBL.generarChargeIndicator(descuento.isFlagCargoDescuento()));
				allowanceCharge.setAllowanceChargeReasonCode(UtilUBL.generarAllowanceChargeReasonCode(descuento.getCodigoMotivoCargoDescuento()));
				allowanceCharge.setMultiplierFactorNumeric(UtilUBL.generarMultiplierFactorNumeric(descuento.getFactorCargoDescuento()));
				allowanceCharge.setAmount(montoCargoDescuento);
				allowanceCharge.setBaseAmount(baseAmount);
				
				invoice.getAllowanceCharge().add(allowanceCharge);
			}
			TaxAmountType taxAmount = new TaxAmountType();
			taxAmount.setValue(comprobante.getMontoTotalImpuestos().getMonto());
			taxAmount.setCurrencyID(comprobante.getMontoTotalImpuestos().getMoneda().getCodigoInternacional());
			
			TaxTotalType taxTotal = new TaxTotalType();
			taxTotal.setTaxAmount(taxAmount);
			
			TaxableAmountType taxableAmount = null;
			TaxAmountType taxAmountSubtotal = null;
			TaxSchemeType taxScheme = null;
			TaxCategoryType taxCategory = null;
			TaxSubtotalType taxSubtotal = null;
			for (MontoOperacionDTO montoOperacion : comprobante.getListaMontoOperaciones()){
				taxableAmount = new TaxableAmountType();
				taxableAmount.setValue(montoOperacion.getMontoOperacion().getMonto());
				taxableAmount.setCurrencyID(montoOperacion.getMontoOperacion().getMoneda().getCodigoInternacional());
				
				taxAmountSubtotal = new TaxAmountType();
				taxAmountSubtotal.setValue(comprobante.getMontoTotalImpuestos().getMonto());
				taxAmountSubtotal.setCurrencyID(comprobante.getMontoTotalImpuestos().getMoneda().getCodigoInternacional());
				
				taxScheme = new TaxSchemeType();
				taxScheme.setID(UtilUBL.generarId(montoOperacion.getCodigoTributo()));
				taxScheme.setName(UtilUBL.generarName(comprobante.getCodigoTributo().getValor()));
				taxScheme.setTaxTypeCode(UtilUBL.generarTaxTypeCode(comprobante.getCodigoTributo().getCodigo()));
				
				taxCategory = new TaxCategoryType();
				taxCategory.setID(UtilUBL.generarIdType(comprobante.getCodigoCategoriaImpuesto().getCodigo()));
				taxCategory.setTaxScheme(taxScheme);
				
				taxSubtotal = new TaxSubtotalType();
				taxSubtotal.setTaxableAmount(taxableAmount);
				taxSubtotal.setTaxAmount(taxAmountSubtotal);
				taxSubtotal.setTaxCategory(taxCategory);
				
				taxTotal.getTaxSubtotal().add(taxSubtotal);
			}
			invoice.getTaxTotal().add(taxTotal);
			
			ComprobanteAnticipoDTO comprobanteAnticipo = comprobante.getListaComprobantesAnticipo().get(0);
			
			PrepaidAmountType prepaidAmount = new PrepaidAmountType();
			prepaidAmount.setValue(comprobanteAnticipo.getMontoComprobante().getMonto());
			prepaidAmount.setCurrencyID(comprobanteAnticipo.getMontoComprobante().getMoneda().getCodigoInternacional());
			
			MonetaryTotalType monetaryTotal = new MonetaryTotalType();
			monetaryTotal.setLineExtensionAmount(lineExtensionAmount);
			monetaryTotal.setTaxInclusiveAmount(taxInclusiveAmount);
			monetaryTotal.setAllowanceTotalAmount(allowanceTotalAmount);
			monetaryTotal.setChargeTotalAmount(chargeTotalAmount);
			monetaryTotal.setPrepaidAmount(prepaidAmount);
			monetaryTotal.setPayableAmount(payableAmount);
			invoice.setLegalMonetaryTotal(monetaryTotal);
			
			InvoiceLineType invoiceLine = null;
			PricingReferenceType pricingReference = null;
			PartyIdentificationType partyIdentificacion = null;
			CountryType pais = null;
			AllowanceChargeType allowanceChargeDetalle = null;
			AmountType montoCargoDescuentoDetalle = null;
			BaseAmountType baseMontoCargoDescuento = null;
			for (int i=0; i<comprobante.getDetalleComprobante().size(); i++){
				DetalleComprobanteDTO detalleComprobante = comprobante.getDetalleComprobante().get(i);

				LineExtensionAmountType lineExtensionAmountDetalle = new LineExtensionAmountType();
				lineExtensionAmountDetalle.setValue(detalleComprobante.getPrecioVentaUnitario().getMonto().getMonto().multiply(UtilEjb.convertirABigDecimal(detalleComprobante.getCantidad().getValor())));
				lineExtensionAmountDetalle.setCurrencyID(detalleComprobante.getPrecioVentaUnitario().getMonto().getMoneda().getCodigoInternacional());

				pricingReference = new PricingReferenceType();
				PriceType priceType = null;
				PriceAmountType priceAmountDetalle = null;
				for (PrecioDetalleDTO precio : detalleComprobante.getListaPrecios()){
					priceAmountDetalle = new PriceAmountType();
					priceAmountDetalle.setValue(precio.getPrecio().getMonto());
					priceAmountDetalle.setCurrencyID(precio.getPrecio().getMoneda().getCodigoInternacional());
					
					priceType = new PriceType();
					priceType.setPriceAmount(priceAmountDetalle);
					priceType.setPriceTypeCode(UtilUBL.generarPriceTypeCode(precio.getTipoPrecio()));
					
					pricingReference.getAlternativeConditionPrice().add(priceType);
				}
				partyIdentificacion = new PartyIdentificationType();
				partyIdentificacion.setID(UtilUBL.generarId(detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento()));
				
				PartyNameType partyNameHuesped = new PartyNameType();
				partyNameHuesped.setName(UtilUBL.generarName(detalleComprobante.getHuesped().getNombrePersona()));
				
				pais = new CountryType();
				pais.setIdentificationCode(UtilUBL.generarIdentificationCode(detalleComprobante.getHuesped().getDireccion().getUbigeo().getCodigoPais()));
				
				AddressType postalAdress = new AddressType();
				postalAdress.setCountry(pais);
				
				PersonType personHuesped = new PersonType();
				personHuesped.setID(UtilUBL.generarId(detalleComprobante.getHuesped().getDocumentoIdentidad().getNumeroDocumento()));
				personHuesped.setFirstName(UtilUBL.generarFirstName(detalleComprobante.getHuesped().getNombrePersona()));
				
				PartyType deliveryPartyDetalle = new PartyType();
				deliveryPartyDetalle.getPartyIdentification().add(partyIdentificacion);
				deliveryPartyDetalle.getPartyName().add(UtilUBL.generarPartyName(detalleComprobante.getHuesped().getNombrePersona()));
				deliveryPartyDetalle.setPostalAddress(postalAdress);
				deliveryPartyDetalle.getPerson().add(personHuesped);
				
				DeliveryType deliveryPasajero = new DeliveryType();
				deliveryPasajero.setDeliveryAddress(UtilUBL.generarAddress(detalleComprobante.getCiudadDestino().getCodigoUbigeoInei()));
				
				AddressType originAddressPasajero = new AddressType();
				originAddressPasajero.setCountrySubentityCode(UtilUBL.generarCountrySubentityCode(detalleComprobante.getCiudadOrigen().getCodigoUbigeoInei()));
				
				ShipmentType shipmentDelivery = new ShipmentType();
				ShipmentStageType shipmentStagePasajero = null;
				TransportEventType departureTransport = null;
				OccurrenceDateType fechaOcurencia = null;
				PersonType pasajero = null;
				FirstNameType nombrePasajero = null;
				for (ProductoServicioDTO proServicio : detalleComprobante.getListaProductoServicio()){
					fechaOcurencia = new OccurrenceDateType();
					fechaOcurencia.setValue(UtilEjb.convertirDateAGregorian(proServicio.getFechaInicioProgramado()));
					
					departureTransport = new TransportEventType();
					departureTransport.setOccurrenceDate(fechaOcurencia);
					
					shipmentStagePasajero = new ShipmentStageType();
					shipmentStagePasajero.setID(UtilUBL.generarId(proServicio.getNumeroAsiento()));
					shipmentStagePasajero.setPlannedDepartureTransportEvent(departureTransport);
					for (PersonaDTO paxs : proServicio.getListaPasajeros()){
						nombrePasajero = new FirstNameType();
						nombrePasajero.setValue(paxs.getNombrePersona());
						
						pasajero = new PersonType();
						pasajero.setID(UtilUBL.generarId(paxs.getDocumentoIdentidad().getNumeroDocumento()));
						pasajero.setFirstName(nombrePasajero);
						
						shipmentStagePasajero.getPassengerPerson().add(pasajero);
					}
					shipmentDelivery.getShipmentStage().add(shipmentStagePasajero);
				}
				shipmentDelivery.setDelivery(deliveryPasajero);
				shipmentDelivery.setOriginAddress(originAddressPasajero);
				
				DeliveryType deliveryDetalle = new DeliveryType();
				deliveryDetalle.setDeliveryParty(deliveryPartyDetalle);
				deliveryDetalle.setShipment(shipmentDelivery);
				
				invoiceLine = new InvoiceLineType();
				invoiceLine.setID(UtilUBL.generarIdType(String.valueOf((i+1))));
				invoiceLine.setInvoicedQuantity(UtilUBL.generarInvoicedQuantity(detalleComprobante.getCantidad()));
				invoiceLine.setLineExtensionAmount(lineExtensionAmountDetalle);
				invoiceLine.setPricingReference(pricingReference);
				invoiceLine.getDelivery().add(deliveryDetalle);
				
				for (DescuentoDTO dscto : detalleComprobante.getListaDescuento()){
					montoCargoDescuentoDetalle = new AmountType();
					montoCargoDescuentoDetalle.setValue(dscto.getMontoCargoDescuento().getMonto());
					montoCargoDescuentoDetalle.setCurrencyID(dscto.getMontoCargoDescuento().getMoneda().getCodigoInternacional());
					
					baseMontoCargoDescuento = new BaseAmountType();
					baseMontoCargoDescuento.setValue(dscto.getMontoBaseCargoDescuento().getMonto());
					baseMontoCargoDescuento.setCurrencyID(dscto.getMontoBaseCargoDescuento().getMoneda().getCodigoInternacional());
					
					allowanceChargeDetalle = new AllowanceChargeType();
					allowanceChargeDetalle.setChargeIndicator(UtilUBL.generarChargeIndicator(dscto.isFlagCargoDescuento()));
					allowanceChargeDetalle.setAllowanceChargeReasonCode(UtilUBL.generarAllowanceChargeReasonCode(dscto.getCodigoMotivoCargoDescuento()));
					allowanceChargeDetalle.setMultiplierFactorNumeric(UtilUBL.generarMultiplierFactorNumeric(dscto.getFactorCargoDescuento()));
					allowanceChargeDetalle.setAmount(montoCargoDescuentoDetalle);
					allowanceChargeDetalle.setBaseAmount(baseMontoCargoDescuento);
					
					invoiceLine.getAllowanceCharge().add(allowanceChargeDetalle);
				}
				
				TaxTotalType taxTotalDetalle = null;
				TaxAmountType taxAmountDetalle = null;
				TaxableAmountType taxableAmountDetalle = null;
				TaxAmountType taxAmountSubtotal2 = null;
				TaxCategoryType taxCategoryDetalle = null;
				TaxSchemeType taxSchemeCategory = null;
				for (AfectacionImptoDTO afecImpto : detalleComprobante.getAfectacionImpuestos()){
					taxAmountDetalle = new TaxAmountType();
					taxAmountDetalle.setValue(afecImpto.getTotalImpuesto().getMonto());
					taxAmountDetalle.setCurrencyID(afecImpto.getTotalImpuesto().getMoneda().getCodigoInternacional());
					
					taxableAmountDetalle = new TaxableAmountType();
					taxableAmountDetalle.setValue(detalleComprobante.getMontoTotal().getMonto());
					taxableAmountDetalle.setCurrencyID(detalleComprobante.getMontoTotal().getMoneda().getCodigoInternacional());
					
					taxAmountSubtotal2 = new TaxAmountType();
					taxAmountSubtotal2.setValue(afecImpto.getTotalImpuesto().getMonto());
					taxAmountSubtotal2.setCurrencyID(afecImpto.getTotalImpuesto().getMoneda().getCodigoInternacional());
					
					taxSchemeCategory = new TaxSchemeType();
					taxSchemeCategory.setID(UtilUBL.generarId(afecImpto.getTributo().getCodigoInternacional()));
					taxSchemeCategory.setName(UtilUBL.generarName(afecImpto.getTributo().getNombre()));
					taxSchemeCategory.setTaxTypeCode(UtilUBL.generarTaxTypeCode(afecImpto.getTributo().getCodigo()));
					
					taxCategoryDetalle = new TaxCategoryType();
					taxCategoryDetalle.setID(UtilUBL.generarId(afecImpto.getCodigoCategoria()));
					taxCategoryDetalle.setPercent(UtilUBL.generarPercent(afecImpto.getPorcentaje()));
					taxCategoryDetalle.setTaxExemptionReasonCode(UtilUBL.generarTaxExemptionReasonCode(afecImpto.getAfectacion()));
					taxCategoryDetalle.setTierRange(UtilUBL.generarTierRange(afecImpto.getCodigoSistemaIsc().getCodigo()));
					taxCategoryDetalle.setTaxScheme(taxSchemeCategory);
					
					TaxSubtotalType taxSubtotalDetalle = new TaxSubtotalType();
					taxSubtotalDetalle.setTaxableAmount(taxableAmountDetalle);
					taxSubtotalDetalle.setTaxAmount(taxAmountSubtotal2);
					taxSubtotalDetalle.setTaxCategory(taxCategoryDetalle);
					
					taxTotalDetalle = new TaxTotalType();
					taxTotalDetalle.setTaxAmount(taxAmountDetalle);
					taxTotalDetalle.getTaxSubtotal().add(taxSubtotalDetalle);
					
					invoiceLine.getTaxTotal().add(taxTotalDetalle);
				}
				ItemIdentificationType sellersItemIdentification = new ItemIdentificationType();
				sellersItemIdentification.setID(UtilUBL.generarId(detalleComprobante.getProducto().getCodigoProducto()));
				
				CommodityClassificationType commodityClassification = new CommodityClassificationType();
				commodityClassification.setItemClassificationCode(UtilUBL.generarItemClassificationCode(detalleComprobante.getProducto().getCodigoProductoSunat()));
				
				ItemType itemDetalle = null;
				for (String descripcion : detalleComprobante.getProducto().getListaDescripcionProducto()){
					itemDetalle = new ItemType();
					itemDetalle.getDescription().add(UtilUBL.generarDescription(descripcion));
					
					itemDetalle.getCommodityClassification().add(commodityClassification);
				}
				itemDetalle.setSellersItemIdentification(sellersItemIdentification);
				
				
				PeriodType usabilityPeriodo = null;
				for (PropiedadesAdicionalesDTO propiedad : detalleComprobante.getListaPropiedadesAdicionales()){
					usabilityPeriodo = new PeriodType();
					usabilityPeriodo.setStartDate(UtilUBL.generarStartDate(propiedad.getFechaInicio()));
					usabilityPeriodo.setEndDate(UtilUBL.generarEndDate(propiedad.getFechaFin()));
					
					ItemPropertyType adicionalProperty = new ItemPropertyType();
					adicionalProperty.setName(UtilUBL.generarName(propiedad.getNombreConceptoTributario()));
					adicionalProperty.setNameCode(UtilUBL.generarNameCode(propiedad.getCodigoConceptoTributario()));
					adicionalProperty.setValue(UtilUBL.generarValue(propiedad.getItem().getValor()));
					adicionalProperty.getValueQualifier().add(UtilUBL.generarValueQualifier(propiedad.getItem().getCodigo()));
					adicionalProperty.setUsabilityPeriod(usabilityPeriodo);
					
					itemDetalle.getAdditionalItemProperty().add(adicionalProperty);
				}
				PriceAmountType priceAmountDetalle2 = new PriceAmountType();
				priceAmountDetalle2.setValue(detalleComprobante.getMontoTotal().getMonto());
				priceAmountDetalle2.setCurrencyID(detalleComprobante.getMontoTotal().getMoneda().getCodigoInternacional());
				
				PriceType price = new PriceType();
				price.setPriceAmount(priceAmountDetalle2);
				
				invoice.getInvoiceLine().add(invoiceLine);
				invoiceLine.setItem(itemDetalle);
				invoiceLine.setPrice(price);
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
