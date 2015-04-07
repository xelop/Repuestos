/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repuestos.UI;

import javax.swing.JFrame;
import repuestos.Logic.Controller;

/**
 *
 * @author Xelop
 */
public class InsertClient extends javax.swing.JFrame {

    /**
     * Creates new form InsertClient
     */
    Controller Control;
    public InsertClient(Controller pControl) {
        initComponents();
        Control=pControl;
        _pnl_telephone.setVisible(false);
        Control.changeCurrentUI(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        _rbn_Organization = new javax.swing.JRadioButton();
        _rbn_Person = new javax.swing.JRadioButton();
        _lbl_Type = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        _lbl_Direction = new javax.swing.JLabel();
        _lbl_Name = new javax.swing.JLabel();
        _txt_Direction = new javax.swing.JTextField();
        _lbl_City = new javax.swing.JLabel();
        _txt_Name = new javax.swing.JTextField();
        _txt_City = new javax.swing.JTextField();
        _lbl_Identification = new javax.swing.JLabel();
        _txt_OrganizationPerson = new javax.swing.JTextField();
        _lbl_Person = new javax.swing.JLabel();
        _txt_Identification = new javax.swing.JTextField();
        _btn_AddClient = new javax.swing.JButton();
        _pnl_telephone = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _txa_Telephones = new javax.swing.JTextArea();
        _btn_AddTelephone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(_rbn_Organization);
        _rbn_Organization.setSelected(true);
        _rbn_Organization.setText("Organization");
        _rbn_Organization.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                _rbn_OrganizationStateChanged(evt);
            }
        });
        _rbn_Organization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _rbn_OrganizationMouseClicked(evt);
            }
        });
        _rbn_Organization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _rbn_OrganizationActionPerformed(evt);
            }
        });

        buttonGroup1.add(_rbn_Person);
        _rbn_Person.setText("Person");
        _rbn_Person.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                _rbn_PersonStateChanged(evt);
            }
        });
        _rbn_Person.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _rbn_PersonMouseClicked(evt);
            }
        });

        _lbl_Type.setText("Type:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lbl_Type)
                    .addComponent(_rbn_Organization)
                    .addComponent(_rbn_Person))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_lbl_Type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_rbn_Organization)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_rbn_Person)
                .addGap(21, 21, 21))
        );

        _lbl_Direction.setText("Direction");

        _lbl_Name.setText("Name");

        _txt_Direction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _txt_DirectionActionPerformed(evt);
            }
        });

        _lbl_City.setText("City");

        _txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _txt_NameActionPerformed(evt);
            }
        });

        _txt_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _txt_CityActionPerformed(evt);
            }
        });

        _lbl_Identification.setText("Identification");

        _lbl_Person.setText("Person in Charge");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(_lbl_Direction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_txt_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(_lbl_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lbl_City)
                            .addComponent(_lbl_Identification)
                            .addComponent(_lbl_Person))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_txt_OrganizationPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_txt_Identification, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_Direction)
                    .addComponent(_txt_Direction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_Name)
                    .addComponent(_txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_City)
                    .addComponent(_txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_Identification)
                    .addComponent(_txt_Identification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_Person)
                    .addComponent(_txt_OrganizationPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        _btn_AddClient.setText("Done");
        _btn_AddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_AddClientActionPerformed(evt);
            }
        });

        _txa_Telephones.setColumns(20);
        _txa_Telephones.setRows(5);
        jScrollPane1.setViewportView(_txa_Telephones);

        _btn_AddTelephone.setText("Add Telephone");

        javax.swing.GroupLayout _pnl_telephoneLayout = new javax.swing.GroupLayout(_pnl_telephone);
        _pnl_telephone.setLayout(_pnl_telephoneLayout);
        _pnl_telephoneLayout.setHorizontalGroup(
            _pnl_telephoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pnl_telephoneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _pnl_telephoneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_btn_AddTelephone)
                .addGap(68, 68, 68))
        );
        _pnl_telephoneLayout.setVerticalGroup(
            _pnl_telephoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _pnl_telephoneLayout.createSequentialGroup()
                .addComponent(_btn_AddTelephone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(_pnl_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(_btn_AddClient)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245)
                        .addComponent(_btn_AddClient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(_pnl_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insertClient(){
        if(_rbn_Organization.isSelected())
            Control.insertOrganization(_txt_Identification.getText() , _txt_Direction.getText(), _txt_Name.getText(), _txt_City.getText(), _txt_OrganizationPerson.getText());      
        else
            Control.insertPerson(_txt_Identification.getText(), _txt_Direction.getText() , _txt_Name.getText(), _txt_City.getText());
    }
    
    private void _txt_DirectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_DirectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_DirectionActionPerformed

    private void _txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_NameActionPerformed

    private void _txt_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_CityActionPerformed

    private void _rbn_OrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__rbn_OrganizationActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event__rbn_OrganizationActionPerformed

    private void _btn_AddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_AddClientActionPerformed
        // TODO add your handling code here:
        insertClient();
    }//GEN-LAST:event__btn_AddClientActionPerformed

    private void _rbn_PersonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event__rbn_PersonStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event__rbn_PersonStateChanged

    private void _rbn_OrganizationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event__rbn_OrganizationStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event__rbn_OrganizationStateChanged

    private void _rbn_OrganizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__rbn_OrganizationMouseClicked
        // TODO add your handling code here:
        _txt_OrganizationPerson.setVisible(true);
        _lbl_Person.setVisible(true);
        _pnl_telephone.setVisible(false);
        
    }//GEN-LAST:event__rbn_OrganizationMouseClicked

    private void _rbn_PersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__rbn_PersonMouseClicked
        // TODO add your handling code here:
        _txt_OrganizationPerson.setVisible(false);
        _lbl_Person.setVisible(false);
        _pnl_telephone.setVisible(true);
        
    }//GEN-LAST:event__rbn_PersonMouseClicked

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
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InsertClient().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btn_AddClient;
    private javax.swing.JButton _btn_AddTelephone;
    private javax.swing.JLabel _lbl_City;
    private javax.swing.JLabel _lbl_Direction;
    private javax.swing.JLabel _lbl_Identification;
    private javax.swing.JLabel _lbl_Name;
    private javax.swing.JLabel _lbl_Person;
    private javax.swing.JLabel _lbl_Type;
    private javax.swing.JPanel _pnl_telephone;
    private javax.swing.JRadioButton _rbn_Organization;
    private javax.swing.JRadioButton _rbn_Person;
    private javax.swing.JTextArea _txa_Telephones;
    private javax.swing.JTextField _txt_City;
    private javax.swing.JTextField _txt_Direction;
    private javax.swing.JTextField _txt_Identification;
    private javax.swing.JTextField _txt_Name;
    private javax.swing.JTextField _txt_OrganizationPerson;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
