/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.confidential.*;
import model.hospital.Hospital;
import model.hospital.Hospitaldirectory;
import model.patienta.Patientdirectory;
import model.persona.Community;
import model.persona.Persondirectory;
import userinterface.systemadminhome.Adminhome;

/**
 *
 * @author amey8
 */
public class LoginMain extends javax.swing.JPanel {

    /**
     * Creates new form LoginMain
     */
    Persondirectory perdir;
    Authentication auth;
    Patientdirectory patdir;
    Community community;
    Hospitaldirectory hosdir;

    public LoginMain(Patientdirectory patdir, Authentication auth, Community community,Hospitaldirectory hosdir,Persondirectory perdir) {
        initComponents();
        this.auth = auth;
        this.patdir = patdir;
        this.community = community;
        this.hosdir=hosdir;
        this.perdir=perdir;
        tfuserid.setText("parangea");
        tfpass.setText("admin1234");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbloginas = new javax.swing.JComboBox<>();
        tfuserid = new javax.swing.JTextField();
        tfpass = new javax.swing.JTextField();
        javax.swing.JButton btnSubmit1 = new javax.swing.JButton();
        javax.swing.JButton btnClear1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGIN");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Login As");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        cbloginas.setMaximumRowCount(4);
        cbloginas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Reception", "System Admin", "Hospital Admin", "Community Admin" }));
        cbloginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbloginasActionPerformed(evt);
            }
        });

        tfuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfuseridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfpass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbloginas, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                    .addComponent(tfuserid))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbloginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnSubmit1.setBackground(new java.awt.Color(204, 204, 204));
        btnSubmit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit1.setText("Submit");
        btnSubmit1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });

        btnClear1.setBackground(new java.awt.Color(204, 204, 204));
        btnClear1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear1.setText("Clear");
        btnClear1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbloginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbloginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbloginasActionPerformed

    private void tfuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfuseridActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        try {
            Credentials cred = new Credentials();
            cred.setUsername(tfuserid.getText());
            cred.setUsertype(cbloginas.getSelectedItem().toString());
            cred.setPassword(tfpass.getText());
            //System.out.println(cbloginas.getSelectedItem().toString());
            if (auth.checkauth(cred)) {
                JOptionPane.showMessageDialog(this, "Logged in as " + tfuserid.getText());
                if (cbloginas.getSelectedItem().toString().equalsIgnoreCase("Patient")) {
                    Patientjf patientjf = new Patientjf();
                    patientjf.initcurrpatient(patdir.searchIndexPat(tfuserid.getText()), community, patdir, auth, hosdir);
                    patientjf.setVisible(true);
                    
                    
                }
             else if (cbloginas.getSelectedItem().toString().equalsIgnoreCase("System Admin")) {
                //System.out.println(cbloginas.getSelectedItem().toString());
                Adminhome adminhome = new Adminhome();
                adminhome.adminhomeinit(community, patdir, auth, cred, hosdir, perdir);
                adminhome.setVisible(true);
                (new Homepagemjf()).dispose();
            }} else {
                JOptionPane.showMessageDialog(this, "Incorrect Credentials",
                        // "Try Again"
                        cred.getUsername(),
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Warning:Credentials Exception;");

        }

    }//GEN-LAST:event_btnSubmit1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbloginas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfpass;
    private javax.swing.JTextField tfuserid;
    // End of variables declaration//GEN-END:variables
}
