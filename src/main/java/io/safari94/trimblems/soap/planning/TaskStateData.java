
package io.safari94.trimblems.soap.planning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaskStateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskStateData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deployed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="assignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastKnownSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastKnownState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastKnownTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskStateData", namespace = "http://fleetworks.acunia.com/fleet/types", propOrder = {
    "id",
    "deployed",
    "assignee",
    "lastKnownSource",
    "lastKnownState",
    "lastKnownTime"
})
public class TaskStateData {

    @XmlElement(required = true)
    protected String id;
    protected boolean deployed;
    protected String assignee;
    protected String lastKnownSource;
    protected String lastKnownState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastKnownTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the deployed property.
     * 
     */
    public boolean isDeployed() {
        return deployed;
    }

    /**
     * Sets the value of the deployed property.
     * 
     */
    public void setDeployed(boolean value) {
        this.deployed = value;
    }

    /**
     * Gets the value of the assignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * Sets the value of the assignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignee(String value) {
        this.assignee = value;
    }

    /**
     * Gets the value of the lastKnownSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKnownSource() {
        return lastKnownSource;
    }

    /**
     * Sets the value of the lastKnownSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKnownSource(String value) {
        this.lastKnownSource = value;
    }

    /**
     * Gets the value of the lastKnownState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKnownState() {
        return lastKnownState;
    }

    /**
     * Sets the value of the lastKnownState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKnownState(String value) {
        this.lastKnownState = value;
    }

    /**
     * Gets the value of the lastKnownTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastKnownTime() {
        return lastKnownTime;
    }

    /**
     * Sets the value of the lastKnownTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastKnownTime(XMLGregorianCalendar value) {
        this.lastKnownTime = value;
    }

}
