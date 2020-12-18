package exampleconnection;
import java.sql.*;


public class Conn {
    
    private static Connection conn;

    public static Connection poveziSe() {
        try {
            if(conn == null)
                conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/login","root","root");
           
        } catch (SQLException ex) {
            System.out.println("Greska u konekciji");
        }
         return conn;
        
    }
}




