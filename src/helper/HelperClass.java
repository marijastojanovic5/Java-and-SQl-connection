package helper;
import exampleconnection.Conn;
import java.sql.*;

public class HelperClass {
    Connection conn= Conn.poveziSe();
    public int callFun(int a, int b) throws SQLException{
        String upit = "{? = call zbir(?,?)}";
        CallableStatement cst = conn.prepareCall(upit);
        cst.registerOutParameter(1,Types.INTEGER);
        cst.setInt("a",a);
        cst.setInt("b",b);
        cst.execute();
        return cst.getInt(1);
    }
    
}
