/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.dto.OrderDTO;
import com.feedme.info.Information;
import com.feedme.info.SingleInformation;
import com.feedme.service.Employee;
import com.feedme.service.OrderDetail;
import com.feedme.service.OrderDetailDTO;
import com.feedme.service.OrderStatus;
import com.feedme.service.ProductDTO;

import com.feedme.utils.Json;
import com.feedme.ws.Methods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sentinel
 */
public class OrderProcess {

    private List<OrderDetail> orderlist;
    private static DefaultListModel orderModel;
    private static DefaultListModel orderProcessModel;
    private static DefaultComboBoxModel orderStatusModel;

    public OrderProcess() {
    }

    /**
     * Load New Order Process
     *
     * @param fromTime
     * @return
     */
    public static List<OrderDetail> loadNewOrder(String fromTime) {
        short empId = Short.parseShort("1");
        Global.ORDER_NEW_LIST = new ArrayList<>();
        getOrders(fromTime).stream().filter((order) -> (order.getEmployee().getId() == empId)).forEach((order) -> {
            Global.ORDER_NEW_LIST.add(order);
        });
        return Global.ORDER_NEW_LIST;
    }

    /**
     * Load Order Processing
     *
     * @param fromTime
     * @return
     */
    public static List<OrderDetail> loadOrderProcessing(String fromTime) {
        short empId = Short.parseShort("1");
        Global.ORDER_PROCESSING_LIST = new ArrayList<>();
        getOrders(fromTime).stream().filter((order) -> (order.getEmployee().getId() != empId)).forEach((order) -> {
            Global.ORDER_PROCESSING_LIST.add(order);
        });
        return Global.ORDER_PROCESSING_LIST;
    }

    public static List<OrderDetail> getOrders(String fromTime) {
        Global.ORDER_LIST = Methods.fetchOrders(fromTime, new Date().getTime() + "");
        return Global.ORDER_LIST;
    }

    public static DefaultListModel initNewOrderListModel() {
        orderModel = new DefaultListModel();
        List<OrderDetail> orders = OrderProcess.loadNewOrder("1482409098718");
        Collections.reverse(orders);
        orders.forEach((order) -> {
            orderModel.addElement("Đơn Hàng " + order.getId());
        });
        return orderModel;
    }

    public static DefaultListModel initOrderProcessListModel() {
        orderProcessModel = new DefaultListModel();
        OrderProcess.loadOrderProcessing("1482409098718").forEach((order) -> {
            orderProcessModel.addElement("Đơn Hàng Xử Lý " + order.getId());
        });
        return orderProcessModel;
    }

    public static DefaultComboBoxModel initOrderStatusCbbModel() {
        orderStatusModel = new DefaultComboBoxModel();
        Methods.fetchOrderStatus().stream().forEach((object) -> {
            orderStatusModel.addElement(object.getName());
        });
        return orderStatusModel;
    }

    public static OrderDetail getOrderDetail(String orderItem) {
        Methods.fetchOrders("1482409098718", new Date().getTime() + "").forEach((or) -> {
            if (orderItem.contains("" + or.getId())) {
                Global.ORDER = or;
            }
        });
        return Global.ORDER;
    }

    public static OrderStatus getOrderStatus(String status) {

        Methods.fetchOrderStatus().forEach((os) -> {
            if (status.equals(os.getName())) {
                Global.ORDER_STATUS = os;
            }
        });
        return Global.ORDER_STATUS;
    }

    public static HashMap<String, String> getInformation(OrderDetail order) {
        HashMap<String, String> customerInfo = new HashMap<>();
        try {
            Global.INFO = Json.DeserializeObject(order.getCustomer(), Information.class);
            Global.INFO.stream().forEach((info) -> {
                customerInfo.put(info.getKey(), info.getValue());
            });
        } catch (Exception ex) {
        }
        return customerInfo;
    }

    public static boolean receivesOrder(OrderDetail order, Employee em, OrderStatus os, String foodOrders, Double subtotal) {
        order.setEmployee(em);
        order.setStatus(os);
        order.setFoods(foodOrders);
        order.setSubtotal(subtotal);
        OrderDetailDTO dto = new OrderDetailDTO();
        dto.setOrderDetail(order);
        return Methods.updateOrder(dto);
    }

    public String foodsOrderProcess(HashMap<Short, Integer> map) {
        String result = null;
        try {
            result = Json.SerializeObject(map);
        } catch (Exception ex) {
            Logger.getLogger(OrderProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(getOrderDetail("Don Hang 7"));
//        System.out.println(Methods.fetchEmployeeByUsername("demo_employee").getEmployee());
//        System.out.println(Methods.fetchOrderStatusById(Short.parseShort("6")));

        OrderDetail or = getOrderDetail("Don Hang 7");
//        or.setComment("----");
        or.setCustomer("Customer");
//        or.setDiscount(33.3);
        or.setEmployee(Methods.fetchEmployeeByUsername("demo_employee").getEmployee());

        or.setStatus(Methods.fetchOrderStatusById(Short.parseShort("6")));

        OrderDetailDTO dto = new OrderDetailDTO();
        dto.setOrderDetail(or);
        // System.out.println(Methods.updateOrder(dto));

        //System.out.println(getOrderStatus("Đã tiếp nhận"));
    }
}
