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
import com.feedme.utils.Json;
import com.feedme.ws.Methods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public static void main(String[] args) {

        try {
            //        CartProcess cart = new CartProcess();
//        List<ProductDTO> list = getProducts();
//        list.forEach((prod)-> {
//            cart.put(prod.getProduct());
//        });
//        HashMap<Product, Integer> map = new HashMap<>();
//        getProducts().forEach((prod)-> {
//          map.put(prod.getProduct(), 2);
//        });
//        
//         Set<Map.Entry<Product, Integer>> set = cart.entrySet();
//         for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
//            Product key = entry.getKey();
//            Integer value = entry.getValue();
//            
//             System.out.println(key.getName()+"-"+value);
//        }
//         System.out.println(cart.total);
//        try {
//            System.out.println(Json.DeserializeObject(Json.SerializeObject(map), HashMap.class).size());
//        } catch (Exception ex) {
//           
//        }
//System.out.println(new OrderInternalProcess().getProductByName("Súp nấm"));
         
         Product[] prod = Json.DeserializeObject(OrderProcess.getOrderDetail(" 20").getFoods(), Product[].class);
            for (Product product : prod) {
                System.out.println(product.getName());
            }
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

}
