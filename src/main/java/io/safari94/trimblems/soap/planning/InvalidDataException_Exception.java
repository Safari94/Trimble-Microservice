
package io.safari94.trimblems.soap.planning;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidDataException", targetNamespace = "http://fleetworks.acunia.com/fleet/fault")
public class InvalidDataException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidDataException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidDataException_Exception(String message, InvalidDataException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidDataException_Exception(String message, InvalidDataException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: planning.InvalidDataException
     */
    public InvalidDataException getFaultInfo() {
        return faultInfo;
    }

}
