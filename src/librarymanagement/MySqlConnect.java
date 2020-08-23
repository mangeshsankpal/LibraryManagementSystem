/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Amol
 */
public class MySqlConnect {
     Connection conn=null;
    
    public static Connection ConnectDB()
    {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management","root","sa");
          // JOptionPane.showMessageDialog(null, "Connected to database");
           return conn;
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
    }
    
}
