package manejoestudiantes;

import Datos.Conexion;
import Datos.EstudianteJDBC;
import domain.Estudiante;
import java.sql.*;
import java.util.AbstractCollection;
import java.util.List;

public class ManejoEstudiantes {

    public static void main(String[] args) {
        EstudianteJDBC estudiantesJDBC = new EstudianteJDBC();
        
        Connection conn = null;
        try{
            conn = Conexion.getConnection();
            //Revisamos si la conexion estan en modo autocommit
            //por default es autocomit == true
            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            
            EstudianteJDBC estudiantes = new EstudianteJDBC(conn);
        
            //PRUEBA METODO INSERT
            estudiantesJDBC.insert(24, "carlos", "arteaga", "09/03/1995");

             //Prueba metodo update
            //estudiantesJDBC.update(24,"char","artega");

            //Prueba metodo delete
            //estudiantesJDBC.delete(24);

            //Prueba dle metodo select
            //Uso de un objeto estudiante para encapsular la informacion 
            //de un registro de base de datos
            List<Estudiante> student = estudiantesJDBC.select();
            for(Estudiante estudiante : student){
                System.out.println(estudiante);
                System.out.println("");
            }
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
