package employeesystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conn {
    
    Statement s;
    Connection c;
    Conn() {
       
         try {
            
             Class.forName("com.mysql.cj.jdbc.Driver");
             c= DriverManager.getConnection("jdbc:mysql://localhost:3306/employmanagmentsystem","root","localhost14575");
            
             s= c.createStatement();
             
        }  catch(Exception e) {
            e.printStackTrace();
        }
        
        
        
            
    }
    
}
