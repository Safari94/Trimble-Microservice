
package io.safari94.trimblems.soap.planning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripOrderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripOrderData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="tripId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripOrderData", namespace = "http://fleetworks.acunia.com/fleet/types", propOrder = {
    "tripIdOrTaskId"
})
public class TripOrderData {

    @XmlElementRefs({
        @XmlElementRef(name = "tripId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskId", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> tripIdOrTaskId;

    /**
     * Gets the value of the tripIdOrTaskId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripIdOrTaskId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripIdOrTaskId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getTripIdOrTaskId() {
        if (tripIdOrTaskId == null) {
            tripIdOrTaskId = new ArrayList<JAXBElement<String>>();
        }
        return this.tripIdOrTaskId;
    }

}
