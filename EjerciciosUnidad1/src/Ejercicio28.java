import java.util.*;
public class Ejercicio28 {
    public static void main(String[] a){
        System.out.println("Introduce tu edad: ");
        int edad = new Scanner (System.in).nextInt();
        
        boolean mayor = edad >= 18;
        
        System.out.println("¿Vienes acompañado? (true o false): ");
        boolean acompañado = new Scanner (System.in).nextBoolean();

        boolean puerta = mayor || acompañado;
        
        System.out.println("La puerta esta abierta: "+puerta);


        
    }
    
}