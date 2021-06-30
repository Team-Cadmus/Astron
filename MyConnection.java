/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saree.application.gui;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    Connection con = null;
    public static Connection dbConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root","root","Iloveher");                 
            return con;
        }
        catch (Exception e) {
            System.out.println("ERROR :"+e.getMessage());
            return null;
        }
    }
} 