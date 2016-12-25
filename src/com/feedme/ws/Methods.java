/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.ws;

import com.feedme.service.CategoryDTO;
import com.feedme.service.EmployeeDTO;
import com.feedme.service.LogDTO;
import com.feedme.service.ManagerDTO;
import com.feedme.service.OrderDetailDTO;
import com.feedme.service.OrderStatus;
import com.feedme.service.PriviledgeDTO;
import com.feedme.service.ProductDTO;
import com.feedme.service.PromotedDTO;
import com.feedme.service.PropertyDTO;

/**
 *
 * @author Giang
 */
public class Methods {
    private Methods(){};

    public static boolean addCategory(com.feedme.service.CategoryDTO category) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addCategory(category);
    }

    public static boolean addEmployee(com.feedme.service.EmployeeDTO employee) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addEmployee(employee);
    }

    public static boolean addLog(com.feedme.service.LogDTO log) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addLog(log);
    }

    public static boolean addManager(com.feedme.service.ManagerDTO manager) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addManager(manager);
    }

    public static boolean addOrder(com.feedme.service.OrderDetailDTO order) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addOrder(order);
    }

    public static boolean addOrderStatus(com.feedme.service.OrderStatus orderStatus) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addOrderStatus(orderStatus);
    }

    public static boolean addPriviledge(com.feedme.service.PriviledgeDTO priviledge) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addPriviledge(priviledge);
    }

    public static boolean addProduct(com.feedme.service.ProductDTO product) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addProduct(product);
    }

    public static boolean addPromoted(com.feedme.service.PromotedDTO promoted) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addPromoted(promoted);
    }

    public static boolean addProperty(com.feedme.service.PropertyDTO property) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.addPropertie(property);
    }

    public static java.util.List<com.feedme.service.CategoryDTO> fetchCategories() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchCategories();
    }

    public static CategoryDTO fetchCategoryById(short categoryId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchCategoryById(categoryId);
    }

    public static EmployeeDTO fetchEmployeeById(short employeeId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchEmployeeById(employeeId);
    }

    public static EmployeeDTO fetchEmployeeByUsername(java.lang.String employeeUsername) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchEmployeeByUsername(employeeUsername);
    }

    public static java.util.List<com.feedme.service.EmployeeDTO> fetchEmployees() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchEmployees();
    }

    public static java.util.List<com.feedme.service.EmployeeDTO> fetchEmployeesByManager(short managerId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchEmployeesByManager(managerId);
    }

    public static LogDTO fetchLogById(int logId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchLogById(logId);
    }

    public static java.util.List<com.feedme.service.LogDTO> fetchLogs(long fromTime, long toTime) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchLogs(fromTime, toTime);
    }

    public static java.util.List<com.feedme.service.LogDTO> fetchLogsByEmployee(short employeeId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchLogsByEmployee(employeeId);
    }

    public static ManagerDTO fetchManagerById(short managerId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchManagerById(managerId);
    }

    public static java.util.List<com.feedme.service.ManagerDTO> fetchManagers() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchManagers();
    }

    public static OrderDetailDTO fetchOrderById(int orderId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchOrderById(orderId);
    }

    public static java.util.List<com.feedme.service.OrderStatus> fetchOrderStatus() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchOrderStatus();
    }

    public static OrderStatus fetchOrderStatusById(short orderStatusId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchOrderStatusById(orderStatusId);
    }

    public static PriviledgeDTO fetchPriviledgeById(short priviledgeId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchPriviledgeById(priviledgeId);
    }

    public static java.util.List<com.feedme.service.PriviledgeDTO> fetchPriviledges() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchPriviledges();
    }

    public static java.util.List<com.feedme.service.ProductDTO> fetchProducts() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchProducts();
    }

    public static ProductDTO fetchProductsById(short productId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchProductsById(productId);
    }

    public static ProductDTO fetchProductsByName(java.lang.String productName) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return (ProductDTO) port.fetchProductsByName(productName);
    }

    public static PromotedDTO fetchPromotedById(int promotedId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchPromotedById(promotedId);
    }

