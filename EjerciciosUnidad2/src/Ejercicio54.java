
import java.util.*;

/*
Haz un programa que haga esto:
    a) Crea una lista de 10 palabras (las que tú quieras)
    b) Muestra por pantalla la salida del método toString de la lista
    c) Busca en la clase Collections un método que nos ordene la lista y llámalo.
    d) Una vez ordenada, muestra por pantalla la salida del método toString de la lista 
 */
public class Ejercicio54 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Hola");
        lista.add("Adios");
        lista.add("Buenos");
        lista.add("Días");
        lista.add("Alcaparra");
        lista.add("Cebollino");
        lista.add("CheeseBurger");
        lista.add("Cosas");
        lista.add("Cola(En argentino)");

        System.out.println(lista.toString());
        
        Collections.sort(lista);
        
        System.out.println(lista.toString());
        
        
        
    }
}
