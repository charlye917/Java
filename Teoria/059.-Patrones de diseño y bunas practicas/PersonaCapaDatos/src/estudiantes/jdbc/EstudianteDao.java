package estudiantes.jdbc;
import java.sql.SQLException;
import java.util.List;
import estudiantes.dto.EstudianteDTO;

/**
  *Esta interfaz contiene los metodos abstractos con las
  * operaciones basicas sobre la tabla de Estudiante
  * CRUD(Create, Read, Update, Delete)
  * Se debe crear una clase concreta para implementar el
  * codigo asociado a cada metdo
 **/

public interface EstudianteDao{
    public int insert(EstudianteDTO estudiante)
            throws SQLException;

    public int update(EstudianteDTO estudiante)
            throws SQLException;

    public int delete(EstudianteDTO estudiante)
            throws  SQLException;

    public List<EstudianteDTO> select()
            throws SQLException;
}