//    public static java.util.List<com.feedme.service.PromotedDTO> fetchPromoteds() {
//        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
//        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
//        return port.fetchPromoteds();
//    }

    public static PropertyDTO fetchPropertyByKey(java.lang.String key) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchPropertieByKey(key);
    }

    public static java.util.List<com.feedme.service.PropertyDTO> fetchProperties() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchProperties();
    }

    public static EmployeeDTO loginEmployee(com.feedme.service.ManagerDTO manager, java.lang.String employeeUsername) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.loginEmployee(manager, employeeUsername);
    }

    public static ManagerDTO loginManager(java.lang.String username, java.lang.String password) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.loginManager(username, password);
    }

    public static boolean removeCategory(short categoryId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeCategory(categoryId);
    }

    public static boolean removeEmployee(short employeeId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeEmployee(employeeId);
    }

    public static boolean removeLog(int logId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeLog(logId);
    }

    public static boolean removeManager(short managerId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeManager(managerId);
    }

    public static boolean removeOrder(int orderId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeOrder(orderId);
    }

    public static boolean removeOrderStatus(short orderStatusId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeOrderStatus(orderStatusId);
    }

    public static boolean removePriviledge(short priviledId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removePriviledge(priviledId);
    }

    public static boolean removeProduct(short productId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeProduct(productId);
    }

    public static boolean removePromoted(int promotedId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removePromoted(promotedId);
    }

    public static boolean removeProperties(java.lang.String propertyKey) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.removeProperties(propertyKey);
    }

    public static boolean updateCategory(com.feedme.service.CategoryDTO category) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateCategory(category);
    }

    public static boolean updateEmployee(com.feedme.service.EmployeeDTO employee) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateEmployee(employee);
    }

    public static boolean updateLog(com.feedme.service.LogDTO log) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateLog(log);
    }

    public static boolean updateManager(com.feedme.service.ManagerDTO manager) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateManager(manager);
    }

    public static void updateManagerPassword(com.feedme.service.ManagerDTO manager) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        port.updateManagerPassword(manager);
    }

    public static boolean updateOrder(com.feedme.service.OrderDetailDTO order) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateOrder(order);
    }

    public static boolean updateOrderStatus(com.feedme.service.OrderStatus orderStatus) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateOrderStatus(orderStatus);
    }

    public static boolean updatePriviledge(com.feedme.service.PriviledgeDTO updatePriviledge) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updatePriviledge(updatePriviledge);
    }

    public static boolean updateProduct(com.feedme.service.ProductDTO updateProduct) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateProduct(updateProduct);
    }

    public static boolean updatePromoted(com.feedme.service.PromotedDTO promotedUpdate) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updatePromoted(promotedUpdate);
    }

    public static boolean updateProperties(com.feedme.service.PropertyDTO propertyUpdate) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.updateProperties(propertyUpdate);
    }

//    public static java.util.List<com.feedme.service.OrderDetailDTO> fetchOrders(java.lang.String fromTime, java.lang.String toTime) {
//        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
//        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
//        return port.fetchOrders(fromTime, toTime);
//    }
//
//    public static java.util.List<com.feedme.service.OrderDetailDTO> fetchOrdersByEmployee(java.lang.String fromTime, java.lang.String toTime, short employeeId) {
//        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
//        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
//        return port.fetchOrdersByEmployee(fromTime, toTime, employeeId);
//    }

    private static java.util.List<com.feedme.service.Promoted> fetchPromoteds() {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchPromoteds();
    }

    public static java.util.List<com.feedme.service.OrderDetail> fetchOrders(java.lang.String fromTime, java.lang.String toTime) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchOrders(fromTime, toTime);
    }

    public static java.util.List<com.feedme.service.OrderDetail> fetchOrdersByEmployee(java.lang.String fromTime, java.lang.String toTime, short employeeId) {
        com.feedme.service.ApplicationSevice_Service service = new com.feedme.service.ApplicationSevice_Service();
        com.feedme.service.ApplicationSevice port = service.getApplicationSevicePort();
        return port.fetchOrdersByEmployee(fromTime, toTime, employeeId);
    }

   
}
