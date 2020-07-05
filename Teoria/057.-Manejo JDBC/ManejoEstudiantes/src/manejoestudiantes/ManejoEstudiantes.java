package manejoestudiantes;

import java.sql.*;
import java.util.*;

public class ManejoEstudiantes {
    public static void main(String[] args) throws SQLException {
              
        Connection conn = null;
        
        try{
            conn = Conexion.getConnection();
            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            
            EstudiantesJDBC estudiantesJDBC = new EstudiantesJDBC(conn);
                        
            //Prueba del metodo insert
            estudiantesJDBC.insert(25,"Carlos","Arteaga","01/01/1995");

            //Prueba del metodo update
            estudiantesJDBC.update(25,"Charlye","Arteaga2423423423423423423423423423423423423423423423423423423422423");

            //Prueba metodo delete
            //estudiantesJDBC.delete(24);

            conn.commit();
        }catch(SQLException e){
            try{
                System.out.println("Entramos al rollback");
                e.printStackTrace(System.out);
                conn.rollback();
            }catch(SQLException e1){
                e1.printStackTrace(System.out);
            }
        }
        
        
    }
}
