
package Conexion_Bd;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://bd:port/banco_db?ssl-mode=REQUIRED");
        } catch (Exception e) {
            System.out.println("ERROR clase Conexion " + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public void getDatos(){
    }
}
