/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.patient;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.confidential.Fileload;
import model.confidential.Validations;
import model.patienta.Encounter;
import model.patienta.VitalSigns;

/**
 *
 * @author amey8
 */
public class PatAppView extends javax.swing.JPanel {

    /**
     * Creates new form PatAppView
     */
    Encounter enc;
    int patientid;
    int curr_enc=0;
    public PatAppView(Encounter enc, int patientid) {
        initComponents();
        this.enc= enc;
        this.patientid = patientid;
        this.populatetable(0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtencounter = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfcommname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfmm = new javax.swing.JTextField();
        tfdd = new javax.swing.JTextField();
        tfyyyy = new javax.swing.JTextField();
        btnschedule = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jtencounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Enc No", "Date", "Community", "Pulserate", "BloodPressure", "Sugarlevel", "BodyTemp", "Symtoms"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtencounter);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Schedule Appointment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Community");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date");

        tfmm.setText("mm");

        tfdd.setText("dd");
        tfdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfddActionPerformed(evt);
            }
        });

        tfyyyy.setText("yyyy");

        btnschedule.setBackground(new java.awt.Color(153, 153, 153));
        btnschedule.setText("Schedule");
        btnschedule.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscheduleActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(153, 153, 153));
        btnclear.setText("Clear");
        btnclear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jdelete.setBackground(new java.awt.Color(153, 153, 153));
        jdelete.setText("DeleteLatest");
        jdelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcommname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfmm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jdelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnclear))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnschedule)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcommname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclear)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnschedule)
                        .addComponent(jdelete)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfddActionPerformed

    private void btnscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscheduleActionPerformed
        // TODO add your handling code here:
        VitalSigns vs1=new VitalSigns();
        Validations val = new Validations();
        
        try {
        if (tfcommname.getText().isEmpty()||tfmm.getText().isEmpty()||tfdd.getText().isEmpty()||tfyyyy.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Cannot enter empty field",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
            
        }
        if (!val.valhospname(tfcommname.getText()))
        {
            JOptionPane.showMessageDialog(this, "Please enter valid community name",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
        }
        else {
        vs1.setPatient_id(patientid);
        vs1.setVitalsignsid();
        vs1.setComm_name(tfcommname.getText());
        }
        if (!(val.valnum(tfmm.getText())&&val.valnum(tfdd.getText())&&val.valnum(tfyyyy.getText()))){
                JOptionPane.showMessageDialog(this, "Please enter valid date",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
        }
        else {
            String s=tfmm.getText()+"-"+tfdd.getText()+"-"+tfyyyy.getText();
            
            
            vs1.setTimestamp(s);
            
            vs1.setPulserate("NA");
            vs1.setBloodpressure("NA");
            vs1.setSugerlevel("NA");
            vs1.setTemperature("NA");
            vs1.setSymtoms("NA");
                    
            enc.addnewvitalsign(vs1);
            Fileload fileload = new Fileload();
            fileload.loadencounterfile(enc);
            populatetable(1);
            JOptionPane.showMessageDialog(this, "Appointment Scheduled");
            clearview();
        }
        }
        catch(Exception e)
        {
        
        }
    }//GEN-LAST:event_btnscheduleActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        tfcommname.setText("");
        tfmm.setText("");
        tfdd.setText("");
        tfyyyy.setText("");
    }//GEN-LAST:event_btnclearActionPerformed
void clearview(){
tfcommname.setText("");
        tfmm.setText("");
        tfdd.setText("");
        tfyyyy.setText("");}
    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:
        if (curr_enc!=0 && enc.searchencounter(curr_enc).getBloodpressure().equalsIgnoreCase("NA") )
        {
            enc.deletevitalsignrec(curr_enc);
            curr_enc=0;
            populatetable(0);
            
            JOptionPane.showMessageDialog(this, "Current appointment deleted");
        }
        else {
            JOptionPane.showMessageDialog(this, "No new appointment created");
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void populatetable(int r) {
        DefaultTableModel model = (DefaultTableModel) jtencounter.getModel();
        model.setRowCount(0);
        VitalSigns add;
        System.out.println("Here"+r);
        int i = 0;
        for (VitalSigns hos : enc.getEncounter()) {

            Object[] row = new Object[10];
            row[0] = i + 1;
            row[1] = hos.getTimestamp();//username
            row[2] = hos.getComm_name();
            
            row[3] = hos.getPulserate();
            row[4] = hos.getBloodpressure();
            row[5] = hos.getSugerlevel();
            row[6] = hos.getTemperature();
            row[7] = hos.getSymtoms();
            
            model.addRow(row);
            curr_enc=hos.getVitalsignsid();
            if (r==1){
            curr_enc=hos.getVitalsignsid();
            }
            i++;
            //JOptionPane.showMessageDialog(this, "Successfully Employee Profile Created!!!");
        }
        

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnschedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jdelete;
    private javax.swing.JTable jtencounter;
    private javax.swing.JTextField tfcommname;
    private javax.swing.JTextField tfdd;
    private javax.swing.JTextField tfmm;
    private javax.swing.JTextField tfyyyy;
    // End of variables declaration//GEN-END:variables
}
