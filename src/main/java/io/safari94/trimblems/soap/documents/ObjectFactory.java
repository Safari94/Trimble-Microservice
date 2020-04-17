
package io.safari94.trimblems.soap.documents;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the documents package. 
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

    private final static QName _CreateDocument_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "createDocument");
    private final static QName _CreateDocumentResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "createDocumentResponse");
    private final static QName _RemoveDocument_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "removeDocument");
    private final static QName _RemoveDocumentResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "removeDocumentResponse");
    private final static QName _InvalidDataException_QNAME = new QName("http://fleetworks.acunia.com/fleet/fault", "InvalidDataException");
    private final static QName _OperationFailedException_QNAME = new QName("http://fleetworks.acunia.com/fleet/fault", "OperationFailedException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: documents
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentData }
     * 
     */
    public DocumentData createDocumentData() {
        return new DocumentData();
    }

    /**
     * Create an instance of {@link DocumentStateData }
     * 
     */
    public DocumentStateData createDocumentStateData() {
        return new DocumentStateData();
    }

    /**
     * Create an instance of {@link CreateDocument }
     * 
     */
    public CreateDocument createCreateDocument() {
        return new CreateDocument();
    }

    /**
     * Create an instance of {@link CreateDocumentResponse }
     * 
     */
    public CreateDocumentResponse createCreateDocumentResponse() {
        return new CreateDocumentResponse();
    }

    /**
     * Create an instance of {@link RemoveDocument }
     * 
     */
    public RemoveDocument createRemoveDocument() {
        return new RemoveDocument();
    }

    /**
     * Create an instance of {@link RemoveDocumentResponse }
     * 
     */
    public RemoveDocumentResponse createRemoveDocumentResponse() {
        return new RemoveDocumentResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "createDocument")
    public JAXBElement<CreateDocument> createCreateDocument(CreateDocument value) {
        return new JAXBElement<CreateDocument>(_CreateDocument_QNAME, CreateDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "createDocumentResponse")
    public JAXBElement<CreateDocumentResponse> createCreateDocumentResponse(CreateDocumentResponse value) {
        return new JAXBElement<CreateDocumentResponse>(_CreateDocumentResponse_QNAME, CreateDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "removeDocument")
    public JAXBElement<RemoveDocument> createRemoveDocument(RemoveDocument value) {
        return new JAXBElement<RemoveDocument>(_RemoveDocument_QNAME, RemoveDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "removeDocumentResponse")
    public JAXBElement<RemoveDocumentResponse> createRemoveDocumentResponse(RemoveDocumentResponse value) {
        return new JAXBElement<RemoveDocumentResponse>(_RemoveDocumentResponse_QNAME, RemoveDocumentResponse.class, null, value);
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

}
