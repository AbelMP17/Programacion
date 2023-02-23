
import java.util.*;

/*
Realiza un programa que genere un número aleatorio comprendido entre 29 y 65
y lo muestre por pantalla. Nota: Hay dos formas posibles de hacerlo: con la clase Math y con la
clase Random de la “Librería Estándar de Java”. Mira las dos y elige la que te resulte más fácil. 
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        
        System.out.println("Número con la clase Math: "+(int)(Math.random()*(65-29+1)+29));
        
        Random rnd = new Random();
        
        System.out.println("Número con la clase Random: "+(int)(rnd.nextInt(65-29+1)+29));
        
    }
}
