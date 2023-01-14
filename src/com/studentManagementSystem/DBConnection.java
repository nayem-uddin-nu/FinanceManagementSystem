/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagementSystem;

/**
 *
 * @author nayem
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String url = "jdbc:mysql://localhost:3306/student_management_system";
    final static String username = "root";
    final static String password = "root";
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
    
}
