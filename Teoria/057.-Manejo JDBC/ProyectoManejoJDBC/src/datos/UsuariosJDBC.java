package datos;

import domain.Usuarios;
import java.sql.*;
import java.util.*;

public class UsuariosJDBC {
    private String SQL_INSERT = "INSERT INTO USUARIO(ID_USUARIO, USUARIO, PASSWORD) VALUES (?,?,?)";
    private String SQL_UPDATE = "UPDATE USUARIO SET USUARIO=?, PASSWORD=? WHERE ID_USUARIO=?";
    private String SQL_DELETE = "DELETE FROM USUARIO WHERE ID_USUARIO=?";
    private String SQL_SELECT = "SELECT  ID_USUARIO, USUARIO, PASSWORD FROM USUARIO";
      
    public int insert(int id_usuario, String usuario, String password){
        Connection conn = null;
        PreparedStatement stmt= null;
        ResultSet rs = null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
             
            stmt.setInt(index++, id_usuario);
            stmt.setString(index++, usuario);
            stmt.setString(index++, password);
             
            System.out.println("Ejecuntado query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;        
    }
    
    public int update(int id_usuario, String user, String password){
        Connection conn = null;
        PreparedStatement stmt= null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            
            stmt.setString(index++, user);
            stmt.setString(index++, password);
            stmt.setInt(index, id_usuario);
            rows = stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;     
    }
    
    public int delete(int id_usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
        
            stmt.setInt(1, id_usuario);
            rows = stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public List<Usuarios> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuarios usuario = null;
        List<Usuarios> usuarios = new ArrayList();
        
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_usuario = rs.getInt(1);
                String user = rs.getString(2);
                String password = rs.getString(3);
                
                usuario = new Usuarios();
                usuario.setIdUsuario(id_usuario);
                usuario.setUsuario(user);
                usuario.setPassword(password);
                usuarios.add(usuario);
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuarios;
    }
}
