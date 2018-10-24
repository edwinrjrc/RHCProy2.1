/**
 * 
 */
package pe.com.rh.sunat.ejb.util;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.commons.lang.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CountryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.OrderReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyNameType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.RoadTransportType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransportEquipmentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AllowanceChargeReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CityNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CitySubdivisionNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DistrictType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoiceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoicedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ItemClassificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LicensePlateIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineCountNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LocaleCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkAttentionIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MultiplierFactorNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNationalityIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxExemptionReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TierRangeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportModeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueQualifierType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueType;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.CodeType;
import pe.com.rhsistemas.sunat.comprobantes.base.CantidadDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.CodigoDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.IdDTO;
import pe.com.rhsistemas.sunat.comprobantes.base.MedidaDTO;
import un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.IdentifierType;
import un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.MeasureType;

/**
 * @author Edwin
 *
 */
public class UtilUBL {

	public static IDType generarIdType(String valor) {
		IDType idValor = new IDType();
		idValor.setValue(valor);
		return idValor;
	}
	
	public static LineType generarLineType(String valor){
		LineType tipoLinea = new LineType();
		tipoLinea.setValue(valor);
		return tipoLinea;
	}
	
	public static DocumentTypeCodeType generarDocCodeType(String valor){
		DocumentTypeCodeType doc = new DocumentTypeCodeType();
		doc.setValue(valor);
		return doc;
	}
	
	public static UBLVersionIDType generarUBLVersion(String valor){
		UBLVersionIDType versionUbl = new UBLVersionIDType();
		versionUbl.setValue(valor);
		return versionUbl;
	}
	
	public static CustomizationIDType generarCustomizationId(String valor){
		CustomizationIDType customizacionId = new CustomizationIDType();
		customizacionId.setValue(valor);
		return customizacionId;
	}
	
	public static ProfileIDType generarProfileId(IdDTO valor){
		ProfileIDType profileType = (ProfileIDType) generarIdentifier(valor);
		return profileType;
	}
	
	public static CompanyIDType generarCompanyId(IdDTO valor){
		CompanyIDType company = (CompanyIDType) generarIdentifier(valor);
		return company;
	}
	
	public static IDType generarId(IdDTO valor){
		IDType id = (IDType) generarIdentifier(valor);
		return id;
	}
	
	public static InstructionIDType generarInstructionId(IdDTO valor){
		InstructionIDType instruccion = (InstructionIDType) generarIdentifier(valor);
		return instruccion;
	}
	
	public static IdentifierType generarIdentifier(IdDTO valor){
		IdentifierType profileType = new IdentifierType();
		profileType.setValue(valor.getValor());
		if (StringUtils.isNotBlank(valor.getEsquemaNombre())){
			profileType.setSchemeName(valor.getEsquemaNombre());
		}
		if (StringUtils.isNotBlank(valor.getEsquemaNombreAgencia())){
			profileType.setSchemeAgencyName(valor.getEsquemaNombreAgencia());
		}
		if (StringUtils.isNotBlank(valor.getEsquemaNombreAgencia())){
			profileType.setSchemeURI(valor.getEsquemaNombreAgencia());
		}
		if (StringUtils.isNotBlank(valor.getEsquemaId())){
			profileType.setSchemeID(valor.getEsquemaId());
		}
		if (StringUtils.isNotBlank(valor.getEsquemaIdAgencia())){
			profileType.setSchemeAgencyID(valor.getEsquemaIdAgencia());
		}
		return profileType;
	}
	
	public static IssueDateType generarIssueDate(Date valor) throws DatatypeConfigurationException{
		IssueDateType issueDateType = new IssueDateType();
		issueDateType.setValue(UtilEjb.convertirDateAGregorian(valor));
		return issueDateType;
	}
	
	public static IssueTimeType generarIssueTime(Date valor) throws DatatypeConfigurationException{
		IssueTimeType issueTimeType = new IssueTimeType();
		issueTimeType.setValue(UtilEjb.convertirDateAGregorian(valor));
		return issueTimeType;
	}
	
	public static DueDateType generarDueDate(Date valor) throws DatatypeConfigurationException{
		DueDateType dueDateType = new DueDateType();
		dueDateType.setValue(UtilEjb.convertirDateAGregorian(valor));
		return dueDateType;
	}
	
	public static InvoiceTypeCodeType generarInvoiceTypeCode(CodigoDTO valor){
		InvoiceTypeCodeType tipoComprobante = (InvoiceTypeCodeType) generarCode(valor);
		return tipoComprobante;
	}
	
	public static DocumentCurrencyCodeType generarDocumentCurrencyCode(CodigoDTO valor){
		DocumentCurrencyCodeType moneda = (DocumentCurrencyCodeType) generarCode(valor);
		return moneda;
	}
	
