public class Raton extends DispositivoEntrada{
    private int idRaton;
    private int contadorRaton;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idRaton = ++contadorRaton;
    }

    public String toString(){
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString();
    }
}
