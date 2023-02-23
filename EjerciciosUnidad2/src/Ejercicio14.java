/*
Consulta la documentación de la clase String para hacer un programa que
pregunte una frase al usuario y se muestre la letra que hay justo en la mitad de la frase.
 */
import java.util.*;
public class Ejercicio14 {
    public static void main(String[] a){
        System.out.println("Introduce una frase que tu quieras: ");
        String frase = new Scanner(System.in).nextLine();
        
        char caracter = frase.charAt(frase.length()/2);
        
        System.out.println("El caracter que se encuentra justo a la mitad de la frase es: "+caracter);
    } 
}