	public static DocumentTypeCodeType generarDocumentTypeCode(CodigoDTO valor){
		DocumentTypeCodeType document = (DocumentTypeCodeType) generarCode(valor);
		return document;
	}
	
	public static LocaleCodeType generarLocaleCode(CodigoDTO valor){
		LocaleCodeType localCode = (LocaleCodeType) generarCode(valor);
		return localCode;
	}
	
	public static DocumentStatusCodeType generarDocumentStatusCode(CodigoDTO valor){
		DocumentStatusCodeType documentStatus = (DocumentStatusCodeType) generarCode(valor);
		return documentStatus;
	}
	
	public static TransportModeCodeType generarTransportModeCode(CodigoDTO valor){
		TransportModeCodeType transportMode = (TransportModeCodeType) generarCode(valor);
		return transportMode;
	}
	
	public static PriceTypeCodeType generarPriceTypeCode(CodigoDTO valor){
		PriceTypeCodeType tipoPrecio = (PriceTypeCodeType) generarCode(valor);
		return tipoPrecio;
	}
	
	public static GrossWeightMeasureType generarWeightMeasure(MedidaDTO valor){
		GrossWeightMeasureType peso = (GrossWeightMeasureType) generarMeasure(valor);
		return peso;
	}
	
	public static MeasureType generarMeasure(MedidaDTO valor){
		MeasureType measure = new MeasureType();
		measure.setValue(valor.getValor());
		if (StringUtils.isNotBlank(valor.getCodigoUnidad())){
			measure.setUnitCode(valor.getCodigoUnidad());
		}
		if (StringUtils.isNotBlank(valor.getCodigoListaVersionId())){
			measure.setUnitCodeListVersionID(valor.getCodigoListaVersionId());
		}
		return measure;
	}
	
	public static CodeType generarCode(CodigoDTO valor){
		CodeType tipoComprobante = new CodeType();
		tipoComprobante.setValue(valor.getValor());
		if (StringUtils.isNotBlank(valor.getListNombreAgencia())){
			tipoComprobante.setListAgencyName(valor.getListNombreAgencia());
		}
		if (StringUtils.isNotBlank(valor.getListNombre())){
			tipoComprobante.setListName(valor.getListNombre());
		}
		if (StringUtils.isNotBlank(valor.getListURI())){
			tipoComprobante.setListURI(valor.getListURI());
		}
		if (StringUtils.isNotBlank(valor.getListId())){
			tipoComprobante.setListID(valor.getListId());
		}
		
		return tipoComprobante;
	}
	
	public static LineCountNumericType generarLineCount(int numero){
		LineCountNumericType cantidadEnDetalle = new LineCountNumericType();
		cantidadEnDetalle.setValue(UtilEjb.convertirABigDecimal(numero));
		return cantidadEnDetalle;
	}
	
	public static StartDateType generarStartDate(Date fecha) throws DatatypeConfigurationException{
		StartDateType fechaInicio = new StartDateType();
		fechaInicio.setValue(UtilEjb.convertirDateAGregorian(fecha));
		return fechaInicio;
	}
	
	public static EndDateType generarEndDate(Date fecha) throws DatatypeConfigurationException{
		EndDateType fechaFin = new EndDateType();
		fechaFin.setValue(UtilEjb.convertirDateAGregorian(fecha));
		return fechaFin;
	}
	
	public static OrderReferenceType generarOrderReference(String valor){
		OrderReferenceType orderReference = new OrderReferenceType();
		orderReference.setID(generarIdType(valor));
		return orderReference;
	}
	
	public static DocumentStatusCodeType generarDocumentStatus(String valor){
		DocumentStatusCodeType documentStatus = new DocumentStatusCodeType();
		documentStatus.setValue(valor);
		return documentStatus;
	}
	
	public static LocaleCodeType generarLocalCode(String valor){
		LocaleCodeType localeCode = new LocaleCodeType();
		localeCode.setValue(valor);
		return localeCode;
	}
	
	public static NameType generarName(String valor){
		NameType nameType = new NameType();
		nameType.setValue(valor);
		return nameType;
	}
	
	public static RegistrationNameType generarRegistrationName(String valor){
		RegistrationNameType registrationNameEmisor = new RegistrationNameType();
		registrationNameEmisor.setValue(valor);
		return registrationNameEmisor;
	}
	
	public static PartyNameType generarPartyName(String valor){
		PartyNameType partyName = new PartyNameType();
		partyName.setName(UtilUBL.generarName(valor));
		return partyName;
	}
	
	public static MaximumQuantityType generarMaximunQuantity(CantidadDTO valor){
		MaximumQuantityType maximaCantidad = (MaximumQuantityType) generarQuantity(valor);
		return maximaCantidad;
	}
	
