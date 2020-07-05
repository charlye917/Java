public class Teclado extends  DispositivoEntrada{
    private int idTeclado;
    private int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    public String toString(){
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString();
    }
}
