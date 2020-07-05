
package sumasueldos;

import java.util.Scanner;

public class SumaSueldos {
    public static void main(String[] args) {
        int sueldos[] = pedirDatos();
        System.out.println(sumaSueldos(sueldos));
    }
    
    public static int[] pedirDatos(){
        Scanner teclado = new Scanner(System.in);
        int countSueldos;
        int sueldos[];
        
        System.out.println("Ingrese el numeor de sueldos que desea sumar");
        countSueldos = teclado.nextInt();
        
        sueldos = new int[countSueldos];
        
        System.out.println("Ingrese los sueldos a sumar");
        for(int i = 0; i<sueldos.length; i++){
            sueldos[i] = teclado.nextInt();
        }
       return sueldos; 
    }
    
    public static int sumaSueldos(int[] sueldos){
        int resultado = 0;
        for(int sueldo : sueldos){
            resultado = resultado + sueldo;
        }
        return resultado;
    }
}
