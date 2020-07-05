package manejoestudiantes;

public class Estudiante {
    private int estudiante_id;
    private String nombre;
    private String apellido_paterno;
    
    public int getId_estudiate(){
        return estudiante_id;
    }
    
    public void setId_estudiante(int id_estudiante){
        this.estudiante_id = id_estudiante;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido_paterno(){
        return apellido_paterno;
    }
    
    public void setApellido_paterno(String apellido_paterno){
        this.apellido_paterno = apellido_paterno;
    }
    
    public String toString(){
        return "Estudiante{" + "estudiante_id= " + estudiante_id +
                ", nombre= " + nombre +
                ", apellido= " + apellido_paterno + '}';
    }
}
