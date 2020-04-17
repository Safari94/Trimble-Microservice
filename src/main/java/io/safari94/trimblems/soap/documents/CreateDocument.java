
package io.safari94.trimblems.soap.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentData" type="{http://fleetworks.acunia.com/fleet/types}DocumentData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDocument", propOrder = {
    "customer",
    "documentData"
})
public class CreateDocument {

    protected String customer;
    protected DocumentData documentData;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the documentData property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentData }
     *     
     */
    public DocumentData getDocumentData() {
        return documentData;
    }

    /**
     * Sets the value of the documentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentData }
     *     
     */
    public void setDocumentData(DocumentData value) {
        this.documentData = value;
    }

}
