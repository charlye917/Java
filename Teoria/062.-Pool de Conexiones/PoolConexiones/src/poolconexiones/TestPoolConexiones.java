package poolconexiones;

import capadatos.pool.PoolConexionesOracle;
import java.sql.*;

public class TestPoolConexiones {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            conn = PoolConexionesOracle.getConnection();
            stmt = conn.prepareStatement("Select * from estudiante");
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(" " + rs.getInt(1));
                System.out.println(" " + rs.getString(2));
                System.out.println(" " + rs.getString(3));
            }
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
