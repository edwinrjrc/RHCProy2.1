//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.09.09 a las 12:31:18 PM COT 
//


package oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AirFlowPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HumidityPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PartecipationPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ParticipationPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PenaltySurchargePercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProgressPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReliabilityPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SettlementDiscountPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetServicePercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TierRatePercentType;
import un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.NumericType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000016&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Percent. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Numeric information that is assigned or is determined by calculation, counting, or sequencing and is expressed as a percentage. It does not require a unit of quantity or unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Percent&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Clase Java para PercentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PercentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>NumericType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentType")
@XmlSeeAlso({
    PenaltySurchargePercentType.class,
    ReliabilityPercentType.class,
    TierRatePercentType.class,
    PaymentPercentType.class,
    HumidityPercentType.class,
    MinimumPercentType.class,
    TargetServicePercentType.class,
    ParticipationPercentType.class,
    PartecipationPercentType.class,
    ProgressPercentType.class,
    AirFlowPercentType.class,
    MaximumPercentType.class,
    oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PercentType.class,
    SettlementDiscountPercentType.class
})
public class PercentType
    extends NumericType
{


}
