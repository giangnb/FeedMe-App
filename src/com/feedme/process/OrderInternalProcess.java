/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.service.CategoryDTO;
import com.feedme.service.Product;
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

    public OrderInternalProcess() {
    }

    public static List<ProductDTO> getProducts() {
        Global.PRODUCT_LIST = Methods.fetchProducts();
        return Global.PRODUCT_LIST;
    }

    public static List<CategoryDTO> getCategories() {
        Global.CATEGORY_LIST = Methods.fetchCategories();
        return Global.CATEGORY_LIST;
    }

    /**
     * DefaultListModel Category name using for Category List in
     * OrderInternalFrame
     *
     * @return
     */
    public static DefaultListModel initCategoryNameListModel() {
        Global.CATEGORY_LIST_MODEL = new DefaultListModel();
        getCategories().forEach((category) -> {
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
    public static DefaultTableModel loadProductByCategoryModel(String categoryName) {
        Global.PRODBYCATEG_TABLE_MODEL = new DefaultTableModel();
        Global.PRODBYCATEG_TABLE_MODEL.addRow(loadProductByCategoryObject(categoryName));
        return Global.PRODBYCATEG_TABLE_MODEL;
    }

    public static Object[] loadProductByCategoryObject(String categoryName) {
        Object[] objProd = null;
        for (ProductDTO p : getProducts()) {
            if (categoryName.equals(p.getCategory().getName())) {
                objProd = new Object[]{p.getName(), p.getPrice(), true, 0};
            }
        }
        return objProd;
    }

    public static Product getProductByName(String prodName) {
        Product prod = new Product();
        getProducts().forEach((p) -> {
            if (prodName.equals(p.getName())) {
                prod.setName(p.getProduct().getName());
                prod.setCategory(p.getProduct().getCategory());
                prod.setDescription(p.getProduct().getDescription());
                prod.setImageFile(p.getProduct().getImageFile());
                prod.setInfo(p.getProduct().getInfo());
                prod.setIsActive(p.isIsActive());
                prod.setPrice(p.getProduct().getPrice());
                prod.setPromotion(p.getProduct().getPromotion());
            }
        });
        return prod;
    }
}
