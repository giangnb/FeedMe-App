/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.info.Information;
import com.feedme.service.OrderDetailDTO;
import com.feedme.utils.Json;
import com.feedme.ws.Methods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sentinel
 */
public class OrderProcess {

    private List<OrderDetailDTO> orderlist;
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
    public static List<OrderDetailDTO> loadNewOrder(long fromTime) {
        short empId = Short.parseShort("1");
        Global.ORDER_NEW_LIST = new ArrayList<>();
        getOrders(fromTime).stream().filter((order) -> (order.getEmployee().getEmployee().getId() == empId)).forEach((order) -> {
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
    public static List<OrderDetailDTO> loadOrderProcessing(long fromTime) {
        short empId = Short.parseShort("1");
        Global.ORDER_PROCESSING_LIST = new ArrayList<>();
        getOrders(fromTime).stream().filter((order) -> (order.getEmployee().getEmployee().getId() != empId)).forEach((order) -> {
            Global.ORDER_PROCESSING_LIST.add(order);
        });
        return Global.ORDER_PROCESSING_LIST;
    }

    public static List<OrderDetailDTO> getOrders(long fromTime) {
        Global.ORDER_LIST = Methods.fetchOrders(fromTime, Global.GET_CURRENT_TIME);
        return Global.ORDER_LIST;
    }

    public static DefaultListModel initNewOrderListModel() {
        orderModel = new DefaultListModel();
        List<OrderDetailDTO> orders = OrderProcess.loadNewOrder(Long.parseLong("1482409098718"));
        Collections.reverse(orders);
        orders.forEach((order) -> {
            orderModel.addElement("Đơn Hàng " + order.getOrderDetail().getId());
        });
        return orderModel;
    }
    
    public static DefaultListModel initOrderProcessListModel() {
        orderProcessModel = new DefaultListModel();
        //List<OrderDetailDTO> orders = OrderProcess.loadOrderProcessing(Long.parseLong("1482409098718"));
        //Collections.reverse(orders);
        OrderProcess.loadOrderProcessing(Long.parseLong("1482409098718")).forEach((order) -> {
            orderProcessModel.addElement("Đơn Hàng Xử Lý " + order.getOrderDetail().getId());
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

    public static OrderDetailDTO getOrderDetail(String orderItem) {
        Methods.fetchOrders(Long.parseLong("1482409098718"), Global.GET_CURRENT_TIME).forEach((or) -> {
            if (orderItem.contains("" + or.getOrderDetail().getId())) {
                Global.ORDER = or;
            }
        });
        return Global.ORDER;
    }

    public static HashMap<String, String> getInformation(OrderDetailDTO order) {
        HashMap<String, String> customerInfo = new HashMap<>();
        try {
            Global.INFO = Json.DeserializeObject(order.getOrderDetail().getCustomer(), Information.class);
            Global.INFO.stream().forEach((info) -> {
                customerInfo.put(info.getKey(), info.getValue());
            });
        } catch (Exception ex) {
        }
        return customerInfo;
    }

    public boolean receivesOrder(OrderDetailDTO newOrder) {
        boolean result = true;
        try {
            return Methods.updateOrder(newOrder);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(OrderProcess.initOrderProcessListModel().getSize());
    }
}
