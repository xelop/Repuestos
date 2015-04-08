/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repuestos.Logic;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import repuestos.UI.MainInterface;
import repuestos.UI.*;

/**
 *
 * @author Xelop
 */
public class Controller {
   private JFrame CurrentUI;
   private DataBaseConnection Data;
   private static Controller Instance;
   
   private Controller(){
       Data=DataBaseConnection.getInstance();
       //Utilitarios.cargarUtilitarios(Data);
   }
   
   public static Controller getInstance(){
       if(Instance==null)
           Instance=new Controller();
       return Instance;
   }
   
   public void changeCurrentUI(JFrame pNextUI){
       CurrentUI=pNextUI;
   }
   
   public void uiDecision(String pMessage){
       if(Data.isErrorOcurred()){
           JOptionPane.showMessageDialog(CurrentUI, pMessage);
           Data.setErrorOcurred(false);
       }else{
           CurrentUI.dispose();
           CurrentUI=new MainInterface(this);
           CurrentUI.setVisible(true);
       }
   }
   
   public void insertPerson(String pIdentification, String pDirection, String pName, String pCity){
       String message=Data.insertPerson(pIdentification, pDirection, pName, pCity);
       uiDecision(message);    
   }
   
   public void insertOrganization(String pIdentification, String pDirection, String pName, String pCity, String pPerson){
       String message=Data.insertOrganization(pIdentification, pDirection, pName, pCity, pPerson);
       uiDecision(message);
   }
   
   public void modifyPerson(String pIdClient, String pDirection, String pName, String pCity, String pCurrentStatus){
       error(Data.modifyClient(pIdClient, pDirection, pName, pCity, pCurrentStatus,""));
   }
   
   public void modifyOrganization(String pIdClient, String pDirection, String pName, String pCity, String pPerson, String pCurrentStatus){
       error(Data.modifyClient(pIdClient, pDirection, pName, pCity, pCurrentStatus,  pPerson));
   }
   
   public void suspendCllient(String pName){
       Data.suspendClient(pName);
       CurrentUI.dispose();
       CurrentUI=new MainInterface(this);
       CurrentUI.setVisible(true);
   }
   
   public ArrayList<String> getClients(){
       return Data.listClients();
   }
   
   public void addPart(String pPercentage, String pName, String pTrademark, String pFactory){
       error(Data.addPart(pPercentage, pName, pTrademark, pFactory));
       
   }
   
   public void erasePart(String pPart){
       Data.erasePart(pPart);
       CurrentUI.dispose();
       CurrentUI=new MainInterface(this);
       CurrentUI.setVisible(true);
   }
   
   public void associatePartWProvider(String pPart, String pProvider, String pPrice){
       error(Data.associateParts(pPart, pProvider, pPrice));
   }
   
   public void associatePartWCar(String pPart, String pCar){
       error(Data.associateCars(pPart, pCar));
   }
   
   public void error(String pError){
       if(pError.isEmpty()){
           CurrentUI.dispose();
           CurrentUI=new MainInterface(this);
           CurrentUI.setVisible(true);
       }else
           JOptionPane.showMessageDialog(CurrentUI,pError);
   }
   
   public void modifyPartPrice(String pPart, String pProvider, String pPrice){
       error(Data.modifyPartPrice(pPart, pProvider, pPrice));
   }
   
   public ArrayList<String> listPartsbyCar(String pModel, String pYear){
       return Data.listPartsbyCar(pModel, pYear);
   }
   
   public void findClient(String pID, int pSearchType){
       String[] values=Data.findClient(pID);
       if(values.length!=0){
           CurrentUI.dispose();
           if(pSearchType==1){
            CurrentUI=new ModifyClient(this, values);
           }else if(pSearchType==2){
            CurrentUI=new SuspendClient(this, values);
           }else if(pSearchType==3){
            CurrentUI=new RegisterOrder(this, values);
           }
           CurrentUI.setVisible(true);
       }else{
           JOptionPane.showMessageDialog(CurrentUI,"El cliente que ingreso no existe");
       }
   }
   
   public void findPart(String pID, int pSearchType){
       String[] values=Data.findPart(pID);
       if(values.length!=0){
           CurrentUI.dispose();
           if(pSearchType==1)
            CurrentUI=new EreasePart(this, values);
           else if(pSearchType==2)
            CurrentUI=new PartswithProvider(this, values);
           else if(pSearchType==3)
            CurrentUI = new PartswithCars(this, values);
           else if(pSearchType==4)
            CurrentUI= new ProvidersofPart(this, values[3]);
           else if(pSearchType==5)
               CurrentUI= new ModifyPrice(this, values);
           CurrentUI.setVisible(true);
       }else
           JOptionPane.showMessageDialog(CurrentUI,"La parte que ingreso no existe");
   }
   
   public ArrayList<String> listPartsbyProvider(String pPart){
       return Data.listPartsbyProvider(pPart);
   }
   
   public void registerOrder(String pClient, String pDate, String pTax){
       error(Data.registerOrder(pClient, pDate, pTax));
   }
   
   public void addItem(String pOrder, String pProvider, String pPart, String pQuantity){
       error(Data.addItem(pOrder, pProvider, pPart, pQuantity));
       
   }    
}
