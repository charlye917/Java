package estudiantecapadatos;
import estudiantes.jdbc.*;
import estudiantes.dto.*;
import java.sql.SQLException;
import java.util.List;

public class EstudianteCapaDatos {

    public static void main(String[] args) throws SQLException {
        EstudianteDaoJDBC estudiante = new EstudianteDaoJDBC() ;
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        estudianteDTO.setId_estudiante(25);
        estudianteDTO.setNombre("Carlos");
        estudianteDTO.setApellido("Arteaga");
        estudianteDTO.setFecha_nacimiento("01/03/1995");

        estudiante.insert(estudianteDTO);
        estudiante.delete(new EstudianteDTO(3));
        estudiante.update(new EstudianteDTO(2));
        
        List<EstudianteDTO> estudiantes = estudiante.select();
        for(EstudianteDTO e : estudiantes){
            System.out.println("nombre" + e.getNombre());
        }
    }
    
}
