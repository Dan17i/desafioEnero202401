package parte3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.programandoenjava.parte3.clases.Persona;

public class PersonaTest {
    private Persona persona;
    @BeforeEach
    public void setUp(){
        persona = new Persona();
    }
    private static final Logger LOG = Logger.getLogger(PersonaTest.class.getName());

    @Test
    public void testDatosComletos(){
        LOG.info("Inicio test Datos Comletos de la clase Persona");
        persona.setNombre("Jose");
        persona.setEdad(19);
        persona.setId(123456);
        
        assertEquals("Jose",persona.getNombre());
        assertEquals(19,persona.getEdad());
        assertEquals(123456, persona.getId());
        LOG.info("termina exitosamente test Datos Comletos de la clase Persona");
    }

}
