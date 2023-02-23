import java.util.*;
public class Ejercicio16 {
    public static void main(String[] a){
        
        double elPadrino = 3.5;
        
        double odisea =2.95;
        
        double alquilar = (elPadrino+odisea)*2;
        
        boolean pagar = alquilar<=5;
        
        System.out.println("Coste de estas 2 películas durante 2 días: "+alquilar);
        System.out.println("Se puede pagar: "+pagar);

    }
}
