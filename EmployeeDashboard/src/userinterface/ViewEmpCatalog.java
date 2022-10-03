/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeCatalog;
import userinterface.MainJFrame;

/**
 *
 * @author AMEY PARANGE
 */
public class ViewEmpCatalog extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmpCatalog
     */
    EmployeeCatalog catalog;

    public ViewEmpCatalog(EmployeeCatalog catalog) {
        initComponents();
        this.catalog = catalog;
        populatecatalog();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tcatalog = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tffirstname = new javax.swing.JTextField();
        tflastname = new javax.swing.JTextField();
        tfage = new javax.swing.JTextField();
        tfgender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfempid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfmobileno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfemailid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tflevel = new javax.swing.JTextField();
        tfteaminfo = new javax.swing.JTextField();
        tfpostitle = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnedit = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(550, 200));

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Catalogue");

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tcatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmpId", "FirstName", "LastName", "Age", "Gender", "MobileNo", "EmailId", "Level", "TeamInfo", "JobTitle", "Start date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tcatalog.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tcatalog.setMinimumSize(new java.awt.Dimension(600, 80));
        tcatalog.setPreferredSize(new java.awt.Dimension(600, 80));
        jScrollPane2.setViewportView(tcatalog);

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Gender");

        tflastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflastnameActionPerformed(evt);
            }
        });

        tfage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfageActionPerformed(evt);
            }
        });

        tfgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfgenderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Employee Id");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Mobile Number");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Email id");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Level");

        tflevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflevelActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Position Title");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Team Info");

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(tfempid))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tffirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tflastname, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfgender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfage, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfmobileno, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(tfemailid)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfteaminfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(tflevel)
                            .addComponent(tfpostitle))))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnupdate)
                    .addComponent(btnedit)
                    .addComponent(btnsearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfempid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tffirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnedit))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(tflevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tflastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnupdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnsearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tfgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(223, 223, 223)
                            .addComponent(btndelete)
                            .addGap(18, 18, 18)
                            .addComponent(btnview))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnview)
                    .addComponent(btndelete))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int row = tcatalog.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            DefaultTableModel model = (DefaultTableModel) tcatalog.getModel();

            int selected_emp = (int) model.getValueAt(row, 0);

            catalog.deleteemprec(selected_emp);
            populatecatalog();

        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int row = tcatalog.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            DefaultTableModel model = (DefaultTableModel) tcatalog.getModel();

            int selected_empid = (int) model.getValueAt(row, 0);

            //catalog.deleteemprec(selected_emp);
            // populatecatalog();
            Employee emp = catalog.searchIndexEmp(selected_empid);
            displayEmpDetails(emp);
            disableViewfield();
            // MainJFrame mjf= new MainJFrame();
            //mjf.btnviewActionPerformed(catalog,selected_empid);

        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void tflastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflastnameActionPerformed

    private void tfageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfageActionPerformed

    private void tfgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfgenderActionPerformed

    private void tflevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflevelActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int tempid = Integer.valueOf(tfempid.getText());
        catalog.deleteemprec(tempid);
        Employee emp = new Employee();
        emp.setEmpid(Integer.valueOf(tfempid.getText()));
        emp.setFirstname(tffirstname.getText());
        emp.setLastname(tflastname.getText());
        emp.setAge(Integer.valueOf(tfage.getText()));
        emp.setMobileno(Integer.valueOf(tfmobileno.getText()));
        emp.setLevel(tflevel.getText());
        emp.setEmail(tfemailid.getText());
        emp.setTeaminfo(tfteaminfo.getText());
        emp.setPostitle(tfpostitle.getText());
        //emp.setGender(listgender.getSelectedValue());
        emp.setGender(tfgender.getText());

        catalog.addnewemployee(emp);
        JOptionPane.showMessageDialog(this, "Successfully Employee Profile Created!!!");
        disableViewfield();
        populatecatalog();

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        enableViewfield();
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String query ;
        Employee emp= new Employee();
        if (!tfempid.getText().isEmpty()) {
            query = tfempid.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                if (emp1.getEmpid()== Integer.valueOf(query)) {
                    emp = emp1;
                }
            }
        }  else if (!tffirstname.getText().isEmpty()) {
            query = tffirstname.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getFirstname().equalsIgnoreCase(query)) {
                    emp = emp1;
                }
            }
        } else if (!tflastname.getText().isEmpty()) {
            query = tflastname.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getLastname().equalsIgnoreCase(query)) {
                    emp = emp1;
                }
            }
        } else if (!tfmobileno.getText().isEmpty()) {
            query = tfmobileno.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getMobileno()== Integer.valueOf(query)) {
                    emp = emp1;
                }
            }
        } else if (!tfage.getText().isEmpty()) {
            query = tfage.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getAge()== Integer.valueOf(query)) {
                    emp = emp1;
                }
            }
        } else if (!tflevel.getText().isEmpty()) {
            query = tflevel.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getLevel().equalsIgnoreCase(query)) {
                    emp = emp1;
                }
            }
        } else if (!tfemailid.getText().isEmpty()) {
            query = tfemailid.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getEmail().equalsIgnoreCase(query)) {
                    emp = emp1;
                }
            }
        } else if (!tfteaminfo.getText().isEmpty()) {
            query = tfteaminfo.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getTeaminfo().equalsIgnoreCase(query)) {
                    emp = emp1;
                }
            }
        } else if (!tfpostitle.getText().isEmpty()) {
            query = tfpostitle.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getPostitle().equalsIgnoreCase(query)) {
                    emp = emp1;
                }
            }
        } else if (!tfgender.getText().isEmpty()) {
            query = tfgender.getText();
            for (Employee emp1 : catalog.getCatalog()) {
                
                if (emp1.getGender().equalsIgnoreCase(query)) {
                    emp = emp1;
                }
            }
        }
        if (emp!=null){
            JOptionPane.showMessageDialog(this, 
                "Employee Found!!!");
        populatecatalog(emp);
        clearview();}
        else JOptionPane.showMessageDialog(this, 
                "Employee does exist!!!");

    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tcatalog;
    private javax.swing.JTextField tfage;
    private javax.swing.JTextField tfemailid;
    private javax.swing.JTextField tfempid;
    private javax.swing.JTextField tffirstname;
    private javax.swing.JTextField tfgender;
    private javax.swing.JTextField tflastname;
    private javax.swing.JTextField tflevel;
    private javax.swing.JTextField tfmobileno;
    private javax.swing.JTextField tfpostitle;
    private javax.swing.JTextField tfteaminfo;
    // End of variables declaration//GEN-END:variables

    private void populatecatalog() {
        DefaultTableModel model = (DefaultTableModel) tcatalog.getModel();
        model.setRowCount(0);

        for (Employee emp : catalog.getCatalog()) {
            Object[] row = new Object[11];

            row[0] = emp.getEmpid();
//emp.getEmpid();
            row[1] = emp.getFirstname();
            row[2] = emp.getLastname();
            row[3] = emp.getAge();
            row[4] = emp.getGender();
            row[5] = emp.getMobileno();
            row[6] = emp.getEmail();
            row[7] = emp.getLevel();
            row[8] = emp.getTeaminfo();
            row[9] = emp.getPostitle();
            row[10] = emp.getStartdate();
            model.addRow(row);
            //JOptionPane.showMessageDialog(this, "Successfully Employee Profile Created!!!");
        }

    }
    
     private void populatecatalog(Employee emp) {
        DefaultTableModel model = (DefaultTableModel) tcatalog.getModel();
        model.setRowCount(0);

        
            Object[] row = new Object[10];

            row[0] = emp.getEmpid();
//emp.getEmpid();
            row[1] = emp.getFirstname();
            row[2] = emp.getLastname();
            row[3] = emp.getAge();
            row[4] = emp.getGender();
            row[5] = emp.getMobileno();
            row[6] = emp.getEmail();
            row[7] = emp.getLevel();
            row[8] = emp.getTeaminfo();
            row[9] = emp.getPostitle();
            row[10] = emp.getStartdate();
            model.addRow(row);
            //JOptionPane.showMessageDialog(this, "Successfully Employee Profile Created!!!");
        

    }

    public void displayEmpDetails(Employee emp) {
        tfempid.setText(String.valueOf(emp.getEmpid()));
        tffirstname.setText(emp.getFirstname());
        tflastname.setText(emp.getLastname());
        tfage.setText(String.valueOf(emp.getAge()));
        tfmobileno.setText(String.valueOf(emp.getMobileno()));
        tflevel.setText(emp.getLevel());
        tfemailid.setText(emp.getEmail());
        tfteaminfo.setText(emp.getTeaminfo());
        tfpostitle.setText(emp.getPostitle());
        tfgender.setText(emp.getGender());
        
    }

    private void disableViewfield() {
        tfempid.setEnabled(false);
        tffirstname.setEnabled(false);
        tflastname.setEnabled(false);
        tfage.setEnabled(false);
        tfmobileno.setEnabled(false);
        tflevel.setEnabled(false);
        tfemailid.setEnabled(false);
        tfteaminfo.setEnabled(false);
        tfpostitle.setEnabled(false);
        tfgender.setEnabled(false);
        
    }

    private void enableViewfield() {
        tffirstname.setEnabled(true);
        tflastname.setEnabled(true);
        tfage.setEnabled(true);
        tfmobileno.setEnabled(true);
        tflevel.setEnabled(true);
        tfemailid.setEnabled(true);
        tfteaminfo.setEnabled(true);
        tfpostitle.setEnabled(true);
        tfgender.setEnabled(true);
        
    }

    private void clearview() {
            tfempid.setText("");
            tffirstname.setText("");
            tflastname.setText("");
            tfage.setText("");
            tfmobileno.setText("");
            tflevel.setText("");
            tfemailid.setText("");
            tfteaminfo.setText("");
            tfpostitle.setText("");  
            tfgender.setText("");
            
    }
}
