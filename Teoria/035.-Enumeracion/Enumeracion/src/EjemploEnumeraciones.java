public class EjemploEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Valor 1: " + Dias.LUNES);

        indicarDia(Dias.VIERNES);
    }

    public static void indicarDia(Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("Primer dia");
                break;
            case VIERNES:
                System.out.println("Quinto dia");
                break;
            default:
                System.out.println("Valor no valido");
        }
    }
}
