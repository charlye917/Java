package estudiantes.dto;

public class EstudianteDTO {
    public EstudianteDTO(){}
    
    public EstudianteDTO(int id_estudiante){
        this.id_estudiante = id_estudiante;
    }
    
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    
    public int getId_estudiante(){
        return id_estudiante;
    }
    
    public void setId_estudiante(int id_estudiante){
        this.id_estudiante = id_estudiante;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getFechaNacimiento(){
        return fecha_nacimiento;
    }
    
    public void setFechaNacmineto(String fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String toString(){
        return "Persona{" + "id_persona = " + id_estudiante +
                ", nombre= " + nombre +
                ", apellido= " + apellido +"}";
    }
}
