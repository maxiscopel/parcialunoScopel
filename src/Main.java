import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear las entidades
        Direccion direccion = new Direccion("23", 742, "lujan", "1234");
        Editorial editorial = new Editorial("Editorial Ficticia", "edit12.com", direccion);
        Autor autor1 = new Autor("ana lopez", "Argentina", LocalDate.of(1975, 3, 12));
        Autor autor2 = new Autor("Carlosperez ", "peru", LocalDate.of(1980, 11, 5));
        Genero genero = new Genero("novela", "Ficcion");

        // Crear libro y ejemplares
        Libro libro = new Libro("el viento", 2004, genero, "123-456-789", Arrays.asList(autor1, autor2), editorial);
        Ejemplar ejemplar1 = new Ejemplar("EJ001", EstadoEjemplar.DISPONIBLE, libro);
        Ejemplar ejemplar2 = new Ejemplar("EJ002", EstadoEjemplar.DISPONIBLE, libro);
        libro.agregarEjemplar(ejemplar1);
        libro.agregarEjemplar(ejemplar2);

        // Crear revista
        Genero generoCiencia = new Genero("Ciencia", "publicaciones científicas");
        Revista revista = new Revista("cienca nac", 2023, generoCiencia, 15, 4);
        Ejemplar ejemplarRevista = new Ejemplar("RV001", EstadoEjemplar.DISPONIBLE, revista);
        revista.agregarEjemplar(ejemplarRevista);

        // Crear biblioteca y usuario
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario("lucia", "ferndz", "40345678");

        // Agregar publicaciones a la biblioteca
        biblioteca.agregarPublicacion(libro);
        biblioteca.agregarPublicacion(revista);

        // Crear y agregar préstamo
        Prestamo prestamo = new Prestamo(LocalDate.now(), null);
        prestamo.agregarLineaPrestamo(ejemplar1);
        usuario.agregarPrestamo(prestamo);

        // Registrar usuario y mostrar historial de préstamos
        biblioteca.registrarUsuario(usuario);
        System.out.println(" /n :Historial prestamos del usuario");
        usuario.mostrarHistorialPrestamos();

        // Mostrar ejemplares disponibles del libro
        System.out.println("\n:e ejemplares disponibles del libro ---");
        libro.getEjemplaresDisponibles().forEach(ejemplar ->
                System.out.println("codigo: " + ejemplar.getCodigo()));
    }
}
