
package io.safari94.trimblems.soap.planning;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the planning package. 
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
    private final static QName _AssignTasks_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "assignTasks");
    private final static QName _AssignTasksResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "assignTasksResponse");
    private final static QName _AssignTrips_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "assignTrips");
    private final static QName _AssignTripsResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "assignTripsResponse");
    private final static QName _CreateTasks_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "createTasks");
    private final static QName _CreateTasksResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "createTasksResponse");
    private final static QName _CreateTrips_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "createTrips");
    private final static QName _CreateTripsResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "createTripsResponse");
    private final static QName _DeployTasks_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "deployTasks");
    private final static QName _DeployTasksResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "deployTasksResponse");
    private final static QName _DeployTrips_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "deployTrips");
    private final static QName _DeployTripsResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "deployTripsResponse");
    private final static QName _FindTask_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "findTask");
    private final static QName _FindTaskResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "findTaskResponse");
    private final static QName _FindTrip_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "findTrip");
    private final static QName _FindTripResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "findTripResponse");
    private final static QName _OrderTasks_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "orderTasks");
    private final static QName _OrderTasksResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "orderTasksResponse");
    private final static QName _OrderTrips_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "orderTrips");
    private final static QName _OrderTripsResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "orderTripsResponse");
    private final static QName _QueryTerminal_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "queryTerminal");
    private final static QName _QueryTerminalResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "queryTerminalResponse");
    private final static QName _RemoveTasks_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "removeTasks");
    private final static QName _RemoveTasksResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "removeTasksResponse");
    private final static QName _RemoveTrips_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "removeTrips");
    private final static QName _RemoveTripsResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "removeTripsResponse");
    private final static QName _UnAssignTasks_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "unAssignTasks");
    private final static QName _UnAssignTasksResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "unAssignTasksResponse");
    private final static QName _UnAssignTrips_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "unAssignTrips");
    private final static QName _UnAssignTripsResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "unAssignTripsResponse");
    private final static QName _UpdateTerminal_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "updateTerminal");
    private final static QName _UpdateTerminalResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "updateTerminalResponse");
    private final static QName _UpdateTerminalTrips_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "updateTerminalTrips");
    private final static QName _UpdateTerminalTripsResponse_QNAME = new QName("http://fleetworks.acunia.com/fleet/service", "updateTerminalTripsResponse");
    private final static QName _TripOrderDataTripId_QNAME = new QName("", "tripId");
    private final static QName _TripOrderDataTaskId_QNAME = new QName("", "taskId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: planning
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
     * Create an instance of {@link AssignTasks }
     * 
     */
    public AssignTasks createAssignTasks() {
        return new AssignTasks();
    }

    /**
     * Create an instance of {@link AssignTasksResponse }
     * 
     */
    public AssignTasksResponse createAssignTasksResponse() {
        return new AssignTasksResponse();
    }

    /**
     * Create an instance of {@link AssignTrips }
     * 
     */
    public AssignTrips createAssignTrips() {
        return new AssignTrips();
    }

    /**
     * Create an instance of {@link AssignTripsResponse }
     * 
     */
    public AssignTripsResponse createAssignTripsResponse() {
        return new AssignTripsResponse();
    }

    /**
     * Create an instance of {@link CreateTasks }
     * 
     */
    public CreateTasks createCreateTasks() {
        return new CreateTasks();
    }

    /**
     * Create an instance of {@link CreateTasksResponse }
     * 
     */
    public CreateTasksResponse createCreateTasksResponse() {
        return new CreateTasksResponse();
    }

    /**
     * Create an instance of {@link CreateTrips }
     * 
     */
    public CreateTrips createCreateTrips() {
        return new CreateTrips();
    }

    /**
     * Create an instance of {@link CreateTripsResponse }
     * 
     */
    public CreateTripsResponse createCreateTripsResponse() {
        return new CreateTripsResponse();
    }

    /**
     * Create an instance of {@link DeployTasks }
     * 
     */
    public DeployTasks createDeployTasks() {
        return new DeployTasks();
    }

    /**
     * Create an instance of {@link DeployTasksResponse }
     * 
     */
    public DeployTasksResponse createDeployTasksResponse() {
        return new DeployTasksResponse();
    }

    /**
     * Create an instance of {@link DeployTrips }
     * 
     */
    public DeployTrips createDeployTrips() {
        return new DeployTrips();
    }

    /**
     * Create an instance of {@link DeployTripsResponse }
     * 
     */
    public DeployTripsResponse createDeployTripsResponse() {
        return new DeployTripsResponse();
    }

    /**
     * Create an instance of {@link FindTask }
     * 
     */
    public FindTask createFindTask() {
        return new FindTask();
    }

    /**
     * Create an instance of {@link FindTaskResponse }
     * 
     */
    public FindTaskResponse createFindTaskResponse() {
        return new FindTaskResponse();
    }

    /**
     * Create an instance of {@link FindTrip }
     * 
     */
    public FindTrip createFindTrip() {
        return new FindTrip();
    }

    /**
     * Create an instance of {@link FindTripResponse }
     * 
     */
    public FindTripResponse createFindTripResponse() {
        return new FindTripResponse();
    }

    /**
     * Create an instance of {@link OrderTasks }
     * 
     */
    public OrderTasks createOrderTasks() {
        return new OrderTasks();
    }

    /**
     * Create an instance of {@link OrderTasksResponse }
     * 
     */
    public OrderTasksResponse createOrderTasksResponse() {
        return new OrderTasksResponse();
    }

    /**
     * Create an instance of {@link OrderTrips }
     * 
     */
    public OrderTrips createOrderTrips() {
        return new OrderTrips();
    }

    /**
     * Create an instance of {@link OrderTripsResponse }
     * 
     */
    public OrderTripsResponse createOrderTripsResponse() {
        return new OrderTripsResponse();
    }

    /**
     * Create an instance of {@link QueryTerminal }
     * 
     */
    public QueryTerminal createQueryTerminal() {
        return new QueryTerminal();
    }

    /**
     * Create an instance of {@link QueryTerminalResponse }
     * 
     */
    public QueryTerminalResponse createQueryTerminalResponse() {
        return new QueryTerminalResponse();
    }

    /**
     * Create an instance of {@link RemoveTasks }
     * 
     */
    public RemoveTasks createRemoveTasks() {
        return new RemoveTasks();
    }

    /**
     * Create an instance of {@link RemoveTasksResponse }
     * 
     */
    public RemoveTasksResponse createRemoveTasksResponse() {
        return new RemoveTasksResponse();
    }

    /**
     * Create an instance of {@link RemoveTrips }
     * 
     */
    public RemoveTrips createRemoveTrips() {
        return new RemoveTrips();
    }

    /**
     * Create an instance of {@link RemoveTripsResponse }
     * 
     */
    public RemoveTripsResponse createRemoveTripsResponse() {
        return new RemoveTripsResponse();
    }

    /**
     * Create an instance of {@link UnAssignTasks }
     * 
     */
    public UnAssignTasks createUnAssignTasks() {
        return new UnAssignTasks();
    }

    /**
     * Create an instance of {@link UnAssignTasksResponse }
     * 
     */
    public UnAssignTasksResponse createUnAssignTasksResponse() {
        return new UnAssignTasksResponse();
    }

    /**
     * Create an instance of {@link UnAssignTrips }
     * 
     */
    public UnAssignTrips createUnAssignTrips() {
        return new UnAssignTrips();
    }

    /**
     * Create an instance of {@link UnAssignTripsResponse }
     * 
     */
    public UnAssignTripsResponse createUnAssignTripsResponse() {
        return new UnAssignTripsResponse();
    }

    /**
     * Create an instance of {@link UpdateTerminal }
     * 
     */
    public UpdateTerminal createUpdateTerminal() {
        return new UpdateTerminal();
    }

    /**
     * Create an instance of {@link UpdateTerminalResponse }
     * 
     */
    public UpdateTerminalResponse createUpdateTerminalResponse() {
        return new UpdateTerminalResponse();
    }

    /**
     * Create an instance of {@link UpdateTerminalTrips }
     * 
     */
    public UpdateTerminalTrips createUpdateTerminalTrips() {
        return new UpdateTerminalTrips();
    }

    /**
     * Create an instance of {@link UpdateTerminalTripsResponse }
     * 
     */
    public UpdateTerminalTripsResponse createUpdateTerminalTripsResponse() {
        return new UpdateTerminalTripsResponse();
    }

    /**
     * Create an instance of {@link ActivityData }
     * 
     */
    public ActivityData createActivityData() {
        return new ActivityData();
    }

    /**
     * Create an instance of {@link AddressData }
     * 
     */
    public AddressData createAddressData() {
        return new AddressData();
    }

    /**
     * Create an instance of {@link ContactData }
     * 
     */
    public ContactData createContactData() {
        return new ContactData();
    }

    /**
     * Create an instance of {@link CoordinateData }
     * 
     */
    public CoordinateData createCoordinateData() {
        return new CoordinateData();
    }

    /**
     * Create an instance of {@link PhoneListData }
     * 
     */
    public PhoneListData createPhoneListData() {
        return new PhoneListData();
    }

    /**
     * Create an instance of {@link PropertyData }
     * 
     */
    public PropertyData createPropertyData() {
        return new PropertyData();
    }

    /**
     * Create an instance of {@link TaskData }
     * 
     */
    public TaskData createTaskData() {
        return new TaskData();
    }

    /**
     * Create an instance of {@link TaskStateData }
     * 
     */
    public TaskStateData createTaskStateData() {
        return new TaskStateData();
    }

    /**
     * Create an instance of {@link TripData }
     * 
     */
    public TripData createTripData() {
        return new TripData();
    }

    /**
     * Create an instance of {@link TripOrderData }
     * 
     */
    public TripOrderData createTripOrderData() {
        return new TripOrderData();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignTasks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignTasks }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "assignTasks")
    public JAXBElement<AssignTasks> createAssignTasks(AssignTasks value) {
        return new JAXBElement<AssignTasks>(_AssignTasks_QNAME, AssignTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignTasksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignTasksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "assignTasksResponse")
    public JAXBElement<AssignTasksResponse> createAssignTasksResponse(AssignTasksResponse value) {
        return new JAXBElement<AssignTasksResponse>(_AssignTasksResponse_QNAME, AssignTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignTrips }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignTrips }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "assignTrips")
    public JAXBElement<AssignTrips> createAssignTrips(AssignTrips value) {
        return new JAXBElement<AssignTrips>(_AssignTrips_QNAME, AssignTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignTripsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignTripsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "assignTripsResponse")
    public JAXBElement<AssignTripsResponse> createAssignTripsResponse(AssignTripsResponse value) {
        return new JAXBElement<AssignTripsResponse>(_AssignTripsResponse_QNAME, AssignTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTasks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTasks }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "createTasks")
    public JAXBElement<CreateTasks> createCreateTasks(CreateTasks value) {
        return new JAXBElement<CreateTasks>(_CreateTasks_QNAME, CreateTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTasksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTasksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "createTasksResponse")
    public JAXBElement<CreateTasksResponse> createCreateTasksResponse(CreateTasksResponse value) {
        return new JAXBElement<CreateTasksResponse>(_CreateTasksResponse_QNAME, CreateTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTrips }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTrips }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "createTrips")
    public JAXBElement<CreateTrips> createCreateTrips(CreateTrips value) {
        return new JAXBElement<CreateTrips>(_CreateTrips_QNAME, CreateTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTripsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTripsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "createTripsResponse")
    public JAXBElement<CreateTripsResponse> createCreateTripsResponse(CreateTripsResponse value) {
        return new JAXBElement<CreateTripsResponse>(_CreateTripsResponse_QNAME, CreateTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployTasks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeployTasks }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "deployTasks")
    public JAXBElement<DeployTasks> createDeployTasks(DeployTasks value) {
        return new JAXBElement<DeployTasks>(_DeployTasks_QNAME, DeployTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployTasksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeployTasksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "deployTasksResponse")
    public JAXBElement<DeployTasksResponse> createDeployTasksResponse(DeployTasksResponse value) {
        return new JAXBElement<DeployTasksResponse>(_DeployTasksResponse_QNAME, DeployTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployTrips }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeployTrips }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "deployTrips")
    public JAXBElement<DeployTrips> createDeployTrips(DeployTrips value) {
        return new JAXBElement<DeployTrips>(_DeployTrips_QNAME, DeployTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployTripsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeployTripsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "deployTripsResponse")
    public JAXBElement<DeployTripsResponse> createDeployTripsResponse(DeployTripsResponse value) {
        return new JAXBElement<DeployTripsResponse>(_DeployTripsResponse_QNAME, DeployTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "findTask")
    public JAXBElement<FindTask> createFindTask(FindTask value) {
        return new JAXBElement<FindTask>(_FindTask_QNAME, FindTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTaskResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindTaskResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "findTaskResponse")
    public JAXBElement<FindTaskResponse> createFindTaskResponse(FindTaskResponse value) {
        return new JAXBElement<FindTaskResponse>(_FindTaskResponse_QNAME, FindTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTrip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindTrip }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "findTrip")
    public JAXBElement<FindTrip> createFindTrip(FindTrip value) {
        return new JAXBElement<FindTrip>(_FindTrip_QNAME, FindTrip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTripResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindTripResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "findTripResponse")
    public JAXBElement<FindTripResponse> createFindTripResponse(FindTripResponse value) {
        return new JAXBElement<FindTripResponse>(_FindTripResponse_QNAME, FindTripResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderTasks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderTasks }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "orderTasks")
    public JAXBElement<OrderTasks> createOrderTasks(OrderTasks value) {
        return new JAXBElement<OrderTasks>(_OrderTasks_QNAME, OrderTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderTasksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderTasksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "orderTasksResponse")
    public JAXBElement<OrderTasksResponse> createOrderTasksResponse(OrderTasksResponse value) {
        return new JAXBElement<OrderTasksResponse>(_OrderTasksResponse_QNAME, OrderTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderTrips }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderTrips }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "orderTrips")
    public JAXBElement<OrderTrips> createOrderTrips(OrderTrips value) {
        return new JAXBElement<OrderTrips>(_OrderTrips_QNAME, OrderTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderTripsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderTripsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "orderTripsResponse")
    public JAXBElement<OrderTripsResponse> createOrderTripsResponse(OrderTripsResponse value) {
        return new JAXBElement<OrderTripsResponse>(_OrderTripsResponse_QNAME, OrderTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTerminal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTerminal }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "queryTerminal")
    public JAXBElement<QueryTerminal> createQueryTerminal(QueryTerminal value) {
        return new JAXBElement<QueryTerminal>(_QueryTerminal_QNAME, QueryTerminal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTerminalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTerminalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "queryTerminalResponse")
    public JAXBElement<QueryTerminalResponse> createQueryTerminalResponse(QueryTerminalResponse value) {
        return new JAXBElement<QueryTerminalResponse>(_QueryTerminalResponse_QNAME, QueryTerminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTasks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveTasks }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "removeTasks")
    public JAXBElement<RemoveTasks> createRemoveTasks(RemoveTasks value) {
        return new JAXBElement<RemoveTasks>(_RemoveTasks_QNAME, RemoveTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTasksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveTasksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "removeTasksResponse")
    public JAXBElement<RemoveTasksResponse> createRemoveTasksResponse(RemoveTasksResponse value) {
        return new JAXBElement<RemoveTasksResponse>(_RemoveTasksResponse_QNAME, RemoveTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTrips }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveTrips }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "removeTrips")
    public JAXBElement<RemoveTrips> createRemoveTrips(RemoveTrips value) {
        return new JAXBElement<RemoveTrips>(_RemoveTrips_QNAME, RemoveTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTripsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveTripsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "removeTripsResponse")
    public JAXBElement<RemoveTripsResponse> createRemoveTripsResponse(RemoveTripsResponse value) {
        return new JAXBElement<RemoveTripsResponse>(_RemoveTripsResponse_QNAME, RemoveTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnAssignTasks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnAssignTasks }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "unAssignTasks")
    public JAXBElement<UnAssignTasks> createUnAssignTasks(UnAssignTasks value) {
        return new JAXBElement<UnAssignTasks>(_UnAssignTasks_QNAME, UnAssignTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnAssignTasksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnAssignTasksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "unAssignTasksResponse")
    public JAXBElement<UnAssignTasksResponse> createUnAssignTasksResponse(UnAssignTasksResponse value) {
        return new JAXBElement<UnAssignTasksResponse>(_UnAssignTasksResponse_QNAME, UnAssignTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnAssignTrips }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnAssignTrips }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "unAssignTrips")
    public JAXBElement<UnAssignTrips> createUnAssignTrips(UnAssignTrips value) {
        return new JAXBElement<UnAssignTrips>(_UnAssignTrips_QNAME, UnAssignTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnAssignTripsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnAssignTripsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "unAssignTripsResponse")
    public JAXBElement<UnAssignTripsResponse> createUnAssignTripsResponse(UnAssignTripsResponse value) {
        return new JAXBElement<UnAssignTripsResponse>(_UnAssignTripsResponse_QNAME, UnAssignTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTerminal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTerminal }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "updateTerminal")
    public JAXBElement<UpdateTerminal> createUpdateTerminal(UpdateTerminal value) {
        return new JAXBElement<UpdateTerminal>(_UpdateTerminal_QNAME, UpdateTerminal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTerminalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTerminalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "updateTerminalResponse")
    public JAXBElement<UpdateTerminalResponse> createUpdateTerminalResponse(UpdateTerminalResponse value) {
        return new JAXBElement<UpdateTerminalResponse>(_UpdateTerminalResponse_QNAME, UpdateTerminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTerminalTrips }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTerminalTrips }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "updateTerminalTrips")
    public JAXBElement<UpdateTerminalTrips> createUpdateTerminalTrips(UpdateTerminalTrips value) {
        return new JAXBElement<UpdateTerminalTrips>(_UpdateTerminalTrips_QNAME, UpdateTerminalTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTerminalTripsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTerminalTripsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fleetworks.acunia.com/fleet/service", name = "updateTerminalTripsResponse")
    public JAXBElement<UpdateTerminalTripsResponse> createUpdateTerminalTripsResponse(UpdateTerminalTripsResponse value) {
        return new JAXBElement<UpdateTerminalTripsResponse>(_UpdateTerminalTripsResponse_QNAME, UpdateTerminalTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripId", scope = TripOrderData.class)
    public JAXBElement<String> createTripOrderDataTripId(String value) {
        return new JAXBElement<String>(_TripOrderDataTripId_QNAME, String.class, TripOrderData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "taskId", scope = TripOrderData.class)
    public JAXBElement<String> createTripOrderDataTaskId(String value) {
        return new JAXBElement<String>(_TripOrderDataTaskId_QNAME, String.class, TripOrderData.class, value);
    }

}
