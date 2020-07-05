package estudiantes.dto;

public class EstudianteDTO{
      
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;

    public EstudianteDTO(){}
    
    public EstudianteDTO(int id_estudiante){
        this.id_estudiante = id_estudiante;
    }
    
    public int getId_estudiante(){
        return id_estudiante;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getFecha_nacimiento(){
        return fecha_nacimiento;
    }
    
    public void setId_estudiante(int id_estudiante){
        this.id_estudiante = id_estudiante;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setFecha_nacimiento(String fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String toString(){
        return "Estudiante{" +
                " id_estudiante = " + id_estudiante +
                ", nombre = " + nombre +
                ", apellido = " + apellido +
                ", fecha_nacimiento = " + fecha_nacimiento;
    }
    
}
