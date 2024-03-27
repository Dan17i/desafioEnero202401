package parte3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.programandoenjava.parte3.clases.Libro;

public class LibroTest {
    
    @BeforeEach
    public void setUp(){
        LOG.info("Iniciando configuración para la prueba");
    }
    private static final Logger LOG = Logger.getLogger(LibroTest.class.getName());
    @Test
    public void testDatosCompletos(){
        LOG.info("inicia el test Datos Completos de la clase Libro");

        var libro= new Libro("Biblia","Dios", 1600, 0337);

        assertEquals("Biblia",libro.getTitulo());
        assertEquals("Dios", libro.getAutor());
        assertEquals(1600,libro.getAnoPublicacion());
        assertEquals(0337, libro.getId());
    }
}
