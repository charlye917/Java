package conexiontest;

import java.sql.*;

public class ConexionesBD {
     public static void ConexionOracle(){
         //Cadena de conexion oracle
        String url = "jdbc:oracle:thin:@192.168.1.80:1521:charbd";
        String user = "escuela";
        String password = "escuela";
         try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creacion del objeto conexion
            Connection conexion = (Connection)DriverManager.getConnection(url,user,password);
             System.out.println("Conexion a oracle exitosa");
            //Creacion de un objeto Statement
            Statement instruccion = conexion.createStatement();
            //Creacion del  query
            String sql = "Select estudiante_id, nombre, apellido_paterno from estudiante";
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()){
                System.out.println("Id: " + result.getInt(1));
                System.out.println("nombre: " + result.getString(2));
                System.out.println("apellido: " + result.getString(3));
            }
            result.close();
            instruccion.close();
            conexion.close();

        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Error al conectarse a la base de datos");
            System.out.println(ex);
        }
    }
     
    public static void ConexionSQLServer(){
        String url = "jdbc:sqlserver://192.168.1.80:1433;DatabaseName=ESCUELA;user=charbd;Password=charbd;";

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conexion = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa a SQLServer");
            Statement instruccion = conexion.createStatement();
            String sql = "Select estudiante_id, nombre, apellido_paterno from estudiante";
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()){
                System.out.println("ID: " +result.getInt(1));
                System.out.println("nombre: " + result.getString(2));
                System.out.println("apellido: " + result.getString(3));
                
            }
            result.close();
            instruccion.close();
            conexion.close();
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Error al conectarse a al base de datos SQLServer");
            System.out.println(ex);
        }
          
    }
}
