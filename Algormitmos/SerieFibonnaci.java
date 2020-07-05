import java.util.Scanner;

public class SerieFibonnaci{
    public static void main(String[] args) {
        int iteraciones = pedirDatos();
        mostrarValores(iteraciones);
    }

    public static int pedirDatos(){
        Scanner teclado = new Scanner(System.in);
        int muestra;

        do{
            System.out.println("Cuantos numero de la serie desea ver? ");
            muestra = teclado.nextInt();

            if(muestra<=1){
                System.out.println("debe elegir mas de dos numeros para mostrar");
            }
        }while(muestra<=2);
        teclado.close();

        return muestra;
    }

    public static void mostrarValores(int iteraciones){
        int a=0, b=1, temp=0;
        for(int i=0; i<iteraciones;i++){
            System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}