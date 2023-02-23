/*
Rellene la lista con 5 palabras (las que tú quieras)
Muestre por pantalla el tamaño de la lista
Muestre por pantalla la palabra de la posición 3 de la lista.
Llame al método toString de la lista y muestre por pantalla lo que produce
Elimine el primer dato de la lista
Muestre el tamaño de la lista
Muestre por pantalla la palabra de la posición 3 de la lista
Llame al método toString de la lista y muestre por pantalla lo que produce
 */
import java.util.*;
public class Ejercicio50 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(); 
        lista.add("Coche");
        lista.add("Moto");
        lista.add("Bicicleta");
        lista.add("Tractor");
        lista.add("Camión");
        
        String listaS = lista.toString();
        
        int tamaño = lista.size();
        
        System.out.println("La lista mide: "+tamaño);
        
        System.out.println("La palabra de la 3ª posición es: "+lista.get(3));
        
        System.out.println("Lista pasada con el metodo toString: "+listaS);
        
        lista.remove(0);
        
        int tamaño2 = lista.size();
        
        String listaS2 = lista.toString();
        
        System.out.println("\n----------------------------------------------\nLa lista mide: "+tamaño2);
        
        System.out.println("La palabra de la 3ª posición es: "+lista.get(3));
        
        System.out.println("Lista pasada con el metodo toString: "+listaS2);
        
        
    }
}
