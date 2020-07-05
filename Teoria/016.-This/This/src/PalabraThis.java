public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos");
    }
}

class Persona{
    String nombre;

    Persona(String nombre){
        this.nombre = nombre;

        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("imprimir argumento: " + p);
        System.out.println("impresion objeto actual (this): " + this);
    }
}
