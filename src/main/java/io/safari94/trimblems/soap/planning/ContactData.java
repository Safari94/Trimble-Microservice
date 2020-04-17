
package io.safari94.trimblems.soap.planning;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phonelist" type="{http://fleetworks.acunia.com/fleet/types}PhoneListData" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://fleetworks.acunia.com/fleet/types}AddressData" minOccurs="0"/&gt;
 *         &lt;element name="coordinate" type="{http://fleetworks.acunia.com/fleet/types}CoordinateData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactData", namespace = "http://fleetworks.acunia.com/fleet/types", propOrder = {
    "id",
    "name",
    "company",
    "phone",
    "phonelist",
    "address",
    "coordinate"
})
public class ContactData {

    protected String id;
    protected String name;
    protected String company;
    protected String phone;
    protected PhoneListData phonelist;
    protected AddressData address;
    protected CoordinateData coordinate;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phonelist property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneListData }
     *     
     */
    public PhoneListData getPhonelist() {
        return phonelist;
    }

    /**
     * Sets the value of the phonelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneListData }
     *     
     */
    public void setPhonelist(PhoneListData value) {
        this.phonelist = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setAddress(AddressData value) {
        this.address = value;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateData }
     *     
     */
    public CoordinateData getCoordinate() {
        return coordinate;
    }

    /**
     * Sets the value of the coordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateData }
     *     
     */
    public void setCoordinate(CoordinateData value) {
        this.coordinate = value;
    }

}
