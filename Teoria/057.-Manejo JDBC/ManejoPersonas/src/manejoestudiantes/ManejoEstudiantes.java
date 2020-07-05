package manejoestudiantes;

import Datos.EstudianteJDBC;
import domain.Estudiante;
import java.util.AbstractCollection;
import java.util.List;

public class ManejoEstudiantes {

    public static void main(String[] args) {
        EstudianteJDBC estudiantesJDBC = new EstudianteJDBC();
        //PRUEBA METODO INSERT
        //estudiantesJDBC.insert(24, "carlos", "arteaga", "09/03/1995");
        
         //Prueba metodo update
        //estudiantesJDBC.update(24,"char","artega");
        
        //Prueba metodo delete
        //estudiantesJDBC.delete(24);
        
        //Prueba dle metodo select
        //Uso de un objeto estudiante para encapsular la informacion 
        //de un registro de base de datos
        List<Estudiante> estudiantes = estudiantesJDBC.select();
        for(Estudiante estudiante : estudiantes){
            System.out.println(estudiante);
            System.out.println("");
        }
        
    }
    
}
