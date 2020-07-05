package Datos;
import java.sql.*;

public class Conexion {
    private static String JDBC_DRIVER_ORACLE = "oracle.jdbc.driver.OracleDriver";
    private static String JDBC_DRIVER_SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String JDBC_URL_ORACLE = "jdbc:oracle:thin:@192.168.1.80:1521:charbd";
    private static String JDBC_URL_SQLSERVER = "jdbc:sqlserver://192.168.1.80:1433;DatabaseName=ESCUELA;user=charbd;Password=charbd;";
    private static String JDBC_USER = "escuela";
    private static String JDBC_PASS = "escuela";
    private static Driver driver = null;
    
    public static synchronized Connection getConnection() throws SQLException{
        if(driver == null){
            try{
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER_ORACLE);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            }catch (Exception e){
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL_ORACLE, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        } 
    }
    
    public static void close(PreparedStatement stmt){
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException e){
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
