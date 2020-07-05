public class EjemploArgs {
    public static void main(String[] args) {
        imprimirNumeros(15,20,25,30,3,61,75,18,10);

        imprimirNumerosForEach(15,20,61,8,7);

        variosParametros("Juan", true, 15, 20,4);
    }

    public static void imprimirNumeros(int... numeros){
        int elemento;
        for(int i=0; i<numeros.length; i++){
            elemento = numeros[i];
            System.out.println("Elemento " + i + ": " + elemento);
        }
    }

    public static void imprimirNumerosForEach(int... numeros){
        for(int numero : numeros){
            System.out.printf("\nEl numero es: " + numero);
        }
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("\nNombre: " + nombre);
        System.out.println("\nValido: " + valido);

        for(int numero: numeros){
            System.out.println("\nEl numero es: " + numero);
        }
    }
}
