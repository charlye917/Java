import java.util.*;

public class TareaIFElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        String nota;

        System.out.println("Ingrese un valor de 0 a 10");
        valor = scan.nextInt();

        if(valor == 10 || valor >= 9)
            nota = "A";
        else if (valor < 9 || valor >= 8)
            nota = "B";
        else if (valor < 8 || valor >= 7)
            nota = "C";
        else if (valor < 7 || valor >= 6)
            nota ="D";
        else if (valor <6 || valor > 0)
            nota = "F";
        else
            nota = "Valor desconocido";

        System.out.println("Nota = " + nota);

    }
}
