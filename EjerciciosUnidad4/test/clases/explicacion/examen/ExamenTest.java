package clases.explicacion.examen;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
public class ExamenTest {
    
    public ExamenTest() {
    }

    @Test
    public void testSomeMethod() {
        Examen e = new Examen();
        e.añadirNota("Antonio", 6);
        assertEquals(6, e.getNota("Antonio"),0.1);
    }
    
    @Test
    public void testSomeMethod2() {
        Examen e = new Examen();
        e.añadirNota("Carlos", 4);
        e.añadirNota("Arturo", 5);
        e.añadirNota("Belen", 6);
        double media = e.getNotaMedia();
        assertEquals(5, e.getNotaMedia(),0.1);
        assertTrue(e.mediaAprobado());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSomeMethod3() {
        Examen e = new Examen();
        e.añadirNota("Antonio", -20);
        assertEquals(-20, e.getNota("Antonio"),0.1);
    }
    
    @Test
    public void testSomeMethod4() {
        Examen e = new Examen();
        e.añadirNota("Pablo", 4.3);
        e.añadirNota("Tarik", 0);
        e.añadirNota("Abel", 4.9);
        assertFalse(e.mediaAprobado());
    }
    
    @Test
    public void testSomeMethod5() {
        Examen e = new Examen();
        e.añadirNota("Carlos", 10);
        e.añadirNota("Pablo", 4.3);
        e.añadirNota("Arturo", 5);
        e.añadirNota("Belen", 6);
        e.añadirNota("Tarik", 0);
        e.añadirNota("Abel", 4.9);
        List<String> aprobados = e.getAprobados();
        List<String> aprobadosDeVerdad = List.of("Belen", "Arturo", "Carlos");
        assertEquals(aprobadosDeVerdad.size(),aprobados.size());
        
        for (String a : e.getAprobados()){
            assertTrue(aprobados.contains(a));
        }
                
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSomeMethod6() {
        Examen e = new Examen();
        double media = e.getNotaMedia();
        fail("No ha saltado la excepcion que se esperaba.");
    }
    
}
