//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.08.27 a las 12:04:19 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DebitedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxPointDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *           &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *           &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Details&lt;/ccts:DictionaryEntryName&gt;
 *           &lt;ccts:Definition&gt;Information about a Debit Note Line.&lt;/ccts:Definition&gt;
 *           &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Clase Java para DebitNoteLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DebitNoteLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DebitedQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxPointDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DiscrepancyResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLineReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiptLineReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingReference" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitNoteLineType", propOrder = {
    "id",
    "uuid",
    "note",
    "debitedQuantity",
    "lineExtensionAmount",
    "taxPointDate",
    "accountingCostCode",
    "accountingCost",
    "discrepancyResponse",
    "despatchLineReference",
    "receiptLineReference",
    "billingReference",
    "documentReference",
    "pricingReference",
    "delivery",
    "taxTotal",
    "item",
    "price"
})
public class DebitNoteLineType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NoteType note;
    @XmlElement(name = "DebitedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DebitedQuantityType debitedQuantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LineExtensionAmountType lineExtensionAmount;
    @XmlElement(name = "TaxPointDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxPointDateType taxPointDate;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostCodeType accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostType accountingCost;
    @XmlElement(name = "DiscrepancyResponse")
    protected List<ResponseType> discrepancyResponse;
    @XmlElement(name = "DespatchLineReference")
    protected List<LineReferenceType> despatchLineReference;
    @XmlElement(name = "ReceiptLineReference")
    protected List<LineReferenceType> receiptLineReference;
    @XmlElement(name = "BillingReference")
    protected List<BillingReferenceType> billingReference;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "PricingReference")
    protected PricingReferenceType pricingReference;
    @XmlElement(name = "Delivery")
    protected List<DeliveryType> delivery;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "Price")
    protected PriceType price;

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Identifier&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;Identifies the Debit Note Line.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. UUID. Identifier&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;A universally unique identifier for an instance of this ABIE.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;UUID&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link UUIDType }
     *     
     */
    public UUIDType getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDType }
     *     
     */
    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Note. Text&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;Free-form text applying to the Debit Note Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Note&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link NoteType }
     *     
     */
    public NoteType getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteType }
     *     
     */
    public void setNote(NoteType value) {
        this.note = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Debited_ Quantity. Quantity&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;The quantity of Items debited.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTermQualifier&gt;Debited&lt;/ccts:PropertyTermQualifier&gt;
     *               &lt;ccts:PropertyTerm&gt;Quantity&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Quantity&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Quantity. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link DebitedQuantityType }
     *     
     */
    public DebitedQuantityType getDebitedQuantity() {
        return debitedQuantity;
    }

    /**
     * Define el valor de la propiedad debitedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitedQuantityType }
     *     
     */
    public void setDebitedQuantity(DebitedQuantityType value) {
        this.debitedQuantity = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Line Extension Amount. Amount&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;The total amount for the Debit Note Line, including Allowance Charges but net of taxes.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Line Extension Amount&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Amount&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Amount. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public LineExtensionAmountType getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Define el valor de la propiedad lineExtensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public void setLineExtensionAmount(LineExtensionAmountType value) {
        this.lineExtensionAmount = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Tax Point Date. Date&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;The date of the Debit Note Line, used to indicate the point at which tax becomes applicable.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Tax Point Date&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link TaxPointDateType }
     *     
     */
    public TaxPointDateType getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Define el valor de la propiedad taxPointDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPointDateType }
     *     
     */
    public void setTaxPointDate(TaxPointDateType value) {
        this.taxPointDate = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Accounting Cost Code. Code&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;The buyer's accounting code applied to the Debit Note Line.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Accounting Cost Code&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link AccountingCostCodeType }
     *     
     */
    public AccountingCostCodeType getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Define el valor de la propiedad accountingCostCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCostCodeType }
     *     
     */
    public void setAccountingCostCode(AccountingCostCodeType value) {
        this.accountingCostCode = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Accounting Cost. Text&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;The buyer's accounting code applied to the Debit Note Line, expressed as text.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Accounting Cost&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;
     *               &lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link AccountingCostType }
     *     
     */
    public AccountingCostType getAccountingCost() {
        return accountingCost;
    }

    /**
     * Define el valor de la propiedad accountingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCostType }
     *     
     */
    public void setAccountingCost(AccountingCostType value) {
        this.accountingCost = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Discrepancy_ Response. Response&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Discrepancy Response; the reason for the Debit.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTermQualifier&gt;Discrepancy&lt;/ccts:PropertyTermQualifier&gt;
     *               &lt;ccts:PropertyTerm&gt;Response&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Response&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the discrepancyResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType }
     * 
     * 
     */
    public List<ResponseType> getDiscrepancyResponse() {
        if (discrepancyResponse == null) {
            discrepancyResponse = new ArrayList<ResponseType>();
        }
        return this.discrepancyResponse;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Despatch_ Line Reference. Line Reference&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An associative reference to Despatch Line.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTermQualifier&gt;Despatch&lt;/ccts:PropertyTermQualifier&gt;
     *               &lt;ccts:PropertyTerm&gt;Line Reference&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Line Reference&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the despatchLineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despatchLineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespatchLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getDespatchLineReference() {
        if (despatchLineReference == null) {
            despatchLineReference = new ArrayList<LineReferenceType>();
        }
        return this.despatchLineReference;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Receipt_ Line Reference. Line Reference&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An associative reference to Receipt Line.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTermQualifier&gt;Receipt&lt;/ccts:PropertyTermQualifier&gt;
     *               &lt;ccts:PropertyTerm&gt;Line Reference&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Line Reference&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the receiptLineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptLineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getReceiptLineReference() {
        if (receiptLineReference == null) {
            receiptLineReference = new ArrayList<LineReferenceType>();
        }
        return this.receiptLineReference;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Billing Reference&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Billing Reference.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Billing Reference&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Billing Reference&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the billingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingReferenceType }
     * 
     * 
     */
    public List<BillingReferenceType> getBillingReference() {
        if (billingReference == null) {
            billingReference = new ArrayList<BillingReferenceType>();
        }
        return this.billingReference;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Document Reference&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Document Reference.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Pricing Reference&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Pricing Reference.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Pricing Reference&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Pricing Reference&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link PricingReferenceType }
     *     
     */
    public PricingReferenceType getPricingReference() {
        return pricingReference;
    }

    /**
     * Define el valor de la propiedad pricingReference.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingReferenceType }
     *     
     */
    public void setPricingReference(PricingReferenceType value) {
        this.pricingReference = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Delivery&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Delivery.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Delivery&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Delivery&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the delivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryType }
     * 
     * 
     */
    public List<DeliveryType> getDelivery() {
        if (delivery == null) {
            delivery = new ArrayList<DeliveryType>();
        }
        return this.delivery;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Tax Total&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Tax Total.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Tax Total&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Tax Total&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           Gets the value of the taxTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotal() {
        if (taxTotal == null) {
            taxTotal = new ArrayList<TaxTotalType>();
        }
        return this.taxTotal;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Item&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Item&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Item&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Item&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *               &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *               &lt;ccts:DictionaryEntryName&gt;Debit Note Line. Price&lt;/ccts:DictionaryEntryName&gt;
     *               &lt;ccts:Definition&gt;An association to Price.&lt;/ccts:Definition&gt;
     *               &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *               &lt;ccts:ObjectClass&gt;Debit Note Line&lt;/ccts:ObjectClass&gt;
     *               &lt;ccts:PropertyTerm&gt;Price&lt;/ccts:PropertyTerm&gt;
     *               &lt;ccts:AssociatedObjectClass&gt;Price&lt;/ccts:AssociatedObjectClass&gt;
     *             &lt;/ccts:Component&gt;
     * </pre>
     * 
     *           
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

}
