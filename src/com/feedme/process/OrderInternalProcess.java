/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.service.CategoryDTO;
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

    private List<CategoryDTO> categories;
    private List<ProductDTO> products;
    private DefaultListModel categListModel;
    private DefaultTableModel productTableModel;

    public OrderInternalProcess() {
    }

    public List<CategoryDTO> loadCategories() {
        categories = Methods.fetchCategories();
        if (categories == null && categories.isEmpty()) {
            return null;
        }
        return categories;
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
    public DefaultListModel initCategoryNameListModel() {
        categListModel = new DefaultListModel();
        new OrderInternalProcess().categories.forEach((category) -> {
            categListModel.addElement(category.getName());
        });
        return categListModel;
    }

    /**
     * DefaultTable Model productsByCategory using for product Table in
     * OrderInternalFrame
     *
     * @param categoryName
     * @return
     */
    public DefaultTableModel loadProductByCategoryModel(String categoryName) {
        productTableModel = new DefaultTableModel();
        new OrderInternalProcess().loadProducts().forEach((ProductDTO p) -> {
            if (categoryName.equalsIgnoreCase(p.getCategory().getName())) {
                productTableModel.addRow(new Object[]{p.getName(), p.getPrice(), "", ""});
            }
        });
        return productTableModel;
    }

}
