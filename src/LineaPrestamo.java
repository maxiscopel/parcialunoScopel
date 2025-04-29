import java.time.LocalDate;

public class LineaPrestamo {
    private LocalDate FechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo(LocalDate FechaDevolucionEstimada, Ejemplar ejemplar){

            this.FechaDevolucionEstimada=FechaDevolucionEstimada;
            this.ejemplar=ejemplar;

    }
    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public LocalDate getFechaDevolucionEstimada() {
        return FechaDevolucionEstimada;
    }

}
