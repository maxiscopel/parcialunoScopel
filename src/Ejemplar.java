public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;

    public Ejemplar(String codigo, EstadoEjemplar estado, Publicacion publicacion) {
        this.codigo = codigo;
        this.estado = estado;
        this.publicacion = publicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }
}

