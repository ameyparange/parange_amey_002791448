/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.delivery;

import dbconnection.JdbcConnect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.enterprise.Enterprise;
import model.order.OrderItem;
import model.order.OrderitemCatalog;

/**
 *
 * @author amey8
 */
public class RetialSupplierOrder extends javax.swing.JPanel {

    /**
     * Creates new form RetialSupplierOrder
     */
    JdbcConnect connect;
    int itemno =0;
    OrderitemCatalog ordcata;
    String suppliername;
    Enterprise entp;
    String username;
    public RetialSupplierOrder(Enterprise entp,String username) {
        initComponents();
        connect = new JdbcConnect();
        ordcata = new OrderitemCatalog();
        this.username=username;
        loadsupname();
        this.entp=entp;
        btnplaceorder.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        tfsproductname = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfsid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductCata = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        btnview = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfquantity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderItems = new javax.swing.JTable();
        tftotalorderprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnplaceorder = new javax.swing.JButton();
        btndeleteitem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcsupname = new javax.swing.JComboBox<>();
        btnapply = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(219, 247, 252));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Supplier Order Items", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jPanel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel11.setOpaque(false);

        btnsearch.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/loupe.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel4.setText("Name");

        ProductCata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Supplier Name", "Product_id", "Name", "ItemPrice", "Available Qty", "Weight", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductCata.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ProductCata);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfsproductname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfsid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnsearch)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsearch)
                    .addComponent(tfsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfsproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel12.setOpaque(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        btnview.setBackground(new java.awt.Color(153, 153, 153));
        btnview.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/customer/search.png"))); // NOI18N
        btnview.setText("Add To Cart");
        btnview.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(242, 242, 242), null, null));
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnrefresh.setBackground(new java.awt.Color(153, 153, 153));
        btnrefresh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/customer/search.png"))); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(242, 242, 242), null, null));
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel6.setText("Quantity");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrefresh)
                .addGap(18, 18, 18))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnview)
                        .addComponent(btnrefresh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Retail Cart", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jPanel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        OrderItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item No", "Product_id", "Name", "ItemPrice", "Quantity", "Weight", "Description", "Total_ItemPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OrderItems);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel5.setText("Total Order Price");

        btnplaceorder.setBackground(new java.awt.Color(153, 153, 153));
        btnplaceorder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnplaceorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/customer/search.png"))); // NOI18N
        btnplaceorder.setText("Place Order");
        btnplaceorder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(242, 242, 242), null, null));
        btnplaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaceorderActionPerformed(evt);
            }
        });

        btndeleteitem.setBackground(new java.awt.Color(153, 153, 153));
        btndeleteitem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btndeleteitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/customer/search.png"))); // NOI18N
        btndeleteitem.setText("Removeitem");
        btndeleteitem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(242, 242, 242), null, null));
        btndeleteitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteitemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btndeleteitem)
                        .addGap(136, 136, 136)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tftotalorderprice, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnplaceorder)))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jScrollPane2)
                    .addGap(15, 15, 15)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tftotalorderprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btndeleteitem)
                        .addGap(15, 15, 15)))
                .addComponent(btnplaceorder)
                .addGap(7, 7, 7))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel1.setText("Supplier");

        jcsupname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcsupnamejCentnameActionPerformed(evt);
            }
        });

        btnapply.setBackground(new java.awt.Color(153, 153, 153));
        btnapply.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnapply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/customer/search.png"))); // NOI18N
        btnapply.setText("Apply");
        btnapply.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(242, 242, 242), null, null));
        btnapply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcsupname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnapply)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcsupname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnapply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
