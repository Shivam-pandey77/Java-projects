package bank.application;
import java.sql.*;

public class Conn {
  
    Connection c;
    Statement s;
    public Conn(){
        try {
           
            c= DriverManager.getConnection("jdbc:mysql:///bankmanagmentsystem","root","localhost14575");//localhost:3306
            s= c.createStatement();
            
        }catch (Exception e)  {
            System.out.println(e);
        }
        
    }
    
}
