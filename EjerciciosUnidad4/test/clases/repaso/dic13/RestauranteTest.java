
package clases.repaso.dic13;

import java.io.IOException;
import org.junit.Test;

public class RestauranteTest {
    
    public RestauranteTest() {
        Restaurante r = new Restaurante("Los pipos");
            System.out.println(r.getNombre());

            try{
                r.guardar();
            }catch (IOException error){
                System.out.println(error);
            }

            System.out.println(r.getPrecio("Bocadillo"));

            r.añadir("Chumino", 24);

            r.getPrecio("Chumino");

            System.out.println(r.getPlatosCaros());
            String[] platos = {"Chumino", "Sopa"};
            System.out.println(r.getCuenta(platos));
    }

    @Test
    public void testSomeMethod(){
        
    }
    
}

