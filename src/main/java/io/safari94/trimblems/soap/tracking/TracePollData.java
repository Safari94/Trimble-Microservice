package io.safari94.trimblems.soap.tracking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TracePollData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TracePollData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="traces" type="{http://fleetworks.acunia.com/fleet/types}TraceData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="more" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TracePollData", namespace = "http://fleetworks.acunia.com/fleet/types", propOrder = {
    "traces",
    "mark",
    "more"
})
public class TracePollData {

    protected List<TraceData> traces;
    @XmlElement(required = true)
    protected String mark;
    protected boolean more;

    /**
     * Gets the value of the traces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraceData }
     * 
     * 
     */
    public List<TraceData> getTraces() {
        if (traces == null) {
            traces = new ArrayList<TraceData>();
        }
        return this.traces;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Gets the value of the more property.
     * 
     */
    public boolean isMore() {
        return more;
    }

    /**
     * Sets the value of the more property.
     * 
     */
    public void setMore(boolean value) {
        this.more = value;
    }

    @Override
    public String toString() {
        return "TracePollData{" +
                "traces=" + traces +
                ", mark='" + mark + '\'' +
                ", more=" + more +
                '}';
    }
}
