/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.service.ProductDTO;
import com.feedme.ws.Methods;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sentinel
 */
public class OrderInternalProcess {

    private List<ProductDTO> products;

    public OrderInternalProcess() {
    }

    

    public List<ProductDTO> loadProducts() {
        products = Methods.fetchProducts();
        if (products == null || products.isEmpty()) {
            return null;
        }
        return products;
    }

    /**
     * DefaultListModel Category name using for Category List in
     * OrderInternalFrame
     *
     * @return
     */
    public static DefaultListModel initCategoryNameListModel() {
        Global.CATEGORY_LIST_MODEL = new DefaultListModel();
        Methods.fetchCategories().forEach((category) -> {
            Global.CATEGORY_LIST_MODEL.addElement(category.getName());
        });
        return Global.CATEGORY_LIST_MODEL;
    }

    /**
     * DefaultTable Model productsByCategory using for product Table in
     * OrderInternalFrame
     *
     * @param categoryName
     * @return
     */
    public DefaultTableModel loadProductByCategoryModel(String categoryName) {
        Global.PRODBYCATEG_TABLE_MODEL = new DefaultTableModel();
        new OrderInternalProcess().loadProducts().forEach((ProductDTO p) -> {
            if (categoryName.equalsIgnoreCase(p.getCategory().getName())) {
                Global.PRODBYCATEG_TABLE_MODEL.addRow(new Object[]{p.getName(), p.getPrice(), "", ""});
            }
        });
        return Global.PRODBYCATEG_TABLE_MODEL;
    }

}
