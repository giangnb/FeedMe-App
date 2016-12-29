package com.feedme.views;

import com.feedme.Global;
import com.feedme.process.CartProcess;
import com.feedme.process.OrderProcess;
import com.feedme.service.Employee;
import com.feedme.service.OrderDetail;
import com.feedme.service.OrderDetailDTO;
import com.feedme.service.OrderStatus;
import com.feedme.service.Product;
import com.feedme.utils.Json;
import com.feedme.utils.PrintingUtil;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BHT
 */
public class OrderPanel extends javax.swing.JPanel {

    private Timer timer;
    /**
     * Creates new form OrderPanel
     */
    private DefaultTableModel tblModel;
    private DefaultListModel listModel, listProcessModel;
    private DefaultComboBoxModel cbbModel;

    private OrderDetailDTO orderSelected;
    private CartProcess orderCart;
    private OrderDetail order;
    private HashMap<String, String> map;

    public OrderPanel() {
        initComponents();

        listModel = new DefaultListModel();
        listProcessModel = new DefaultListModel();
        listNewOrder.setModel(listModel);
        listProcessingOrder.setModel(listProcessModel);
        cbbModel = new DefaultComboBoxModel();
        cbbOrderStatus.setModel(cbbModel);

        tblModel = (DefaultTableModel) tblOrderDetail.getModel();
        order = new OrderDetail();

        cbbOrderStatus.setEnabled(false);
        btnReceiveOrder.setEnabled(false);
        btnAddFood.setEnabled(false);
        btnRemoveFood.setEnabled(false);

        initNewOrderList();
        initProcessingList();
        initOrderStatusCombobox();
        reloadNewOrderList();
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNewOrder = new org.jdesktop.swingx.JXList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProcessingOrder = new org.jdesktop.swingx.JXList();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerTel = new javax.swing.JTextField();
        txtCustomerAddr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrderDetail = new org.jdesktop.swingx.JXTable();
        lblDiscount = new javax.swing.JLabel();
        btnReceiveOrder = new javax.swing.JButton();
        cbbOrderStatus = new javax.swing.JComboBox();
        btnUpdateOrder = new javax.swing.JButton();
        btnAddFood = new javax.swing.JButton();
        btnRemoveFood = new javax.swing.JButton();
        btnAddFoods = new javax.swing.JButton();
        btnDiscount = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Order mới");

        listNewOrder.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Đang Tải", "Đơn Hàng", "Mới ....." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listNewOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        listNewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNewOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listNewOrder);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Thông tin order");

        jLabel3.setText("Khách hàng");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Order đang xử lý");

