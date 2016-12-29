/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.service.Product;
import com.feedme.utils.Json;
import com.feedme.ws.Methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sentinel
 */
public class CartProcess {

    private final List<Product> products;
    private final List<Integer> quantity;

    public double subTotal = 0, total = 0, discount = 0;

    public CartProcess() {
        products = new ArrayList<>();
        quantity = new ArrayList<>();
    }

    public CartProcess(List<Product> list) {
        products = new ArrayList<>();
        quantity = new ArrayList<>();
        importProductsList(list);
    }

    public CartProcess(String json) throws Exception {
        products = new ArrayList<>();
        quantity = new ArrayList<>();
        Product[] list = Json.DeserializeObject(json, Product[].class);
        for (Product p : list) {
            put(p);
        }
    }

    public CartProcess(Product[] list) {
        products = new ArrayList<>();
        quantity = new ArrayList<>();
        importProductsList(Arrays.asList(list));
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void put(Product product) {
        boolean isFound = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(product.getId())) {
                quantity.set(i, quantity.get(i) + 1);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            products.add(product);
            quantity.add(1);
        }
        subTotal += product.getPrice();
        total += product.getPrice();
        double dis = processDiscount(product.getPrice(), product.getPromotion());
        discount += dis;
        total -= dis;
    }

    public void pop(Product product) {
        Integer value;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(product.getId())) {
                value = quantity.get(i);
                if (value.compareTo(1) <= 1) {
                    products.remove(i);
                    quantity.remove(i);
                } else {
                    quantity.set(i, quantity.get(i) - 1);
                }
            }
        }
        subTotal -= product.getPrice();
        total -= product.getPrice();
        double dis = processDiscount(product.getPrice(), product.getPromotion());
        discount -= dis;
        total += dis;
    }

    @Deprecated
    public void removeProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(product.getId())) {
                int q = quantity.get(i);
                double price = quantity.get(i) * product.getPrice();
                products.remove(i);
                quantity.remove(i);
                subTotal -= price * q;
                total -= price * q;
                double dis = processDiscount(product.getPrice(), product.getPromotion());
                discount -= dis * q;
                total += dis * q;
            }
        }
    }

    public void importProductsList(List<Product> list) {
        for (Product p : list) {
            put(p);
        }
    }

    public Product[] exportProductsList() {
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < quantity.get(i); j++) {
                list.add(products.get(i));
            }
        }
        return list.toArray(new Product[list.size()]);
    }

    public Product[] getProducts() {
        return products.toArray(new Product[products.size()]);
    }

    public int getQuantityOfProduct(Product product) {
        
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==null) {continue;}
            if (products.get(i).getId().intValue()==product.getId().intValue()) {
                
                return quantity.get(i);
            }
        }
        return 0;
    }

    public Integer get(Product product) {
        return new Integer(getQuantityOfProduct(product));
    }

    public int getTotalQuantity() {
        int total = 0;
        for (Integer q : quantity) {
            total += q;
        }
        return total;
    }

    public String exportToJson() throws Exception {
        return Json.SerializeObject(exportProductsList());
    }

    public static double processDiscount(double price, String discount) {
        double result = 0, dis;
        if (discount.contains("%")) {
            dis = Double.parseDouble(discount.replace("%", ""));
            if (dis <= 100) {
                result = (double) (price * dis / 100);
            }
        } else {
            try {
                dis = Double.parseDouble(discount);
                if (dis <= price) {
                    result = dis;
                }
            } catch (NumberFormatException ex) {
            }
        }
        return result;
    }
}
