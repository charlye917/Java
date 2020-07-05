package personas.jdbc;
import java.sql.*;

public class Conexion {
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static String JDBC_URL = "jdbc:oracle:thin:@192.168.1.80:1521:charbd";
    private static String JDBC_USER = "escuela";
    private static String JDBC_PASS = "escuela";
    private static Driver driver = null;
    
    public static synchronized Connection getConnection() throws SQLException{
        if(driver == null){
            try{
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver)jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch(Exception e){
                System.out.println("Fallo al cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void close(PreparedStatement stmt){
        try{
            if(stmt != null){
                stmt.close();
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void close(Connection conn){
        try{
            if(conn != null){
                conn.close();
            }               
        }catch(SQLException e){
            e.printStackTrace();
    }
}
   

}
