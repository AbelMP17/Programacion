import java.util.*;
public class Ejercicio15 {
    public static void main(String[] a){
    
        System.out.println("Escribe un número de grados centígrados: ");
        int gradosCentigrados = new Scanner (System.in).nextInt();
        
        double gradosFarenheit = (gradosCentigrados*1.8)+32;
        
        System.out.println("Grados Centígrados: "+gradosCentigrados);
        System.out.println("Grados Farenheit: "+gradosFarenheit);

    }
}
