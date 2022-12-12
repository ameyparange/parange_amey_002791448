/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.supplier;

import dbconnection.JdbcConnect;
import java.awt.Window;
import javax.swing.SwingUtilities;
import model.enterprise.Enterprise;
import model.enterprise.EnterpriseCatalog;
import userinterface.admin.AdminPage;
import userinterface.admin.Dashboard;
import userinterface.employee.EmployeeRegistration;
import userinterface.hospital.HospitalPage;
import userinterface.retail.RetailPage;


/**
 *
 * @author amey8
 */
public class SupplierPage extends javax.swing.JFrame {

    /**
     * Creates new form SupplierPage1
     */
    JdbcConnect connect;
    String supp_name;
    Enterprise entp;
    Enterprise supplier;
    String username="";
    EnterpriseCatalog suppliercata;
    public SupplierPage() {
        initComponents();
        connect = new JdbcConnect();
        
        loadentname();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnwaremgt = new javax.swing.JButton();
        btnEmployeemgt = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnOrderMgmt = new javax.swing.JButton();
        btnwarecata = new javax.swing.JButton();
        btnOrderCata = new javax.swing.JButton();
        btnEmployeecatalog = new javax.swing.JButton();
        jcentname = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 607));
        setPreferredSize(new java.awt.Dimension(1050, 607));

        jSplitPane1.setDividerLocation(300);

        jPanel1.setBackground(new java.awt.Color(219, 247, 252));

        btnwaremgt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnwaremgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/inventory.png"))); // NOI18N
        btnwaremgt.setText("Warehouse Management");
        btnwaremgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwaremgtActionPerformed(evt);
            }
        });

        btnEmployeemgt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnEmployeemgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/employee.png"))); // NOI18N
        btnEmployeemgt.setText("Employees Management");
        btnEmployeemgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeemgtActionPerformed(evt);
            }
        });

        btnManageOrganization.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnManageOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/inventory.png"))); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/back.png"))); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnOrderMgmt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnOrderMgmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/inventory.png"))); // NOI18N
        btnOrderMgmt.setText("Order Management");
        btnOrderMgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMgmtActionPerformed(evt);
            }
        });

        btnwarecata.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnwarecata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/inventory.png"))); // NOI18N
        btnwarecata.setText("Warehouse Catalog");
        btnwarecata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwarecataActionPerformed(evt);
            }
        });

        btnOrderCata.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnOrderCata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/inventory.png"))); // NOI18N
        btnOrderCata.setText("Order Catalog");
        btnOrderCata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderCataActionPerformed(evt);
            }
        });

        btnEmployeecatalog.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnEmployeecatalog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/employee.png"))); // NOI18N
        btnEmployeecatalog.setText("Employees ");
        btnEmployeecatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeecatalogActionPerformed(evt);
            }
        });

        jcentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCentnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnback)
                .addGap(0, 218, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEmployeemgt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployeecatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderCata, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnwaremgt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrderMgmt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnwarecata, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcentname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(7, 7, 7)
                .addComponent(jcentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageOrganization)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnwaremgt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnwarecata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderMgmt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderCata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployeemgt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployeecatalog)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(219, 247, 252));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(219, 247, 252));

        jLabel2.setBackground(new java.awt.Color(219, 247, 252));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Supplier Admin");

        btnlogout.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Click any of the Features");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnwaremgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwaremgtActionPerformed
        // TODO add your handling code here:

        SupplierWarehouseMgmt supint = new SupplierWarehouseMgmt( entp );
        jSplitPane1.setRightComponent(supint);
    }//GEN-LAST:event_btnwaremgtActionPerformed

    private void btnEmployeemgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeemgtActionPerformed
        // TODO add your handling code here:
        EmployeeRegistration supempreg = new EmployeeRegistration( );
        jSplitPane1.setRightComponent(supempreg);

    }//GEN-LAST:event_btnEmployeemgtActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        
        ManageSupOrg mgorg = new ManageSupOrg(supp_name );
        jSplitPane1.setRightComponent(mgorg);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnOrderMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMgmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderMgmtActionPerformed

    private void btnwarecataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwarecataActionPerformed
        // TODO add your handling code here:
        
                SupplierWarehouseCatalog supint = new SupplierWarehouseCatalog( entp );
        jSplitPane1.setRightComponent(supint);
    }//GEN-LAST:event_btnwarecataActionPerformed

    private void btnOrderCataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderCataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderCataActionPerformed

    private void btnEmployeecatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeecatalogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeecatalogActionPerformed

    private void jCentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCentnameActionPerformed
        // TODO add your handling code here:
        supp_name = jcentname.getSelectedItem().toString();
        
        entp =loadentname (supp_name);
        jSplitPane1.setRightComponent(null);
    }//GEN-LAST:event_jCentnameActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
         SupplierPage frame = new SupplierPage();
        Window w = SwingUtilities.getWindowAncestor(SupplierPage.this);
        w.setVisible(false);  
        Dashboard frame1 = new Dashboard();
        frame1.setVisible(true);
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployeecatalog;
    private javax.swing.JButton btnEmployeemgt;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnOrderCata;
    private javax.swing.JButton btnOrderMgmt;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnwarecata;
    private javax.swing.JButton btnwaremgt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<String> jcentname;
    // End of variables declaration//GEN-END:variables

void loadentname(){
    //String ent_type =jCentname.getSelectedItem().toString();
    //String s;
    
    try{
    connect.connect();
            // Prepare Statement
               
            connect.pet = connect.con.prepareStatement("Select * from enterprise e where e.ent_type='Supplier'");
           //connect.pet.setString(1, ent_type);
           //System.out.println("pet");
           //System.out.println(connect.pet.toString());
            connect.myRs = connect.pet.executeQuery();
            while (connect.myRs.next()) {
                jcentname.addItem(connect.myRs.getString("name"));
                
            }
            
            
    }
     catch (Exception et) {
            System.out.println(et.toString());

        }
}

    Enterprise loadentname(String name){
    //String ent_type =jCentname.getSelectedItem().toString();
    //String s;
    Enterprise t;
    try{
    connect.connect();
            // Prepare Statement
               
            connect.pet = connect.con.prepareStatement("Select * from enterprise e where e.ent_type='Supplier' and name= ? ");
           connect.pet.setString(1, name);
           
            connect.myRs = connect.pet.executeQuery();
            if (connect.myRs.next()) {
                //jcentname.addItem(connect.myRs.getString("name"));
                t = new Enterprise(connect.myRs.getInt("ent_id"), connect.myRs.getString("ent_type"),
                        connect.myRs.getString("name"), connect.myRs.getString("email"), connect.myRs.getInt("add_id"));
                return t;
            }
            
            
    }
     catch (Exception et) {
            System.out.println(et.toString());
            return new Enterprise();
        }
    return new Enterprise();
}


}
