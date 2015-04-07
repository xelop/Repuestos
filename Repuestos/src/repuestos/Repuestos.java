/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repuestos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import repuestos.Logic.Controller;
import repuestos.Logic.DataBaseConnection;
import repuestos.UI.MainInterface;

/**
 *
 * @author Xelop
 */
public class Repuestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     new MainInterface(Controller.getInstance()).setVisible(true);   
    }
    
}
