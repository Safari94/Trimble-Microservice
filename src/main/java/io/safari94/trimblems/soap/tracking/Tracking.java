package io.safari94.trimblems.soap.tracking;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Tracking", targetNamespace = "http://fleetworks.acunia.com/fleet/service")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Tracking {


    /**
     * 
     * @param mark
     * @param customer
     * @return
     *     returns io.safari94.trimble.TracePollData
     * @throws OperationFailedException_Exception
     * @throws InvalidDataException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pollTraces", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.tracking.PollTraces")
    @ResponseWrapper(localName = "pollTracesResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.tracking.PollTracesResponse")
    public TracePollData pollTraces(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "mark", targetNamespace = "")
        String mark)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param terminalIds
     * @param customer
     * @throws OperationFailedException_Exception
     * @throws InvalidDataException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "requestTrace", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.tracking.RequestTrace")
    @ResponseWrapper(localName = "requestTraceResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.tracking.RequestTraceResponse")
    public void requestTrace(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminalIds", targetNamespace = "")
        List<String> terminalIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

}
