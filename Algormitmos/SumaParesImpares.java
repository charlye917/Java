public class SumaParesImpares{
    public static void main(String[] args){
        int sumaPares=0, sumaImpares=0;
        System.out.println("Algorimo que suma los pares e impares que hay del 1 al 100");
        for(int n=0; n<=100; n++){
            if(n % 2 == 0){
                sumaPares = sumaPares + n;
            } else{
                sumaImpares = sumaImpares + n;
            }
        }
        System.out.println("Suma Pares: " + sumaPares);
        System.out.println("Suma Impares" + sumaImpares);

    }
}