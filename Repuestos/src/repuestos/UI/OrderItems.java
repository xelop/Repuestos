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
public class OrderItems extends javax.swing.JFrame {

    /**
     * Creates new form OrderItems
     */
    Controller Control;
    public OrderItems(Controller pControl) {
        initComponents();
        Control=pControl;
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

        jPanel2 = new javax.swing.JPanel();
        _lbl_Name = new javax.swing.JLabel();
        _d = new javax.swing.JLabel();
        _txt_Provider = new javax.swing.JTextField();
        _lbl_City = new javax.swing.JLabel();
        _txt_Part = new javax.swing.JTextField();
        _txt_Quantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        _txt_OrderID = new javax.swing.JTextField();
        _btn_Back = new javax.swing.JButton();
        _btn_Add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _lbl_Name.setText("Provider ID");

        _d.setText("Part ID");

        _txt_Provider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _txt_ProviderActionPerformed(evt);
            }
        });
        _txt_Provider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _txt_ProviderKeyReleased(evt);
            }
        });

        _lbl_City.setText("Quantity");

        _txt_Part.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _txt_PartActionPerformed(evt);
            }
        });
        _txt_Part.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _txt_PartKeyReleased(evt);
            }
        });

        _txt_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _txt_QuantityActionPerformed(evt);
            }
        });
        _txt_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _txt_QuantityKeyReleased(evt);
            }
        });

        jLabel1.setText("Order ID");

        _txt_OrderID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _txt_OrderIDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(_d)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_txt_Part, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(_lbl_City)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(_txt_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lbl_Name)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_txt_Provider, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(_txt_OrderID))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(_txt_OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_Name)
                    .addComponent(_txt_Provider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_d)
                    .addComponent(_txt_Part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_City)
                    .addComponent(_txt_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        _btn_Back.setText("Back");
        _btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _btn_BackMouseClicked(evt);
            }
        });
        _btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_BackActionPerformed(evt);
            }
        });

        _btn_Add.setText("Add");
        _btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _btn_AddMouseClicked(evt);
            }
        });
        _btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_btn_Add)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(_btn_Back)
                        .addGap(11, 11, 11)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(_btn_Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_btn_Back)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _txt_ProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_ProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_ProviderActionPerformed

    private void _txt_PartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_PartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_PartActionPerformed

    private void _txt_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_QuantityActionPerformed

    private void _btn_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__btn_AddMouseClicked
        // TODO add your handling code here:
        Control.addItem(_txt_OrderID.getText(), _txt_Provider.getText(), _txt_Part.getText(), _txt_Quantity.getText());
    }//GEN-LAST:event__btn_AddMouseClicked

    private void _btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__btn_BackMouseClicked
        // TODO add your handling code here:
        new MainInterface(Control).setVisible(true);
        this.dispose();
    }//GEN-LAST:event__btn_BackMouseClicked

    private void _btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__btn_AddActionPerformed

    private void _btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__btn_BackActionPerformed

    private void _txt_OrderIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__txt_OrderIDKeyReleased
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())||evt.getExtendedKeyCode()==8) {
        } else{
            _txt_OrderID.setText(""+_txt_OrderID.getText().substring(0, _txt_OrderID.getText().length() - 1));
        }
    }//GEN-LAST:event__txt_OrderIDKeyReleased

    private void _txt_ProviderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__txt_ProviderKeyReleased
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())||evt.getExtendedKeyCode()==8) {
        } else{
            _txt_Provider.setText(""+_txt_Provider.getText().substring(0, _txt_Provider.getText().length() - 1));
        }
    }//GEN-LAST:event__txt_ProviderKeyReleased

    private void _txt_PartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__txt_PartKeyReleased
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())||evt.getExtendedKeyCode()==8) {
        } else{
            _txt_Part.setText(""+_txt_Part.getText().substring(0, _txt_Part.getText().length() - 1));
        }
    }//GEN-LAST:event__txt_PartKeyReleased

    private void _txt_QuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__txt_QuantityKeyReleased
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())||evt.getExtendedKeyCode()==8) {
        } else{
            _txt_Quantity.setText(""+_txt_Quantity.getText().substring(0, _txt_Quantity.getText().length() - 1));
        }
    }//GEN-LAST:event__txt_QuantityKeyReleased

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
            java.util.logging.Logger.getLogger(OrderItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new OrderItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btn_Add;
    private javax.swing.JButton _btn_Back;
    private javax.swing.JLabel _d;
    private javax.swing.JLabel _lbl_City;
    private javax.swing.JLabel _lbl_Name;
    private javax.swing.JTextField _txt_OrderID;
    private javax.swing.JTextField _txt_Part;
    private javax.swing.JTextField _txt_Provider;
    private javax.swing.JTextField _txt_Quantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
