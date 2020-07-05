public class EjemploArreglos {
    public static void main(String[] args) {
        //1. Decalaracion arreglo tipo arreglo
        int edades[];
        //2. Instanciar el arreglo e enteros
        edades = new int[3];
        //3. incializamos los valores
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        //imprimimos los valorse del arreglo a la salida estandar
        //4.leemos cada valor del arreglo

        for(int i = 0; i<edades.length; i++){
            System.out.println("Arreglo " + i + ": " + edades[i]);
        }
    }
}
