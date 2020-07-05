package domain;

public class Usuarios {
    private int id_usuario;
    private String usuario;
    private String password;
    
    public int getIdUsuario(){
        return id_usuario;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setIdUsuario(int id_usuario){
        this.id_usuario = id_usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String toString(){
        return "Estudiante: id_estudiante = " + id_usuario +
                ", usuario = " + usuario +
                ", password = " + password;
    }
}
