public class Main {
    public static void main(String[] args) {
        //OperadoresAritmeticos();
        //OperadoresAsignacion();
        //OperadoresUnarios();
        //OperadoresRelacionales();
        //OperadoresCondicionales();
        //OperadorTernario();
        PrecedenciaOperador();
    }

    public static void OperadoresAritmeticos(){
        int a = 3, b = 4;
        int c = a + b;

        System.out.println("c = " + c);
        System.out.println("Resultado: " + (a + b));
        System.out.println("Resultado 2: " + (c - b));

        double d = 3D / b;
        System.out.println("El resultaod de la division es: " + d);

        int g = 6 % 2;
        if (g == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }

    public static void  OperadoresAsignacion(){
        int a = 3, b = 2;
        int c = a;

        a+=3;
        System.out.println("a = " + a);
    }

    public static void OperadoresUnarios(){
        int a = 3;
        int b = -a;
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c;

        System.out.println("Valor de c: " + c + ", Valor d: " + d);

        int e = 3;
        int f = e++;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = 3;
        int h = ++g;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }

    public static void OperadoresRelacionales(){
        int a = 3, b = 5;
        boolean c = (a != b);
        System.out.println("c = " + c);

        String d = "hola", e = "hola";
        boolean f = d.equals(e);
        System.out.println("f = " + f);

        boolean g = (a <= b);
        System.out.println("g = "+ g);
    }

    public static void OperadoresCondicionales(){
        int a = 3;
        int valorMin = 0;
        int valorMax = 10;

        if (a >= valorMin && a <= valorMax)
            System.out.println("Dentro de rango");
        else
            System.out.println("Fuerea de rango");
    }

    public static void OperadorTernario(){
        //Simplificacion del if-Else
        int numero = 11;
        var resultado = (numero % 2 == 0) ? "NUMERO PAR" : "NUMERO IMPAR";
        System.out.println("Resutaldo = " + resultado);
    }

    public static void PrecedenciaOperador(){
        int x = 5;
        int y = 10;
        int z = ++x + y--;//x = 6, y = 10

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Ejemplo procedencia operadores");
        var resultado = 4 + 5 + 6 / 3;
        System.out.printf("Resutlado =  " + resultado);

        resultado =
    }


}
