public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica ari = new Aritmetica(5,5);

        int suma = ari.sumar();
        int resta = ari.restar();
        int multi = ari.multiplicar();
        double divi = ari.dividir();

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(divi);
    }
}
