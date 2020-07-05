import java.util.Scanner;

public class OrdenaSueldos{
    double sueldo[];
    double datos[];
    public static void main(String[] args){
        OrdenaSueldos os = new OrdenaSueldos();
        os.obtenerDatos();
        os.ordenamiento();
        os.mostrarDatos();

    }

    public void obtenerDatos(){
        Scanner sc = new Scanner(System.in);
        int elementos;

        System.out.println("Ingrese el numero de sueldos que desea agregar");
        elementos = sc.nextInt();

        sueldo = new double[elementos];

        for(int i=0; i<elementos; i++){
            System.out.println("Ingrese el sueldo " + (i + 1));
            sueldo[i] = sc.nextDouble();
        }
    }

    public void ordenamiento(){
        double aux;
        for(int i=0; i<sueldo.length; i++){
            for(int j=0; i<sueldo.length; j++){
                if(sueldos[j]>sueldo[j+1]){
                    aux = sueldo[j+1];
                    sueldo[j+1] = sueldo[j];
                    sueldo[j] = aux;
                }
            }
        }
    }

    public void mostrarDatos(){
        for(int i=0; i<sueldo.length; i++){
            System.out.println("Valor: " + sueldo[i]);
        }
    }
}