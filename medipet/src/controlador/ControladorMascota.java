package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Mascota;

public class ControladorMascota {

    public void MascotaAlmacenar(Mascota mascota) {

        Conexion conexion = new Conexion();

        try {

            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "INSERT INTO MASCOTA (NOM_MASCOTA, AT_PREVIA, CANT_AT_PREV, DUENIO, NOM_DUENIO, DESCRI_MASCOTA, EDAD_MASCOTA, TIPO_MASCOTA, TEL_DUENO) VALUES ("
                    + "'" + mascota.getNomMascota() + "', "
                    + "" + mascota.isAtPrevia() + ", "
                    + "" + mascota.getCantAtPrev() + ", "
                    + "" + mascota.isDuenio() + ", "
                    + "'" + mascota.getNomDuenio() + "', "
                    + "'" + mascota.getDescriMascota() + "', "
                    + "'" + mascota.getEdadMascota() + "', "
                    + "'" + mascota.getTipoMascota() + "', "
                    + "" + mascota.getTelefono()+");";

            System.out.println("CONSULTA: " + consulta);
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA OK");

        } catch (Exception err) {
            System.out.println(err.getMessage());

        }
    }

    public ArrayList<Mascota> MascotaListar(String texto) {
        ArrayList<Mascota> listarMascota = new ArrayList<>();
        Conexion conexion = new Conexion();

        try {

            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT ID_MASCOTA, NOM_MASCOTA, EDAD_MASCOTA, TIPO_MASCOTA, DUENIO FROM MASCOTA WHERE "
                    + "NOM_MASCOTA LIKE '" + texto + "%';";
            System.out.println("CONSULTA: " + consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("ID_MASCOTA"));
                mascota.setNomMascota(rs.getString("NOM_MASCOTA"));
                mascota.setEdadMascota(rs.getInt("EDAD_MASCOTA"));
                mascota.setTipoMascota(rs.getString("TIPO_MASCOTA"));
                mascota.setDuenio(rs.getBoolean("DUENIO"));
                listarMascota.add(mascota);
            }
            return listarMascota;

        } catch (Exception err) {
            System.out.println(err.getMessage());
            return listarMascota;
        }
    }

    public ArrayList<Mascota> TipoListar(String texto) {
        ArrayList<Mascota> listarMascota = new ArrayList<>();
        Conexion conexion = new Conexion();

        try {

            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT ID_MASCOTA, NOM_MASCOTA, EDAD_MASCOTA, TIPO_MASCOTA, DUENIO FROM MASCOTA WHERE "
                    + "TIPO_MASCOTA LIKE '" + texto + "%';";
            System.out.println("CONSULTA: " + consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("ID_MASCOTA"));
                mascota.setNomMascota(rs.getString("NOM_MASCOTA"));
                mascota.setEdadMascota(rs.getInt("EDAD_MASCOTA"));
                mascota.setTipoMascota(rs.getString("TIPO_MASCOTA"));
                mascota.setDuenio(rs.getBoolean("DUENIO"));
                listarMascota.add(mascota);
            }
            return listarMascota;

        } catch (Exception err) {
            System.out.println(err.getMessage());
            return listarMascota;
        }
    }

    public void MascotaEliminar (int idMascota) throws Exception{
        Conexion conexion = new Conexion();
        try {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "DELETE FROM MASCOTA WHERE ID_MASCOTA = "+idMascota+";";
            System.out.println("CONSULTA");
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA OK");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
        
}
}
