package domain;

public class Estudiante {
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    
    public int getIdEstudiante(){
        return id_estudiante;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getFechaNacimiento(){
        return fecha_nacimiento;
    }
    
    public void setIdEstudiante(int id_estudiante){
        this.id_estudiante = id_estudiante;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setFechaNacimiento(String fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String toString(){
        return "Persona{ " + "id_estudiante = " + id_estudiante +
                ", nombre = " + nombre + 
                ", apellido = " + apellido + '}';
    }
    
    
}
