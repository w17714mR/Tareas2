package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {

    private final static String SERVER = "localhost:3306";
    private final static String USER = "root";
    private final static String PASS = "admin";
    private final static String DB = "MEDIPET";

    public Connection getConnection() {
        Properties propiedadesConexion = new Properties();
        try {
            propiedadesConexion.put("user", USER);
            propiedadesConexion.put("password", PASS);
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + SERVER + "/" + DB, propiedadesConexion);
            
            return conn;
            

        } catch (Exception err) {
            System.out.println(err.getMessage());
            
            return null;
        }
    }

}
