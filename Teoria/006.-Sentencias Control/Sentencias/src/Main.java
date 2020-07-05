public class Main {
    public static void main(String[] args) {
        //ifElse();
        //switchCase();
        mesAño();


    }

    public static void ifElse(){
        int numero = 0;
        var texto = "numero desconocido";

        if(numero == 1)
            texto = "numero uno";
        else if(numero == 2)
            texto = "numero dos";
        else
            texto = "numero desconocido";

        System.out.println("numero desconocido");
    }

    public static void switchCase(){
         var numero = 2;
         var texto = "numeros desconocidos";

         switch(numero){
             case 1:
                 texto = "numero uno";
                 break;
             case 2:
                 texto = "numero dos";
                 break;
             case 3:
                 texto = "numero tres";
                 break;
             default:
                 texto = "numero desconocido";
                 break;
         }

        System.out.println(texto);
    }

    public static void mesAño(){
        int mes = 1;
        String estacion;

        switch(mes){
            case 1: case 2: case 12:
                estacion = "invierno";
                break;

            case 3: case 4: case 5:
                estacion = "primavera";
                break;
            case 6: case 7: case 8:
                estacion = "verano";
                break;
            case 9: case 10: case 11:
                estacion = "otoño";
                break;
            default:
                estacion = "Mes invalido";
                break;
        }

        System.out.println("Estacion switch: " + estacion);

        if(mes == 1 || mes == 2 || mes ==12)
            estacion = "invierno";
        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "primavera";
        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "Verano";
        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "otoño";
        else
            estacion = "valor no valido";
        System.out.println("Estacion IF-Else= " + estacion);
    }
}
