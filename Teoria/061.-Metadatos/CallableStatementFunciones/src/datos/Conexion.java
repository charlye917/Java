package datos;
import java.sql.*;
import java.util.*;

public class Conexion {
    private static String JDBC_DRIVER;
    private static String JDBC_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static Driver driver = null;
    private static String JDBC_FILE_NAME = "jdbc";
    
    public static Properties loadProperties(String file){
        Properties prop = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle(file);//permite leer directamente el archivo file
        Enumeration e = bundle.getKeys();//se solicitan todas las llaves almacenadas
        String key = null;
        while(e.hasMoreElements()){//iteramos cada una de las llaves que contiene el archivo
            key = (String) e.nextElement();
            prop.put(key, bundle.getObject(key));//agreagamos la llave y el valor de la llave
        }
        JDBC_DRIVER = prop.getProperty("driver");
        JDBC_URL = prop.getProperty("url");
        JDBC_USER = prop.getProperty("user");
        JDBC_PASS = prop.getProperty("pass");
        return prop;
    }
    
    public static synchronized Connection getConnection() throws SQLException{
        if(driver == null){
            try{
                //CARGAMOS LAS PROPIEDADES DE CONEXION
                loadProperties(JDBC_FILE_NAME);
                //SE REGISTRA EL DRIVER
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            }catch(Exception e){
                System.out.println("Fallo al cargar el driver");
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
        }catch(SQLException sqle){
            sqle.printStackTrace();
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
