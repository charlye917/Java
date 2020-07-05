package Datos;

import domain.Estudiante;
import java.sql.*;
import java.util.*;

public class EstudianteJDBC {
    private java.sql.Connection userConn;
    
    private final String SQL_INSERT = "INSERT INTO estudiante(estudiante_id, nombre,apellido_paterno,fecha_nacimiento) values (?,?,?,?)";
    private final String SQL_UPDATE = "UPDATE estudiante SET nombre=?, apellido_paterno=? where estudiante_id = ?";
    private final String SQL_DELETE = "DELETE FROM estudiante WHERE estudiante_id = ?";
    private final String SQL_SELECT = "SELECT estudiante_id, nombre, apellido_paterno, fecha_nacimiento FROM estudiante ORDER BY estudiante_id";
    
    public EstudianteJDBC(){}
    
    public EstudianteJDBC(Connection conn){
        this.userConn = conn;
    }
    
    public int insert(int estudiante_id, String nombre, String apellido_paterno, String fecha_nacimiento) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este caso
        
        int rows = 0;//registros afectados
        try{
            conn = (this.userConn != null ? this.userConn : Conexion.getConnection());
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;//contador de columnas
            
            stmt.setInt(index++, estudiante_id);
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido_paterno);
            stmt.setString(index++, fecha_nacimiento);
            
            System.out.println("Ejecuntando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();//no.registros afectados
            System.out.println("Registros afectados " + rows);
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    public int update(int estudiante_id, String nombre, String apellido_paterno) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;
        try{
            conn =(this.userConn != null ? this.userConn : Conexion.getConnection());
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido_paterno);
            stmt.setInt(index, estudiante_id);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados" + rows); 
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    public int delete(int estudiante_id){
       Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet rs = null;
       int rows = 0;
       try{
           conn = (this.userConn == null ? this.userConn : Conexion.getConnection());
           System.out.println("Ejecutnado query: " + SQL_DELETE);
           stmt = conn.prepareStatement(SQL_DELETE);
           stmt.setInt(1, estudiante_id);
           rows = stmt.executeUpdate();
           System.out.println("Registros eliminados: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
           Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
       }
       return rows;
    }
    
    public List<Estudiante> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Estudiante estudiante = null;
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        try{
            conn = (this.userConn == null ? this.userConn : Conexion.getConnection());
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_estudiante = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido_paterno = rs.getString(3);
                String fecha_nacimiento = rs.getString(4);
                
                estudiante = new Estudiante();
                estudiante.setIdEstudiante(id_estudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido_paterno);
                estudiante.setFechaNacimiento(fecha_nacimiento);
                estudiantes.add(estudiante);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return estudiantes;
        
    }
}
