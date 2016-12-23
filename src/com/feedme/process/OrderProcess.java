/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.info.Information;
import com.feedme.service.OrderDetailDTO;
import com.feedme.service.OrderStatus;
import com.feedme.utils.Json;
import com.feedme.ws.Methods;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sentinel
 */
public class OrderProcess {

    private List<OrderDetailDTO> orderlist;
    private static DefaultListModel orderModel;
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
        Global.ORDER_LIST = Methods.fetchOrders(fromTime, Global.GET_CURRENT_TIME);
        if (Global.ORDER_LIST == null || Global.ORDER_LIST.isEmpty()) {
            return null;
        }
        Global.ORDER_LIST.stream().filter((order) -> (order.getEmployee().getEmployee().getId() != empId)).forEach((_item) -> {
            Global.ORDER_LIST = null;
        });
        return Global.ORDER_LIST;
    }

    /**
     * Load Order Processing
     *
     * @param fromTime
     * @return
     */
    public List<OrderDetailDTO> loadOrderProcessing(long fromTime) {
        short empId = Short.parseShort("1");
        orderlist = Methods.fetchOrders(fromTime, Global.GET_CURRENT_TIME);
        if (orderlist == null || orderlist.isEmpty()) {
            return null;
        }
        orderlist.stream().filter((order) -> (order.getEmployee().getEmployee().getId() == empId)).forEach((_item) -> {
            orderlist = null;
        });
        return orderlist;
    }

    public static List<OrderDetailDTO> getOrders(long fromTime) {
        Global.ORDER_LIST = Methods.fetchOrders(fromTime, Global.GET_CURRENT_TIME);
        return Global.ORDER_LIST;
    }

    public static DefaultListModel initNewOrderListModel() {
        orderModel = new DefaultListModel();
        OrderProcess.getOrders(Long.parseLong("1482409098718")).forEach((order) -> {
            orderModel.addElement("Đơn Hàng " + order.getOrderDetail().getId());
        });
        return orderModel;
    }
    
    public static DefaultComboBoxModel initOrderStatusCbbModel() {
        orderStatusModel = new DefaultComboBoxModel();
        Methods.fetchOrderStatus().stream().forEach((object) -> {
            orderStatusModel.addElement(object.getName());
        });
        return orderStatusModel;
    }
    
    public static OrderDetailDTO getOrderDetail(String orderItem) {
       Methods.fetchOrders(Long.parseLong("1482409098718"), Global.GET_CURRENT_TIME).forEach((or)-> {
          if (orderItem.contains(""+or.getOrderDetail().getId())) {
              Global.ORDER = or;
          }
       });
        return Global.ORDER;
    }
    
    public static Information loadCustomerInfo(OrderDetailDTO order) {
    }
}
