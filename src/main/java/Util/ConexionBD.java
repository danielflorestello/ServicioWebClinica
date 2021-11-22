
package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    Connection con;
    
    public ConexionBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica","root","");
        } catch (Exception e) {
            
        }
    }

    public Connection getConnection() {
        return con;
    }
}
