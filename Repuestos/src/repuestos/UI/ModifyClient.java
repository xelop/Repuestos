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
public class ModifyClient extends javax.swing.JFrame {

    /**
     * Creates new form ModifyClient
     */
    Controller Control;
    String[] Values;
    String[] Numbers;
    String[] OldNumbers;
    boolean Organization;
    public ModifyClient(Controller pControl, String[] pValues) {
        initComponents();
        Control=pControl;
        Values=pValues; //can an alternate key be modified?
        loadPresets();
        oldNumbers();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void insertClient(){
        String CurrentSelection;
        if(_rbt_Active.isSelected())
            CurrentSelection="ACTIVO";
        else if(_rbt_Inactive.isSelected())
            CurrentSelection="INACTIVO";
        else
            CurrentSelection="SUSPENDIDO";
        
        if(Organization)
            Control.modifyOrganization(Values,(new String[]{ _txt_Name.getText(), CurrentSelection, _txt_Direction.getText(), _txt_City.getText(),
            _txt_OrganizationPerson.getText(),_txt_PersonCharge.getText(), _txt_Telephone.getText()}));      
        else{
            Control.setTelephones(OldNumbers, Numbers);
            Control.modifyPerson(Values,(new String[]{_txt_Name.getText(), CurrentSelection, _txt_Direction.getText(), _txt_City.getText()}));
        }
    }
    public void oldNumbers(){
        OldNumbers=new String[Numbers.length];
        System.arraycopy(Numbers, 0, OldNumbers, 0, Numbers.length );
    }
    
    public void loadPresets(){
        //Quedan [0]=id, [1]=cedula. [2]=nombre, [3]=estado, [4]=direccion, [5]=ciudad, [6]=contacto
        _txt_Name.setText(Values[2]);
        _txt_City.setText(Values[5]);
        _txt_Direction.setText(Values[4]);
        if(Values.length==9){
            _txt_OrganizationPerson.setText(Values[6]);
            _txt_PersonCharge.setText(Values[7]);
            _txt_Telephone.setText(Values[8]);
            _pnl_Telephone.setVisible(false);
            Organization=true;
        }else{
            _lbl_Person.setVisible(false);
            _txt_OrganizationPerson.setVisible(false);
            _lbl_PersonCharge.setVisible(false);
            _txt_PersonCharge.setVisible(false);
            _lbl_Telephone.setVisible(false);
            _txt_Telephone.setVisible(false);
            Organization=false;
            Numbers=Control.getTelephones(Values[1]);
        }
        if(Values[3].equals("Active"))
            _rbt_Active.setSelected(true);
        else if(Values[3].equals("Inactive"))
            _rbt_Inactive.setSelected(true);
        else
            _rbt_suspended.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        _btn_AddClient = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        _lbl_Direction = new javax.swing.JLabel();
        _lbl_Name = new javax.swing.JLabel();
        _txt_Direction = new javax.swing.JTextField();
        _lbl_City = new javax.swing.JLabel();
        _txt_Name = new javax.swing.JTextField();
        _txt_City = new javax.swing.JTextField();
        _txt_OrganizationPerson = new javax.swing.JTextField();
        _lbl_Person = new javax.swing.JLabel();
        _lbl_PersonCharge = new javax.swing.JLabel();
        _txt_PersonCharge = new javax.swing.JTextField();
        _lbl_Telephone = new javax.swing.JLabel();
        _txt_Telephone = new javax.swing.JTextField();
        _pnl_Telephone = new javax.swing.JPanel();
        _btn_AddTelephone = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        _lbl_State = new javax.swing.JLabel();
        _rbt_Active = new javax.swing.JRadioButton();
        _rbt_Inactive = new javax.swing.JRadioButton();
        _rbt_suspended = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _btn_AddClient.setText("Done");
        _btn_AddClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _btn_AddClientMouseClicked(evt);
            }
        });

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

        _lbl_Person.setText("Person in Charge");

        _lbl_PersonCharge.setText("Person's Charge");

        _lbl_Telephone.setText("Telephone");

        _txt_Telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _txt_TelephoneKeyReleased(evt);
            }
        });

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
                            .addComponent(_lbl_Person)
                            .addComponent(_lbl_PersonCharge)
                            .addComponent(_lbl_Telephone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_txt_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_txt_PersonCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_txt_OrganizationPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(_lbl_Person)
                    .addComponent(_txt_OrganizationPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_PersonCharge)
                    .addComponent(_txt_PersonCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lbl_Telephone)
                    .addComponent(_txt_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        _btn_AddTelephone.setText("Change Telephone");
        _btn_AddTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btn_AddTelephoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout _pnl_TelephoneLayout = new javax.swing.GroupLayout(_pnl_Telephone);
        _pnl_Telephone.setLayout(_pnl_TelephoneLayout);
        _pnl_TelephoneLayout.setHorizontalGroup(
            _pnl_TelephoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pnl_TelephoneLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(_btn_AddTelephone)
                .addGap(44, 44, 44))
        );
        _pnl_TelephoneLayout.setVerticalGroup(
            _pnl_TelephoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pnl_TelephoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_btn_AddTelephone)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        _lbl_State.setText("State: ");

        buttonGroup2.add(_rbt_Active);
        _rbt_Active.setText("Active");

        buttonGroup2.add(_rbt_Inactive);
        _rbt_Inactive.setText("Inactive");

        buttonGroup2.add(_rbt_suspended);
        _rbt_suspended.setText("Suspended");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(_rbt_suspended)
                            .addComponent(_rbt_Active, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_rbt_Inactive, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(_lbl_State)
                        .addGap(70, 70, 70))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_lbl_State)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_rbt_Active)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_rbt_Inactive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_rbt_suspended)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_btn_AddClient)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_pnl_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(_pnl_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(_btn_AddClient)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _txt_DirectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_DirectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_DirectionActionPerformed

    private void _txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_NameActionPerformed

    private void _txt_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__txt_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__txt_CityActionPerformed

    private void _btn_AddClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__btn_AddClientMouseClicked
        // TODO add your handling code here:
        insertClient();
    }//GEN-LAST:event__btn_AddClientMouseClicked

    private void _txt_TelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__txt_TelephoneKeyReleased
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())||evt.getExtendedKeyCode()==8) {
        } else{
            _txt_Telephone.setText(""+_txt_Telephone.getText().substring(0, _txt_Telephone.getText().length() - 1));
        }
    }//GEN-LAST:event__txt_TelephoneKeyReleased

    private void _btn_AddTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btn_AddTelephoneActionPerformed
        // TODO add your handling code here:
        if(Numbers.length==0){
            
        }else
        new ModifyTele(Numbers).setVisible(true);
        
    }//GEN-LAST:event__btn_AddTelephoneActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(ModifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ModifyClient(Controller.getInstance(),"carlos").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btn_AddClient;
    private javax.swing.JButton _btn_AddTelephone;
    private javax.swing.JLabel _lbl_City;
    private javax.swing.JLabel _lbl_Direction;
    private javax.swing.JLabel _lbl_Name;
    private javax.swing.JLabel _lbl_Person;
    private javax.swing.JLabel _lbl_PersonCharge;
    private javax.swing.JLabel _lbl_State;
    private javax.swing.JLabel _lbl_Telephone;
    private javax.swing.JPanel _pnl_Telephone;
    private javax.swing.JRadioButton _rbt_Active;
    private javax.swing.JRadioButton _rbt_Inactive;
    private javax.swing.JRadioButton _rbt_suspended;
    private javax.swing.JTextField _txt_City;
    private javax.swing.JTextField _txt_Direction;
    private javax.swing.JTextField _txt_Name;
    private javax.swing.JTextField _txt_OrganizationPerson;
    private javax.swing.JTextField _txt_PersonCharge;
    private javax.swing.JTextField _txt_Telephone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
