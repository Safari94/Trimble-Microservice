package io.safari94.trimblems.soap.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.safari94.trimble package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvalidDataException_QNAME = new QName("http://fleetworks.acunia.com/fleet/fault", "InvalidDataException");
    private final static QName _OperationFailedException_QNAME = new QName("http://fleetworks.acunia.com/fleet/fault", "OperationFailedException");
    private final static QName _PollTraces_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "pollTraces");
    private final static QName _PollTracesResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "pollTracesResponse");
    private final static QName _RequestTrace_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "requestTrace");
    private final static QName _RequestTraceResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "requestTraceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.safari94.trimble
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvalidDataException }
     * 
     */
    public InvalidDataException createInvalidDataException() {
        return new InvalidDataException();
    }

    /**
     * Create an instance of {@link OperationFailedException }
     * 
     */
    public OperationFailedException createOperationFailedException() {
        return new OperationFailedException();
    }

    /**
     * Create an instance of {@link PollTraces }
     * 
     */
    public PollTraces createPollTraces() {
        return new PollTraces();
    }

    /**
     * Create an instance of {@link PollTracesResponse }
     * 
     */
    public PollTracesResponse createPollTracesResponse() {
        return new PollTracesResponse();
    }

    /**
     * Create an instance of {@link RequestTrace }
     * 
     */
    public RequestTrace createRequestTrace() {
        return new RequestTrace();
    }

    /**
     * Create an instance of {@link RequestTraceResponse }
     * 
     */
    public RequestTraceResponse createRequestTraceResponse() {
        return new RequestTraceResponse();
    }

    /**
     * Create an instance of {@link CoordinateData }
     * 
     */
    public CoordinateData createCoordinateData() {
        return new CoordinateData();
    }

    /**
     * Create an instance of {@link PropertyData }
     * 
     */
    public PropertyData createPropertyData() {
        return new PropertyData();
    }

    /**
     * Create an instance of {@link TraceData }
     * 
     */
    public TraceData createTraceData() {
        return new TraceData();
    }

    /**
     * Create an instance of {@link TracePollData }
     * 
     */
    public TracePollData createTracePollData() {
        return new TracePollData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidDataException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidDataException }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/fault", name = "InvalidDataException")
    public JAXBElement<InvalidDataException> createInvalidDataException(InvalidDataException value) {
        return new JAXBElement<InvalidDataException>(_InvalidDataException_QNAME, InvalidDataException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationFailedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationFailedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/fault", name = "OperationFailedException")
    public JAXBElement<OperationFailedException> createOperationFailedException(OperationFailedException value) {
        return new JAXBElement<OperationFailedException>(_OperationFailedException_QNAME, OperationFailedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PollTraces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PollTraces }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "pollTraces")
    public JAXBElement<PollTraces> createPollTraces(PollTraces value) {
        return new JAXBElement<PollTraces>(_PollTraces_QNAME, PollTraces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PollTracesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PollTracesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "pollTracesResponse")
    public JAXBElement<PollTracesResponse> createPollTracesResponse(PollTracesResponse value) {
        return new JAXBElement<PollTracesResponse>(_PollTracesResponse_QNAME, PollTracesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestTrace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestTrace }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "requestTrace")
    public JAXBElement<RequestTrace> createRequestTrace(RequestTrace value) {
        return new JAXBElement<RequestTrace>(_RequestTrace_QNAME, RequestTrace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestTraceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestTraceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "requestTraceResponse")
    public JAXBElement<RequestTraceResponse> createRequestTraceResponse(RequestTraceResponse value) {
        return new JAXBElement<RequestTraceResponse>(_RequestTraceResponse_QNAME, RequestTraceResponse.class, null, value);
    }

}
