/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.info.Information;
import com.feedme.info.SingleInformation;
import com.feedme.service.Employee;
import com.feedme.service.OrderDetail;
import com.feedme.service.OrderDetailDTO;
import com.feedme.service.OrderStatus;
import com.feedme.service.Product;

import com.feedme.utils.Json;
import com.feedme.ws.Methods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sentinel
 */
public class OrderProcess {

    private static List<OrderDetail> orderlist;
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
    public static List<OrderDetail> loadNewOrder() {
        short empId = Short.parseShort("1");
        orderlist = new ArrayList<>();
        Collections.reverse(getOrders(1482409098718l + ""));
        getOrders(1482409098718l + "").stream().filter((order) -> (order.getEmployee().getId() == empId)).forEach((order) -> {
            orderlist.add(order);
        });
        return orderlist;

    }

    /**
     * Load Order Processing
     *
     * @param fromTime
     * @return
     */
    public static List<OrderDetail> loadOrderProcessing() {
        short empId = Short.parseShort("1");
        orderlist = new ArrayList<>();
        Collections.reverse(getOrders(1482409098718l + ""));
        getOrders(1482409098718l + "").stream().filter((order) -> (order.getEmployee().getId() != empId)).forEach((order) -> {
            orderlist.add(order);
        });
        return orderlist;
    }

    public static List<OrderDetail> getOrders(String fromTime) {
        Global.ORDER_LIST = Methods.fetchOrders(fromTime, new Date().getTime() + "");
        return Global.ORDER_LIST;
    }

    public static DefaultListModel initOrderProcessListModel() {
        orderProcessModel = new DefaultListModel();
        OrderProcess.loadOrderProcessing().forEach((order) -> {
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

    public static List<OrderStatus> getOrderStatusList() {
        return Methods.fetchOrderStatus();
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

    public static boolean receivesOrder(OrderDetail order, Employee em, OrderStatus os) {
        order.setEmployee(em);
        order.setStatus(os);
        String note = null;
        try {
            Information info = Json.DeserializeObject(order.getNote(), Information.class);
            info.add(new SingleInformation(new Date().getTime() + "", os.getName() + " - " + em.getUsername()));
            note = Json.SerializeObject(info);
        } catch (Exception ex) {
        }
        order.setNote(note);
        OrderDetailDTO dto = new OrderDetailDTO();
        dto.setOrderDetail(order);
        return Methods.updateOrder(dto);
    }

    public static boolean updateOrder(OrderDetail order, String foodOrders, Double subtotal) {
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
            ex.printStackTrace();
        }
        return result;
    }

    public CartProcess getProductFromOrder(OrderDetail order) {
        CartProcess cart = new CartProcess();
        Product[] prod = null;
        try {
            prod = Json.DeserializeObject(order.getFoods(), Product[].class);
            for (Product product : prod) {
                cart.put(product);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cart;
    }
}
