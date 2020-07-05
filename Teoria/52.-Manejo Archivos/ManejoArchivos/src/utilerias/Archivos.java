package utilerias;
import java.io.*;

public class Archivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void escribeArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente el archivo");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            String contenido = "Anexando informacion al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fine de anexar");
            salida.close();
            System.out.println("Se ha anexado la informaicon correctamente");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

