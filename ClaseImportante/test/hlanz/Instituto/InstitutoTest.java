package hlanz.Instituto;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.*;

/**
 *
 * @author usuario
 */
public class InstitutoTest {
    //Añado un alumno y compruebo que se a añadido correctamente
    @Test
    public void testSomeMethod() {
        //Creo un mock del alumno
        Alumno a = Mockito.mock(Alumno.class);
        Mockito.when(a.getNombre())
                .thenReturn("Miguel");
        
        Mockito.when(a.getNota())
                .thenReturn(5);
        
        Instituto i = new Instituto("HLanz");
        
        //Alumno a = new Alumno("Miguel", 5);
        i.anadir(a);
        
        Alumno alumnoPrueba = i.getAlumnos().get(0);
        
        //Da error porque está sin programar
        assertEquals("Miguel", alumnoPrueba.getNombre());
        
                
    }
    
}
