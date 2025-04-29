import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void mostrarHistorialPrestamos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println("fecha de prstamo: " + prestamo.getFechaPrestamo());
            for (LineaPrestamo linea : prestamo.getLineas()) {
                System.out.println("  Ejemplar: " + linea.getEjemplar().getCodigo()
                        + "dev estimada: " + linea.getFechaDevolucionEstimada());
            }
            System.out.println("Fecha devolución real: " + prestamo.getFechaDevolucion());
        }
    }
}
