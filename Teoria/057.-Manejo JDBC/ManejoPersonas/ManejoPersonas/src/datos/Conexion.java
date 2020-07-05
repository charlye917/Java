package datos;
import java.sql.*;

public class Conexion {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost/sga?useSSL=false";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "admin";
    private static Driver driver = null;
    
    public static synchronized Connection getConnection()//unicamente un hilo ejecuta el metndo una vez
        throws SQLException{//capturamos la excepcion que puede producir este metodo
            if(driver == null){
                try{
                    Class jdbcDriverClass = Class.forName(JDBC_DRIVER);//Carga en memoria la clase de mysql
                    driver = (Driver) jdbcDriverClass.newInstance();//Creamos una instancia
                    DriverManager.registerDriver(driver);//Registramos la varialbe de tipo driver
                    //Con todo esto lo unico que se hizo es poner en memoria el dirver que queremos usar
                }catch(Exception e){
                    System.out.println("Fallo en cargar el driver JDBC");
                    e.printStackTrace();
                }
            }
            return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
        }
    
    public static void close(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        } catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
    public static void close(PreparedStatement stmt){
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
    //Cierra la conexion
    public static void close(Connection conn){
        try{
            if(conn != null){
                conn.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }    
    }
    
}
