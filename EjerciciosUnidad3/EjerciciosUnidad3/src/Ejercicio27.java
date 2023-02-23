/*
Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El 
programa deberá recorrer dicha lista y mostrará por pantalla las que contienen la letra “a”.
 */
import java.util.*;
public class Ejercicio27 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        System.out.println("Escribe 6 palabras: ");
        String palabras = new Scanner(System.in).nextLine();
        
        for (StringTokenizer stringTokenizer = new StringTokenizer(palabras); stringTokenizer.hasMoreTokens();) {
            String token = stringTokenizer.nextToken(" ");
            lista.add(token);
            
            if(token.toLowerCase().contains("a")){
                System.out.println(token);
            }
            
            
        }
        System.out.println("Fin del programa.");
    }
}
