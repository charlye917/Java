import java.util.*;

public class PersonaEdad{
    Scanner sc = new Scanner(System.in);
    String nombre[];
    int[] edad;
    int contador;

    public void carga(){
        System.out.println("Ingrese el numero de elementos que desea agregar");
        contador = sc.nextInt();
        nombre = new String[contador];
        edad = new int[contador];

        for(int i = 0; i<contador;i++){
            System.out.println("Nombre: ");
            sc.nextLine();
            nombre[i] = sc.next();
            System.out.println("Edad: ");
            edad[i] = sc.nextInt();
        }
    }

    public void mayorEdad(){
        for(int i=0; i<nombre.length;i++){
            if(edad[i]>=18){
                System.out.println(nombre[i]);
            }  
        }
    }

    public static void main(String[] args){
        PersonaEdad datos = new PersonaEdad();
        datos.carga();
        datos.mayorEdad();
    }
}