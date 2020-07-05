import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //EjWhile();
        EjFor();
        EjContBreak();
    }

    public static void EjWhile(){
        var i = 0;
        String texto = "impresion infinita";
        while(i<3){
            System.out.println("Texto = " + i);
            i++;
        }

        do{
            System.out.println("Texto = " + i);
            i++;
        }while(i<3);
    }

    public static void EjFor(){
        for(var i = 0; i<5; i++){
            System.out.println("Prueba for: " + i );
        }
    }

    public static void EjContBreak(){

        for(var i = 0; i<3; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}
