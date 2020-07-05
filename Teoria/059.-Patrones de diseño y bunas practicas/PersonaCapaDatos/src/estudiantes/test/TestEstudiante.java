package estudiantes.test;

import java.sql.SQLException;
import java.util.List;
import estudiantes.dto.EstudianteDTO;
import estudiantes.jdbc.EstudianteDao;
import estudiantes.jdbc.EstudianteDaoJDBC;
import java.util.Set;

public class TestEstudiante {

    public static void main(String[] args) {
        EstudianteDao estudianteDao = new EstudianteDaoJDBC();
        EstudianteDTO estudiante = new EstudianteDTO();
        estudiante.setNombre("Carlos");
        estudiante.setApellido("Arteaga");
        estudiante.setFechaNacmineto("01/01/1995");
        try{
            //estudianteDao.insert(estudiante);
            //estudianteDao.delete(new EstudianteDTO(0));
            //EstudianteDTO estudianteTmp = new EstudianteDTO();
            //estudianteTmp.setId_estudiante(0);
            //estudianteTmp.setNombre("Daniela");
            //estudianteTmp.setApellido("Centeno");
            //estudianteDao.update(estudianteTmp); 
            
            List<EstudianteDTO> estudiantes = estudianteDao.select();
            for(EstudianteDTO estudianteDTO : estudiantes){
                System.out.println(estudianteDTO);
                System.out.println();
            }
            
            
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