//        if (!tfsid.getText().isEmpty()) {
//            populatetable(Integer.valueOf(tfsid.getText()) );
//        } else if (!tfsproductname.getText().isEmpty()) {
//            populatetableon_name(tfsproductname.getText());
//
//        } else {
//            JOptionPane.showMessageDialog(this,
//                "Search on Product Id or Product Name");
//        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int row = ProductCata.getSelectedRow();
        btnrefresh.setEnabled(true);
        
        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                "No row is selected! Please select one row",
                "Select row",
                JOptionPane.ERROR_MESSAGE);
        } else {
            
            if (  !tfquantity.getText().isEmpty()) {
            OrderItem orderitem;
            DefaultTableModel model = (DefaultTableModel) ProductCata.getModel();
            //System.out.println();
            int prod_id = Integer.valueOf( model.getValueAt(row, 1).toString());
            btnplaceorder.setEnabled(true);
            String name =  model.getValueAt(row, 2).toString();
            int price = Integer.valueOf( model.getValueAt(row, 3).toString());
           int avail_qty = Integer.valueOf( model.getValueAt(row, 4).toString());
            int weight = Integer.valueOf( model.getValueAt(row, 5).toString());
             String desc = (String ) model.getValueAt(row, 6).toString();
             int order_qty = Integer.valueOf(tfquantity.getText());
             itemno=itemno+1;
             orderitem= new OrderItem(itemno,prod_id,name,price,order_qty,weight,desc,price*order_qty);
             System.out.println(orderitem.toString());
             ordcata.addOrderitem(orderitem);
             populatetable();
            }
            else {
            
            JOptionPane.showMessageDialog(this,
                "Quantity not provided",
                "Enter Qauntity",
                JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void jcsupnamejCentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcsupnamejCentnameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jcsupnamejCentnameActionPerformed

    private void btnplaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaceorderActionPerformed
        // TODO add your handling code here:

        connect.insertorder(username,entp.getName(),suppliername,Integer.valueOf(tftotalorderprice.getText()));
       connect.insertorderitem( ordcata,connect.getlatestorderid());
       DefaultTableModel model = (DefaultTableModel) OrderItems.getModel();
        model.setRowCount(0);
       btnplaceorder.setEnabled(false);

    }//GEN-LAST:event_btnplaceorderActionPerformed

    private void btnapplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapplyActionPerformed
        // TODO add your handling code here:
        suppliername= jcsupname.getSelectedItem().toString();
        loadsupplierorderitems(suppliername);
        btnapply.setEnabled(false);
    }//GEN-LAST:event_btnapplyActionPerformed

    private void btndeleteitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteitemActionPerformed
        // TODO add your handling code here:
          int row = OrderItems.getSelectedRow();
        
        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) OrderItems.getModel();

            int selected_hosid = (int) model.getValueAt(row, 1);
            ordcata.deleteorditem(selected_hosid);
        }
    }//GEN-LAST:event_btndeleteitemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderItems;
    private javax.swing.JTable ProductCata;
    private javax.swing.JButton btnapply;
    private javax.swing.JButton btndeleteitem;
    private javax.swing.JButton btnplaceorder;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcsupname;
    private javax.swing.JTextField tfquantity;
    private javax.swing.JTextField tfsid;
    private javax.swing.JTextField tfsproductname;
    private javax.swing.JTextField tftotalorderprice;
    // End of variables declaration//GEN-END:variables

    void loadsupname(){
    //String ent_type =jCentname.getSelectedItem().toString();
    //String s;
    
    try{
    connect.connect();
            // Prepare Statement
               
            connect.pet = connect.con.prepareStatement("Select * from enterprise e where e.ent_type='Supplier'");
            connect.myRs = connect.pet.executeQuery();
            while (connect.myRs.next()) {
                jcsupname.addItem(connect.myRs.getString("name"));
                
            }
            jcsupname.setSelectedIndex(0);
            suppliername=jcsupname.getSelectedItem().toString();
            //loadsupplierorderitems(jcsupname.getSelectedItem().toString());
    }
     catch (Exception et) {
            System.out.println(et.toString());

        }
}
    
    void loadsupplierorderitems(String suppliername)
    {
        DefaultTableModel model = (DefaultTableModel) ProductCata.getModel();
        model.setRowCount(0);
         try{
    connect.connect();
            // Prepare Statement
               
            connect.pet = connect.con.prepareStatement("Select p.product_id,p.name,p.price,i.quantity,p.weight, p.desc1 from enterprise e join product p on e.ent_id = p.ent_id"
                    + " join inventory i on p.product_id = i.product_id  where e.ent_type='Supplier'"
                    + " and e.name=? ");
            connect.pet.setString(1, suppliername);
            connect.myRs = connect.pet.executeQuery();
            
            //System.out.println(connect.pet.toString());
            while (connect.myRs.next()) {
                
                Object[] row = new Object[8];
                row[0] = suppliername;
                row[1] = connect.myRs.getInt("product_id");
                row[2] = connect.myRs.getString("name");
                row[3] = connect.myRs.getString("price");//username
                row[4] = connect.myRs.getString("quantity");
                row[5] = connect.myRs.getString("weight");
                //row[6] = connect.myRs.getString("validity");
                row[6] = connect.myRs.getString("desc1");
                model.addRow(row);
            }
            
            
    }
     catch (Exception et) {
            System.out.println(et.toString());

        }
        
    }
    void refresh(){
        tfquantity.setText("");
    tfsid.setText("");
    tfsproductname.setText("");
    loadsupplierorderitems(jcsupname.getSelectedItem().toString());
    }
    
    void populatetable()
    {
    DefaultTableModel model = (DefaultTableModel) OrderItems.getModel();
        model.setRowCount(0);
        int tot_price=0;

        int i = 1;
        for (OrderItem hos : ordcata.getOrditem()) {

            Object[] row = new Object[10];
            row[0] = i;
            row[1] = hos.getProduct_id();//username
            row[2] = hos.getName();
            row[3] = hos.getItem_price();
            row[4] = hos.getQuantity();
            row[5] = hos.getWeight();
            row[6] = hos.getDescription();
            row[7] = hos.getTotalitemprice();
            tot_price=tot_price+hos.getTotalitemprice();


            model.addRow(row);

            i++;
            //JOptionPane.showMessageDialog(this, "Successfully Employee Profile Created!!!");
        }
        
    tftotalorderprice.setText(String.valueOf(tot_price));
 
    }
}
