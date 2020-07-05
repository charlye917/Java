public class ParImpar{
    public static void main(String[] args) {

        int num = 10;

        System.out.println("Programa que muestra los numeros pares e impares en un rango sin usar el operador %");
        System.out.println("Ingrese el numero que desea ver el rango: " + num);

        while(num > 0 ){
            if(par(num)){
                System.out.println(num + " es par");
            }else{
                System.out.println(num + " es impar");
            }

            num -= 1;
        }
    }

    private static boolean impar(int num){
        if(num == 0 )
            return false;
        else
            return par(num - 1);
    }

    private static boolean par(int num){
        if(num == 0)
            return true;
        else
            return impar(num - 1);    
    }
}