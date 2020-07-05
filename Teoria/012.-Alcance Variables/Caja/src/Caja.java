public class Caja {
    int ancho, alto, profundo;

    Caja(){}

    Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calculaVolumen(){
        int vol;
        vol = ancho * alto * profundo;
        return vol;
    }
}
