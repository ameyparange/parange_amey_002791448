/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.delivery;

import dbconnection.JdbcConnect;
import javax.swing.table.DefaultTableModel;
import model.enterprise.Enterprise;
import model.order.OrderitemCatalog;

/**
 *
 * @author amey8
 */
public class DeliveryCatalog extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryCatalog
     */
        JdbcConnect connect;
    int itemno =0;
    OrderitemCatalog ordcata;
    String suppliername;
    Enterprise entp;
    String username;
    int corder_id;
    public DeliveryCatalog(Enterprise entp,String username) {
        initComponents();
        this.username=username;
    connect = new JdbcConnect();
        this.entp=entp;
        populateorder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jcstatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ordertable = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Supplier Orders", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jcstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORDER PLACED", "ORDER SHIPPED", "DELIVERED" }));
        jcstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcstatusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel1.setText("Status");

        Ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer", "Seller", "Created Date", "Modified Date", "OrderPrice", "Delivery Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Ordertable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 290, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcstatusActionPerformed
        // TODO add your handling code here:
        populateorder();
    }//GEN-LAST:event_jcstatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Ordertable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcstatus;
    // End of variables declaration//GEN-END:variables

public void populateorder(){
    DefaultTableModel model = (DefaultTableModel) Ordertable.getModel();
        model.setRowCount(0);
         try{
    connect.connect();
            // Prepare Statement
               
            connect.pet = connect.con.prepareStatement("Select o.order_id,o.ent_name,o.f_ent_name,DATE_FORMAT(d.created_date, '%d/%m/%y %T') created_date,"
                    + " DATE_FORMAT(d.Modified_date, '%d/%m/%y %T') Modified_date,o.orderprice, "
                    + "DATE_FORMAT(d.delivery_date, '%d/%m/%y %T') delivery_date ,d.status "
                    + "from order1 o join delivery d on o.order_id=d.order_id where d.status like concat('%',?,'%') order by o.order_id desc");
            connect.pet.setString(1, jcstatus.getSelectedItem().toString());
            //connect.pet.setString(2, entp.getName());
            
            System.out.println(connect.pet.toString());
            connect.myRs = connect.pet.executeQuery();
            while (connect.myRs.next()) {
                Object[] row = new Object[9];
                row[0] = connect.myRs.getInt("order_id");
                row[1] = connect.myRs.getString("ent_name");//username
                row[2] = connect.myRs.getString("f_ent_name");
                row[3] = connect.myRs.getString("created_date");
                row[4] = connect.myRs.getString("Modified_date");
                row[5] = connect.myRs.getInt("orderprice");
                row[6] = connect.myRs.getString("delivery_date");
                row[7] = connect.myRs.getString("status");
                model.addRow(row);
            }
            
            
    }
     catch (Exception et) {
            System.out.println(et.toString());

        }

}
}
