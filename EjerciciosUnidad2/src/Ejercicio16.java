/*

 */
import java.util.*;
public class Ejercicio16 {

    public static void main(String[] a) {
        System.out.println("Escribe una frase: ");
        String frase = new Scanner(System.in).nextLine();

        System.out.println("Escribe una palabra que se encuentre dentro de la primera frase: ");
        String frase2 = new Scanner(System.in).nextLine();

        
        /* Otra forma de hacer este programa:
            boolean incluido2 = frase.indexOf(frase2)>=0;
        */
        
        boolean incluido = frase.contains(frase2);

        
        System.out.println("Coinciden: " + incluido);

    }
}
