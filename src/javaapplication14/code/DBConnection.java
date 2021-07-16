package javaapplication14.code;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connect(){
    
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";
        String pass = "";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        return con;
    }
    
}
