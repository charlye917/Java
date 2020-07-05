public class EjemploSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 1000);
        System.out.println(empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Karla", 2000, "finanzas");
        System.out.println(gerente.obtenerDetalles());
    }
}
