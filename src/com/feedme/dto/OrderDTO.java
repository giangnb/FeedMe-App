/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.dto;

import com.feedme.service.OrderDetail;
import com.feedme.service.OrderDetailDTO;

/**
 *
 * @author Sentinel
 */
public class OrderDTO extends OrderDetailDTO{
 private  OrderDetail order;
    public OrderDTO(OrderDetail order) {
        this.order = order;
    }

    @Override
    public void setOrderDetail(OrderDetail value) {
        super.setOrderDetail(value); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderDetail getOrderDetail() {
        return super.getOrderDetail(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
