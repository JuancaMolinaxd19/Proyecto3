
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url="jdbc:postgresql://localhost:5432/bd_ventas";
    String user="postgres";
    String pass="Seguridad77";
    public Connection Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,user,pass);
            java.sql.Statement st = con.createStatement();
        } catch (Exception e) {
        }
        return con;
    }
}
