
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Usa la clase StringTokenizer para hacer un programa que pregunte al usuario
"Escriba una frase" y nos muestre en una línea diferente cada palabra de la frase y además, el
número total de palabras encontradas.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Escribe una frase: ");
        String frase = new Scanner(System.in).nextLine();
        
        int i = 0;
        
        for (StringTokenizer tokenS = new StringTokenizer(frase); tokenS.hasMoreTokens();) {
            
            String token = tokenS.nextToken(" ");
            System.out.println(token);
            
            i++;
            
        }
        System.out.println("El número de palabras es "+i);
    }
}
