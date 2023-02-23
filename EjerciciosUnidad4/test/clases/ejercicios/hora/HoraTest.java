package clases.ejercicios.hora;

import java.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.*;

public class HoraTest {
    
    public HoraTest() {
    }

    @Test
    public void testSomeMethod(){
        Hora h = new Hora(12, 0, 0);
        assertEquals(12, h.hora());
        assertEquals(0, h.minuto());
        assertEquals(0, h.segundo());
    }
    @Test
    public void testSomeMethod2(){
        Hora h = new Hora(12, 0, 0);
        Hora seg = h.añadirSegundos(20);
        assertEquals(12,seg.hora());
        assertEquals(0, seg.minuto());
        assertEquals(20, seg.segundo());

    }
    @Test
    public void testSomeMethod3(){
        Hora h = new Hora(20, 12, 0);
        assertEquals(true,h.esNoche());
    }
    @Test
    public void testSomeMethod4(){
        Hora h = new Hora(20, 0, 0);
        assertEquals("8:0:0", h.toString());
    }
    
    @Test
    public void testSomeMethod5(){
        Hora h1 = new Hora(8, 0, 0);
        Hora h2 = new Hora(8, 13, 5);
        Hora sum = Hora.suma(h1, h2);
        assertEquals(sum.toString(), "4:13:5");
    }
    
    @Test
    public void testSomeMethod6(){
        Hora h = new Hora(10,5,5);
        LocalTime lT = h.toLocalTime();
        assertEquals(h.hora(), lT.getHour());
        assertEquals(h.minuto(), lT.getMinute());
        assertEquals(h.segundo(), lT.getSecond());
    }
}
