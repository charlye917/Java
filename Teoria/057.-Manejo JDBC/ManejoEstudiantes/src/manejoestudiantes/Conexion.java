package manejoestudiantes;
import java.sql.*;

public class Conexion {
    private static String JDBC_DRIVER_ORACLE = "oracle.jdbc.driver.OracleDriver";
    //private static String JDBC_DRIVER_SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //private static String JDBC_DRIVER_POSTGRES = "org.postgresql.Driver";

    private static String JDBC_URL_ORACLE = "jdbc:oracle:thin:@192.168.1.80:1521:charbd";
    //private static String JDBC_URL_SQLSERVER = "jdbc:sqlserver://192.168.1.80:1433;DatabaseName=ESCUELA;";
    //private static String JDBC_URL_POSTGRES = "jdbc:postgresql://localhost:5432/Escuela";
    
    private static String JDBC_USER_ORACLE = "escuela";
    private static String JDBC_PASS_ORACLE = "escuela";
    //private static String JDBC_USER_POSTGRES = "charbd";
    //private static String JDBC_PASS_POSTGRES = "charbd";
    //private static String JDBC_USER_SQLSERVER = "charbd";
    //private static String JDBC_PASS_SQLSERVER = "charbd";
    
    private static Driver driver = null;
    
    public static synchronized Connection getConnection() throws SQLException{
        if(driver == null){
            try{
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER_ORACLE);
                driver = (Driver)jdbcDriverClass.newInstance();
            } catch(Exception e){
                System.out.println("Fallo al cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL_ORACLE,JDBC_USER_ORACLE,JDBC_PASS_ORACLE);    
        //return DriverManager.getConnection(JDBC_URL_POSTGRES,JDBC_USER_POSTGRES,JDBC_PASS_POSTGRES);
        //return DriverManager.getConnection(JDBC_URL_SQLSERVER,JDBC_USER_SQLSERVER,JDBC_PASS_SQLSERVER);
    }
    
    public static void close(ResultSet rs) {
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
    
    public static void  close(Connection conn){
        try{
            if(conn != null){
                conn.close();
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    

}
