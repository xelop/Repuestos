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
   
   public void insertPerson(String pIdentification, String pDirection, String pName, String pCity, ArrayList<String> pNumbers){
       String message=Data.insertPerson(pIdentification, pDirection, pName, pCity, pNumbers);
       uiDecision(message);

   }
   
   public void insertOrganization(String pIdentification, String pDirection, String pName, String pCity, String pPerson, String pPersonCharge, String pTelehpone){
       String message=Data.insertOrganization(pIdentification, pDirection, pName, pCity, pPerson, pPersonCharge, pTelehpone);
       uiDecision(message);
   }
   
   public void modifyPerson(String[] pOldValues, String[] pValues){
       for(int i=0; i<pOldValues.length-2;i++){
           if(pOldValues[i+2].equals(pValues[i]))
               pValues[i]=null;
       }
       
       error(Data.modifyClient(pOldValues[0],pValues[2], pValues[0], pValues[3], pValues[1],null,null,null));
   }
   
   public void setTelephones(String[] pOldValues, String[] pNewValues){
       Data.modifyTelephones(pOldValues, pNewValues);
   }
   
   public String[] getTelephones(String pId){
       return Data.getTelephones(pId);
   }
   
   public void modifyOrganization(String[] pOldValues, String[] pValues){
       for(int i=0; i<pOldValues.length-2;i++){
           if(pOldValues[i+2].equals(pValues[i]))
               pValues[i]=null;
           System.out.println(i);
       }
       error(Data.modifyClient(pOldValues[0], pValues[2], pValues[0], pValues[3], pValues[1], pValues[4],  pValues[5], pValues[6]));
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
   
   public void connectionFailed(){
       JOptionPane.showMessageDialog(CurrentUI,"No se pudo hacer la coneccion a la base");
   }
   
   public void findClient(String pID, int pSearchType){
       String[] values=Data.findClient(pID);
       
       if(values.length>1){
           CurrentUI.dispose();
           if(pSearchType==1){
            CurrentUI=new ModifyClient(this, values);
           }else if(pSearchType==2){
            CurrentUI=new SuspendClient(this, values);
           }else if(pSearchType==3){
               if(values[3].equals("SUSPENDIDO")){
                   JOptionPane.showMessageDialog(CurrentUI,"El cliente que ingreso esta suspendido");
               }else
               CurrentUI=new RegisterOrder(this, values);
           }
           CurrentUI.setVisible(true);
       }else
           JOptionPane.showMessageDialog(CurrentUI,"El cliente que ingreso no existe");
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
