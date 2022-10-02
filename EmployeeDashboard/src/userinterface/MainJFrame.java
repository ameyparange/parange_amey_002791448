/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import java.util.ArrayList;
import model.Employee;
import model.EmployeeCatalog;

/**
 *
 * @author AMEY PARANGE
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    public EmployeeCatalog catalog;

    public MainJFrame() {
        initComponents();
        
        catalog = new EmployeeCatalog();
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
        javax.swing.JPanel ControlPanel = new javax.swing.JPanel();
        btncreate = new javax.swing.JButton();
        btnempcata = new javax.swing.JButton();
        javax.swing.JPanel Details = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnempcata.setText("Catalogue");
        btnempcata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempcataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnempcata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        ControlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btncreate, btnempcata});

        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btncreate)
                .addGap(11, 11, 11)
                .addComponent(btnempcata)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        ControlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btncreate, btnempcata});

        jSplitPane1.setLeftComponent(ControlPanel);

        javax.swing.GroupLayout DetailsLayout = new javax.swing.GroupLayout(Details);
        Details.setLayout(DetailsLayout);
        DetailsLayout.setHorizontalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        DetailsLayout.setVerticalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(Details);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        CreateEmp createemp = new CreateEmp(catalog);
        jSplitPane1.setRightComponent(createemp);
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnempcataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempcataActionPerformed
        // TODO add your handling code here:
        ViewEmpCatalog vmd = new ViewEmpCatalog(catalog);
        jSplitPane1.setRightComponent(vmd);
    }//GEN-LAST:event_btnempcataActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnempcata;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
