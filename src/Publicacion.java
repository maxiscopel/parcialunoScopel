import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {
    protected String titulo;
    protected int anio;
    protected List<Ejemplar> ejemplares;
    protected Genero genero;

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.ejemplares = new ArrayList<>();
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public List<Ejemplar> getEjemplaresDisponibles() {
        List<Ejemplar> disponibles = new ArrayList<>();
        for (Ejemplar e : ejemplares) {
            if (e.getEstado() == EstadoEjemplar.DISPONIBLE) {
                disponibles.add(e);
            }
        }
        return disponibles;
    }


    public String getTitulo() {
        return titulo;
    }

    public List<Ejemplar> getEjemplares() {
       return ejemplares;
    }

}
