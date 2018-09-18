//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.09.09 a las 12:31:18 PM COT 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChangeConditionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportServiceProviderSpecialTermsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportUserSpecialTermsType;


/**
 * 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *                &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *                &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Details&lt;/ccts:DictionaryEntryName&gt;
 *                &lt;ccts:Definition&gt;A class to describe terms applying to a transport execution plan.&lt;/ccts:Definition&gt;
 *                &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
 *             &lt;/ccts:Component&gt;
 * </pre>
 * 
 *          
 * 
 * <p>Clase Java para TransportExecutionTermsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransportExecutionTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportUserSpecialTerms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportServiceProviderSpecialTerms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChangeConditions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BonusPaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommissionPaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyPaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceChargePaymentTerms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportExecutionTermsType", propOrder = {
    "transportUserSpecialTerms",
    "transportServiceProviderSpecialTerms",
    "changeConditions",
    "paymentTerms",
    "deliveryTerms",
    "bonusPaymentTerms",
    "commissionPaymentTerms",
    "penaltyPaymentTerms",
    "environmentalEmission",
    "notificationRequirement",
    "serviceChargePaymentTerms"
})
public class TransportExecutionTermsType {

    @XmlElement(name = "TransportUserSpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TransportUserSpecialTermsType> transportUserSpecialTerms;
    @XmlElement(name = "TransportServiceProviderSpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TransportServiceProviderSpecialTermsType> transportServiceProviderSpecialTerms;
    @XmlElement(name = "ChangeConditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ChangeConditionsType> changeConditions;
    @XmlElement(name = "PaymentTerms")
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "DeliveryTerms")
    protected List<DeliveryTermsType> deliveryTerms;
    @XmlElement(name = "BonusPaymentTerms")
    protected PaymentTermsType bonusPaymentTerms;
    @XmlElement(name = "CommissionPaymentTerms")
    protected PaymentTermsType commissionPaymentTerms;
    @XmlElement(name = "PenaltyPaymentTerms")
    protected PaymentTermsType penaltyPaymentTerms;
    @XmlElement(name = "EnvironmentalEmission")
    protected List<EnvironmentalEmissionType> environmentalEmission;
    @XmlElement(name = "NotificationRequirement")
    protected List<NotificationRequirementType> notificationRequirement;
    @XmlElement(name = "ServiceChargePaymentTerms")
    protected PaymentTermsType serviceChargePaymentTerms;

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Transport User_ Special Terms. Text&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Text describing special terms specified by the transport user.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Transport User&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Special Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the transportUserSpecialTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportUserSpecialTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportUserSpecialTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportUserSpecialTermsType }
     * 
     * 
     */
    public List<TransportUserSpecialTermsType> getTransportUserSpecialTerms() {
        if (transportUserSpecialTerms == null) {
            transportUserSpecialTerms = new ArrayList<TransportUserSpecialTermsType>();
        }
        return this.transportUserSpecialTerms;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Transport Service Provider_ Special Terms. Text&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Text describing special terms specified by the transport service provider.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Transport Service Provider&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Special Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the transportServiceProviderSpecialTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportServiceProviderSpecialTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportServiceProviderSpecialTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportServiceProviderSpecialTermsType }
     * 
     * 
     */
    public List<TransportServiceProviderSpecialTermsType> getTransportServiceProviderSpecialTerms() {
        if (transportServiceProviderSpecialTerms == null) {
            transportServiceProviderSpecialTerms = new ArrayList<TransportServiceProviderSpecialTermsType>();
        }
        return this.transportServiceProviderSpecialTerms;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Change Conditions. Text&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Text describing conditions applying to a change of these transport execution terms.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Change Conditions&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the changeConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeConditionsType }
     * 
     * 
     */
    public List<ChangeConditionsType> getChangeConditions() {
        if (changeConditions == null) {
            changeConditions = new ArrayList<ChangeConditionsType>();
        }
        return this.changeConditions;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Payment Terms&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Payment terms associated with the transportation service.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Payment Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Payment Terms&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Payment Terms&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Delivery Terms&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Delivery terms (e.g., Incoterms) associated with the transportation service.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Delivery Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Delivery Terms&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Delivery Terms&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the deliveryTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryTermsType }
     * 
     * 
     */
    public List<DeliveryTermsType> getDeliveryTerms() {
        if (deliveryTerms == null) {
            deliveryTerms = new ArrayList<DeliveryTermsType>();
        }
        return this.deliveryTerms;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Bonus_ Payment Terms. Payment Terms&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Terms relating to payment of applicable bonuses associated with the transport service.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Bonus&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Payment Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Payment Terms&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Payment Terms&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getBonusPaymentTerms() {
        return bonusPaymentTerms;
    }

    /**
     * Define el valor de la propiedad bonusPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setBonusPaymentTerms(PaymentTermsType value) {
        this.bonusPaymentTerms = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Commission_ Payment Terms. Payment Terms&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Terms of payment applying to a commission specified in the transport execution plan.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Commission&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Payment Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Payment Terms&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Payment Terms&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getCommissionPaymentTerms() {
        return commissionPaymentTerms;
    }

    /**
     * Define el valor de la propiedad commissionPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setCommissionPaymentTerms(PaymentTermsType value) {
        this.commissionPaymentTerms = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Penalty_ Payment Terms. Payment Terms&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Terms of payment applying to a penalty specified in the transport execution plan.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Penalty&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Payment Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Payment Terms&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Payment Terms&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPenaltyPaymentTerms() {
        return penaltyPaymentTerms;
    }

    /**
     * Define el valor de la propiedad penaltyPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPenaltyPaymentTerms(PaymentTermsType value) {
        this.penaltyPaymentTerms = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Environmental Emission&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;An environmental emission resulting from the transportation service.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Environmental Emission&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Environmental Emission&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Environmental Emission&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the environmentalEmission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalEmission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalEmission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalEmissionType }
     * 
     * 
     */
    public List<EnvironmentalEmissionType> getEnvironmentalEmission() {
        if (environmentalEmission == null) {
            environmentalEmission = new ArrayList<EnvironmentalEmissionType>();
        }
        return this.environmentalEmission;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Notification Requirement&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A notification requirement related to the transportation service; e.g., a requirement that the transport user should be notified when goods are ready for pickup.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Notification Requirement&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Notification Requirement&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Notification Requirement&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the notificationRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationRequirementType }
     * 
     * 
     */
    public List<NotificationRequirementType> getNotificationRequirement() {
        if (notificationRequirement == null) {
            notificationRequirement = new ArrayList<NotificationRequirementType>();
        }
        return this.notificationRequirement;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Transport Execution Terms. Service Charge_ Payment Terms. Payment Terms&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;Payment terms for the service charge associated with the transport service.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Transport Execution Terms&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Service Charge&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Payment Terms&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Payment Terms&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Payment Terms&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getServiceChargePaymentTerms() {
        return serviceChargePaymentTerms;
    }

    /**
     * Define el valor de la propiedad serviceChargePaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setServiceChargePaymentTerms(PaymentTermsType value) {
        this.serviceChargePaymentTerms = value;
    }

}
