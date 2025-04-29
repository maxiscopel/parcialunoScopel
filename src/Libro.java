import java.util.List;

public class Libro extends Publicacion {
    private String isbn;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String titulo, int anio, Genero genero, String isbn, List<Autor> autores, Editorial editorial) {
        super(titulo, anio, genero);
        this.isbn = isbn;
        this.autores = autores;
        this.editorial = editorial;
    }

    // Getters y setters opcionales
}
