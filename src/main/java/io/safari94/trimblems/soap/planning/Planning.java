
package io.safari94.trimblems.soap.planning;

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
@WebService(name = "Planning", targetNamespace = "http://fleetworks.acunia.com/fleet/service")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Planning {


    /**
     * 
     * @param terminal
     * @param taskIds
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "assignTasks", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "package io.safari94.trimblems.soap.planning.AssignTasks")
    @ResponseWrapper(localName = "assignTasksResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "package io.safari94.trimblems.soap.planning.AssignTasksResponse")
    public void assignTasks(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminal", targetNamespace = "")
        String terminal,
        @WebParam(name = "taskIds", targetNamespace = "")
        List<String> taskIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param tripIds
     * @param terminal
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "assignTrips", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "package io.safari94.trimblems.soap.planning.AssignTrips")
    @ResponseWrapper(localName = "assignTripsResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.AssignTripsResponse")
    public void assignTrips(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminal", targetNamespace = "")
        String terminal,
        @WebParam(name = "tripIds", targetNamespace = "")
        List<String> tripIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param taskData
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createTasks", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.CreateTasks")
    @ResponseWrapper(localName = "createTasksResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.CreateTasksResponse")
    public void createTasks(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "taskData", targetNamespace = "")
        List<TaskData> taskData)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param tripData
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createTrips", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "planning.CreateTrips")
    @ResponseWrapper(localName = "createTripsResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "planning.CreateTripsResponse")
    public void createTrips(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "tripData", targetNamespace = "")
        List<TripData> tripData)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param taskIds
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deployTasks", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.DeployTasks")
    @ResponseWrapper(localName = "deployTasksResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.DeployTasksResponse")
    public void deployTasks(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "taskIds", targetNamespace = "")
        List<String> taskIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param tripIds
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deployTrips", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.DeployTrips")
    @ResponseWrapper(localName = "deployTripsResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.DeployTripsResponse")
    public void deployTrips(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "tripIds", targetNamespace = "")
        List<String> tripIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param taskId
     * @param customer
     * @return
     *     returns planning.TaskData
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findTask", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.FindTask")
    @ResponseWrapper(localName = "findTaskResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.FindTaskResponse")
    public TaskData findTask(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "taskId", targetNamespace = "")
        String taskId)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param tripId
     * @param customer
     * @return
     *     returns planning.TripData
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findTrip", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.FindTrip")
    @ResponseWrapper(localName = "findTripResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.FindTripResponse")
    public TripData findTrip(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "tripId", targetNamespace = "")
        String tripId)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param terminal
     * @param taskIds
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "orderTasks", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.OrderTasks")
    @ResponseWrapper(localName = "orderTasksResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.OrderTasksResponse")
    public void orderTasks(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminal", targetNamespace = "")
        String terminal,
        @WebParam(name = "taskIds", targetNamespace = "")
        List<String> taskIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param terminal
     * @param customer
     * @param order
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "orderTrips", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.OrderTrips")
    @ResponseWrapper(localName = "orderTripsResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.OrderTripsResponse")
    public void orderTrips(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminal", targetNamespace = "")
        String terminal,
        @WebParam(name = "order", targetNamespace = "")
        TripOrderData order)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param terminal
     * @param customer
     * @return
     *     returns java.util.List<planning.TaskStateData>
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryTerminal", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.QueryTerminal")
    @ResponseWrapper(localName = "queryTerminalResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.QueryTerminalResponse")
    public List<TaskStateData> queryTerminal(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminal", targetNamespace = "")
        String terminal)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param taskIds
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeTasks", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.RemoveTasks")
    @ResponseWrapper(localName = "removeTasksResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.RemoveTasksResponse")
    public void removeTasks(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "taskIds", targetNamespace = "")
        List<String> taskIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param tripId
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeTrips", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.RemoveTrips")
    @ResponseWrapper(localName = "removeTripsResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.RemoveTripsResponse")
    public void removeTrips(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "tripId", targetNamespace = "")
        List<String> tripId)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param taskIds
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "unAssignTasks", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UnAssignTasks")
    @ResponseWrapper(localName = "unAssignTasksResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UnAssignTasksResponse")
    public void unAssignTasks(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "taskIds", targetNamespace = "")
        List<String> taskIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param tripIds
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "unAssignTrips", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UnAssignTrips")
    @ResponseWrapper(localName = "unAssignTripsResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UnAssignTripsResponse")
    public void unAssignTrips(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "tripIds", targetNamespace = "")
        List<String> tripIds)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param taskData
     * @param terminal
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateTerminal", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UpdateTerminal")
    @ResponseWrapper(localName = "updateTerminalResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UpdateTerminalResponse")
    public void updateTerminal(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminal", targetNamespace = "")
        String terminal,
        @WebParam(name = "taskData", targetNamespace = "")
        List<TaskData> taskData)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

    /**
     * 
     * @param tripData
     * @param terminal
     * @param customer
     * @throws InvalidDataException_Exception
     * @throws OperationFailedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateTerminalTrips", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UpdateTerminalTrips")
    @ResponseWrapper(localName = "updateTerminalTripsResponse", targetNamespace = "http://fleetworks.acunia.com/fleet/service", className = "io.safari94.trimblems.soap.planning.UpdateTerminalTripsResponse")
    public void updateTerminalTrips(
        @WebParam(name = "customer", targetNamespace = "")
        String customer,
        @WebParam(name = "terminal", targetNamespace = "")
        String terminal,
        @WebParam(name = "tripData", targetNamespace = "")
        List<TripData> tripData)
        throws InvalidDataException_Exception, OperationFailedException_Exception
    ;

}
