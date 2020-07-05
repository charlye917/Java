public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor(){}

    public Monitor(String marca, double tamaño){
        idMonitor = ++contadorMonitores;
        this.marca = marca;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "idMonitor = " + idMonitor
                + "marca = " + marca
                + "tamaño = " + tamaño;
    }

    public String getMarca(){
        return marca;
    }

    public double getTamaño(){
        return tamaño;
    }

    public int getIdMonitor(){
        return idMonitor;
    }


}
