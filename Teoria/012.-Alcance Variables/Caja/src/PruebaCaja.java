public class PruebaCaja {
    public static void main(String[] args) {
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        int volumen;

        Caja caja = new Caja(ancho, alto, profundo);

        volumen = caja.calculaVolumen();
        System.out.println("Volumen = " + volumen);
    }
}
