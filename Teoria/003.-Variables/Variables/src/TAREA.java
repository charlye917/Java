import java.util.Scanner;

public class TAREA {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String titulo;
        String autor;

        System.out.println("Proporciona el nombre del titulo; ");
        titulo = scann.nextLine();
        System.out.println("Proporciona el nombre del autor: " );
        autor = scann.nextLine();

        System.out.println("El libro " + titulo + " Fue escrito por " + autor);
    }
}
