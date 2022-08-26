/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broadbanddistributionsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class JavaConnector {
    
    public static Connection connecrDB(){ 
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            Connection conn = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;databaseName=broadBandManagementSystem ; selectMethod=cursor", "sas", "123456");
            
            return conn;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection Failed");
            System.out.println(e);
        }
        return null;
    }
    
}
