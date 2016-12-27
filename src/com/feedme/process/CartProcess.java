/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.service.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sentinel
 */
public class CartProcess extends HashMap<Product, Integer>{
    

      public double subTotal = 0, total = 0, discount = 0;

        public void put(Product product) {
            Integer val = 0;
            for (Product p : getProducts()) {
                System.out.println(product.getName());
                System.out.println(p);
                System.out.println(p.getName() + " - " + product.getName());
                System.out.println();
                if (Objects.equals(p.getId(),product.getId())) {
                    val = get(p);
                    put(p, val + 1);
                    System.out.println("Val: " + val);
                    break;
                }
            }
            if (val == 0) {
                put(product, 1);
            }
            subTotal += product.getPrice();
            total += product.getPrice();
        }

        public void pop(Product product) {
            Integer value = get(product);
            if (value == null) {
                return;
            }
            if (value > 1) {
                put(product, value - 1);
            } else {
                remove(product);
            }
            subTotal -= product.getPrice();
            total -= product.getPrice();
//            double dis = GlobalBean.processDiscount(product.getPrice(), product.getPromotion());
//            discount -= dis;
//            total += dis;
        }

        public void removeProduct(Product product) {
            for (int i = 0; i < get(product); i++) {
                pop(product);
            }
        }

        public void importProductsList(List<Product> list) {
            for (Product p : list) {
                put(p);
            }
        }

        public List<Product> exportProductsList() {
            ArrayList<Product> list = new ArrayList<>();
            for (Product p : keySet()) {
                for (int i = 0; i < get(p); i++) {
                    list.add(p);
                }
            }
            return list;
        }

        public List<Product> getProducts() {
            return new ArrayList<>(keySet());
        }
}
