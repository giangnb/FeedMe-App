/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme;

import com.feedme.info.Information;
import com.feedme.process.CartProcess;
import com.feedme.process.OrderProcess;
import com.feedme.service.CategoryDTO;
import com.feedme.service.EmployeeDTO;
import com.feedme.service.ManagerDTO;
import com.feedme.service.OrderDetail;
import com.feedme.service.OrderStatus;
import com.feedme.service.ProductDTO;
import com.feedme.service.Property;
import com.feedme.service.PropertyDTO;
import com.feedme.ws.Methods;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang
 */
public class Global {

    public static ManagerDTO MANAGER;
    public static EmployeeDTO EMPLOYEE;
    public static OrderDetail ORDER;
    public static Information INFO;
    public static OrderStatus ORDER_STATUS;
    public static CartProcess CART_GLOBAL;
    public static Double DISCOUNT_VALUE;
    public static DefaultListModel CATEGORY_LIST_MODEL;
    public static DefaultTableModel PRODBYCATEG_TABLE_MODEL;
    public static DefaultTableModel ORDERPROD_TABLE_MODEL;
    public static List<ProductDTO> PRODUCT_LIST;
    public static List<CategoryDTO> CATEGORY_LIST;
    public static List<OrderDetail> ORDER_LIST;
    public static List<OrderDetail> ORDER_PROCESSING_LIST = OrderProcess.loadOrderProcessing();
    public static List<OrderDetail> ORDER_NEW_LIST = OrderProcess.loadNewOrder();;
    public static List<OrderStatus> ORDER_STATUS_LIST = OrderProcess.getOrderStatusList();
    public static boolean IS_SELECTED_PRODUCT;
    
    public static long GET_CURRENT_TIME = new Date().getTime();

    public Global() {
        CATEGORY_LIST_MODEL = new DefaultListModel();
        PRODBYCATEG_TABLE_MODEL = new DefaultTableModel();
        ORDERPROD_TABLE_MODEL = new DefaultTableModel();
        PRODUCT_LIST = new ArrayList<>();
        CATEGORY_LIST = new ArrayList<>();
        ORDER_LIST = new ArrayList<>();
        
        ORDER_PROCESSING_LIST = new ArrayList();
        CART_GLOBAL = new CartProcess();
    }
    
    private static DecimalFormat number;
    private static SimpleDateFormat date, time;
    private static String money = "::đ";
    
    public static String doFormatPrice(double price) {
        String result = doFormatNumber(price);
        try {
            String[] str = money.split("::");
            result = str[0] + result + str[1];
        } catch (Exception ex) {
        }
        return result.trim();
    }

    public static String doFormatNumber(double num) {
        return number.format(num);
    }

    public static String doFormatTime(Date d) {
        return time.format(d);
    }

    public static String doFormatDate(Date d) {
        return date.format(d);
    }

    public static Double doParsePrice(String price) {
        for (String s : money.split("::")) {
            price = price.replace(s.trim(), "");
        }
        return doParseNumber(price);
    }

    public static Double doParseNumber(String num) {
        try {
            return number.parse(num).doubleValue();
        } catch (ParseException ex) {
            return null;
        }
    }

    public static Date doParseDateTime(String d) {
        try {
            return new SimpleDateFormat(date.toPattern() + " " + time.toPattern()).parse(d);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static Date doParseDate(String d) {
        try {
            return date.parse(d);
        } catch (ParseException ex) {
            return null;
        }
    }
    
 

    /**
     *
     * @param d
     * @return
     */

    public static double processDiscount(double price, String discount) {
        double result = 0, dis;
        if (discount.contains("%")) {
            dis = Double.parseDouble(discount.replace("%", ""));
            if (dis<=100) {
                result = (double)(price*dis/100);
            }
        } else {
            try {
                dis = Double.parseDouble(discount);
                if (dis<=price) {
                    result = dis;
                }
            } catch(NumberFormatException ex) {}
        }
        return result;
    }
}
