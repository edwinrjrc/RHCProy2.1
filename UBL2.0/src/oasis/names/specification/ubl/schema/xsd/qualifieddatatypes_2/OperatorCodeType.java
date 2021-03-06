//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.08.27 a las 12:04:19 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.qualifieddatatypes_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MathematicOperatorCodeType;
import un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.CodeType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *           &lt;ccts:DictionaryEntryName&gt;Operator_ Code. Type&lt;/ccts:DictionaryEntryName&gt;
 *           &lt;ccts:Version&gt;2.0&lt;/ccts:Version&gt;
 *           &lt;ccts:Definition&gt;The set of valid arithmetic operators&lt;/ccts:Definition&gt;
 *           &lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;
 *           &lt;ccts:QualifierTerm&gt;Operator&lt;/ccts:QualifierTerm&gt;
 *           &lt;ccts:UniqueID/&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Clase Java para OperatorCodeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperatorCodeType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2>CodeType">
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="Operator" />
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="UBL" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" default="OASIS Universal Business Language" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" default="Operator" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" default="2.0" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" default="en" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://docs.oasis-open.org/ubl/os-ubl-2.0/cl/gc/default/OperatorCode-2.0.gc" />
 *       &lt;attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="urn:oasis:names:specification:ubl:codelist:gc:OperatorCode-2.0" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorCodeType")
@XmlSeeAlso({
    MathematicOperatorCodeType.class
})
public class OperatorCodeType
    extends CodeType
{


}
