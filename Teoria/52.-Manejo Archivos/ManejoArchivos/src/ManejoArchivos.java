import static  utilerias.Archivos.*;
public class ManejoArchivos {
    private static final String nombre_archivo = "E:\\charl\\Documents\\Programacion\\JAVA\\Programas\\53.-Manejo Archivos\\archivo.txt";

    public static void main(String[] args) {
        crearArchivo(nombre_archivo);
        escribeArchivo(nombre_archivo);
        leerArchivo(nombre_archivo);
        anexarArchivo(nombre_archivo);
        leerArchivo(nombre_archivo);
    }
}
