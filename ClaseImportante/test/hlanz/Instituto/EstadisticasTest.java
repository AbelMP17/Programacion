/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hlanz.Instituto;

import java.util.*;
import org.junit.Test;
import org.mockito.Mockito;

/**
 *
 * @author usuario
 */
public class EstadisticasTest {
    
    @Test
    public void testSomeMethod(){
        
        Alumno a1 = Mockito.mock(Alumno.class);
        Mockito.when(a1.getNota())
                .thenReturn(8);
        
        Alumno a2 = Mockito.mock(Alumno.class);
        Mockito.when(a2.getNota())
                .thenReturn(7);
        
       Instituto i = Mockito.mock(Instituto.class);
        Mockito.when(i.getAlumnos()).thenReturn(List.of(a1,a2));
    }
    
}
