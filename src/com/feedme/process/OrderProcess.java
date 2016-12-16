/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.service.OrderDetailDTO;
import com.feedme.ws.Methods;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sentinel
 */
public class OrderProcess {
    private List<OrderDetailDTO> orderlist;
    public OrderProcess() {
    }
    
     /**
     * Load New Order Process
     * @param fromTime 
     * @param toTime   
     * @return 
     */
    public List<OrderDetailDTO> loadNewOrder(Date fromTime, Date toTime) {
      short empId = Short.parseShort("1");
      orderlist = Methods.fetchOrders(fromTime.getTime(), toTime.getTime());
      if (orderlist==null||orderlist.isEmpty()) {
         return null;
      } 
      orderlist.stream().filter((order) -> (order.getEmployee().getEmployee().getId() != empId )).forEach((_item) -> {
          orderlist = null;
        });
      return orderlist;
    }
    
    
     /**
     * Load Order Processing
     * @param fromTime 
     * @param toTime   
     * @return 
     */
    public List<OrderDetailDTO> loadOrderProcessing(Date fromTime, Date toTime) {
      short empId = Short.parseShort("1");
      orderlist = Methods.fetchOrders(fromTime.getTime(), toTime.getTime());
      if (orderlist==null||orderlist.isEmpty()) {
         return null;
      } 
      orderlist.stream().filter((order) -> (order.getEmployee().getEmployee().getId() == empId )).forEach((_item) -> {
          orderlist = null;
        });
      return orderlist;
    }
    
}