        listProcessingOrder.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listProcessingOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        listProcessingOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listProcessingOrderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listProcessingOrder);

        jLabel5.setText("Điện thoại");

        jLabel6.setText("Địa chỉ");

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Món Ăn", "Giá Tiền", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderDetail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblOrderDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderDetailMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblOrderDetail);

        lblDiscount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDiscount.setText("69.969 VND");

        btnReceiveOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReceiveOrder.setText("Nhận order");
        btnReceiveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiveOrderActionPerformed(evt);
            }
        });

        cbbOrderStatus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbOrderStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbOrderStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbOrderStatusItemStateChanged(evt);
            }
        });
        cbbOrderStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbOrderStatusMouseClicked(evt);
            }
        });

        btnUpdateOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateOrder.setText("Cập nhật");
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });

        btnAddFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/feedme/img/plus.png"))); // NOI18N
        btnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodActionPerformed(evt);
            }
        });

        btnRemoveFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/feedme/img/substract.png"))); // NOI18N
        btnRemoveFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFoodActionPerformed(evt);
            }
        });

        btnAddFoods.setText("Thêm món");
        btnAddFoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodsActionPerformed(evt);
            }
        });

        btnDiscount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/feedme/img/print.png"))); // NOI18N
        btnDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscountActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/feedme/img/signout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveFood, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddFoods))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtCustomerTel)))
                    .addComponent(txtCustomerAddr)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReceiveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDiscount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDiscount))
                            .addComponent(cbbOrderStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddFood)
                            .addComponent(btnRemoveFood)
                            .addComponent(btnAddFoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDiscount)
                            .addComponent(lblDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReceiveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
        new Thread(() -> {
            try {
                updateCurrentOrder(order, orderCart.exportToJson(), orderCart.getTotal());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();
    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    private void btnAddFoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodsActionPerformed
        OrderInternalFrame oif = new OrderInternalFrame();
        oif.setVisible(true);
        if (Global.CART_GLOBAL != null) {
            for (Product p : Global.CART_GLOBAL.exportProductsList()) {
                orderCart.put(p);
            }
        }
        reloadTable(orderCart);
    }//GEN-LAST:event_btnAddFoodsActionPerformed

    private void btnDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscountActionPerformed
        order = new OrderDetail();
        
        order = Global.ORDER_PROCESSING_LIST.get(listProcessingOrder.getSelectedIndex());
       
        ImageIcon icon = new ImageIcon("src/com/feedme/img/print.png");
        int choose = JOptionPane.showOptionDialog(this, "In Hóa Đơn ?", "Hóa Đơn", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, icon, new String[]{"Hóa Đơn Bếp", "Hóa Đơn Giao Hàng", "Hóa Đơn Khách"}, null);
        switch (choose) {
            case 0:
                printForChef(orderCart, order);
                break;
            case 1:
                printForShipper(orderCart, order);
                break;
            case 2:
                printForCustomer(orderCart, order);
                break;
        }
    }//GEN-LAST:event_btnDiscountActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.show(this.getParent(), "staff");
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRemoveFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFoodActionPerformed
        // TODO add your handling code here: 
        Product[] prodArr = orderCart.getProducts();
        orderCart.pop(prodArr[tblOrderDetail.getSelectedRow()]);
        reloadTable(orderCart);

    }//GEN-LAST:event_btnRemoveFoodActionPerformed

    private void listNewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNewOrderMouseClicked
        // TODO add your handling code here:
        btnDiscount.setEnabled(false);
        btnAddFood.setEnabled(true);
        btnRemoveFood.setEnabled(true);
        btnReceiveOrder.setEnabled(true);
        cbbOrderStatus.setEnabled(true);
        order = Global.ORDER_NEW_LIST.get(listNewOrder.getSelectedIndex());
        map = OrderProcess.getInformation(order);
        orderCart = new OrderProcess().getProductFromOrder(order);
        loadOrderDetailInfomation(order, map, orderCart);
    }//GEN-LAST:event_listNewOrderMouseClicked

    private void cbbOrderStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbOrderStatusMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cbbOrderStatusMouseClicked

    private void cbbOrderStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbOrderStatusItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_cbbOrderStatusItemStateChanged

    private void btnReceiveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiveOrderActionPerformed
        // TODO add your handling code here:
        new Thread(() -> {
            receivedOrderByEmployee(order, Global.EMPLOYEE.getEmployee(), Global.ORDER_STATUS_LIST.get(cbbOrderStatus.getSelectedIndex()));
        }).start();
    }//GEN-LAST:event_btnReceiveOrderActionPerformed

    private void listProcessingOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listProcessingOrderMouseClicked
        // TODO add your handling code here:
        btnDiscount.setEnabled(true);
        btnReceiveOrder.setEnabled(false);
        btnUpdateOrder.setEnabled(false);
        order = new OrderDetail();
        map = new HashMap<>();
        orderCart = new CartProcess();
        order = Global.ORDER_PROCESSING_LIST.get(listProcessingOrder.getSelectedIndex());
        map = OrderProcess.getInformation(order);
        orderCart = new OrderProcess().getProductFromOrder(order);
        loadOrderDetailInfomation(order, map, orderCart);

    }//GEN-LAST:event_listProcessingOrderMouseClicked

    private void btnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodActionPerformed
        // TODO add your handling code here:
        Product[] prodArr = orderCart.getProducts();
        orderCart.put(prodArr[tblOrderDetail.getSelectedRow()]);
        reloadTable(orderCart);
    }//GEN-LAST:event_btnAddFoodActionPerformed

    private void tblOrderDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOrderDetailMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnAddFoods;
    private javax.swing.JButton btnDiscount;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReceiveOrder;
    private javax.swing.JButton btnRemoveFood;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JComboBox cbbOrderStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDiscount;
    private org.jdesktop.swingx.JXList listNewOrder;
    private org.jdesktop.swingx.JXList listProcessingOrder;
    private org.jdesktop.swingx.JXTable tblOrderDetail;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtCustomerAddr;
    private javax.swing.JTextField txtCustomerTel;
    // End of variables declaration//GEN-END:variables

    private void reloadNewOrderList() {
        timer = new Timer(60000, (ActionEvent e) -> {
            initNewOrderList();
            System.out.println(">_ Auto Update Order running .....");
        });
    }

    private void receivedOrderByEmployee(OrderDetail order, Employee em, OrderStatus ORDER_STATUS) {
        boolean result = OrderProcess.receivesOrder(order, em, ORDER_STATUS);
        if (result) {
            JOptionPane.showMessageDialog(null, "Đơn hàng " + order.getId() + "\n Đã được nhận bởi nhân viên " + em.getUsername());
            initNewOrderList();
            initProcessingList();
        } else {
            JOptionPane.showMessageDialog(null, "Nhận đơn hàng lỗi. \n ");
        }
    }

    private void initNewOrderList() {
        listModel.removeAllElements();
        Global.ORDER_NEW_LIST.forEach((order) -> {
            listModel.addElement("Đơn Hàng: " + order.getId());
        });
        listNewOrder.setModel(listModel);
    }

    private void initProcessingList() {
        new Thread(() -> {
            listProcessModel.clear();
            Global.ORDER_PROCESSING_LIST.forEach((order) -> {
                listProcessModel.addElement("Đơn Hàng Xử Lý " + order.getId());
            });
        }).start();
    }

    private void loadOrderDetailInfomation(OrderDetail order, HashMap<String, String> map, CartProcess cart) {
        new Thread(() -> {
            txtCustomer.setText(map.get("name"));
            txtCustomerAddr.setText(map.get("address"));
            txtCustomerTel.setText(map.get("tel"));
            tblModel.setRowCount(0);
            for (Product p : cart.getProducts()) {
                tblModel.addRow(new Object[]{p.getName(), p.getPrice(), cart.get(p)});
            }
            cbbOrderStatus.setSelectedItem(order.getStatus().getName());
            lblDiscount.setText(cart.total + "đ");
            JOptionPane.showMessageDialog(null, "Đơn Hàng Số " + order.getId() + "\n Trạng Thái Đơn Hàng " + order.getStatus().getName());
        }).start();
    }

    private void initOrderStatusCombobox() {

        for (OrderStatus os : Global.ORDER_STATUS_LIST) {
            cbbModel.addElement(os.getName());
        }
    }

    private void reloadTable(CartProcess orderCart) {
        tblModel.setRowCount(0);
        for (Product p : orderCart.getProducts()) {
            tblModel.addRow(new Object[]{p.getName(), p.getPrice(), orderCart.get(p)});
        }
    }

    private void updateCurrentOrder(OrderDetail order, String exportToJson, double lbl) {
        boolean result = OrderProcess.updateOrder(order, exportToJson, lbl);
        if (result) {
            JOptionPane.showMessageDialog(null, "Cập Nhật\n Đơn hàng " + order.getId() + "\n Thành Công. ");
        } else {
            JOptionPane.showMessageDialog(null, "Cập Nhật đơn hàng lỗi. \n  Vui Lòng Thử Lại");
        }
    }

    private void printForChef(CartProcess orderCart, OrderDetail order) {
        PrintingUtil printer = new PrintingUtil();
        try {
            // String text, String font, int size, StyleConstants align, Color color
            printer.append(order.getId() + "\n_______________\n", "Consolas", 30, StyleConstants.ALIGN_CENTER, Color.black);
            for (Product p : orderCart.getProducts()) {
                printer.append(p.getName() + "\t" + orderCart.get(p) + "\n", "Consolas", 14, StyleConstants.ALIGN_LEFT, Color.black);
            }
            printer.print();
        } catch (BadLocationException ex) {
            JOptionPane.showMessageDialog(null, "Không thể in được");
            ex.printStackTrace();
        } catch (PrinterException ex) {
             JOptionPane.showMessageDialog(null, "Không thể in được \n Chắc chắn rằng máy POS đã được \n kết nối với máy in");
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void printForShipper(CartProcess orderCart, OrderDetail order) {
        PrintingUtil printer = new PrintingUtil();
        try {
            // String text, String font, int size, StyleConstants align, Color color
           
            printer.append("Đơn Hàng Số " + order.getId() + "\n_______________\n", "Consolas", 30, StyleConstants.ALIGN_CENTER, Color.black);
            printer.append("\nKhách Hàng: \t" + txtCustomer.getText(), "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\nĐiện Thoại: \t" + txtCustomerTel.getText(), "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\nĐịa Chỉ: \t" + txtCustomerAddr.getText(), "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\n\n\tThông tin đơn hàng \t", "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);

            printer.append("\n\t - Số Sản Phẩm: " + orderCart.exportProductsList().length + "", "Consolas", 12, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\n\t - Tổng Tiền: " + orderCart.total + "", "Consolas", 12, StyleConstants.ALIGN_LEFT, Color.black);
            printer.print();
        } catch (BadLocationException ex) {
            JOptionPane.showMessageDialog(null, "Không thể in được");
            ex.printStackTrace();
        } catch (PrinterException ex) {
             JOptionPane.showMessageDialog(null, "Không thể in được \n Chắc chắn rằng máy POS đã được \n kết nối với máy in");
            ex.printStackTrace();
        }
    }

    private void printForCustomer(CartProcess orderCart, OrderDetail order) {
        try {
            PrintingUtil printer = new PrintingUtil();
            printer.append("Đơn Hàng Số " + order.getId() + "\n_______________\n", "Consolas", 30, StyleConstants.ALIGN_CENTER, Color.black);
            printer.append("\nKhách Hàng: \t" + txtCustomer.getText(), "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\nĐiện Thoại: \t" + txtCustomerTel.getText(), "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\nĐịa Chỉ: \t" + txtCustomerAddr.getText(), "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\n\n\tThông tin đơn hàng \t", "Consolas", 15, StyleConstants.ALIGN_LEFT, Color.black);
       
            for (Product p : orderCart.getProducts()) {
                printer.append("\n\t"+p.getName() + " - " + orderCart.get(p) + "\n", "Consolas", 14, StyleConstants.ALIGN_LEFT, Color.black);
            }
            printer.append("\n\t - Tổng Số Sản Phẩm: " + orderCart.exportProductsList().length + "", "Consolas", 12, StyleConstants.ALIGN_LEFT, Color.black);
            printer.append("\n\t - Tổng Tiền: " + orderCart.total + "", "Consolas", 12, StyleConstants.ALIGN_LEFT, Color.black);
            printer.print();
        } catch (BadLocationException ex) {
            JOptionPane.showMessageDialog(null, "Không thể in được");
            ex.printStackTrace();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Không thể in được \n Chắc chắn rằng máy POS đã được \n kết nối với máy in");
            ex.printStackTrace();
        }
    }

}