	public static LatitudeDirectionCodeType generarLatitudeDirection(String valor){
		LatitudeDirectionCodeType latitudeDirection = new LatitudeDirectionCodeType();
		latitudeDirection.setValue(valor);
		return latitudeDirection;
	}
	
	public static LongitudeDirectionCodeType generarLongitudDirection(String valor){
		LongitudeDirectionCodeType longitudDirection = new LongitudeDirectionCodeType();
		longitudDirection.setValue(valor);
		return longitudDirection;
	}
	
	public static HandlingCodeType generarHandlingCode(CodigoDTO valor){
		HandlingCodeType handlingCode = (HandlingCodeType) generarCode(valor);
		return handlingCode;
	}
	
	public static TransportModeCodeType generarTransportMode(CodigoDTO valor){
		TransportModeCodeType transportModeCode = (TransportModeCodeType) generarCode(valor);
		return transportModeCode;
	}
	
	public static PeriodType generarPeriod(Date fecha) throws DatatypeConfigurationException{
		PeriodType fechaInicioTraslado = new PeriodType();
		fechaInicioTraslado.setStartDate(UtilUBL.generarStartDate(fecha));
		return fechaInicioTraslado;
	}
	
	public static RegistrationNationalityIDType generarRegistrationNationality(String valor){
		RegistrationNationalityIDType registracionNacionalidad = new RegistrationNationalityIDType();
		registracionNacionalidad.setValue(valor);
		return registracionNacionalidad;
	}
	
	public static LicensePlateIDType generarLicensePlate(String valor){
		LicensePlateIDType placaCarro = new LicensePlateIDType();
		placaCarro.setValue(valor);
		return placaCarro;
	}
	
	public static RoadTransportType generarRoadTransport(String valor){
		RoadTransportType roadTransport = new RoadTransportType();
		roadTransport.setLicensePlateID(UtilUBL.generarLicensePlate(valor));
		return roadTransport;
	}
	
	public static CountrySubentityCodeType generarCountrySubentityCode(String valor){
		CountrySubentityCodeType countrySubentity = new CountrySubentityCodeType();
		countrySubentity.setValue(valor);
		return countrySubentity;
	}
	
	public static AddressLineType generarAddressLine(String valor){
		AddressLineType addressLine = new AddressLineType();
		addressLine.setLine(UtilUBL.generarLineType(valor));
		return addressLine;
	}
	
	public static MarkAttentionIndicatorType generarMarkAttention(boolean valor){
		MarkAttentionIndicatorType markAttention = new MarkAttentionIndicatorType();
		markAttention.setValue(valor);
		return markAttention;
	}
	
	public static PartyType generarParty(boolean valor){
		PartyType deliveryShipmentParty = new PartyType();
		deliveryShipmentParty.setMarkAttentionIndicator(UtilUBL.generarMarkAttention(valor));
		return deliveryShipmentParty;
	}
	
	public static TransportEquipmentType generarTransportEquipment(String valor){
		TransportEquipmentType transportEquiment = new TransportEquipmentType();
		transportEquiment.setID(UtilUBL.generarIdType(valor));
		return transportEquiment;
	}
	
	public static StreetNameType generarStreetName(String valor){
		StreetNameType nombreCalle = new StreetNameType();
		nombreCalle.setValue(valor);
		return nombreCalle;
	}
	
	public static CitySubdivisionNameType generarCitySubdivision(String valor){
		CitySubdivisionNameType citySubdivisionName = new CitySubdivisionNameType();
		citySubdivisionName.setValue(valor);
		return citySubdivisionName;
	}
	
	public static CityNameType generarCityName(String valor){
		CityNameType cityName = new CityNameType();
		cityName.setValue(valor);
		return cityName;
	}
	
	public static CountrySubentityType generarCountrySubentity(String valor){
		CountrySubentityType departamento = new CountrySubentityType();
		departamento.setValue(valor);
		return departamento;
	}
	
	public static DistrictType generarDistrict(String valor){
		DistrictType distrito = new DistrictType();
		distrito.setValue(valor);
		return distrito;
	}
	
	public static IdentificationCodeType generarIdentificationCode(String valor){
		IdentificationCodeType identificacionCode = new IdentificationCodeType();
		identificacionCode.setValue(valor);
		return identificacionCode;
	}
	
	public static IdentificationCodeType generarIdentificationCode(CodigoDTO valor){
		IdentificationCodeType identificacionCode = (IdentificationCodeType) generarCode(valor);
		return identificacionCode;
	}
	
	public static CountryType generarCountry(String valor){
		CountryType country = new CountryType();
		country.setIdentificationCode(UtilUBL.generarIdentificationCode(valor));
		return country;
	}
	
