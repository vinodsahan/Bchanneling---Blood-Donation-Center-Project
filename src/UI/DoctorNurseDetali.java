/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author msham
 */
public class DoctorNurseDetali extends javax.swing.JInternalFrame {

    /**
     * Creates new form DoctorNurseDetali
     */
    public DoctorNurseDetali() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtDName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDSpeciality = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDEdu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comExYear = new javax.swing.JComboBox<>();
        comExMonth = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDAdress1 = new javax.swing.JTextField();
        txtDAdress2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDPhone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNPhone = new javax.swing.JTextField();
        txtNAdress2 = new javax.swing.JTextField();
        txtNAdress1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        comNMonth = new javax.swing.JComboBox<>();
        comNExYear = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNEdu = new javax.swing.JTextField();
        txtNSection = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNName = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Doctor & Nurse");
        setPreferredSize(new java.awt.Dimension(1156, 625));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor & Nurse Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1084, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Doctor Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 72, 90, 35));

        txtDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 81, 249, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Doctor ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 125, 82, 28));

        txtDID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDID, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 128, 185, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Speciality");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 190, 82, 27));

        txtDSpeciality.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 192, 185, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Education");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 243, 82, 34));

        txtDEdu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 249, 185, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Experiance");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 69, 41));

        comExYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comExYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00 Year", "01 Year", "02 Year", "03 Year ", "04 Year", "05 Year", "06 Year", "07 Year", "08 Year", "09 Year", "10 Year", "11 Year", "12 Year", "13 Year", "14 Year", "15 Year", "16 Year", "17 Year", "18 Year", "19 Year", "20 Year", "21 Year", "22 Year", "23 Year", "24 Year", "25 Year", "26 Year", "27 Year", "28 Year", "29 Year", "30 Year", "31 Year", "32 Year", "33 Year", "34 Year", "35 Year", "36 Year", "37 Year", "38 Year", "39 Year", "40 Year", "41 Year", "42 Year", "43 Year", "44 Year", "45 Year" }));
        getContentPane().add(comExYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        comExMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comExMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 Month", "02 Month", "03 Month", "04 Month", "05 Month", "06 Month", "07 Month", "08 Month", "09 Month", "10 Month", "11 Month", "12 Month" }));
        getContentPane().add(comExMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Adress");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 351, 55, 41));

        txtDAdress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDAdress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 185, -1));

        txtDAdress2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDAdress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 185, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Phone");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 69, 32));

        txtDPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 185, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Phone");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 82, 32));

        txtNPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 185, -1));

        txtNAdress2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNAdress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 185, -1));

        txtNAdress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNAdress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 185, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Adress");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 351, 55, 41));

        btnReset.setBackground(new java.awt.Color(204, 0, 0));
        btnReset.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, -1, -1));

        btnSave.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, -1, -1));

        comNMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comNMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 Month", "02 Month", "03 Month", "04 Month", "05 Month", "06 Month", "07 Month", "08 Month", "09 Month", "10 Month", "11 Month", "12 Month" }));
        getContentPane().add(comNMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 100, 20));

        comNExYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comNExYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00 Year", "01 Year", "02 Year", "03 Year ", "04 Year", "05 Year", "06 Year", "07 Year", "08 Year", "09 Year", "10 Year", "11 Year", "12 Year", "13 Year", "14 Year", "15 Year", "16 Year", "17 Year", "18 Year", "19 Year", "20 Year", "21 Year", "22 Year", "23 Year", "24 Year", "25 Year", "26 Year", "27 Year", "28 Year", "29 Year", "30 Year", "31 Year", "32 Year", "33 Year", "34 Year", "35 Year", "36 Year", "37 Year", "38 Year", "39 Year", "40 Year", "41 Year", "42 Year", "43 Year", "44 Year", "45 Year" }));
        getContentPane().add(comNExYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Experiance");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 82, 41));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Education");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 243, 82, 34));

        txtNEdu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 249, 185, -1));

        txtNSection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 198, 185, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Section");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 193, 90, 32));

        txtNID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNID, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 128, 185, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nurse ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 125, 82, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nurse Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 72, 90, 35));

        txtNName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNName, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 78, 249, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int YesORNo = JOptionPane.showConfirmDialog(null, "Do you want clear all Text","clear Text", JOptionPane.YES_NO_OPTION);
        if(YesORNo == 0){
            txtDAdress1.setText(null);
            txtDAdress2.setText(null);
            txtDEdu.setText(null);
            txtDID.setText(null);
            txtDName.setText(null);
            txtDPhone.setText(null);
            txtDSpeciality.setText(null);
            txtNAdress1.setText(null);
            txtNAdress2.setText(null);
            txtNEdu.setText(null);
            txtNID.setText(null);
            txtNName.setText(null);
            txtNPhone.setText(null);
            txtNSection.setText(null);
        } else {
            
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comExMonth;
    private javax.swing.JComboBox<String> comExYear;
    private javax.swing.JComboBox<String> comNExYear;
    private javax.swing.JComboBox<String> comNMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDAdress1;
    private javax.swing.JTextField txtDAdress2;
    private javax.swing.JTextField txtDEdu;
    private javax.swing.JTextField txtDID;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtDPhone;
    private javax.swing.JTextField txtDSpeciality;
    private javax.swing.JTextField txtNAdress1;
    private javax.swing.JTextField txtNAdress2;
    private javax.swing.JTextField txtNEdu;
    private javax.swing.JTextField txtNID;
    private javax.swing.JTextField txtNName;
    private javax.swing.JTextField txtNPhone;
    private javax.swing.JTextField txtNSection;
    // End of variables declaration//GEN-END:variables
}
