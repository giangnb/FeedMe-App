
package com.feedme.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.feedme.service package. 
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

    private final static QName _AddProduct_QNAME = new QName("http://webservice.feedme.com/", "addProduct");
    private final static QName _Log_QNAME = new QName("http://webservice.feedme.com/", "log");
    private final static QName _UpdateOrderResponse_QNAME = new QName("http://webservice.feedme.com/", "updateOrderResponse");
    private final static QName _RemoveEmployee_QNAME = new QName("http://webservice.feedme.com/", "removeEmployee");
    private final static QName _AddManager_QNAME = new QName("http://webservice.feedme.com/", "addManager");
    private final static QName _AddCategory_QNAME = new QName("http://webservice.feedme.com/", "addCategory");
    private final static QName _FetchOrderById_QNAME = new QName("http://webservice.feedme.com/", "fetchOrderById");
    private final static QName _RemoveLog_QNAME = new QName("http://webservice.feedme.com/", "removeLog");
    private final static QName _FetchPropertieByKey_QNAME = new QName("http://webservice.feedme.com/", "fetchPropertieByKey");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://webservice.feedme.com/", "addEmployeeResponse");
    private final static QName _FetchOrdersByEmployee_QNAME = new QName("http://webservice.feedme.com/", "fetchOrdersByEmployee");
    private final static QName _LoginEmployeeResponse_QNAME = new QName("http://webservice.feedme.com/", "loginEmployeeResponse");
    private final static QName _FetchOrderStatusById_QNAME = new QName("http://webservice.feedme.com/", "fetchOrderStatusById");
    private final static QName _AddOrderStatus_QNAME = new QName("http://webservice.feedme.com/", "addOrderStatus");
    private final static QName _RemoveProperties_QNAME = new QName("http://webservice.feedme.com/", "removeProperties");
    private final static QName _FetchPromotedsResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchPromotedsResponse");
    private final static QName _RemoveCategory_QNAME = new QName("http://webservice.feedme.com/", "removeCategory");
    private final static QName _FetchPropertieByKeyResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchPropertieByKeyResponse");
    private final static QName _AddOrder_QNAME = new QName("http://webservice.feedme.com/", "addOrder");
    private final static QName _FetchOrderStatus_QNAME = new QName("http://webservice.feedme.com/", "fetchOrderStatus");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://webservice.feedme.com/", "updateProductResponse");
    private final static QName _UpdateEmployeeResponse_QNAME = new QName("http://webservice.feedme.com/", "updateEmployeeResponse");
    private final static QName _FetchProductByCategory_QNAME = new QName("http://webservice.feedme.com/", "fetchProductByCategory");
    private final static QName _Product_QNAME = new QName("http://webservice.feedme.com/", "product");
    private final static QName _UpdateLogResponse_QNAME = new QName("http://webservice.feedme.com/", "updateLogResponse");
    private final static QName _RemovePriviledge_QNAME = new QName("http://webservice.feedme.com/", "removePriviledge");
    private final static QName _AddManagerResponse_QNAME = new QName("http://webservice.feedme.com/", "addManagerResponse");
    private final static QName _FetchPromotedByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchPromotedByIdResponse");
    private final static QName _FetchPropertiesResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchPropertiesResponse");
    private final static QName _Manager_QNAME = new QName("http://webservice.feedme.com/", "manager");
    private final static QName _FetchEmployees_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployees");
    private final static QName _RemoveOrderStatus_QNAME = new QName("http://webservice.feedme.com/", "removeOrderStatus");
    private final static QName _UpdateLog_QNAME = new QName("http://webservice.feedme.com/", "updateLog");
    private final static QName _UpdateOrderStatus_QNAME = new QName("http://webservice.feedme.com/", "updateOrderStatus");
    private final static QName _FetchCategories_QNAME = new QName("http://webservice.feedme.com/", "fetchCategories");
    private final static QName _FetchPriviledgesResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchPriviledgesResponse");
    private final static QName _LoginManager_QNAME = new QName("http://webservice.feedme.com/", "loginManager");
    private final static QName _AddEmployee_QNAME = new QName("http://webservice.feedme.com/", "addEmployee");
    private final static QName _RemoveOrderResponse_QNAME = new QName("http://webservice.feedme.com/", "removeOrderResponse");
    private final static QName _AddOrderStatusResponse_QNAME = new QName("http://webservice.feedme.com/", "addOrderStatusResponse");
    private final static QName _RemovePropertiesResponse_QNAME = new QName("http://webservice.feedme.com/", "removePropertiesResponse");
    private final static QName _UpdateCategory_QNAME = new QName("http://webservice.feedme.com/", "updateCategory");
    private final static QName _AddPriviledgeResponse_QNAME = new QName("http://webservice.feedme.com/", "addPriviledgeResponse");
    private final static QName _FetchProductByCategoryResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchProductByCategoryResponse");
    private final static QName _RemoveProduct_QNAME = new QName("http://webservice.feedme.com/", "removeProduct");
    private final static QName _FetchProperties_QNAME = new QName("http://webservice.feedme.com/", "fetchProperties");
    private final static QName _UpdatePromoted_QNAME = new QName("http://webservice.feedme.com/", "updatePromoted");
    private final static QName _FetchProductByNameAndCategory_QNAME = new QName("http://webservice.feedme.com/", "fetchProductByNameAndCategory");
    private final static QName _AddOrderResponse_QNAME = new QName("http://webservice.feedme.com/", "addOrderResponse");
    private final static QName _Promoted_QNAME = new QName("http://webservice.feedme.com/", "promoted");
    private final static QName _FetchManagers_QNAME = new QName("http://webservice.feedme.com/", "fetchManagers");
    private final static QName _FetchPromoteds_QNAME = new QName("http://webservice.feedme.com/", "fetchPromoteds");
    private final static QName _UpdateManagerPasswordResponse_QNAME = new QName("http://webservice.feedme.com/", "updateManagerPasswordResponse");
    private final static QName _RemoveEmployeeResponse_QNAME = new QName("http://webservice.feedme.com/", "removeEmployeeResponse");
    private final static QName _FetchCategoryById_QNAME = new QName("http://webservice.feedme.com/", "fetchCategoryById");
    private final static QName _FetchProducts_QNAME = new QName("http://webservice.feedme.com/", "fetchProducts");
    private final static QName _FetchLogsByEmployeeResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchLogsByEmployeeResponse");
    private final static QName _Property_QNAME = new QName("http://webservice.feedme.com/", "property");
    private final static QName _FetchEmployeeById_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployeeById");
    private final static QName _AddPropertie_QNAME = new QName("http://webservice.feedme.com/", "addPropertie");
    private final static QName _UpdatePropertiesResponse_QNAME = new QName("http://webservice.feedme.com/", "updatePropertiesResponse");
    private final static QName _AddPropertieResponse_QNAME = new QName("http://webservice.feedme.com/", "addPropertieResponse");
    private final static QName _AddLogResponse_QNAME = new QName("http://webservice.feedme.com/", "addLogResponse");
    private final static QName _FetchOrderByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchOrderByIdResponse");
    private final static QName _FetchOrdersByEmployeeResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchOrdersByEmployeeResponse");
    private final static QName _UpdateManager_QNAME = new QName("http://webservice.feedme.com/", "updateManager");
    private final static QName _FetchProductByNameAndCategoryResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchProductByNameAndCategoryResponse");
    private final static QName _FetchCategoriesResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchCategoriesResponse");
    private final static QName _FetchOrdersResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchOrdersResponse");
    private final static QName _AddPriviledge_QNAME = new QName("http://webservice.feedme.com/", "addPriviledge");
    private final static QName _FetchOrders_QNAME = new QName("http://webservice.feedme.com/", "fetchOrders");
    private final static QName _AddProductResponse_QNAME = new QName("http://webservice.feedme.com/", "addProductResponse");
    private final static QName _FetchCategoryByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchCategoryByIdResponse");
    private final static QName _FetchOrderStatusResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchOrderStatusResponse");
    private final static QName _OrderStatus_QNAME = new QName("http://webservice.feedme.com/", "orderStatus");
    private final static QName _RemoveOrderStatusResponse_QNAME = new QName("http://webservice.feedme.com/", "removeOrderStatusResponse");
    private final static QName _FetchProductsByNameResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchProductsByNameResponse");
    private final static QName _FetchProductsByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchProductsByIdResponse");
    private final static QName _UpdateManagerPassword_QNAME = new QName("http://webservice.feedme.com/", "updateManagerPassword");
    private final static QName _FetchProductsResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchProductsResponse");
    private final static QName _AddLog_QNAME = new QName("http://webservice.feedme.com/", "addLog");
    private final static QName _RemovePromoted_QNAME = new QName("http://webservice.feedme.com/", "removePromoted");
    private final static QName _AddPromotedResponse_QNAME = new QName("http://webservice.feedme.com/", "addPromotedResponse");
    private final static QName _FetchEmployeeByUsernameResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployeeByUsernameResponse");
    private final static QName _FetchLogById_QNAME = new QName("http://webservice.feedme.com/", "fetchLogById");
    private final static QName _FetchProductsById_QNAME = new QName("http://webservice.feedme.com/", "fetchProductsById");
    private final static QName _FetchManagerByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchManagerByIdResponse");
    private final static QName _LoginEmployee_QNAME = new QName("http://webservice.feedme.com/", "loginEmployee");
    private final static QName _UpdateOrder_QNAME = new QName("http://webservice.feedme.com/", "updateOrder");
    private final static QName _FetchEmployeesByManagerResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployeesByManagerResponse");
    private final static QName _FetchPriviledges_QNAME = new QName("http://webservice.feedme.com/", "fetchPriviledges");
    private final static QName _UpdatePromotedResponse_QNAME = new QName("http://webservice.feedme.com/", "updatePromotedResponse");
    private final static QName _AddPromoted_QNAME = new QName("http://webservice.feedme.com/", "addPromoted");
    private final static QName _FetchPromotedByTime_QNAME = new QName("http://webservice.feedme.com/", "fetchPromotedByTime");
    private final static QName _FetchEmployeeByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployeeByIdResponse");
    private final static QName _OrderDetail_QNAME = new QName("http://webservice.feedme.com/", "orderDetail");
    private final static QName _UpdateCategoryResponse_QNAME = new QName("http://webservice.feedme.com/", "updateCategoryResponse");
    private final static QName _UpdatePriviledgeResponse_QNAME = new QName("http://webservice.feedme.com/", "updatePriviledgeResponse");
    private final static QName _Category_QNAME = new QName("http://webservice.feedme.com/", "category");
    private final static QName _FetchLogsResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchLogsResponse");
    private final static QName _RemoveManager_QNAME = new QName("http://webservice.feedme.com/", "removeManager");
    private final static QName _FetchPriviledgeById_QNAME = new QName("http://webservice.feedme.com/", "fetchPriviledgeById");
    private final static QName _RemovePriviledgeResponse_QNAME = new QName("http://webservice.feedme.com/", "removePriviledgeResponse");
    private final static QName _UpdateProduct_QNAME = new QName("http://webservice.feedme.com/", "updateProduct");
    private final static QName _FetchProductsByName_QNAME = new QName("http://webservice.feedme.com/", "fetchProductsByName");
    private final static QName _RemoveProductResponse_QNAME = new QName("http://webservice.feedme.com/", "removeProductResponse");
    private final static QName _AddCategoryResponse_QNAME = new QName("http://webservice.feedme.com/", "addCategoryResponse");
    private final static QName _FetchEmployeesByManager_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployeesByManager");
    private final static QName _UpdateOrderStatusResponse_QNAME = new QName("http://webservice.feedme.com/", "updateOrderStatusResponse");
    private final static QName _Employee_QNAME = new QName("http://webservice.feedme.com/", "employee");
    private final static QName _FetchPromotedByTimeResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchPromotedByTimeResponse");
    private final static QName _FetchEmployeesResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployeesResponse");
    private final static QName _FetchLogByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchLogByIdResponse");
    private final static QName _UpdateEmployee_QNAME = new QName("http://webservice.feedme.com/", "updateEmployee");
    private final static QName _FetchLogsByEmployee_QNAME = new QName("http://webservice.feedme.com/", "fetchLogsByEmployee");
    private final static QName _UpdateProperties_QNAME = new QName("http://webservice.feedme.com/", "updateProperties");
    private final static QName _RemoveLogResponse_QNAME = new QName("http://webservice.feedme.com/", "removeLogResponse");
    private final static QName _UpdatePriviledge_QNAME = new QName("http://webservice.feedme.com/", "updatePriviledge");
    private final static QName _FetchPromotedById_QNAME = new QName("http://webservice.feedme.com/", "fetchPromotedById");
    private final static QName _RemoveManagerResponse_QNAME = new QName("http://webservice.feedme.com/", "removeManagerResponse");
    private final static QName _FetchEmployeeByUsername_QNAME = new QName("http://webservice.feedme.com/", "fetchEmployeeByUsername");
    private final static QName _FetchOrderStatusByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchOrderStatusByIdResponse");
    private final static QName _FetchPriviledgeByIdResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchPriviledgeByIdResponse");
    private final static QName _Priviledge_QNAME = new QName("http://webservice.feedme.com/", "priviledge");
    private final static QName _FetchLogs_QNAME = new QName("http://webservice.feedme.com/", "fetchLogs");
    private final static QName _RemoveCategoryResponse_QNAME = new QName("http://webservice.feedme.com/", "removeCategoryResponse");
    private final static QName _RemovePromotedResponse_QNAME = new QName("http://webservice.feedme.com/", "removePromotedResponse");
    private final static QName _RemoveOrder_QNAME = new QName("http://webservice.feedme.com/", "removeOrder");
    private final static QName _FetchManagerById_QNAME = new QName("http://webservice.feedme.com/", "fetchManagerById");
    private final static QName _LoginManagerResponse_QNAME = new QName("http://webservice.feedme.com/", "loginManagerResponse");
    private final static QName _FetchManagersResponse_QNAME = new QName("http://webservice.feedme.com/", "fetchManagersResponse");
    private final static QName _UpdateManagerResponse_QNAME = new QName("http://webservice.feedme.com/", "updateManagerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.feedme.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOrderStatusResponse }
     * 
     */
    public AddOrderStatusResponse createAddOrderStatusResponse() {
        return new AddOrderStatusResponse();
    }

    /**
     * Create an instance of {@link RemoveOrderResponse }
     * 
     */
    public RemoveOrderResponse createRemoveOrderResponse() {
        return new RemoveOrderResponse();
    }

    /**
     * Create an instance of {@link AddPriviledgeResponse }
     * 
     */
    public AddPriviledgeResponse createAddPriviledgeResponse() {
        return new AddPriviledgeResponse();
    }

    /**
     * Create an instance of {@link FetchProductByCategoryResponse }
     * 
     */
    public FetchProductByCategoryResponse createFetchProductByCategoryResponse() {
        return new FetchProductByCategoryResponse();
    }

    /**
     * Create an instance of {@link RemoveProduct }
     * 
     */
    public RemoveProduct createRemoveProduct() {
        return new RemoveProduct();
    }

    /**
     * Create an instance of {@link RemovePropertiesResponse }
     * 
     */
    public RemovePropertiesResponse createRemovePropertiesResponse() {
        return new RemovePropertiesResponse();
    }

    /**
     * Create an instance of {@link UpdateCategory }
     * 
     */
    public UpdateCategory createUpdateCategory() {
        return new UpdateCategory();
    }

    /**
     * Create an instance of {@link UpdatePromoted }
     * 
     */
    public UpdatePromoted createUpdatePromoted() {
        return new UpdatePromoted();
    }

    /**
     * Create an instance of {@link FetchProperties }
     * 
     */
    public FetchProperties createFetchProperties() {
        return new FetchProperties();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link Promoted }
     * 
     */
    public Promoted createPromoted() {
        return new Promoted();
    }

    /**
     * Create an instance of {@link FetchProductByNameAndCategory }
     * 
     */
    public FetchProductByNameAndCategory createFetchProductByNameAndCategory() {
        return new FetchProductByNameAndCategory();
    }

    /**
     * Create an instance of {@link FetchPromoteds }
     * 
     */
    public FetchPromoteds createFetchPromoteds() {
        return new FetchPromoteds();
    }

    /**
     * Create an instance of {@link UpdateManagerPasswordResponse }
     * 
     */
    public UpdateManagerPasswordResponse createUpdateManagerPasswordResponse() {
        return new UpdateManagerPasswordResponse();
    }

    /**
     * Create an instance of {@link FetchManagers }
     * 
     */
    public FetchManagers createFetchManagers() {
        return new FetchManagers();
    }

    /**
     * Create an instance of {@link RemoveEmployeeResponse }
     * 
     */
    public RemoveEmployeeResponse createRemoveEmployeeResponse() {
        return new RemoveEmployeeResponse();
    }

    /**
     * Create an instance of {@link FetchLogsByEmployeeResponse }
     * 
     */
    public FetchLogsByEmployeeResponse createFetchLogsByEmployeeResponse() {
        return new FetchLogsByEmployeeResponse();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link FetchCategoryById }
     * 
     */
    public FetchCategoryById createFetchCategoryById() {
        return new FetchCategoryById();
    }

    /**
     * Create an instance of {@link FetchProducts }
     * 
     */
    public FetchProducts createFetchProducts() {
        return new FetchProducts();
    }

    /**
     * Create an instance of {@link FetchEmployeeById }
     * 
     */
    public FetchEmployeeById createFetchEmployeeById() {
        return new FetchEmployeeById();
    }

    /**
     * Create an instance of {@link AddPropertie }
     * 
     */
    public AddPropertie createAddPropertie() {
        return new AddPropertie();
    }

    /**
     * Create an instance of {@link UpdatePropertiesResponse }
     * 
     */
    public UpdatePropertiesResponse createUpdatePropertiesResponse() {
        return new UpdatePropertiesResponse();
    }

    /**
     * Create an instance of {@link AddPropertieResponse }
     * 
     */
    public AddPropertieResponse createAddPropertieResponse() {
        return new AddPropertieResponse();
    }

    /**
     * Create an instance of {@link FetchOrdersByEmployeeResponse }
     * 
     */
    public FetchOrdersByEmployeeResponse createFetchOrdersByEmployeeResponse() {
        return new FetchOrdersByEmployeeResponse();
    }

    /**
     * Create an instance of {@link AddLogResponse }
     * 
     */
    public AddLogResponse createAddLogResponse() {
        return new AddLogResponse();
    }

    /**
     * Create an instance of {@link FetchOrderByIdResponse }
     * 
     */
    public FetchOrderByIdResponse createFetchOrderByIdResponse() {
        return new FetchOrderByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateManager }
     * 
     */
    public UpdateManager createUpdateManager() {
        return new UpdateManager();
    }

    /**
     * Create an instance of {@link FetchProductByNameAndCategoryResponse }
     * 
     */
    public FetchProductByNameAndCategoryResponse createFetchProductByNameAndCategoryResponse() {
        return new FetchProductByNameAndCategoryResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link UpdateOrderResponse }
     * 
     */
    public UpdateOrderResponse createUpdateOrderResponse() {
        return new UpdateOrderResponse();
    }

    /**
     * Create an instance of {@link AddManager }
     * 
     */
    public AddManager createAddManager() {
        return new AddManager();
    }

    /**
     * Create an instance of {@link RemoveEmployee }
     * 
     */
    public RemoveEmployee createRemoveEmployee() {
        return new RemoveEmployee();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link FetchPropertieByKey }
     * 
     */
    public FetchPropertieByKey createFetchPropertieByKey() {
        return new FetchPropertieByKey();
    }

    /**
     * Create an instance of {@link AddCategory }
     * 
     */
    public AddCategory createAddCategory() {
        return new AddCategory();
    }

    /**
     * Create an instance of {@link FetchOrderById }
     * 
     */
    public FetchOrderById createFetchOrderById() {
        return new FetchOrderById();
    }

    /**
     * Create an instance of {@link RemoveLog }
     * 
     */
    public RemoveLog createRemoveLog() {
        return new RemoveLog();
    }

    /**
     * Create an instance of {@link AddOrderStatus }
     * 
     */
    public AddOrderStatus createAddOrderStatus() {
        return new AddOrderStatus();
    }

    /**
     * Create an instance of {@link FetchOrderStatusById }
     * 
     */
    public FetchOrderStatusById createFetchOrderStatusById() {
        return new FetchOrderStatusById();
    }

    /**
     * Create an instance of {@link FetchOrdersByEmployee }
     * 
     */
    public FetchOrdersByEmployee createFetchOrdersByEmployee() {
        return new FetchOrdersByEmployee();
    }

    /**
     * Create an instance of {@link LoginEmployeeResponse }
     * 
     */
    public LoginEmployeeResponse createLoginEmployeeResponse() {
        return new LoginEmployeeResponse();
    }

    /**
     * Create an instance of {@link FetchPromotedsResponse }
     * 
     */
    public FetchPromotedsResponse createFetchPromotedsResponse() {
        return new FetchPromotedsResponse();
    }

    /**
     * Create an instance of {@link RemoveProperties }
     * 
     */
    public RemoveProperties createRemoveProperties() {
        return new RemoveProperties();
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link FetchPropertieByKeyResponse }
     * 
     */
    public FetchPropertieByKeyResponse createFetchPropertieByKeyResponse() {
        return new FetchPropertieByKeyResponse();
    }

    /**
     * Create an instance of {@link RemoveCategory }
     * 
     */
    public RemoveCategory createRemoveCategory() {
        return new RemoveCategory();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link FetchOrderStatus }
     * 
     */
    public FetchOrderStatus createFetchOrderStatus() {
        return new FetchOrderStatus();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link FetchProductByCategory }
     * 
     */
    public FetchProductByCategory createFetchProductByCategory() {
        return new FetchProductByCategory();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link UpdateLogResponse }
     * 
     */
    public UpdateLogResponse createUpdateLogResponse() {
        return new UpdateLogResponse();
    }

    /**
     * Create an instance of {@link AddManagerResponse }
     * 
     */
    public AddManagerResponse createAddManagerResponse() {
        return new AddManagerResponse();
    }

    /**
     * Create an instance of {@link FetchPromotedByIdResponse }
     * 
     */
    public FetchPromotedByIdResponse createFetchPromotedByIdResponse() {
        return new FetchPromotedByIdResponse();
    }

    /**
     * Create an instance of {@link FetchPropertiesResponse }
     * 
     */
    public FetchPropertiesResponse createFetchPropertiesResponse() {
        return new FetchPropertiesResponse();
    }

    /**
     * Create an instance of {@link Manager }
     * 
     */
    public Manager createManager() {
        return new Manager();
    }

    /**
     * Create an instance of {@link RemovePriviledge }
     * 
     */
    public RemovePriviledge createRemovePriviledge() {
        return new RemovePriviledge();
    }

    /**
     * Create an instance of {@link FetchEmployees }
     * 
     */
    public FetchEmployees createFetchEmployees() {
        return new FetchEmployees();
    }

    /**
     * Create an instance of {@link RemoveOrderStatus }
     * 
     */
    public RemoveOrderStatus createRemoveOrderStatus() {
        return new RemoveOrderStatus();
    }

    /**
     * Create an instance of {@link UpdateLog }
     * 
     */
    public UpdateLog createUpdateLog() {
        return new UpdateLog();
    }

    /**
     * Create an instance of {@link UpdateOrderStatus }
     * 
     */
    public UpdateOrderStatus createUpdateOrderStatus() {
        return new UpdateOrderStatus();
    }

    /**
     * Create an instance of {@link FetchPriviledgesResponse }
     * 
     */
    public FetchPriviledgesResponse createFetchPriviledgesResponse() {
        return new FetchPriviledgesResponse();
    }

    /**
     * Create an instance of {@link FetchCategories }
     * 
     */
    public FetchCategories createFetchCategories() {
        return new FetchCategories();
    }

    /**
     * Create an instance of {@link LoginManager }
     * 
     */
    public LoginManager createLoginManager() {
        return new LoginManager();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link FetchPriviledgeById }
     * 
     */
    public FetchPriviledgeById createFetchPriviledgeById() {
        return new FetchPriviledgeById();
    }

    /**
     * Create an instance of {@link FetchLogsResponse }
     * 
     */
    public FetchLogsResponse createFetchLogsResponse() {
        return new FetchLogsResponse();
    }

    /**
     * Create an instance of {@link RemoveManager }
     * 
     */
    public RemoveManager createRemoveManager() {
        return new RemoveManager();
    }

    /**
     * Create an instance of {@link FetchProductsByName }
     * 
     */
    public FetchProductsByName createFetchProductsByName() {
        return new FetchProductsByName();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link RemovePriviledgeResponse }
     * 
     */
    public RemovePriviledgeResponse createRemovePriviledgeResponse() {
        return new RemovePriviledgeResponse();
    }

    /**
     * Create an instance of {@link AddCategoryResponse }
     * 
     */
    public AddCategoryResponse createAddCategoryResponse() {
        return new AddCategoryResponse();
    }

    /**
     * Create an instance of {@link RemoveProductResponse }
     * 
     */
    public RemoveProductResponse createRemoveProductResponse() {
        return new RemoveProductResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link UpdateOrderStatusResponse }
     * 
     */
    public UpdateOrderStatusResponse createUpdateOrderStatusResponse() {
        return new UpdateOrderStatusResponse();
    }

    /**
     * Create an instance of {@link FetchEmployeesByManager }
     * 
     */
    public FetchEmployeesByManager createFetchEmployeesByManager() {
        return new FetchEmployeesByManager();
    }

    /**
     * Create an instance of {@link FetchEmployeesResponse }
     * 
     */
    public FetchEmployeesResponse createFetchEmployeesResponse() {
        return new FetchEmployeesResponse();
    }

    /**
     * Create an instance of {@link FetchPromotedByTimeResponse }
     * 
     */
    public FetchPromotedByTimeResponse createFetchPromotedByTimeResponse() {
        return new FetchPromotedByTimeResponse();
    }

    /**
     * Create an instance of {@link UpdateProperties }
     * 
     */
    public UpdateProperties createUpdateProperties() {
        return new UpdateProperties();
    }

    /**
     * Create an instance of {@link FetchLogsByEmployee }
     * 
     */
    public FetchLogsByEmployee createFetchLogsByEmployee() {
        return new FetchLogsByEmployee();
    }

    /**
     * Create an instance of {@link FetchLogByIdResponse }
     * 
     */
    public FetchLogByIdResponse createFetchLogByIdResponse() {
        return new FetchLogByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link UpdatePriviledge }
     * 
     */
    public UpdatePriviledge createUpdatePriviledge() {
        return new UpdatePriviledge();
    }

    /**
     * Create an instance of {@link RemoveLogResponse }
     * 
     */
    public RemoveLogResponse createRemoveLogResponse() {
        return new RemoveLogResponse();
    }

    /**
     * Create an instance of {@link FetchPromotedById }
     * 
     */
    public FetchPromotedById createFetchPromotedById() {
        return new FetchPromotedById();
    }

    /**
     * Create an instance of {@link RemoveManagerResponse }
     * 
     */
    public RemoveManagerResponse createRemoveManagerResponse() {
        return new RemoveManagerResponse();
    }

    /**
     * Create an instance of {@link FetchEmployeeByUsername }
     * 
     */
    public FetchEmployeeByUsername createFetchEmployeeByUsername() {
        return new FetchEmployeeByUsername();
    }

    /**
     * Create an instance of {@link Priviledge }
     * 
     */
    public Priviledge createPriviledge() {
        return new Priviledge();
    }

    /**
     * Create an instance of {@link FetchOrderStatusByIdResponse }
     * 
     */
    public FetchOrderStatusByIdResponse createFetchOrderStatusByIdResponse() {
        return new FetchOrderStatusByIdResponse();
    }

    /**
     * Create an instance of {@link FetchPriviledgeByIdResponse }
     * 
     */
    public FetchPriviledgeByIdResponse createFetchPriviledgeByIdResponse() {
        return new FetchPriviledgeByIdResponse();
    }

    /**
     * Create an instance of {@link FetchLogs }
     * 
     */
    public FetchLogs createFetchLogs() {
        return new FetchLogs();
    }

    /**
     * Create an instance of {@link RemoveOrder }
     * 
     */
    public RemoveOrder createRemoveOrder() {
        return new RemoveOrder();
    }

    /**
     * Create an instance of {@link RemoveCategoryResponse }
     * 
     */
    public RemoveCategoryResponse createRemoveCategoryResponse() {
        return new RemoveCategoryResponse();
    }

    /**
     * Create an instance of {@link RemovePromotedResponse }
     * 
     */
    public RemovePromotedResponse createRemovePromotedResponse() {
        return new RemovePromotedResponse();
    }

    /**
     * Create an instance of {@link FetchManagersResponse }
     * 
     */
    public FetchManagersResponse createFetchManagersResponse() {
        return new FetchManagersResponse();
    }

    /**
     * Create an instance of {@link UpdateManagerResponse }
     * 
     */
    public UpdateManagerResponse createUpdateManagerResponse() {
        return new UpdateManagerResponse();
    }

    /**
     * Create an instance of {@link LoginManagerResponse }
     * 
     */
    public LoginManagerResponse createLoginManagerResponse() {
        return new LoginManagerResponse();
    }

    /**
     * Create an instance of {@link FetchManagerById }
     * 
     */
    public FetchManagerById createFetchManagerById() {
        return new FetchManagerById();
    }

    /**
     * Create an instance of {@link FetchCategoriesResponse }
     * 
     */
    public FetchCategoriesResponse createFetchCategoriesResponse() {
        return new FetchCategoriesResponse();
    }

    /**
     * Create an instance of {@link FetchOrdersResponse }
     * 
     */
    public FetchOrdersResponse createFetchOrdersResponse() {
        return new FetchOrdersResponse();
    }

    /**
     * Create an instance of {@link FetchOrders }
     * 
     */
    public FetchOrders createFetchOrders() {
        return new FetchOrders();
    }

    /**
     * Create an instance of {@link AddPriviledge }
     * 
     */
    public AddPriviledge createAddPriviledge() {
        return new AddPriviledge();
    }

    /**
     * Create an instance of {@link FetchCategoryByIdResponse }
     * 
     */
    public FetchCategoryByIdResponse createFetchCategoryByIdResponse() {
        return new FetchCategoryByIdResponse();
    }

    /**
     * Create an instance of {@link FetchOrderStatusResponse }
     * 
     */
    public FetchOrderStatusResponse createFetchOrderStatusResponse() {
        return new FetchOrderStatusResponse();
    }

    /**
     * Create an instance of {@link OrderStatus }
     * 
     */
    public OrderStatus createOrderStatus() {
        return new OrderStatus();
    }

    /**
     * Create an instance of {@link RemoveOrderStatusResponse }
     * 
     */
    public RemoveOrderStatusResponse createRemoveOrderStatusResponse() {
        return new RemoveOrderStatusResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link FetchProductsByIdResponse }
     * 
     */
    public FetchProductsByIdResponse createFetchProductsByIdResponse() {
        return new FetchProductsByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateManagerPassword }
     * 
     */
    public UpdateManagerPassword createUpdateManagerPassword() {
        return new UpdateManagerPassword();
    }

    /**
     * Create an instance of {@link FetchProductsByNameResponse }
     * 
     */
    public FetchProductsByNameResponse createFetchProductsByNameResponse() {
        return new FetchProductsByNameResponse();
    }

    /**
     * Create an instance of {@link AddPromotedResponse }
     * 
     */
    public AddPromotedResponse createAddPromotedResponse() {
        return new AddPromotedResponse();
    }

    /**
     * Create an instance of {@link FetchEmployeeByUsernameResponse }
     * 
     */
    public FetchEmployeeByUsernameResponse createFetchEmployeeByUsernameResponse() {
        return new FetchEmployeeByUsernameResponse();
    }

    /**
     * Create an instance of {@link FetchLogById }
     * 
     */
    public FetchLogById createFetchLogById() {
        return new FetchLogById();
    }

    /**
     * Create an instance of {@link AddLog }
     * 
     */
    public AddLog createAddLog() {
        return new AddLog();
    }

    /**
     * Create an instance of {@link RemovePromoted }
     * 
     */
    public RemovePromoted createRemovePromoted() {
        return new RemovePromoted();
    }

    /**
     * Create an instance of {@link FetchProductsResponse }
     * 
     */
    public FetchProductsResponse createFetchProductsResponse() {
        return new FetchProductsResponse();
    }

    /**
     * Create an instance of {@link FetchManagerByIdResponse }
     * 
     */
    public FetchManagerByIdResponse createFetchManagerByIdResponse() {
        return new FetchManagerByIdResponse();
    }

    /**
     * Create an instance of {@link FetchProductsById }
     * 
     */
    public FetchProductsById createFetchProductsById() {
        return new FetchProductsById();
    }

    /**
     * Create an instance of {@link LoginEmployee }
     * 
     */
    public LoginEmployee createLoginEmployee() {
        return new LoginEmployee();
    }

    /**
     * Create an instance of {@link FetchEmployeesByManagerResponse }
     * 
     */
    public FetchEmployeesByManagerResponse createFetchEmployeesByManagerResponse() {
        return new FetchEmployeesByManagerResponse();
    }

    /**
     * Create an instance of {@link UpdateOrder }
     * 
     */
    public UpdateOrder createUpdateOrder() {
        return new UpdateOrder();
    }

    /**
     * Create an instance of {@link FetchPriviledges }
     * 
     */
    public FetchPriviledges createFetchPriviledges() {
        return new FetchPriviledges();
    }

    /**
     * Create an instance of {@link AddPromoted }
     * 
     */
    public AddPromoted createAddPromoted() {
        return new AddPromoted();
    }

    /**
     * Create an instance of {@link UpdatePromotedResponse }
     * 
     */
    public UpdatePromotedResponse createUpdatePromotedResponse() {
        return new UpdatePromotedResponse();
    }

    /**
     * Create an instance of {@link FetchPromotedByTime }
     * 
     */
    public FetchPromotedByTime createFetchPromotedByTime() {
        return new FetchPromotedByTime();
    }

    /**
     * Create an instance of {@link FetchEmployeeByIdResponse }
     * 
     */
    public FetchEmployeeByIdResponse createFetchEmployeeByIdResponse() {
        return new FetchEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link OrderDetail }
     * 
     */
    public OrderDetail createOrderDetail() {
        return new OrderDetail();
    }

    /**
     * Create an instance of {@link UpdateCategoryResponse }
     * 
     */
    public UpdateCategoryResponse createUpdateCategoryResponse() {
        return new UpdateCategoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePriviledgeResponse }
     * 
     */
    public UpdatePriviledgeResponse createUpdatePriviledgeResponse() {
        return new UpdatePriviledgeResponse();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link SingleInformation }
     * 
     */
    public SingleInformation createSingleInformation() {
        return new SingleInformation();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link PropertyDTO }
     * 
     */
    public PropertyDTO createPropertyDTO() {
        return new PropertyDTO();
    }

    /**
     * Create an instance of {@link EmployeeDTO }
     * 
     */
    public EmployeeDTO createEmployeeDTO() {
        return new EmployeeDTO();
    }

    /**
     * Create an instance of {@link PromotedDTO }
     * 
     */
    public PromotedDTO createPromotedDTO() {
        return new PromotedDTO();
    }

    /**
     * Create an instance of {@link ManagerDTO }
     * 
     */
    public ManagerDTO createManagerDTO() {
        return new ManagerDTO();
    }

    /**
     * Create an instance of {@link LogDTO }
     * 
     */
    public LogDTO createLogDTO() {
        return new LogDTO();
    }

    /**
     * Create an instance of {@link OrderDetailDTO }
     * 
     */
    public OrderDetailDTO createOrderDetailDTO() {
        return new OrderDetailDTO();
    }

    /**
     * Create an instance of {@link CategoryDTO }
     * 
     */
    public CategoryDTO createCategoryDTO() {
        return new CategoryDTO();
    }

    /**
     * Create an instance of {@link PriviledgeDTO }
     * 
     */
    public PriviledgeDTO createPriviledgeDTO() {
        return new PriviledgeDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "log")
    public JAXBElement<Log> createLog(Log value) {
        return new JAXBElement<Log>(_Log_QNAME, Log.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateOrderResponse")
    public JAXBElement<UpdateOrderResponse> createUpdateOrderResponse(UpdateOrderResponse value) {
        return new JAXBElement<UpdateOrderResponse>(_UpdateOrderResponse_QNAME, UpdateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeEmployee")
    public JAXBElement<RemoveEmployee> createRemoveEmployee(RemoveEmployee value) {
        return new JAXBElement<RemoveEmployee>(_RemoveEmployee_QNAME, RemoveEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addManager")
    public JAXBElement<AddManager> createAddManager(AddManager value) {
        return new JAXBElement<AddManager>(_AddManager_QNAME, AddManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addCategory")
    public JAXBElement<AddCategory> createAddCategory(AddCategory value) {
        return new JAXBElement<AddCategory>(_AddCategory_QNAME, AddCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrderById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrderById")
    public JAXBElement<FetchOrderById> createFetchOrderById(FetchOrderById value) {
        return new JAXBElement<FetchOrderById>(_FetchOrderById_QNAME, FetchOrderById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeLog")
    public JAXBElement<RemoveLog> createRemoveLog(RemoveLog value) {
        return new JAXBElement<RemoveLog>(_RemoveLog_QNAME, RemoveLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPropertieByKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPropertieByKey")
    public JAXBElement<FetchPropertieByKey> createFetchPropertieByKey(FetchPropertieByKey value) {
        return new JAXBElement<FetchPropertieByKey>(_FetchPropertieByKey_QNAME, FetchPropertieByKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrdersByEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrdersByEmployee")
    public JAXBElement<FetchOrdersByEmployee> createFetchOrdersByEmployee(FetchOrdersByEmployee value) {
        return new JAXBElement<FetchOrdersByEmployee>(_FetchOrdersByEmployee_QNAME, FetchOrdersByEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "loginEmployeeResponse")
    public JAXBElement<LoginEmployeeResponse> createLoginEmployeeResponse(LoginEmployeeResponse value) {
        return new JAXBElement<LoginEmployeeResponse>(_LoginEmployeeResponse_QNAME, LoginEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrderStatusById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrderStatusById")
    public JAXBElement<FetchOrderStatusById> createFetchOrderStatusById(FetchOrderStatusById value) {
        return new JAXBElement<FetchOrderStatusById>(_FetchOrderStatusById_QNAME, FetchOrderStatusById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addOrderStatus")
    public JAXBElement<AddOrderStatus> createAddOrderStatus(AddOrderStatus value) {
        return new JAXBElement<AddOrderStatus>(_AddOrderStatus_QNAME, AddOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeProperties")
    public JAXBElement<RemoveProperties> createRemoveProperties(RemoveProperties value) {
        return new JAXBElement<RemoveProperties>(_RemoveProperties_QNAME, RemoveProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPromotedsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPromotedsResponse")
    public JAXBElement<FetchPromotedsResponse> createFetchPromotedsResponse(FetchPromotedsResponse value) {
        return new JAXBElement<FetchPromotedsResponse>(_FetchPromotedsResponse_QNAME, FetchPromotedsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeCategory")
    public JAXBElement<RemoveCategory> createRemoveCategory(RemoveCategory value) {
        return new JAXBElement<RemoveCategory>(_RemoveCategory_QNAME, RemoveCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPropertieByKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPropertieByKeyResponse")
    public JAXBElement<FetchPropertieByKeyResponse> createFetchPropertieByKeyResponse(FetchPropertieByKeyResponse value) {
        return new JAXBElement<FetchPropertieByKeyResponse>(_FetchPropertieByKeyResponse_QNAME, FetchPropertieByKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addOrder")
    public JAXBElement<AddOrder> createAddOrder(AddOrder value) {
        return new JAXBElement<AddOrder>(_AddOrder_QNAME, AddOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrderStatus")
    public JAXBElement<FetchOrderStatus> createFetchOrderStatus(FetchOrderStatus value) {
        return new JAXBElement<FetchOrderStatus>(_FetchOrderStatus_QNAME, FetchOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateEmployeeResponse")
    public JAXBElement<UpdateEmployeeResponse> createUpdateEmployeeResponse(UpdateEmployeeResponse value) {
        return new JAXBElement<UpdateEmployeeResponse>(_UpdateEmployeeResponse_QNAME, UpdateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductByCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductByCategory")
    public JAXBElement<FetchProductByCategory> createFetchProductByCategory(FetchProductByCategory value) {
        return new JAXBElement<FetchProductByCategory>(_FetchProductByCategory_QNAME, FetchProductByCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateLogResponse")
    public JAXBElement<UpdateLogResponse> createUpdateLogResponse(UpdateLogResponse value) {
        return new JAXBElement<UpdateLogResponse>(_UpdateLogResponse_QNAME, UpdateLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePriviledge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removePriviledge")
    public JAXBElement<RemovePriviledge> createRemovePriviledge(RemovePriviledge value) {
        return new JAXBElement<RemovePriviledge>(_RemovePriviledge_QNAME, RemovePriviledge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addManagerResponse")
    public JAXBElement<AddManagerResponse> createAddManagerResponse(AddManagerResponse value) {
        return new JAXBElement<AddManagerResponse>(_AddManagerResponse_QNAME, AddManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPromotedByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPromotedByIdResponse")
    public JAXBElement<FetchPromotedByIdResponse> createFetchPromotedByIdResponse(FetchPromotedByIdResponse value) {
        return new JAXBElement<FetchPromotedByIdResponse>(_FetchPromotedByIdResponse_QNAME, FetchPromotedByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPropertiesResponse")
    public JAXBElement<FetchPropertiesResponse> createFetchPropertiesResponse(FetchPropertiesResponse value) {
        return new JAXBElement<FetchPropertiesResponse>(_FetchPropertiesResponse_QNAME, FetchPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "manager")
    public JAXBElement<Manager> createManager(Manager value) {
        return new JAXBElement<Manager>(_Manager_QNAME, Manager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployees")
    public JAXBElement<FetchEmployees> createFetchEmployees(FetchEmployees value) {
        return new JAXBElement<FetchEmployees>(_FetchEmployees_QNAME, FetchEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeOrderStatus")
    public JAXBElement<RemoveOrderStatus> createRemoveOrderStatus(RemoveOrderStatus value) {
        return new JAXBElement<RemoveOrderStatus>(_RemoveOrderStatus_QNAME, RemoveOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateLog")
    public JAXBElement<UpdateLog> createUpdateLog(UpdateLog value) {
        return new JAXBElement<UpdateLog>(_UpdateLog_QNAME, UpdateLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateOrderStatus")
    public JAXBElement<UpdateOrderStatus> createUpdateOrderStatus(UpdateOrderStatus value) {
        return new JAXBElement<UpdateOrderStatus>(_UpdateOrderStatus_QNAME, UpdateOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchCategories")
    public JAXBElement<FetchCategories> createFetchCategories(FetchCategories value) {
        return new JAXBElement<FetchCategories>(_FetchCategories_QNAME, FetchCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPriviledgesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPriviledgesResponse")
    public JAXBElement<FetchPriviledgesResponse> createFetchPriviledgesResponse(FetchPriviledgesResponse value) {
        return new JAXBElement<FetchPriviledgesResponse>(_FetchPriviledgesResponse_QNAME, FetchPriviledgesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "loginManager")
    public JAXBElement<LoginManager> createLoginManager(LoginManager value) {
        return new JAXBElement<LoginManager>(_LoginManager_QNAME, LoginManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeOrderResponse")
    public JAXBElement<RemoveOrderResponse> createRemoveOrderResponse(RemoveOrderResponse value) {
        return new JAXBElement<RemoveOrderResponse>(_RemoveOrderResponse_QNAME, RemoveOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addOrderStatusResponse")
    public JAXBElement<AddOrderStatusResponse> createAddOrderStatusResponse(AddOrderStatusResponse value) {
        return new JAXBElement<AddOrderStatusResponse>(_AddOrderStatusResponse_QNAME, AddOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removePropertiesResponse")
    public JAXBElement<RemovePropertiesResponse> createRemovePropertiesResponse(RemovePropertiesResponse value) {
        return new JAXBElement<RemovePropertiesResponse>(_RemovePropertiesResponse_QNAME, RemovePropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateCategory")
    public JAXBElement<UpdateCategory> createUpdateCategory(UpdateCategory value) {
        return new JAXBElement<UpdateCategory>(_UpdateCategory_QNAME, UpdateCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPriviledgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addPriviledgeResponse")
    public JAXBElement<AddPriviledgeResponse> createAddPriviledgeResponse(AddPriviledgeResponse value) {
        return new JAXBElement<AddPriviledgeResponse>(_AddPriviledgeResponse_QNAME, AddPriviledgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductByCategoryResponse")
    public JAXBElement<FetchProductByCategoryResponse> createFetchProductByCategoryResponse(FetchProductByCategoryResponse value) {
        return new JAXBElement<FetchProductByCategoryResponse>(_FetchProductByCategoryResponse_QNAME, FetchProductByCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeProduct")
    public JAXBElement<RemoveProduct> createRemoveProduct(RemoveProduct value) {
        return new JAXBElement<RemoveProduct>(_RemoveProduct_QNAME, RemoveProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProperties")
    public JAXBElement<FetchProperties> createFetchProperties(FetchProperties value) {
        return new JAXBElement<FetchProperties>(_FetchProperties_QNAME, FetchProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePromoted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updatePromoted")
    public JAXBElement<UpdatePromoted> createUpdatePromoted(UpdatePromoted value) {
        return new JAXBElement<UpdatePromoted>(_UpdatePromoted_QNAME, UpdatePromoted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductByNameAndCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductByNameAndCategory")
    public JAXBElement<FetchProductByNameAndCategory> createFetchProductByNameAndCategory(FetchProductByNameAndCategory value) {
        return new JAXBElement<FetchProductByNameAndCategory>(_FetchProductByNameAndCategory_QNAME, FetchProductByNameAndCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addOrderResponse")
    public JAXBElement<AddOrderResponse> createAddOrderResponse(AddOrderResponse value) {
        return new JAXBElement<AddOrderResponse>(_AddOrderResponse_QNAME, AddOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Promoted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "promoted")
    public JAXBElement<Promoted> createPromoted(Promoted value) {
        return new JAXBElement<Promoted>(_Promoted_QNAME, Promoted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchManagers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchManagers")
    public JAXBElement<FetchManagers> createFetchManagers(FetchManagers value) {
        return new JAXBElement<FetchManagers>(_FetchManagers_QNAME, FetchManagers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPromoteds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPromoteds")
    public JAXBElement<FetchPromoteds> createFetchPromoteds(FetchPromoteds value) {
        return new JAXBElement<FetchPromoteds>(_FetchPromoteds_QNAME, FetchPromoteds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateManagerPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateManagerPasswordResponse")
    public JAXBElement<UpdateManagerPasswordResponse> createUpdateManagerPasswordResponse(UpdateManagerPasswordResponse value) {
        return new JAXBElement<UpdateManagerPasswordResponse>(_UpdateManagerPasswordResponse_QNAME, UpdateManagerPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeEmployeeResponse")
    public JAXBElement<RemoveEmployeeResponse> createRemoveEmployeeResponse(RemoveEmployeeResponse value) {
        return new JAXBElement<RemoveEmployeeResponse>(_RemoveEmployeeResponse_QNAME, RemoveEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchCategoryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchCategoryById")
    public JAXBElement<FetchCategoryById> createFetchCategoryById(FetchCategoryById value) {
        return new JAXBElement<FetchCategoryById>(_FetchCategoryById_QNAME, FetchCategoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProducts")
    public JAXBElement<FetchProducts> createFetchProducts(FetchProducts value) {
        return new JAXBElement<FetchProducts>(_FetchProducts_QNAME, FetchProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchLogsByEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchLogsByEmployeeResponse")
    public JAXBElement<FetchLogsByEmployeeResponse> createFetchLogsByEmployeeResponse(FetchLogsByEmployeeResponse value) {
        return new JAXBElement<FetchLogsByEmployeeResponse>(_FetchLogsByEmployeeResponse_QNAME, FetchLogsByEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "property")
    public JAXBElement<Property> createProperty(Property value) {
        return new JAXBElement<Property>(_Property_QNAME, Property.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployeeById")
    public JAXBElement<FetchEmployeeById> createFetchEmployeeById(FetchEmployeeById value) {
        return new JAXBElement<FetchEmployeeById>(_FetchEmployeeById_QNAME, FetchEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPropertie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addPropertie")
    public JAXBElement<AddPropertie> createAddPropertie(AddPropertie value) {
        return new JAXBElement<AddPropertie>(_AddPropertie_QNAME, AddPropertie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updatePropertiesResponse")
    public JAXBElement<UpdatePropertiesResponse> createUpdatePropertiesResponse(UpdatePropertiesResponse value) {
        return new JAXBElement<UpdatePropertiesResponse>(_UpdatePropertiesResponse_QNAME, UpdatePropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPropertieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addPropertieResponse")
    public JAXBElement<AddPropertieResponse> createAddPropertieResponse(AddPropertieResponse value) {
        return new JAXBElement<AddPropertieResponse>(_AddPropertieResponse_QNAME, AddPropertieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addLogResponse")
    public JAXBElement<AddLogResponse> createAddLogResponse(AddLogResponse value) {
        return new JAXBElement<AddLogResponse>(_AddLogResponse_QNAME, AddLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrderByIdResponse")
    public JAXBElement<FetchOrderByIdResponse> createFetchOrderByIdResponse(FetchOrderByIdResponse value) {
        return new JAXBElement<FetchOrderByIdResponse>(_FetchOrderByIdResponse_QNAME, FetchOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrdersByEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrdersByEmployeeResponse")
    public JAXBElement<FetchOrdersByEmployeeResponse> createFetchOrdersByEmployeeResponse(FetchOrdersByEmployeeResponse value) {
        return new JAXBElement<FetchOrdersByEmployeeResponse>(_FetchOrdersByEmployeeResponse_QNAME, FetchOrdersByEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateManager")
    public JAXBElement<UpdateManager> createUpdateManager(UpdateManager value) {
        return new JAXBElement<UpdateManager>(_UpdateManager_QNAME, UpdateManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductByNameAndCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductByNameAndCategoryResponse")
    public JAXBElement<FetchProductByNameAndCategoryResponse> createFetchProductByNameAndCategoryResponse(FetchProductByNameAndCategoryResponse value) {
        return new JAXBElement<FetchProductByNameAndCategoryResponse>(_FetchProductByNameAndCategoryResponse_QNAME, FetchProductByNameAndCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchCategoriesResponse")
    public JAXBElement<FetchCategoriesResponse> createFetchCategoriesResponse(FetchCategoriesResponse value) {
        return new JAXBElement<FetchCategoriesResponse>(_FetchCategoriesResponse_QNAME, FetchCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrdersResponse")
    public JAXBElement<FetchOrdersResponse> createFetchOrdersResponse(FetchOrdersResponse value) {
        return new JAXBElement<FetchOrdersResponse>(_FetchOrdersResponse_QNAME, FetchOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPriviledge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addPriviledge")
    public JAXBElement<AddPriviledge> createAddPriviledge(AddPriviledge value) {
        return new JAXBElement<AddPriviledge>(_AddPriviledge_QNAME, AddPriviledge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrders")
    public JAXBElement<FetchOrders> createFetchOrders(FetchOrders value) {
        return new JAXBElement<FetchOrders>(_FetchOrders_QNAME, FetchOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchCategoryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchCategoryByIdResponse")
    public JAXBElement<FetchCategoryByIdResponse> createFetchCategoryByIdResponse(FetchCategoryByIdResponse value) {
        return new JAXBElement<FetchCategoryByIdResponse>(_FetchCategoryByIdResponse_QNAME, FetchCategoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrderStatusResponse")
    public JAXBElement<FetchOrderStatusResponse> createFetchOrderStatusResponse(FetchOrderStatusResponse value) {
        return new JAXBElement<FetchOrderStatusResponse>(_FetchOrderStatusResponse_QNAME, FetchOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "orderStatus")
    public JAXBElement<OrderStatus> createOrderStatus(OrderStatus value) {
        return new JAXBElement<OrderStatus>(_OrderStatus_QNAME, OrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeOrderStatusResponse")
    public JAXBElement<RemoveOrderStatusResponse> createRemoveOrderStatusResponse(RemoveOrderStatusResponse value) {
        return new JAXBElement<RemoveOrderStatusResponse>(_RemoveOrderStatusResponse_QNAME, RemoveOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductsByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductsByNameResponse")
    public JAXBElement<FetchProductsByNameResponse> createFetchProductsByNameResponse(FetchProductsByNameResponse value) {
        return new JAXBElement<FetchProductsByNameResponse>(_FetchProductsByNameResponse_QNAME, FetchProductsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductsByIdResponse")
    public JAXBElement<FetchProductsByIdResponse> createFetchProductsByIdResponse(FetchProductsByIdResponse value) {
        return new JAXBElement<FetchProductsByIdResponse>(_FetchProductsByIdResponse_QNAME, FetchProductsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateManagerPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateManagerPassword")
    public JAXBElement<UpdateManagerPassword> createUpdateManagerPassword(UpdateManagerPassword value) {
        return new JAXBElement<UpdateManagerPassword>(_UpdateManagerPassword_QNAME, UpdateManagerPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductsResponse")
    public JAXBElement<FetchProductsResponse> createFetchProductsResponse(FetchProductsResponse value) {
        return new JAXBElement<FetchProductsResponse>(_FetchProductsResponse_QNAME, FetchProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addLog")
    public JAXBElement<AddLog> createAddLog(AddLog value) {
        return new JAXBElement<AddLog>(_AddLog_QNAME, AddLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePromoted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removePromoted")
    public JAXBElement<RemovePromoted> createRemovePromoted(RemovePromoted value) {
        return new JAXBElement<RemovePromoted>(_RemovePromoted_QNAME, RemovePromoted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPromotedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addPromotedResponse")
    public JAXBElement<AddPromotedResponse> createAddPromotedResponse(AddPromotedResponse value) {
        return new JAXBElement<AddPromotedResponse>(_AddPromotedResponse_QNAME, AddPromotedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployeeByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployeeByUsernameResponse")
    public JAXBElement<FetchEmployeeByUsernameResponse> createFetchEmployeeByUsernameResponse(FetchEmployeeByUsernameResponse value) {
        return new JAXBElement<FetchEmployeeByUsernameResponse>(_FetchEmployeeByUsernameResponse_QNAME, FetchEmployeeByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchLogById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchLogById")
    public JAXBElement<FetchLogById> createFetchLogById(FetchLogById value) {
        return new JAXBElement<FetchLogById>(_FetchLogById_QNAME, FetchLogById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductsById")
    public JAXBElement<FetchProductsById> createFetchProductsById(FetchProductsById value) {
        return new JAXBElement<FetchProductsById>(_FetchProductsById_QNAME, FetchProductsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchManagerByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchManagerByIdResponse")
    public JAXBElement<FetchManagerByIdResponse> createFetchManagerByIdResponse(FetchManagerByIdResponse value) {
        return new JAXBElement<FetchManagerByIdResponse>(_FetchManagerByIdResponse_QNAME, FetchManagerByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "loginEmployee")
    public JAXBElement<LoginEmployee> createLoginEmployee(LoginEmployee value) {
        return new JAXBElement<LoginEmployee>(_LoginEmployee_QNAME, LoginEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateOrder")
    public JAXBElement<UpdateOrder> createUpdateOrder(UpdateOrder value) {
        return new JAXBElement<UpdateOrder>(_UpdateOrder_QNAME, UpdateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployeesByManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployeesByManagerResponse")
    public JAXBElement<FetchEmployeesByManagerResponse> createFetchEmployeesByManagerResponse(FetchEmployeesByManagerResponse value) {
        return new JAXBElement<FetchEmployeesByManagerResponse>(_FetchEmployeesByManagerResponse_QNAME, FetchEmployeesByManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPriviledges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPriviledges")
    public JAXBElement<FetchPriviledges> createFetchPriviledges(FetchPriviledges value) {
        return new JAXBElement<FetchPriviledges>(_FetchPriviledges_QNAME, FetchPriviledges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePromotedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updatePromotedResponse")
    public JAXBElement<UpdatePromotedResponse> createUpdatePromotedResponse(UpdatePromotedResponse value) {
        return new JAXBElement<UpdatePromotedResponse>(_UpdatePromotedResponse_QNAME, UpdatePromotedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPromoted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addPromoted")
    public JAXBElement<AddPromoted> createAddPromoted(AddPromoted value) {
        return new JAXBElement<AddPromoted>(_AddPromoted_QNAME, AddPromoted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPromotedByTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPromotedByTime")
    public JAXBElement<FetchPromotedByTime> createFetchPromotedByTime(FetchPromotedByTime value) {
        return new JAXBElement<FetchPromotedByTime>(_FetchPromotedByTime_QNAME, FetchPromotedByTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployeeByIdResponse")
    public JAXBElement<FetchEmployeeByIdResponse> createFetchEmployeeByIdResponse(FetchEmployeeByIdResponse value) {
        return new JAXBElement<FetchEmployeeByIdResponse>(_FetchEmployeeByIdResponse_QNAME, FetchEmployeeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "orderDetail")
    public JAXBElement<OrderDetail> createOrderDetail(OrderDetail value) {
        return new JAXBElement<OrderDetail>(_OrderDetail_QNAME, OrderDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateCategoryResponse")
    public JAXBElement<UpdateCategoryResponse> createUpdateCategoryResponse(UpdateCategoryResponse value) {
        return new JAXBElement<UpdateCategoryResponse>(_UpdateCategoryResponse_QNAME, UpdateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePriviledgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updatePriviledgeResponse")
    public JAXBElement<UpdatePriviledgeResponse> createUpdatePriviledgeResponse(UpdatePriviledgeResponse value) {
        return new JAXBElement<UpdatePriviledgeResponse>(_UpdatePriviledgeResponse_QNAME, UpdatePriviledgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchLogsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchLogsResponse")
    public JAXBElement<FetchLogsResponse> createFetchLogsResponse(FetchLogsResponse value) {
        return new JAXBElement<FetchLogsResponse>(_FetchLogsResponse_QNAME, FetchLogsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeManager")
    public JAXBElement<RemoveManager> createRemoveManager(RemoveManager value) {
        return new JAXBElement<RemoveManager>(_RemoveManager_QNAME, RemoveManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPriviledgeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPriviledgeById")
    public JAXBElement<FetchPriviledgeById> createFetchPriviledgeById(FetchPriviledgeById value) {
        return new JAXBElement<FetchPriviledgeById>(_FetchPriviledgeById_QNAME, FetchPriviledgeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePriviledgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removePriviledgeResponse")
    public JAXBElement<RemovePriviledgeResponse> createRemovePriviledgeResponse(RemovePriviledgeResponse value) {
        return new JAXBElement<RemovePriviledgeResponse>(_RemovePriviledgeResponse_QNAME, RemovePriviledgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<UpdateProduct>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductsByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchProductsByName")
    public JAXBElement<FetchProductsByName> createFetchProductsByName(FetchProductsByName value) {
        return new JAXBElement<FetchProductsByName>(_FetchProductsByName_QNAME, FetchProductsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeProductResponse")
    public JAXBElement<RemoveProductResponse> createRemoveProductResponse(RemoveProductResponse value) {
        return new JAXBElement<RemoveProductResponse>(_RemoveProductResponse_QNAME, RemoveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "addCategoryResponse")
    public JAXBElement<AddCategoryResponse> createAddCategoryResponse(AddCategoryResponse value) {
        return new JAXBElement<AddCategoryResponse>(_AddCategoryResponse_QNAME, AddCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployeesByManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployeesByManager")
    public JAXBElement<FetchEmployeesByManager> createFetchEmployeesByManager(FetchEmployeesByManager value) {
        return new JAXBElement<FetchEmployeesByManager>(_FetchEmployeesByManager_QNAME, FetchEmployeesByManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateOrderStatusResponse")
    public JAXBElement<UpdateOrderStatusResponse> createUpdateOrderStatusResponse(UpdateOrderStatusResponse value) {
        return new JAXBElement<UpdateOrderStatusResponse>(_UpdateOrderStatusResponse_QNAME, UpdateOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPromotedByTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPromotedByTimeResponse")
    public JAXBElement<FetchPromotedByTimeResponse> createFetchPromotedByTimeResponse(FetchPromotedByTimeResponse value) {
        return new JAXBElement<FetchPromotedByTimeResponse>(_FetchPromotedByTimeResponse_QNAME, FetchPromotedByTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployeesResponse")
    public JAXBElement<FetchEmployeesResponse> createFetchEmployeesResponse(FetchEmployeesResponse value) {
        return new JAXBElement<FetchEmployeesResponse>(_FetchEmployeesResponse_QNAME, FetchEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchLogByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchLogByIdResponse")
    public JAXBElement<FetchLogByIdResponse> createFetchLogByIdResponse(FetchLogByIdResponse value) {
        return new JAXBElement<FetchLogByIdResponse>(_FetchLogByIdResponse_QNAME, FetchLogByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchLogsByEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchLogsByEmployee")
    public JAXBElement<FetchLogsByEmployee> createFetchLogsByEmployee(FetchLogsByEmployee value) {
        return new JAXBElement<FetchLogsByEmployee>(_FetchLogsByEmployee_QNAME, FetchLogsByEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateProperties")
    public JAXBElement<UpdateProperties> createUpdateProperties(UpdateProperties value) {
        return new JAXBElement<UpdateProperties>(_UpdateProperties_QNAME, UpdateProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeLogResponse")
    public JAXBElement<RemoveLogResponse> createRemoveLogResponse(RemoveLogResponse value) {
        return new JAXBElement<RemoveLogResponse>(_RemoveLogResponse_QNAME, RemoveLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePriviledge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updatePriviledge")
    public JAXBElement<UpdatePriviledge> createUpdatePriviledge(UpdatePriviledge value) {
        return new JAXBElement<UpdatePriviledge>(_UpdatePriviledge_QNAME, UpdatePriviledge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPromotedById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPromotedById")
    public JAXBElement<FetchPromotedById> createFetchPromotedById(FetchPromotedById value) {
        return new JAXBElement<FetchPromotedById>(_FetchPromotedById_QNAME, FetchPromotedById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeManagerResponse")
    public JAXBElement<RemoveManagerResponse> createRemoveManagerResponse(RemoveManagerResponse value) {
        return new JAXBElement<RemoveManagerResponse>(_RemoveManagerResponse_QNAME, RemoveManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchEmployeeByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchEmployeeByUsername")
    public JAXBElement<FetchEmployeeByUsername> createFetchEmployeeByUsername(FetchEmployeeByUsername value) {
        return new JAXBElement<FetchEmployeeByUsername>(_FetchEmployeeByUsername_QNAME, FetchEmployeeByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchOrderStatusByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchOrderStatusByIdResponse")
    public JAXBElement<FetchOrderStatusByIdResponse> createFetchOrderStatusByIdResponse(FetchOrderStatusByIdResponse value) {
        return new JAXBElement<FetchOrderStatusByIdResponse>(_FetchOrderStatusByIdResponse_QNAME, FetchOrderStatusByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchPriviledgeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchPriviledgeByIdResponse")
    public JAXBElement<FetchPriviledgeByIdResponse> createFetchPriviledgeByIdResponse(FetchPriviledgeByIdResponse value) {
        return new JAXBElement<FetchPriviledgeByIdResponse>(_FetchPriviledgeByIdResponse_QNAME, FetchPriviledgeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Priviledge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "priviledge")
    public JAXBElement<Priviledge> createPriviledge(Priviledge value) {
        return new JAXBElement<Priviledge>(_Priviledge_QNAME, Priviledge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchLogs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchLogs")
    public JAXBElement<FetchLogs> createFetchLogs(FetchLogs value) {
        return new JAXBElement<FetchLogs>(_FetchLogs_QNAME, FetchLogs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeCategoryResponse")
    public JAXBElement<RemoveCategoryResponse> createRemoveCategoryResponse(RemoveCategoryResponse value) {
        return new JAXBElement<RemoveCategoryResponse>(_RemoveCategoryResponse_QNAME, RemoveCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePromotedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removePromotedResponse")
    public JAXBElement<RemovePromotedResponse> createRemovePromotedResponse(RemovePromotedResponse value) {
        return new JAXBElement<RemovePromotedResponse>(_RemovePromotedResponse_QNAME, RemovePromotedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "removeOrder")
    public JAXBElement<RemoveOrder> createRemoveOrder(RemoveOrder value) {
        return new JAXBElement<RemoveOrder>(_RemoveOrder_QNAME, RemoveOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchManagerById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchManagerById")
    public JAXBElement<FetchManagerById> createFetchManagerById(FetchManagerById value) {
        return new JAXBElement<FetchManagerById>(_FetchManagerById_QNAME, FetchManagerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "loginManagerResponse")
    public JAXBElement<LoginManagerResponse> createLoginManagerResponse(LoginManagerResponse value) {
        return new JAXBElement<LoginManagerResponse>(_LoginManagerResponse_QNAME, LoginManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchManagersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "fetchManagersResponse")
    public JAXBElement<FetchManagersResponse> createFetchManagersResponse(FetchManagersResponse value) {
        return new JAXBElement<FetchManagersResponse>(_FetchManagersResponse_QNAME, FetchManagersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.feedme.com/", name = "updateManagerResponse")
    public JAXBElement<UpdateManagerResponse> createUpdateManagerResponse(UpdateManagerResponse value) {
        return new JAXBElement<UpdateManagerResponse>(_UpdateManagerResponse_QNAME, UpdateManagerResponse.class, null, value);
    }

}
