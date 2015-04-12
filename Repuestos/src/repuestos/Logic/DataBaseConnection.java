/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repuestos.Logic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyValue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.net.www.content.image.png;

/**
 *
 * @author Xelop
 */
public class DataBaseConnection {
    
    private static DataBaseConnection Instance;
    private String DataBaseURL= "jdbc:sqlserver://localhost;integratedSecurity=true;database=REPUESTOS";
    private Connection Connection;
    private CallableStatement StoredProcCall;
    private boolean ErrorOcurred=false;
    
    private DataBaseConnection(){
        try {
            Connection = DriverManager.getConnection(DataBaseURL);
            if (Connection != null) {
                // Imprimir datos de conexión
                System.out.println("Connection Succesful:");
                DatabaseMetaData dm = (DatabaseMetaData) Connection.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DataBaseConnection getInstance(){
        if(Instance==null)
            Instance=new DataBaseConnection();
        return Instance;   
    }
    
    public String insertPerson(String pIdentification, String pDirection, String pName, String pCity, ArrayList<String> pNumbers){
        
        try {
            StoredProcCall= Connection.prepareCall("{? = call CreatePersona(?,?,?,?,?)}");
            
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            
            StoredProcCall.setString(2, "ACTIVO");
            StoredProcCall.setString(3, pDirection);
            StoredProcCall.setString(4, pName);
            StoredProcCall.setString(5, pCity);
            StoredProcCall.setString(6, pIdentification);
            StoredProcCall.execute();
            
            int returnValue= StoredProcCall.getInt(1);
            if(returnValue==-1){
                ErrorOcurred=true;
                return "La persona mencionada ya existe";
            }
            for(String number:pNumbers){
                StoredProcCall= Connection.prepareCall("{call CreateTelefonoPersona(?,?)}");

                StoredProcCall.setString(2,pIdentification);
                StoredProcCall.setString(1,number);
                StoredProcCall.execute();
                
            }
            return "";
          
        } catch (SQLException ex) {
            if(ex.getErrorCode()==2601)
                return "El nombre debe ser unico entre clientes";
            System.out.println("Unknown error ocurred");
            System.out.println(ex.getErrorCode()+ex.getMessage());
            
        }
        return "Error";
    }
    
    public String insertOrganization(String pIdentification, String pDirection, String pName, String pCity, String pPerson, String pPersonCharge, String pTelehpone){
        try {
            
            StoredProcCall= Connection.prepareCall("{? = call CreateOrganizacion(?,?,?,?,?,?,?,?)}");
            
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            
            StoredProcCall.setString(2, "ACTIVO");
            StoredProcCall.setString(3, pDirection);
            StoredProcCall.setString(4, pName);
            StoredProcCall.setString(5, pCity);
            StoredProcCall.setString(6, pIdentification);
            StoredProcCall.setString(7, pPerson);
            StoredProcCall.setString(8, pPersonCharge);
            StoredProcCall.setString(9, pTelehpone);
            
            StoredProcCall.execute();
            
            int returnValue= StoredProcCall.getInt(1);
            if(returnValue==-1){
               ErrorOcurred=true;
               return "La organizacion ingresada ya existe";
            }
            if(returnValue==1){
                ErrorOcurred=true;
                return "La cedula de la persona no es valida";
            }
            return "";
            
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode()+ ex.getMessage());
            ErrorOcurred=true;
            if(ex.getErrorCode()==547){
                return "La Persona indicada no existe";   
            }
            if(ex.getErrorCode()==2601){
                return "El nombre ya es ocupado por otro cliente";
            }
        }
        return "";
    }
    
    public void getClienteQuerie(String pIdentification){
        try {
            String sql = "SELECT Id, p.Cedula, Nombre, Estado ,Direccion, Ciudad \n"
                    + "FROM Clientes, Personas p \n"
                    + "WHERE Id = p.IdCliente \n"
                    + "AND Id="+ pIdentification+";";
            
            Statement stmt = Connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               // Valores se extraen usando el nombre de la columna.
               int cedula   = rs.getInt("Cedula");
               String fecha = rs.getString("Nombre");

               // Mostrar valores
               System.out.print("cedula: " + cedula);
               System.out.println(", nombre: " + fecha);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @SuppressWarnings("empty-statement")
    public String[] findClient(String pId){
        try {
            StoredProcCall= Connection.prepareCall("{?=call GetOrganizacionOPersona(?,?,?,?,?,?,?,?,?,?)}");
            StoredProcCall.setString(2, pId);
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            StoredProcCall.registerOutParameter(3, Types.INTEGER);
            StoredProcCall.registerOutParameter(4, Types.INTEGER);
            StoredProcCall.registerOutParameter(5, Types.VARCHAR);
            StoredProcCall.registerOutParameter(6, Types.VARCHAR);
            StoredProcCall.registerOutParameter(7, Types.VARCHAR);
            StoredProcCall.registerOutParameter(8, Types.VARCHAR);
            StoredProcCall.registerOutParameter(9, Types.VARCHAR);
            StoredProcCall.registerOutParameter(10, Types.VARCHAR);
            StoredProcCall.registerOutParameter(11, Types.INTEGER);
            StoredProcCall.execute();
            
            if(StoredProcCall.getInt(1)==-6){
                return new String[]{Integer.toString(StoredProcCall.getInt(3)), Integer.toString(StoredProcCall.getInt(4)), StoredProcCall.getString(5),
                StoredProcCall.getString(6), StoredProcCall.getString(7), StoredProcCall.getString(8)};
                //Quedan [0]=id, [1]=cedula. [2]=nombre, [3]=estado, [4]=direccion, [5]=ciudad, [6]=contacto
            }
            else if(StoredProcCall.getInt(1)==-7){
                return new String[]{Integer.toString(StoredProcCall.getInt(3)), Integer.toString(StoredProcCall.getInt(4)), StoredProcCall.getString(5),
                StoredProcCall.getString(6), StoredProcCall.getString(7), StoredProcCall.getString(8),StoredProcCall.getString(9), StoredProcCall.getString(10), Integer.toString(StoredProcCall.getInt(11))};
            }else
                return new String[]{};
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return new String[]{};
        }
    }
    
    public String modifyClient(String pIdClient, String pDirection, String pName, String pCity, String pCurrentStatus, String pPerson, String pPersonCharge, String pTelehpone){
            //el metodo no agarra la excepcion de nombres repetidos, pero no modifica la base en dado caso
        try {
            StoredProcCall= Connection.prepareCall("{? = call UpdateCliente(?,?,?,?,?,?,?,?)}");
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            StoredProcCall.setString(2, pIdClient);
            StoredProcCall.setString(3, pCurrentStatus);
            StoredProcCall.setString(4, pDirection);
            StoredProcCall.setString(5, pName);
            StoredProcCall.setString(6, pCity);
            StoredProcCall.setString(7, pPerson);
            StoredProcCall.setString(8, pPersonCharge);
            StoredProcCall.setString(9, pTelehpone);
            
            StoredProcCall.executeUpdate();
            if(StoredProcCall.getInt(1)==-1){
                return "El nombre indicado ya existe";
            }
            
            return "";
            
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode()+ex.getMessage());
        }
        return "";
    }
    
    public void modifyTelephones(String[] pOldValues, String[] pNewValues){
        try {
            StoredProcCall = Connection.prepareCall("{call UpdateTelefonoPersona(?,?)}");
            for(int i=0;i<pOldValues.length;i++){
                StoredProcCall.setString(1, pOldValues[i]);
                StoredProcCall.setString(2, pNewValues[i]);
                StoredProcCall.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String[] getTelephones(String pCedula){
        ArrayList<String> numbers= new ArrayList<String>();
        try{
            StoredProcCall = Connection.prepareCall("{call GetTelefonosPersona(?)}");
            StoredProcCall.setString(1, pCedula);
            ResultSet rs=StoredProcCall.executeQuery();
            while(rs.next()){
               numbers.add(rs.getString("Telefono"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode()+ex.getMessage());
        }
        String[] finalNumbers = new String[numbers.size()];
        finalNumbers = numbers.toArray(finalNumbers);
        return finalNumbers;
    }
    
    public void suspendClient(String pName){
        try {
            StoredProcCall = Connection.prepareCall("{call SuspenderCliente(?)}");
            StoredProcCall.setString(1, pName);
            StoredProcCall.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode()+ex.getMessage());
        }
    }
    
    public ArrayList<String> listClients(){
        ArrayList<String> values =new ArrayList<String>();
        try {
            Statement stmt = Connection.createStatement();
            String sql;
            sql = "SELECT Id, Nombre, Estado, Direccion, Ciudad  FROM Clientes;";
            ResultSet rs = stmt.executeQuery(sql);

            // Extraer datos de un conjunto de resultados.
            
            while(rs.next()){
                
                values.add("ID: "+Integer.toString(rs.getInt("Id"))+ " Name: "+ rs.getString("Nombre")
                + " Direction: "+ rs.getString("Direccion") + " City: "+ rs.getString(4) + " Status: "+ rs.getString("Estado"));
            }
            return values;
            
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode()+ex.getMessage());
            return values;
        }
    } //unico metodo inline
    
    public String addPart(String pPercentage, String pName, String pTrademark, String pFactory){
        
        try {
            StoredProcCall= Connection.prepareCall("{?=call PartesConFabrica(?,?,?,?)}");
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            StoredProcCall.setString(2, pPercentage);
            StoredProcCall.setString(3, pTrademark);
            StoredProcCall.setString(4, pName);
            StoredProcCall.setString(5, pFactory);
            StoredProcCall.execute();
            
            int error=StoredProcCall.getInt(1);
            if(error==-1)
                return "La parte ya existe";
            if(error==-2)
                return "El codigo de fabrica no existe";
            return "";
        } catch (SQLException ex) {
            return ex.getMessage();
        }
        
    }
    
    public String[] findPart(String pID){
        try {
            StoredProcCall= Connection.prepareCall("{call GetParte(?)}");
            StoredProcCall.setString(1, pID);
            ResultSet rs = StoredProcCall.executeQuery();
            rs.next();
            
            return new String[] {Integer.toString(rs.getInt("Id")), Integer.toString(rs.getInt("Porcentaje")),
                rs.getString("Marca"), rs.getString("Nombre")};
            //Queda [0]= id, [1]= porcentaje, [2]= marca, [3]= nombre
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return new String[]{};
        }
        
    }
    
    public void erasePart(String pPart){
        try {
            
            StoredProcCall=Connection.prepareCall("{call DeleteParte(?)}");
            StoredProcCall.setString(1, pPart);
            StoredProcCall.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String associateParts(String pPart, String pProvider, String pPrice){
        try {
            
            StoredProcCall=Connection.prepareCall("{call LinkProveedoresPartes(?,?,?)}" );
            StoredProcCall.setString(1, pProvider);
            StoredProcCall.setString(2, pPart);
            StoredProcCall.setString(3, pPrice);
            StoredProcCall.execute();
            
            return "";
        } catch (SQLException ex) {
            
            if(ex.getErrorCode()==547){
                return "El proveedor indicado no existe";   
            }
            return ex.getMessage();
        }
        
    }
    
    public String associateCars(String pPart, String pCar){
        try {
            StoredProcCall= Connection.prepareCall("{ call LinkPartesAutomoviles(?,?)}");
            StoredProcCall.setString(1, pPart);
            StoredProcCall.setString(2, pCar);
            StoredProcCall.execute();         
            return "";
            
        } catch (SQLException ex) {
            if(ex.getErrorCode()==547){
                return "El carro indicado no existe";   
            }
            return ex.getMessage();   
        }
    }
    
    public String modifyPartPrice(String pPart, String pProvider, String pPrice){
        try {
            StoredProcCall = Connection.prepareCall("{ ? = call UpdatePreciosParteProveedor(?,?,?)}");
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            StoredProcCall.setString(2, pProvider);
            StoredProcCall.setString(3, pPart);
            StoredProcCall.setString(4, pPrice);
            StoredProcCall.execute();
            
            if(StoredProcCall.getInt(1)==-1){
                return "El proveedor no existe";
            }
            return "";
            
        } catch (SQLException ex) {
            if(ex.getErrorCode()==547){
                return "El carro indicado no existe";   
            }
            return ex.getMessage();   
        }
        
    }
    
    public ArrayList<String> listPartsbyCar(String pModel, String pYear){
        ArrayList<String> values= new ArrayList<String>();
        try {
            StoredProcCall=Connection.prepareCall("{ call GetPartesPorTiposDeAutomoviles(?,?)}");
            StoredProcCall.setString(1, pModel);
            StoredProcCall.setString(2, pYear);
            ResultSet rs = StoredProcCall.executeQuery();
            
            while(rs.next()){
                
                values.add("ID: "+Integer.toString(rs.getInt("Id"))+ " Name: "+ rs.getString("Nombre")
                + " TradeMark: "+ rs.getString("Marca") + " Percentage: "+ Integer.toString(rs.getInt("Porcentaje")));
            }
            return values;
            
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + ex.getMessage());
            return values;
        }
        
    }
    
    public ArrayList<String> listPartsbyProvider(String pPart){
        ArrayList<String> values= new ArrayList<String>();
        try {
            StoredProcCall=Connection.prepareCall("{ call GetProveedoresParaUnaParte(?)}");
            StoredProcCall.setString(1, pPart);
            ResultSet rs= StoredProcCall.executeQuery();
            while(rs.next()){
                values.add("ID: "+Integer.toString(rs.getInt("Id"))+ " Name: "+ rs.getString("Nombre")
                + " Direction: "+ rs.getString("Direccion") + " City: "+ rs.getString(4) + " Contacto: "+ rs.getString("NombreContacto"));
            }
            return values;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return values;
        }
    }
    
    public String registerOrder(String pClient, String pDate, String pTax){
        try {
            StoredProcCall= Connection.prepareCall("{ ?=call CreateOrden(?,?,?)}");
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            StoredProcCall.setString(2, pTax);
            StoredProcCall.setString(3, pDate);
            StoredProcCall.setString(4, pClient);
            StoredProcCall.execute();
            if(StoredProcCall.getInt(1)==-1){
                return "El cliente esta suspendido, no se puede hacer la orden";
            }
            return "";
        } catch (SQLException ex) {
            return ex.getMessage();
        }
        
    }
    
    public String addItem(String pOrder, String pProvider, String pPart, String pQuantity){
        try {
            StoredProcCall= Connection.prepareCall("{?=call LinkOrdenesProveedoresPartes(?,?,?,?)}");
            StoredProcCall.registerOutParameter(1, Types.INTEGER);
            StoredProcCall.setString(2, pOrder);
            StoredProcCall.setString(3, pProvider);
            StoredProcCall.setString(4, pPart);
            StoredProcCall.setString(5, pQuantity);
            StoredProcCall.execute();
            if(StoredProcCall.getInt(1)==-1){
                return "Uno de los valores que ingreso no existe";
            }
            return "";
        } catch (SQLException ex) {
            if(ex.getErrorCode()==2627){
                return "Su orden ya incluye el este item";
            }
            return ex.getMessage();
        }
                
    }

    public boolean isErrorOcurred() {
        return ErrorOcurred;
    }
    
    public void setErrorOcurred(boolean ErrorOcurred) {
        this.ErrorOcurred = ErrorOcurred;
    }
}
