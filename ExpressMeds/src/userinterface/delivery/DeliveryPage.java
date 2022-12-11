package userinterface.delivery;

import model.enterprise.Enterprise;
import userinterface.employee.EmployeeRegistration;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nehajoisher
 */
public class DeliveryPage extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryPage
     */
    String username;
    Enterprise entp;
    public DeliveryPage(String username) {
        initComponents();
        this.username=username;
        entp = new Enterprise(1,"Delivery","Doordash","Enterprise",0);
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
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnsupordercat = new javax.swing.JButton();
        btncustordercat = new javax.swing.JButton();
        btnemployees = new javax.swing.JButton();
        btngrievmngt = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btncustorder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(219, 247, 252));

        btnsupordercat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnsupordercat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/fast-delivery.png"))); // NOI18N
        btnsupordercat.setText("Supplier Order Catalog");
        btnsupordercat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupordercatActionPerformed(evt);
            }
        });

        btncustordercat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btncustordercat.setText("Register Complaints");
        btncustordercat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustordercatActionPerformed(evt);
            }
        });

        btnemployees.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnemployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/employee.png"))); // NOI18N
        btnemployees.setText("Employees");
        btnemployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemployeesActionPerformed(evt);
            }
        });

        btngrievmngt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btngrievmngt.setText("Manage Grievances ");
        btngrievmngt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrievmngtActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/back.png"))); // NOI18N
        btnback.setText("Back");

        btncustorder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btncustorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/checkout.png"))); // NOI18N
        btncustorder.setText("Customer Order");
        btncustorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustorderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnback)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnsupordercat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncustordercat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnemployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btngrievmngt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncustorder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(82, 82, 82)
                .addComponent(btnsupordercat)
                .addGap(18, 18, 18)
                .addComponent(btncustorder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncustordercat)
                .addGap(18, 18, 18)
                .addComponent(btngrievmngt)
                .addGap(245, 245, 245)
                .addComponent(btnemployees)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(219, 247, 252));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(219, 247, 252));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Delivery Admin");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Click any of the Features");

        btnlogout.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsupordercatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupordercatActionPerformed
        // TODO add your handling code here:
        DeliveryCatalog delsupord = new DeliveryCatalog(entp,username );
        jSplitPane1.setRightComponent(delsupord);

    }//GEN-LAST:event_btnsupordercatActionPerformed

    private void btncustordercatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustordercatActionPerformed
        // TODO add your handling code here:
        CustomerGrievanceSupport complaint = new CustomerGrievanceSupport(username );
        jSplitPane1.setRightComponent(complaint );

    }//GEN-LAST:event_btncustordercatActionPerformed

    private void btnemployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemployeesActionPerformed
        // TODO add your handling code here:

        EmployeeRegistration supempreg = new EmployeeRegistration( );
        jSplitPane1.setRightComponent(supempreg);
    }//GEN-LAST:event_btnemployeesActionPerformed

    private void btngrievmngtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrievmngtActionPerformed
        // TODO add your handling code here:
        ManageGrievances mangriev = new ManageGrievances(username);
        jSplitPane1.setRightComponent(mangriev);

    }//GEN-LAST:event_btngrievmngtActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btncustorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustorderActionPerformed
        // TODO add your handling code here:
        CustRetailOrder mangriev = new CustRetailOrder(entp,username);
        jSplitPane1.setRightComponent(mangriev);
    }//GEN-LAST:event_btncustorderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeliveryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DeliveryPage(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncustorder;
    private javax.swing.JButton btncustordercat;
    private javax.swing.JButton btnemployees;
    private javax.swing.JButton btngrievmngt;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsupordercat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
