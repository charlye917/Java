package datos;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaJDBC {
    private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido) values(?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre=?,apellido=? where id_persona=?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT id_persona, nombre, apellido from persona ORDER BY id_persona";
    
    public int insert(String nombre, String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;//Contador de columnas
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int update(int id_persona, String nombre, String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setInt(index, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
