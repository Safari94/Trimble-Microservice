
package io.safari94.trimblems.soap.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;


/**
 * <p>Java class for DocumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="isPermanent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentData", namespace = "http://fleetworks.acunia.com/fleet/types", propOrder = {
    "fileName",
    "fileType",
    "fileContent",
    "isPermanent"
})
public class DocumentData {

    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected String fileType;
    @XmlElement(required = true)
    protected byte[] fileContent;
    protected boolean isPermanent;

    @Override
    public String toString() {
        return "DocumentData{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileContent=" + Arrays.toString(fileContent) +
                ", isPermanent=" + isPermanent +
                '}';
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }


    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileContent(byte[] value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the isPermanent property.
     * 
     */
    public boolean isIsPermanent() {
        return isPermanent;
    }

    /**
     * Sets the value of the isPermanent property.
     * 
     */
    public void setIsPermanent(boolean value) {
        this.isPermanent = value;
    }

}
