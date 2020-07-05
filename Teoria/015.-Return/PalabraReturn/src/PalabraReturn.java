public class PalabraReturn {
    public static void main(String[] args) {
        var resultado = sumar(3,5);
        System.out.println("resultado = " + resultado);
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int suma(int a, int b){
        if(a == 0 && b == 0){
            System.out.println("Valors iguales a cero");
            return 0;
        }
        return a + b;
    }
}
