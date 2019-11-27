
package medipet;

import db.Conexion;
import java.sql.Connection;
import vista.*;


public class Main {


    public static void main(String[] args) {

       Conexion conexion = new Conexion();
        Connection conn = conexion.getConnection();
        if (conn != null) {
            System.out.println("CONEXIÓN OK");
        } else {
            System.out.println("CONEXIÓN KO");
        }

        Inicio in = new Inicio();

   
    }
    
}
