/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class dbcode {
    public static Connection con;
    public static Statement s;
    static{
    try{
        con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/spendingdb"+"?userSSl=false",
                "root",
                "tiger");
        s=con.createStatement();
         }catch(Exception e ){
        JOptionPane.showMessageDialog(null, e);
    
         }
    }
    
}
