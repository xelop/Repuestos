/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repuestos.UI;

import repuestos.Logic.Controller;

/**
 *
 * @author Xelop
 */
public class PartswithProvider extends javax.swing.JFrame {

    /**
     * Creates new form PartswithProvider
     */
    Controller Control;
    String[] CurrentPart;
    public PartswithProvider(Controller pControl, String[] pCurrentPart) {
        initComponents();
        Control=pControl;
        CurrentPart=pCurrentPart;
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
        _txt_ProviderID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        _txt_Cost = new javax.swing.JTextField();
        _btn_Associate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Provider's ID");

        _txt_ProviderID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _txt_ProviderIDKeyReleased(evt);
            }
        });

        jLabel2.setText("Cost per Part");

        _txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _txt_CostKeyReleased(evt);
            }
        });

        _btn_Associate.setText("Associate");
        _btn_Associate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _btn_AssociateMouseClicked(evt);
            }
        });
        _btn_Associate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_AssociateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_txt_Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_txt_ProviderID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(_btn_Associate)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(_txt_ProviderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(_txt_Cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(_btn_Associate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _btn_AssociateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__btn_AssociateMouseClicked
        // TODO add your handling code here:
        Control.associatePartWProvider(CurrentPart[0], _txt_ProviderID.getText(), _txt_Cost.getText());
    }//GEN-LAST:event__btn_AssociateMouseClicked

    private void _btn_AssociateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_AssociateActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event__btn_AssociateActionPerformed

    private void _txt_ProviderIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__txt_ProviderIDKeyReleased
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())||evt.getExtendedKeyCode()==8) {
        } else{
            _txt_ProviderID.setText(""+_txt_ProviderID.getText().substring(0, _txt_ProviderID.getText().length() - 1));
        }
    }//GEN-LAST:event__txt_ProviderIDKeyReleased

    private void _txt_CostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__txt_CostKeyReleased
        // TODO add your handling code here:

        if(Character.isDigit(evt.getKeyChar())||evt.getExtendedKeyCode()==8) {
        } else{
            _txt_Cost.setText(""+_txt_Cost.getText().substring(0, _txt_Cost.getText().length() - 1));
        }
    }//GEN-LAST:event__txt_CostKeyReleased

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
            java.util.logging.Logger.getLogger(PartswithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartswithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartswithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartswithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PartswithProvider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btn_Associate;
    private javax.swing.JTextField _txt_Cost;
    private javax.swing.JTextField _txt_ProviderID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
