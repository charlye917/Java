public class EjemploMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
         edades[0][0] = 30;
         edades[0][1] = 20;
         edades[1][0] = 45;
         edades[1][1] = 10;
         edades[2][0] = 38;
         edades[2][1] = 50;

         for(int i = 0; i<edades.length; i++){
            for(int j = 0; j<edades[i].length; j++){
                System.out.println("Edades: " + edades[i][j]);
            }
         }

    }
}
