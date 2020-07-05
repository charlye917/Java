package estudiantes.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import estudiantes.dto.EstudianteDTO;
import java.util.Set;

/**
*Esta clase implementa la clase EstudianteDao es una implementacion con
* la teconologia JDBC se podria haber otro tipo de implementaciones con las tecologias como 
* hibernate, ibatis, SpringJDBC, etc.
**/

public class EstudianteDaoJDBC implements EstudianteDao{
    private Connection userConn;
    private final String SQL_INSERT = "INSERT INTO estudiante(estudiante_id, nombre, apellido_paterno,fecha_nacimiento)";
    private final String SQL_UPDATE = "UPDATE estudiante SET nombre=? WHERE estudiante_id=?";
    private final String SQL_DELETE = "DELETE FROM estudiante WHERE estudiante_id=?";
    private final String SQL_SELECT = "SELECT estudiante_id, nombre from estudiante";
    
    public EstudianteDaoJDBC(){}
    
    public EstudianteDaoJDBC(Connection conn){
        this.userConn = conn;
    }

    @Override
    public int insert(EstudianteDTO estudiante) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            System.out.println("Ejecutando insert");
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setInt(index++,estudiante.getId_estudiante());
            stmt.setString(index++,estudiante.getNombre());
            stmt.setString(index++,estudiante.getApellido());
            stmt.setString(index,estudiante.getFecha_nacimiento());
            rows = stmt.executeUpdate();
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int update(EstudianteDTO estudiante) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            System.out.println("Ejecutando update");
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++,estudiante.getNombre());
            stmt.setInt(index, estudiante.getId_estudiante());
            rows = stmt.executeUpdate();
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;      
    }

    @Override
    public int delete(EstudianteDTO estudiante) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            System.out.println("Ejecutando delete");
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            int index = 1;
            stmt.setInt(index,estudiante.getId_estudiante());
            rows = stmt.executeUpdate();
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows; 
    }

    @Override
    public List<EstudianteDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        EstudianteDTO estudianteDTO = null;
        List<EstudianteDTO> estudiantes = new ArrayList<EstudianteDTO>();
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idEstudianteTemp = rs.getInt(1);
                String nombreTemp = rs.getString(2);
                estudianteDTO = new EstudianteDTO();
                estudianteDTO.setId_estudiante(idEstudianteTemp);
                estudianteDTO.setNombre(nombreTemp);
                estudiantes.add(estudianteDTO);
                               
            }
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
