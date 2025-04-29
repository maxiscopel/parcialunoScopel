public class Revista extends Publicacion {
    private int volumen;
    private int numero;


    public Revista(String titulo, int anio, Genero genero, int volumen, int numero) {
        super(titulo, anio, genero);
        this.volumen = volumen;
        this.numero = numero;
    }

    public int getvolumen() {
        return volumen;
    }
    public int getnumero() {
        return numero;
    }
}
