import java.util.Scanner;

public class TareaAreaFigura {
    public static void main(String[] args) {
        int alto, ancho;
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el alto de la figura: ");
        alto = scann.nextInt();
        System.out.println("Ingrese el ancho de la figura: ");
        ancho = scann.nextInt();
        System.out.println("AREA: " + (alto * ancho));
        System.out.println("Perimetro: " + ((alto + ancho) * 2));

    }
}
