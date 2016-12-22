/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme;

import com.feedme.service.CategoryDTO;
import com.feedme.service.EmployeeDTO;
import com.feedme.service.ManagerDTO;
import com.feedme.service.ProductDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang
 */
public class Global {

    public static ManagerDTO MANAGER;
    public static EmployeeDTO EMPLOYEE;
    public static String DISCOUNT_VALUE;
    public static DefaultListModel CATEGORY_LIST_MODEL;
    public static DefaultTableModel PRODBYCATEG_TABLE_MODEL;
    public static DefaultTableModel ORDERPROD_TABLE_MODEL;
    public static List<ProductDTO> PRODUCT_LIST;
    public static List<CategoryDTO> CATEGORY_LIST;
    public static boolean IS_SELECTED_PRODUCT;

    public Global() {
        CATEGORY_LIST_MODEL = new DefaultListModel();
        PRODBYCATEG_TABLE_MODEL = new DefaultTableModel();
        ORDERPROD_TABLE_MODEL = new DefaultTableModel();
        PRODUCT_LIST = new ArrayList<>();
        CATEGORY_LIST = new ArrayList<>();
    } 
}
