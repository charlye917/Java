import java.util.Scanner;

public class MayorMenor{
    String[] nombre;
    int[] sueldo;
    

    public void obtenerDatos(){
        Scanner sc = new Scanner(System.in);
        int cont;

        System.out.println("Ingrese el numero de datos que desea agregar");
        cont = sc.nextInt();
        nombre = new String[cont];
        sueldo = new int[cont];

        for(int i=0; i<cont; i++){
            System.out.print("Nombre: \t\n");
            nombre[i] = sc.next();
            System.out.print("Sueldo: \t\n");
            sueldo[i] = sc.nextInt();
        }
    }

    public void datoMayor(){
        int pos=0;
        int mayor = sueldo[0];
        for(int i=0;i<nombre.length-1;i++){
            if(sueldo[i]>mayor){
                mayor = sueldo[i];
                pos = i;
            }
        }
        System.out.print("Nombre: " + nombre[pos]);
        System.out.println();
        System.out.print("Sueldo: " + sueldo[pos]);
    }

    public static void main(String[] args){
        MayorMenor mm = new MayorMenor();
        mm.obtenerDatos();
        mm.datoMayor();

    }
}