	public static ChargeIndicatorType generarChargeIndicator(boolean valor){
		ChargeIndicatorType chargeIndicator = new ChargeIndicatorType();
		chargeIndicator.setValue(valor);
		return chargeIndicator;
	}
	
	public static AllowanceChargeReasonCodeType generarAllowanceChargeReasonCode(String valor){
		AllowanceChargeReasonCodeType allowanceChargeReason = new AllowanceChargeReasonCodeType();
		allowanceChargeReason.setValue(valor);
		return allowanceChargeReason;
	}
	
	public static MultiplierFactorNumericType generarMultiplierFactorNumeric(BigDecimal valor){
		MultiplierFactorNumericType multiplierFactor = new MultiplierFactorNumericType();
		multiplierFactor.setValue(valor);
		return multiplierFactor;
	}
	
	public static TaxTypeCodeType generarTaxTypeCode(String valor){
		TaxTypeCodeType taxTypeCode = new TaxTypeCodeType();
		taxTypeCode.setValue(valor);
		return taxTypeCode;
	}
	
	public static PriceTypeCodeType generarPriceTypeCode(String valor){
		PriceTypeCodeType priceTypeCode = new PriceTypeCodeType();
		priceTypeCode.setValue(valor);
		return priceTypeCode;
	}
	
	public static PercentType generarPercent(BigDecimal valor){
		PercentType porcentaje = new PercentType();
		porcentaje.setValue(valor);
		return porcentaje;
	}
	
	public static TaxExemptionReasonCodeType generarTaxExemptionReasonCode(CodigoDTO valor){
		TaxExemptionReasonCodeType codigoAfectacion = (TaxExemptionReasonCodeType) generarCode(valor);
		return codigoAfectacion;
	}
	
	public static TierRangeType generarTierRange(String valor){
		TierRangeType codigoSistemaIsc = new TierRangeType();
		codigoSistemaIsc.setValue(valor);
		return codigoSistemaIsc;
	}
	
	public static DescriptionType generarDescription(String valor){
		DescriptionType descripcionProducto = new DescriptionType();
		descripcionProducto.setValue(valor);
		return descripcionProducto;
	}
	
	public static ItemIdentificationType generarItemIdentificacion(String valor){
		ItemIdentificationType itemIdentificacion = new ItemIdentificationType();
		itemIdentificacion.setID(UtilUBL.generarIdType(valor));
		return itemIdentificacion;
	}
	
	public static ItemClassificationCodeType generarItemClassificationCode(CodigoDTO valor){
		ItemClassificationCodeType itemClasificacion = (ItemClassificationCodeType) generarCode(valor);
		return itemClasificacion;
	}
	
	public static NameCodeType generarNameCode(CodigoDTO valor){
		NameCodeType nameCode = (NameCodeType) generarCode(valor);
		return nameCode;
	}
	
	public static ValueType generarValue(String valor){
		ValueType valueType = new ValueType();
		valueType.setValue(valor);
		return valueType;
	}
	
	public static ValueQualifierType generarValueQualifier(String valor){
		ValueQualifierType valueQualifier = new ValueQualifierType();
		valueQualifier.setValue(valor);
		return valueQualifier;
	}
	
	public static AddressType generarAddress(String valor){
		AddressType postalAdress = new AddressType();
		postalAdress.setCountry(UtilUBL.generarCountry(valor));
		return postalAdress;
	}
	
	public static FirstNameType generarFirstName(String valor){
		FirstNameType firstNameHuesped = new FirstNameType();
		firstNameHuesped.setValue(valor);
		return firstNameHuesped;
	}
	
	public static String parsearDatoSiNull(String valor, String valorDefecto){
		if (StringUtils.isBlank(valor)){
			return valorDefecto;
		}
		return valor;
	}
	
	public static InvoicedQuantityType generarInvoicedQuantity(CantidadDTO valor){
		InvoicedQuantityType cantidad = (InvoicedQuantityType) generarQuantity(valor);
		return cantidad;
	}
	
	public static QuantityType generarCantidad(CantidadDTO valor){
		QuantityType cantidad = (QuantityType) generarQuantity(valor);
		return cantidad;
	}
	
	public static un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.QuantityType generarQuantity(CantidadDTO valor){
		un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.QuantityType cantidad = new un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.QuantityType();
		cantidad.setValue(valor.getValorNumerico());
		if (StringUtils.isNotBlank(valor.getUnidadMedida())){
			cantidad.setUnitCode(valor.getUnidadMedida());
		}
		if (StringUtils.isNotBlank(valor.getUnidadListaId())){
			cantidad.setUnitCodeListID(valor.getUnidadListaId());
		}
		if (StringUtils.isNotBlank(valor.getUnidadListaId())){
			cantidad.setUnitCodeListAgencyName(valor.getUnidadListaAgencia());
		}
		return cantidad;
	}
}