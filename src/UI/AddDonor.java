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
public class AddDonor extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public AddDonor() {
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
        comBDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel18 = new javax.swing.JLabel();
        comBlooGroup = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDBloodNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDAdress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comDBirth = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtDWeight = new javax.swing.JTextField();
        txtDHeight = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comDGender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDPhoneH = new javax.swing.JTextField();
        txtDPhoneM = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comBloodEx = new de.wannawork.jcalendar.JCalendarComboBox();
        btnDReset = new javax.swing.JButton();
        btnDNext = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Donor");
        setPreferredSize(new java.awt.Dimension(1156, 625));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Donor Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Blood Add Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 122, 48));
        getContentPane().add(comBDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 123, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Blood Group");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 87, -1));

        comBlooGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O", "O-", "O+", "A-", "A+", "B+", "B-", "AB" }));
        getContentPane().add(comBlooGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 90, 43));

        txtDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 500, 43));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Blood No");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 70, 30));
        getContentPane().add(txtDBloodNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 60, 30));

        txtDAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtDAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 40, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        txtDAdress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDAdressActionPerformed(evt);
            }
        });
        getContentPane().add(txtDAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 510, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 40, -1));

        txtDID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtDID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 70, 50));
        getContentPane().add(comDBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Weight");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 353, -1, -1));
        getContentPane().add(txtDWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 353, 46, -1));
        getContentPane().add(txtDHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 393, 46, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Height");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 393, -1, -1));

        comDGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comDGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(comDGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Phone");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 443, 40, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Home");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 443, 40, -1));

        txtDPhoneH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPhoneHActionPerformed(evt);
            }
        });
        getContentPane().add(txtDPhoneH, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 132, -1));

        txtDPhoneM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPhoneMActionPerformed(evt);
            }
        });
        getContentPane().add(txtDPhoneM, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 132, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Mobile");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 473, 40, -1));

        jLabel6.setFont(jLabel6.getFont().deriveFont((float)14));
        jLabel6.setText("Blood Expire Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 503, -1, 35));
        getContentPane().add(comBloodEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 130, -1));

        btnDReset.setBackground(new java.awt.Color(204, 0, 0));
        btnDReset.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnDReset.setText("Reset");
        btnDReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnDReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 544, -1, -1));

        btnDNext.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnDNext.setText("Next");
        btnDNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnDNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 544, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDAdressActionPerformed

    private void txtDPhoneHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPhoneHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPhoneHActionPerformed

    private void txtDPhoneMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPhoneMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPhoneMActionPerformed

    private void btnDResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDResetActionPerformed
        int YesORNo = JOptionPane.showConfirmDialog(null, "Do you want clear all Text","clear Text", JOptionPane.YES_NO_OPTION);
        if(YesORNo == 0){
            txtDName.setText(null);
            txtDAdress.setText(null);
            txtDAge.setText(null);
            txtDBloodNo.setText(null);
            txtDHeight.setText(null);
            txtDID.setText(null);
            txtDPhoneH.setText(null);
            txtDPhoneM.setText(null);
            txtDWeight.setText(null);
        } else{
            
        }
        
    }//GEN-LAST:event_btnDResetActionPerformed

    private void btnDNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDNextActionPerformed
      
    }//GEN-LAST:event_btnDNextActionPerformed

    private void txtDNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDNext;
    private javax.swing.JButton btnDReset;
    private de.wannawork.jcalendar.JCalendarComboBox comBDate;
    private javax.swing.JComboBox<String> comBlooGroup;
    private de.wannawork.jcalendar.JCalendarComboBox comBloodEx;
    private de.wannawork.jcalendar.JCalendarComboBox comDBirth;
    private javax.swing.JComboBox<String> comDGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDAdress;
    private javax.swing.JTextField txtDAge;
    private javax.swing.JTextField txtDBloodNo;
    private javax.swing.JTextField txtDHeight;
    private javax.swing.JTextField txtDID;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtDPhoneH;
    private javax.swing.JTextField txtDPhoneM;
    private javax.swing.JTextField txtDWeight;
    // End of variables declaration//GEN-END:variables
}
