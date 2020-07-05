package introduccionjdbc;
import java.sql.*;

public class IntroduccionJDBC {    
    public static void main(String[] args) {
        //Cadena de conexion
       String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
       //Cargamos el driver de conexion
       try{
           Class.forName("com.mysql.jdbc.Driver");
           //Creamos el objeto conexion
           Connection conexion = (Connection) DriverManager.getConnection(url,"root","admin");
           //creamos un objeto statement
           Statement instruccion = conexion.createStatement();
           //Creamos el query
           String sql = "select id_persona, nombre, apellido from persona";
           ResultSet result = instruccion.executeQuery(sql);
           while(result.next()){
               System.out.println("Id: " + result.getInt(1));
               System.out.println("Nombre: " + result.getString(2));
               System.out.println("Apellido: " + result.getString(3));
           }
           result.close();
           instruccion.close(); 
           conexion.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
       }
    }
    
}
