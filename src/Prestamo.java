import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private List<LineaPrestamo> lineas;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = new ArrayList<>();
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LocalDate fechaEstimada = fechaPrestamo.plusDays(15); // ejemplo de 15 días
        LineaPrestamo linea = new LineaPrestamo(fechaEstimada, ejemplar);
        lineas.add(linea);
        ejemplar.setEstado(EstadoEjemplar.PRESTADO);
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public List<LineaPrestamo> getLineas() {
        return lineas;
    }
}
