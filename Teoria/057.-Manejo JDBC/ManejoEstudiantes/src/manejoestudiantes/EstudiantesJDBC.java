package manejoestudiantes;

import java.sql.*;
import java.util.*;

public class EstudiantesJDBC {
    private java.sql.Connection userConn;
    private final String SQL_INSERT = "INSERT INTO ESTUDIANTE(ESTUDIANTE_ID, NOMBRE, APELLIDO_PATERNO,FECHA_NACIMIENTO) VALUES (?,?,?,?)";
    private final String SQL_UPDATE = "UPDATE ESTUDIANTE SET NOMBRE=?,APELLIDO_PATERNO=? WHERE ESTUDIANTE_ID=?";
    private final String SQL_DELETE = "DELETE FROM ESTUDIANTE WHERE ESTUDIANTE_ID = ?";
    private final String SQL_SELECT = "SELECT ESTUDIANTE_ID, NOMBRE, APELLIDO_PATERNO FROM ESTUDIANTE ORDER BY ESTUDIANTE_ID";
    
    public EstudiantesJDBC(){}
    
    public EstudiantesJDBC(Connection conn){
        this.userConn = conn;
    }

    public int insert(int estudiante_id, String nombre, String apellido_paterno, String fecha_nacimiento) throws SQLException {
        java.util.Date date = new java.util.Date();
        
        Connection conn = null;
        PreparedStatement stmt = null;    
        
        int rows = 0;
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;//contador de columnas
            stmt.setInt(index++,estudiante_id);
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido_paterno);
            stmt.setString(index++, fecha_nacimiento);
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();//no. de registros afectados
            System.out.println("Registros afectados: " + rows);
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    public int update(int id_estudiante,String nombre, String apellido_paterno) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt=conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++,nombre);
            stmt.setString(index++,apellido_paterno);
            stmt.setInt(index++,id_estudiante);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        } finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    public int delete(int id_estudiante) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_estudiante);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        } catch(SQLException e){
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
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_estudiante = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido_paterno = rs.getString(3);
                
                estudiante = new Estudiante();
                estudiante.setId_estudiante(id_estudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido_paterno(apellido_paterno);
                estudiantes.add(estudiante);
            }
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return estudiantes;
    }
    
}
