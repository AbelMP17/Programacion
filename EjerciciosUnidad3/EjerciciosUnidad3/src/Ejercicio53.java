/*
Crea un Set<String> y añádele 15 palabras. A continuación, recorre todas las
palabras del Set y muestra por cada una, su longitud y la palabra escrita en mayúsculas. 
 */
import java.util.*;
public class Ejercicio53 {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        
        for(int i = 0;i<=15;i++){
            System.out.print("Escribe una palabra: ");
            String pal = new Scanner(System.in).nextLine();
            lista.add(pal);
        }
        
        for(String palabra : lista){
            System.out.println("La palabra en mayuscula es "+palabra.toUpperCase()+" y su longitud es de "+palabra.length());
        }
        
        
    }
}
