package parte3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.programandoenjava.parte3.clases.Biblioteca;
import com.programandoenjava.parte3.clases.Libro;
public class BibliotecaTest {
    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        // Inicializamos la biblioteca antes de cada prueba
        biblioteca = new Biblioteca();
    }

    private static final Logger LOG = Logger.getLogger(BibliotecaTest.class.getName());

    @Test
    public void testConstructorInicializaListaLibros (){
        LOG.info("inicia el Test de testConstructor Inicializa ListaLibros de la clase biblioteca ");

        assertNotNull(biblioteca.getListaLibros(), "La lista de libros debe ser inicializada en el constructor");
        assertTrue(biblioteca.getListaLibros().isEmpty(), "La lista de libros debe estar vacía inicialmente");
        
        LOG.info("finaliza exitoso el Test de testConstructor Inicializa ListaLibros de la clase biblioteca ");
    }

    @Test
    public void testAgregarLibroCorrectamente(){

        LOG.info("inicia el test agregar Libro Correctamente de la clase Biblioteca ");
        // instancia
        Libro libro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954, 12345);
        biblioteca.agregarLibro(libro);

        // Obtenemos la lista de libros de la biblioteca
        Collection<Libro> listaLibros = biblioteca.getListaLibros();

        // Verificamos si la lista de libros contiene el libro agregado
        assertTrue(listaLibros.contains(libro), "El libro no se agregó correctamente a la biblioteca");
        LOG.info("fianliza exitoso!!, el test agregar Libro Correctamente de la clase Biblioteca ");
    
    }
     @Test
    public void testBuscarLibroIdExistente() {
        LOG.info("inicia el test Buscar Libro Id Existente de la clase Biblioteca ");
        // Creamos algunos libros de prueba
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954, 12345);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 54321);

        // Agregamos los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Buscamos un libro existente por su id
        Libro libroEncontrado = biblioteca.buscarLibroId(12345);

        // Verificamos si el libro encontrado es el esperado
        assertEquals(libro1, libroEncontrado, "El libro encontrado no es el esperado");

        LOG.info("finaliza con exito,el test Buscar Libro Id Existente de la clase Biblioteca  ");
    }

    @Test
    public void testBuscarLibroIdNoExistente() {
        LOG.info("inicia el test Buscar Libro Id NoExistente de la clase Biblioteca");
        // Intentamos buscar un libro con un id que no existe
        Libro libroEncontrado = biblioteca.buscarLibroId(9999);

        // Verificamos que el libro encontrado sea nulo
        assertNull(libroEncontrado, "No se debería haber encontrado ningún libro");
    }

}
