
package io.safari94.trimblems.soap.documents;

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
@WebService(name = "Document", targetNamespace = "http://fleetworks.acunia.com/fleet/service")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Document {


    /**
     * 
     * @param documentData
     * @param customer
     * @return
     *     returns documents.DocumentStateData
     * @throws OperationFailedException_Exception
     * @throws InvalidDataException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createDocument", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.documents.CreateDocument")
    @ResponseWrapper(localName = "createDocumentResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.documents.CreateDocumentResponse")
    public DocumentStateData createDocument(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "documentData", targetNamespace = "")
        DocumentData documentData)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param uniqueDocId
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeDocument", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.documents.RemoveDocument")
    @ResponseWrapper(localName = "removeDocumentResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.documents.RemoveDocumentResponse")
    public void removeDocument(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "uniqueDocId", targetNamespace = "")
        String uniqueDocId)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

}