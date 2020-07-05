public class Persona {
    private final int idPersona;
    private String nombre;
    private static int contadorPersona;

    Persona(String nombre){
        idPersona = ++contadorPersona;
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
