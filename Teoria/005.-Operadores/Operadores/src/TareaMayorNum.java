import java.util.Scanner;

public class TareaMayorNum {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el valor del numero 1: ");
        num1 = scann.nextInt();
        System.out.println("Ingrese el valor del numero 2: ");
        num2 = scann.nextInt();

        var resultado = num1 > num2 ? "El numero 1 es mayor" : "El numero 2 es Mayor";
        System.out.println(resultado);





    }
}
