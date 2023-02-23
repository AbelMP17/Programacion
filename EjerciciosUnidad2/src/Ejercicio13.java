/*
Consulta el pdf de la “Librería Estándar de Java” y busca la clase String. Haz un
programa que pregunte tu nombre por teclado, y el ordenador lo muestre en mayúsculas,
minúsculas y diga cuántos caracteres tiene.
 */
import java.util.*;
public class Ejercicio13 {
    public static void main(String[] a){
        System.out.println("Escribe tu nombre completo: ");
        String nombreCompleto = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe tu nombre completo en Mayúscula: "+nombreCompleto.toUpperCase());
        System.out.println("Escribe tu nombre completo: "+nombreCompleto.toLowerCase());
        System.out.println("Numero de carácteres: "+nombreCompleto.length());
        
    }
}
