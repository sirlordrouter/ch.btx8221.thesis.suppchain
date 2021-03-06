
package webservice.erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.erp package. 
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

    private final static QName _GetItemsBySSCC_QNAME = new QName("http://service/", "getItemsBySSCC");
    private final static QName _GetPreparedPrescriptionsForPatientResponse_QNAME = new QName("http://service/", "getPreparedPrescriptionsForPatientResponse");
    private final static QName _GetItemsByBatch_QNAME = new QName("http://service/", "getItemsByBatch");
    private final static QName _GetDosetForPatient_QNAME = new QName("http://service/", "getDosetForPatient");
    private final static QName _GetOrderForSSCCResponse_QNAME = new QName("http://service/", "getOrderForSSCCResponse");
    private final static QName _ProcessOrder_QNAME = new QName("http://service/", "processOrder");
    private final static QName _SetOrder_QNAME = new QName("http://service/", "setOrder");
    private final static QName _UpdatePreparedMedicationsResponse_QNAME = new QName("http://service/", "updatePreparedMedicationsResponse");
    private final static QName _GetQuantities_QNAME = new QName("http://service/", "getQuantities");
    private final static QName _GetPrescriptionsForPatientResponse_QNAME = new QName("http://service/", "getPrescriptionsForPatientResponse");
    private final static QName _GetOpenOrdersByGLNResponse_QNAME = new QName("http://service/", "getOpenOrdersByGLNResponse");
    private final static QName _UpdateDispensedMedicationResponse_QNAME = new QName("http://service/", "updateDispensedMedicationResponse");
    private final static QName _ResetTrackedItemsResponse_QNAME = new QName("http://service/", "resetTrackedItemsResponse");
    private final static QName _ResetTrackedItems_QNAME = new QName("http://service/", "resetTrackedItems");
    private final static QName _GetOrderForSSCC_QNAME = new QName("http://service/", "getOrderForSSCC");
    private final static QName _GetPrescriptionsForPatient_QNAME = new QName("http://service/", "getPrescriptionsForPatient");
    private final static QName _ProcessOrderResponse_QNAME = new QName("http://service/", "processOrderResponse");
    private final static QName _CheckoutItemsResponse_QNAME = new QName("http://service/", "checkoutItemsResponse");
    private final static QName _GetItemsBySSCCResponse_QNAME = new QName("http://service/", "getItemsBySSCCResponse");
    private final static QName _GetStations_QNAME = new QName("http://service/", "getStations");
    private final static QName _GetPreparedPrescriptionsCountForPatientResponse_QNAME = new QName("http://service/", "getPreparedPrescriptionsCountForPatientResponse");
    private final static QName _GetCheckedInItemsResponse_QNAME = new QName("http://service/", "getCheckedInItemsResponse");
    private final static QName _InsertTrackingItemsResponse_QNAME = new QName("http://service/", "insertTrackingItemsResponse");
    private final static QName _GetDosetForPatientResponse_QNAME = new QName("http://service/", "getDosetForPatientResponse");
    private final static QName _GetItemByIdentifier_QNAME = new QName("http://service/", "getItemByIdentifier");
    private final static QName _GetPreparedPrescriptionsCountForPatient_QNAME = new QName("http://service/", "getPreparedPrescriptionsCountForPatient");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://service/", "sayHelloWorldFromResponse");
    private final static QName _GetCheckedInItems_QNAME = new QName("http://service/", "getCheckedInItems");
    private final static QName _GetItemsByBatchResponse_QNAME = new QName("http://service/", "getItemsByBatchResponse");
    private final static QName _GetItemsByGSIN_QNAME = new QName("http://service/", "getItemsByGSIN");
    private final static QName _GetItemsByGSINResponse_QNAME = new QName("http://service/", "getItemsByGSINResponse");
    private final static QName _GetToDoListPrescriptions_QNAME = new QName("http://service/", "getToDoListPrescriptions");
    private final static QName _InsertTrackingItems_QNAME = new QName("http://service/", "insertTrackingItems");
    private final static QName _GetItemByIdentifierResponse_QNAME = new QName("http://service/", "getItemByIdentifierResponse");
    private final static QName _GetPatients_QNAME = new QName("http://service/", "getPatients");
    private final static QName _UpdateDispensedMedication_QNAME = new QName("http://service/", "updateDispensedMedication");
    private final static QName _GetOpenOrdersByGLN_QNAME = new QName("http://service/", "getOpenOrdersByGLN");
    private final static QName _UpdatePreparedMedications_QNAME = new QName("http://service/", "updatePreparedMedications");
    private final static QName _GetLogisticUnitsForProduct_QNAME = new QName("http://service/", "getLogisticUnitsForProduct");
    private final static QName _GetToDoListPrescriptionsResponse_QNAME = new QName("http://service/", "getToDoListPrescriptionsResponse");
    private final static QName _GetQuantitiesResponse_QNAME = new QName("http://service/", "getQuantitiesResponse");
    private final static QName _CheckoutItems_QNAME = new QName("http://service/", "checkoutItems");
    private final static QName _GetStationsResponse_QNAME = new QName("http://service/", "getStationsResponse");
    private final static QName _CheckinItemsResponse_QNAME = new QName("http://service/", "checkinItemsResponse");
    private final static QName _GetPreparedPrescriptionsForPatient_QNAME = new QName("http://service/", "getPreparedPrescriptionsForPatient");
    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://service/", "sayHelloWorldFrom");
    private final static QName _SetOrderResponse_QNAME = new QName("http://service/", "setOrderResponse");
    private final static QName _GetLogisticUnitsForProductResponse_QNAME = new QName("http://service/", "getLogisticUnitsForProductResponse");
    private final static QName _GetPatientsResponse_QNAME = new QName("http://service/", "getPatientsResponse");
    private final static QName _CheckinItems_QNAME = new QName("http://service/", "checkinItems");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.erp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckoutItems }
     * 
     */
    public CheckoutItems createCheckoutItems() {
        return new CheckoutItems();
    }

    /**
     * Create an instance of {@link GetStationsResponse }
     * 
     */
    public GetStationsResponse createGetStationsResponse() {
        return new GetStationsResponse();
    }

    /**
     * Create an instance of {@link GetQuantitiesResponse }
     * 
     */
    public GetQuantitiesResponse createGetQuantitiesResponse() {
        return new GetQuantitiesResponse();
    }

    /**
     * Create an instance of {@link GetLogisticUnitsForProduct }
     * 
     */
    public GetLogisticUnitsForProduct createGetLogisticUnitsForProduct() {
        return new GetLogisticUnitsForProduct();
    }

    /**
     * Create an instance of {@link GetToDoListPrescriptionsResponse }
     * 
     */
    public GetToDoListPrescriptionsResponse createGetToDoListPrescriptionsResponse() {
        return new GetToDoListPrescriptionsResponse();
    }

    /**
     * Create an instance of {@link UpdatePreparedMedications }
     * 
     */
    public UpdatePreparedMedications createUpdatePreparedMedications() {
        return new UpdatePreparedMedications();
    }

    /**
     * Create an instance of {@link GetOpenOrdersByGLN }
     * 
     */
    public GetOpenOrdersByGLN createGetOpenOrdersByGLN() {
        return new GetOpenOrdersByGLN();
    }

    /**
     * Create an instance of {@link GetItemByIdentifierResponse }
     * 
     */
    public GetItemByIdentifierResponse createGetItemByIdentifierResponse() {
        return new GetItemByIdentifierResponse();
    }

    /**
     * Create an instance of {@link GetPatients }
     * 
     */
    public GetPatients createGetPatients() {
        return new GetPatients();
    }

    /**
     * Create an instance of {@link UpdateDispensedMedication }
     * 
     */
    public UpdateDispensedMedication createUpdateDispensedMedication() {
        return new UpdateDispensedMedication();
    }

    /**
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link GetPreparedPrescriptionsForPatient }
     * 
     */
    public GetPreparedPrescriptionsForPatient createGetPreparedPrescriptionsForPatient() {
        return new GetPreparedPrescriptionsForPatient();
    }

    /**
     * Create an instance of {@link CheckinItemsResponse }
     * 
     */
    public CheckinItemsResponse createCheckinItemsResponse() {
        return new CheckinItemsResponse();
    }

    /**
     * Create an instance of {@link SetOrderResponse }
     * 
     */
    public SetOrderResponse createSetOrderResponse() {
        return new SetOrderResponse();
    }

    /**
     * Create an instance of {@link CheckinItems }
     * 
     */
    public CheckinItems createCheckinItems() {
        return new CheckinItems();
    }

    /**
     * Create an instance of {@link GetLogisticUnitsForProductResponse }
     * 
     */
    public GetLogisticUnitsForProductResponse createGetLogisticUnitsForProductResponse() {
        return new GetLogisticUnitsForProductResponse();
    }

    /**
     * Create an instance of {@link GetPatientsResponse }
     * 
     */
    public GetPatientsResponse createGetPatientsResponse() {
        return new GetPatientsResponse();
    }

    /**
     * Create an instance of {@link GetCheckedInItemsResponse }
     * 
     */
    public GetCheckedInItemsResponse createGetCheckedInItemsResponse() {
        return new GetCheckedInItemsResponse();
    }

    /**
     * Create an instance of {@link GetPreparedPrescriptionsCountForPatientResponse }
     * 
     */
    public GetPreparedPrescriptionsCountForPatientResponse createGetPreparedPrescriptionsCountForPatientResponse() {
        return new GetPreparedPrescriptionsCountForPatientResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFromResponse }
     * 
     */
    public SayHelloWorldFromResponse createSayHelloWorldFromResponse() {
        return new SayHelloWorldFromResponse();
    }

    /**
     * Create an instance of {@link GetPreparedPrescriptionsCountForPatient }
     * 
     */
    public GetPreparedPrescriptionsCountForPatient createGetPreparedPrescriptionsCountForPatient() {
        return new GetPreparedPrescriptionsCountForPatient();
    }

    /**
     * Create an instance of {@link GetItemByIdentifier }
     * 
     */
    public GetItemByIdentifier createGetItemByIdentifier() {
        return new GetItemByIdentifier();
    }

    /**
     * Create an instance of {@link GetDosetForPatientResponse }
     * 
     */
    public GetDosetForPatientResponse createGetDosetForPatientResponse() {
        return new GetDosetForPatientResponse();
    }

    /**
     * Create an instance of {@link InsertTrackingItemsResponse }
     * 
     */
    public InsertTrackingItemsResponse createInsertTrackingItemsResponse() {
        return new InsertTrackingItemsResponse();
    }

    /**
     * Create an instance of {@link GetItemsByGSIN }
     * 
     */
    public GetItemsByGSIN createGetItemsByGSIN() {
        return new GetItemsByGSIN();
    }

    /**
     * Create an instance of {@link GetItemsByGSINResponse }
     * 
     */
    public GetItemsByGSINResponse createGetItemsByGSINResponse() {
        return new GetItemsByGSINResponse();
    }

    /**
     * Create an instance of {@link GetItemsByBatchResponse }
     * 
     */
    public GetItemsByBatchResponse createGetItemsByBatchResponse() {
        return new GetItemsByBatchResponse();
    }

    /**
     * Create an instance of {@link GetCheckedInItems }
     * 
     */
    public GetCheckedInItems createGetCheckedInItems() {
        return new GetCheckedInItems();
    }

    /**
     * Create an instance of {@link InsertTrackingItems }
     * 
     */
    public InsertTrackingItems createInsertTrackingItems() {
        return new InsertTrackingItems();
    }

    /**
     * Create an instance of {@link GetToDoListPrescriptions }
     * 
     */
    public GetToDoListPrescriptions createGetToDoListPrescriptions() {
        return new GetToDoListPrescriptions();
    }

    /**
     * Create an instance of {@link CheckoutItemsResponse }
     * 
     */
    public CheckoutItemsResponse createCheckoutItemsResponse() {
        return new CheckoutItemsResponse();
    }

    /**
     * Create an instance of {@link GetOrderForSSCC }
     * 
     */
    public GetOrderForSSCC createGetOrderForSSCC() {
        return new GetOrderForSSCC();
    }

    /**
     * Create an instance of {@link GetPrescriptionsForPatient }
     * 
     */
    public GetPrescriptionsForPatient createGetPrescriptionsForPatient() {
        return new GetPrescriptionsForPatient();
    }

    /**
     * Create an instance of {@link ProcessOrderResponse }
     * 
     */
    public ProcessOrderResponse createProcessOrderResponse() {
        return new ProcessOrderResponse();
    }

    /**
     * Create an instance of {@link ResetTrackedItems }
     * 
     */
    public ResetTrackedItems createResetTrackedItems() {
        return new ResetTrackedItems();
    }

    /**
     * Create an instance of {@link ResetTrackedItemsResponse }
     * 
     */
    public ResetTrackedItemsResponse createResetTrackedItemsResponse() {
        return new ResetTrackedItemsResponse();
    }

    /**
     * Create an instance of {@link GetItemsBySSCCResponse }
     * 
     */
    public GetItemsBySSCCResponse createGetItemsBySSCCResponse() {
        return new GetItemsBySSCCResponse();
    }

    /**
     * Create an instance of {@link GetStations }
     * 
     */
    public GetStations createGetStations() {
        return new GetStations();
    }

    /**
     * Create an instance of {@link GetItemsByBatch }
     * 
     */
    public GetItemsByBatch createGetItemsByBatch() {
        return new GetItemsByBatch();
    }

    /**
     * Create an instance of {@link GetPreparedPrescriptionsForPatientResponse }
     * 
     */
    public GetPreparedPrescriptionsForPatientResponse createGetPreparedPrescriptionsForPatientResponse() {
        return new GetPreparedPrescriptionsForPatientResponse();
    }

    /**
     * Create an instance of {@link GetItemsBySSCC }
     * 
     */
    public GetItemsBySSCC createGetItemsBySSCC() {
        return new GetItemsBySSCC();
    }

    /**
     * Create an instance of {@link ProcessOrder }
     * 
     */
    public ProcessOrder createProcessOrder() {
        return new ProcessOrder();
    }

    /**
     * Create an instance of {@link SetOrder }
     * 
     */
    public SetOrder createSetOrder() {
        return new SetOrder();
    }

    /**
     * Create an instance of {@link GetOrderForSSCCResponse }
     * 
     */
    public GetOrderForSSCCResponse createGetOrderForSSCCResponse() {
        return new GetOrderForSSCCResponse();
    }

    /**
     * Create an instance of {@link GetDosetForPatient }
     * 
     */
    public GetDosetForPatient createGetDosetForPatient() {
        return new GetDosetForPatient();
    }

    /**
     * Create an instance of {@link GetOpenOrdersByGLNResponse }
     * 
     */
    public GetOpenOrdersByGLNResponse createGetOpenOrdersByGLNResponse() {
        return new GetOpenOrdersByGLNResponse();
    }

    /**
     * Create an instance of {@link UpdateDispensedMedicationResponse }
     * 
     */
    public UpdateDispensedMedicationResponse createUpdateDispensedMedicationResponse() {
        return new UpdateDispensedMedicationResponse();
    }

    /**
     * Create an instance of {@link GetPrescriptionsForPatientResponse }
     * 
     */
    public GetPrescriptionsForPatientResponse createGetPrescriptionsForPatientResponse() {
        return new GetPrescriptionsForPatientResponse();
    }

    /**
     * Create an instance of {@link GetQuantities }
     * 
     */
    public GetQuantities createGetQuantities() {
        return new GetQuantities();
    }

    /**
     * Create an instance of {@link UpdatePreparedMedicationsResponse }
     * 
     */
    public UpdatePreparedMedicationsResponse createUpdatePreparedMedicationsResponse() {
        return new UpdatePreparedMedicationsResponse();
    }

    /**
     * Create an instance of {@link WebServiceResult }
     * 
     */
    public WebServiceResult createWebServiceResult() {
        return new WebServiceResult();
    }

    /**
     * Create an instance of {@link TrspPatient }
     * 
     */
    public TrspPatient createTrspPatient() {
        return new TrspPatient();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link TrspMedication }
     * 
     */
    public TrspMedication createTrspMedication() {
        return new TrspMedication();
    }

    /**
     * Create an instance of {@link ToDoListPrescriptions }
     * 
     */
    public ToDoListPrescriptions createToDoListPrescriptions() {
        return new ToDoListPrescriptions();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Shipment }
     * 
     */
    public Shipment createShipment() {
        return new Shipment();
    }

    /**
     * Create an instance of {@link MediPrepResult }
     * 
     */
    public MediPrepResult createMediPrepResult() {
        return new MediPrepResult();
    }

    /**
     * Create an instance of {@link TrspPreparedMedication }
     * 
     */
    public TrspPreparedMedication createTrspPreparedMedication() {
        return new TrspPreparedMedication();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link Production }
     * 
     */
    public Production createProduction() {
        return new Production();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link TrspPrescription }
     * 
     */
    public TrspPrescription createTrspPrescription() {
        return new TrspPrescription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsBySSCC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsBySSCC")
    public JAXBElement<GetItemsBySSCC> createGetItemsBySSCC(GetItemsBySSCC value) {
        return new JAXBElement<GetItemsBySSCC>(_GetItemsBySSCC_QNAME, GetItemsBySSCC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreparedPrescriptionsForPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPreparedPrescriptionsForPatientResponse")
    public JAXBElement<GetPreparedPrescriptionsForPatientResponse> createGetPreparedPrescriptionsForPatientResponse(GetPreparedPrescriptionsForPatientResponse value) {
        return new JAXBElement<GetPreparedPrescriptionsForPatientResponse>(_GetPreparedPrescriptionsForPatientResponse_QNAME, GetPreparedPrescriptionsForPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsByBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsByBatch")
    public JAXBElement<GetItemsByBatch> createGetItemsByBatch(GetItemsByBatch value) {
        return new JAXBElement<GetItemsByBatch>(_GetItemsByBatch_QNAME, GetItemsByBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDosetForPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getDosetForPatient")
    public JAXBElement<GetDosetForPatient> createGetDosetForPatient(GetDosetForPatient value) {
        return new JAXBElement<GetDosetForPatient>(_GetDosetForPatient_QNAME, GetDosetForPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderForSSCCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getOrderForSSCCResponse")
    public JAXBElement<GetOrderForSSCCResponse> createGetOrderForSSCCResponse(GetOrderForSSCCResponse value) {
        return new JAXBElement<GetOrderForSSCCResponse>(_GetOrderForSSCCResponse_QNAME, GetOrderForSSCCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "processOrder")
    public JAXBElement<ProcessOrder> createProcessOrder(ProcessOrder value) {
        return new JAXBElement<ProcessOrder>(_ProcessOrder_QNAME, ProcessOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "setOrder")
    public JAXBElement<SetOrder> createSetOrder(SetOrder value) {
        return new JAXBElement<SetOrder>(_SetOrder_QNAME, SetOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePreparedMedicationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updatePreparedMedicationsResponse")
    public JAXBElement<UpdatePreparedMedicationsResponse> createUpdatePreparedMedicationsResponse(UpdatePreparedMedicationsResponse value) {
        return new JAXBElement<UpdatePreparedMedicationsResponse>(_UpdatePreparedMedicationsResponse_QNAME, UpdatePreparedMedicationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getQuantities")
    public JAXBElement<GetQuantities> createGetQuantities(GetQuantities value) {
        return new JAXBElement<GetQuantities>(_GetQuantities_QNAME, GetQuantities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrescriptionsForPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPrescriptionsForPatientResponse")
    public JAXBElement<GetPrescriptionsForPatientResponse> createGetPrescriptionsForPatientResponse(GetPrescriptionsForPatientResponse value) {
        return new JAXBElement<GetPrescriptionsForPatientResponse>(_GetPrescriptionsForPatientResponse_QNAME, GetPrescriptionsForPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenOrdersByGLNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getOpenOrdersByGLNResponse")
    public JAXBElement<GetOpenOrdersByGLNResponse> createGetOpenOrdersByGLNResponse(GetOpenOrdersByGLNResponse value) {
        return new JAXBElement<GetOpenOrdersByGLNResponse>(_GetOpenOrdersByGLNResponse_QNAME, GetOpenOrdersByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDispensedMedicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateDispensedMedicationResponse")
    public JAXBElement<UpdateDispensedMedicationResponse> createUpdateDispensedMedicationResponse(UpdateDispensedMedicationResponse value) {
        return new JAXBElement<UpdateDispensedMedicationResponse>(_UpdateDispensedMedicationResponse_QNAME, UpdateDispensedMedicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetTrackedItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "resetTrackedItemsResponse")
    public JAXBElement<ResetTrackedItemsResponse> createResetTrackedItemsResponse(ResetTrackedItemsResponse value) {
        return new JAXBElement<ResetTrackedItemsResponse>(_ResetTrackedItemsResponse_QNAME, ResetTrackedItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetTrackedItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "resetTrackedItems")
    public JAXBElement<ResetTrackedItems> createResetTrackedItems(ResetTrackedItems value) {
        return new JAXBElement<ResetTrackedItems>(_ResetTrackedItems_QNAME, ResetTrackedItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderForSSCC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getOrderForSSCC")
    public JAXBElement<GetOrderForSSCC> createGetOrderForSSCC(GetOrderForSSCC value) {
        return new JAXBElement<GetOrderForSSCC>(_GetOrderForSSCC_QNAME, GetOrderForSSCC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrescriptionsForPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPrescriptionsForPatient")
    public JAXBElement<GetPrescriptionsForPatient> createGetPrescriptionsForPatient(GetPrescriptionsForPatient value) {
        return new JAXBElement<GetPrescriptionsForPatient>(_GetPrescriptionsForPatient_QNAME, GetPrescriptionsForPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "processOrderResponse")
    public JAXBElement<ProcessOrderResponse> createProcessOrderResponse(ProcessOrderResponse value) {
        return new JAXBElement<ProcessOrderResponse>(_ProcessOrderResponse_QNAME, ProcessOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkoutItemsResponse")
    public JAXBElement<CheckoutItemsResponse> createCheckoutItemsResponse(CheckoutItemsResponse value) {
        return new JAXBElement<CheckoutItemsResponse>(_CheckoutItemsResponse_QNAME, CheckoutItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsBySSCCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsBySSCCResponse")
    public JAXBElement<GetItemsBySSCCResponse> createGetItemsBySSCCResponse(GetItemsBySSCCResponse value) {
        return new JAXBElement<GetItemsBySSCCResponse>(_GetItemsBySSCCResponse_QNAME, GetItemsBySSCCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getStations")
    public JAXBElement<GetStations> createGetStations(GetStations value) {
        return new JAXBElement<GetStations>(_GetStations_QNAME, GetStations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreparedPrescriptionsCountForPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPreparedPrescriptionsCountForPatientResponse")
    public JAXBElement<GetPreparedPrescriptionsCountForPatientResponse> createGetPreparedPrescriptionsCountForPatientResponse(GetPreparedPrescriptionsCountForPatientResponse value) {
        return new JAXBElement<GetPreparedPrescriptionsCountForPatientResponse>(_GetPreparedPrescriptionsCountForPatientResponse_QNAME, GetPreparedPrescriptionsCountForPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckedInItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCheckedInItemsResponse")
    public JAXBElement<GetCheckedInItemsResponse> createGetCheckedInItemsResponse(GetCheckedInItemsResponse value) {
        return new JAXBElement<GetCheckedInItemsResponse>(_GetCheckedInItemsResponse_QNAME, GetCheckedInItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTrackingItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertTrackingItemsResponse")
    public JAXBElement<InsertTrackingItemsResponse> createInsertTrackingItemsResponse(InsertTrackingItemsResponse value) {
        return new JAXBElement<InsertTrackingItemsResponse>(_InsertTrackingItemsResponse_QNAME, InsertTrackingItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDosetForPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getDosetForPatientResponse")
    public JAXBElement<GetDosetForPatientResponse> createGetDosetForPatientResponse(GetDosetForPatientResponse value) {
        return new JAXBElement<GetDosetForPatientResponse>(_GetDosetForPatientResponse_QNAME, GetDosetForPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemByIdentifier")
    public JAXBElement<GetItemByIdentifier> createGetItemByIdentifier(GetItemByIdentifier value) {
        return new JAXBElement<GetItemByIdentifier>(_GetItemByIdentifier_QNAME, GetItemByIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreparedPrescriptionsCountForPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPreparedPrescriptionsCountForPatient")
    public JAXBElement<GetPreparedPrescriptionsCountForPatient> createGetPreparedPrescriptionsCountForPatient(GetPreparedPrescriptionsCountForPatient value) {
        return new JAXBElement<GetPreparedPrescriptionsCountForPatient>(_GetPreparedPrescriptionsCountForPatient_QNAME, GetPreparedPrescriptionsCountForPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sayHelloWorldFromResponse")
    public JAXBElement<SayHelloWorldFromResponse> createSayHelloWorldFromResponse(SayHelloWorldFromResponse value) {
        return new JAXBElement<SayHelloWorldFromResponse>(_SayHelloWorldFromResponse_QNAME, SayHelloWorldFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckedInItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCheckedInItems")
    public JAXBElement<GetCheckedInItems> createGetCheckedInItems(GetCheckedInItems value) {
        return new JAXBElement<GetCheckedInItems>(_GetCheckedInItems_QNAME, GetCheckedInItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsByBatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsByBatchResponse")
    public JAXBElement<GetItemsByBatchResponse> createGetItemsByBatchResponse(GetItemsByBatchResponse value) {
        return new JAXBElement<GetItemsByBatchResponse>(_GetItemsByBatchResponse_QNAME, GetItemsByBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsByGSIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsByGSIN")
    public JAXBElement<GetItemsByGSIN> createGetItemsByGSIN(GetItemsByGSIN value) {
        return new JAXBElement<GetItemsByGSIN>(_GetItemsByGSIN_QNAME, GetItemsByGSIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsByGSINResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsByGSINResponse")
    public JAXBElement<GetItemsByGSINResponse> createGetItemsByGSINResponse(GetItemsByGSINResponse value) {
        return new JAXBElement<GetItemsByGSINResponse>(_GetItemsByGSINResponse_QNAME, GetItemsByGSINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetToDoListPrescriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getToDoListPrescriptions")
    public JAXBElement<GetToDoListPrescriptions> createGetToDoListPrescriptions(GetToDoListPrescriptions value) {
        return new JAXBElement<GetToDoListPrescriptions>(_GetToDoListPrescriptions_QNAME, GetToDoListPrescriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTrackingItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertTrackingItems")
    public JAXBElement<InsertTrackingItems> createInsertTrackingItems(InsertTrackingItems value) {
        return new JAXBElement<InsertTrackingItems>(_InsertTrackingItems_QNAME, InsertTrackingItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdentifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemByIdentifierResponse")
    public JAXBElement<GetItemByIdentifierResponse> createGetItemByIdentifierResponse(GetItemByIdentifierResponse value) {
        return new JAXBElement<GetItemByIdentifierResponse>(_GetItemByIdentifierResponse_QNAME, GetItemByIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPatients")
    public JAXBElement<GetPatients> createGetPatients(GetPatients value) {
        return new JAXBElement<GetPatients>(_GetPatients_QNAME, GetPatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDispensedMedication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateDispensedMedication")
    public JAXBElement<UpdateDispensedMedication> createUpdateDispensedMedication(UpdateDispensedMedication value) {
        return new JAXBElement<UpdateDispensedMedication>(_UpdateDispensedMedication_QNAME, UpdateDispensedMedication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenOrdersByGLN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getOpenOrdersByGLN")
    public JAXBElement<GetOpenOrdersByGLN> createGetOpenOrdersByGLN(GetOpenOrdersByGLN value) {
        return new JAXBElement<GetOpenOrdersByGLN>(_GetOpenOrdersByGLN_QNAME, GetOpenOrdersByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePreparedMedications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updatePreparedMedications")
    public JAXBElement<UpdatePreparedMedications> createUpdatePreparedMedications(UpdatePreparedMedications value) {
        return new JAXBElement<UpdatePreparedMedications>(_UpdatePreparedMedications_QNAME, UpdatePreparedMedications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogisticUnitsForProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getLogisticUnitsForProduct")
    public JAXBElement<GetLogisticUnitsForProduct> createGetLogisticUnitsForProduct(GetLogisticUnitsForProduct value) {
        return new JAXBElement<GetLogisticUnitsForProduct>(_GetLogisticUnitsForProduct_QNAME, GetLogisticUnitsForProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetToDoListPrescriptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getToDoListPrescriptionsResponse")
    public JAXBElement<GetToDoListPrescriptionsResponse> createGetToDoListPrescriptionsResponse(GetToDoListPrescriptionsResponse value) {
        return new JAXBElement<GetToDoListPrescriptionsResponse>(_GetToDoListPrescriptionsResponse_QNAME, GetToDoListPrescriptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuantitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getQuantitiesResponse")
    public JAXBElement<GetQuantitiesResponse> createGetQuantitiesResponse(GetQuantitiesResponse value) {
        return new JAXBElement<GetQuantitiesResponse>(_GetQuantitiesResponse_QNAME, GetQuantitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkoutItems")
    public JAXBElement<CheckoutItems> createCheckoutItems(CheckoutItems value) {
        return new JAXBElement<CheckoutItems>(_CheckoutItems_QNAME, CheckoutItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getStationsResponse")
    public JAXBElement<GetStationsResponse> createGetStationsResponse(GetStationsResponse value) {
        return new JAXBElement<GetStationsResponse>(_GetStationsResponse_QNAME, GetStationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkinItemsResponse")
    public JAXBElement<CheckinItemsResponse> createCheckinItemsResponse(CheckinItemsResponse value) {
        return new JAXBElement<CheckinItemsResponse>(_CheckinItemsResponse_QNAME, CheckinItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreparedPrescriptionsForPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPreparedPrescriptionsForPatient")
    public JAXBElement<GetPreparedPrescriptionsForPatient> createGetPreparedPrescriptionsForPatient(GetPreparedPrescriptionsForPatient value) {
        return new JAXBElement<GetPreparedPrescriptionsForPatient>(_GetPreparedPrescriptionsForPatient_QNAME, GetPreparedPrescriptionsForPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "setOrderResponse")
    public JAXBElement<SetOrderResponse> createSetOrderResponse(SetOrderResponse value) {
        return new JAXBElement<SetOrderResponse>(_SetOrderResponse_QNAME, SetOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogisticUnitsForProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getLogisticUnitsForProductResponse")
    public JAXBElement<GetLogisticUnitsForProductResponse> createGetLogisticUnitsForProductResponse(GetLogisticUnitsForProductResponse value) {
        return new JAXBElement<GetLogisticUnitsForProductResponse>(_GetLogisticUnitsForProductResponse_QNAME, GetLogisticUnitsForProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPatientsResponse")
    public JAXBElement<GetPatientsResponse> createGetPatientsResponse(GetPatientsResponse value) {
        return new JAXBElement<GetPatientsResponse>(_GetPatientsResponse_QNAME, GetPatientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkinItems")
    public JAXBElement<CheckinItems> createCheckinItems(CheckinItems value) {
        return new JAXBElement<CheckinItems>(_CheckinItems_QNAME, CheckinItems.class, null, value);
    }

}
