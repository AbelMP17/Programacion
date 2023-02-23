
import java.util.HashSet;
import java.util.Set;

/*
Consulta la documentación de la interfaz Set<T> y la clase HashSet<T> y haz un
programa que las use para crear un conjunto de Strings llamado “mensajes” y haga esto:
    a) Rellene el conjunto con las palabras: silla, mesa, niño, mesa, casa, silla, lápiz
    b) Muestre por pantalla el tamaño de la lista
    c) Llame al método toString de la lista y muestre por pantalla lo que produce 
 */
public class Ejercicio51 {
    public static void main(String[] args) {

        
        Set<String> objetos = new HashSet<>(); 
        objetos.add("Silla");
        objetos.add("Mesa");
        objetos.add("Niño");
        objetos.add("Mesa");
        objetos.add("Casa");
        objetos.add("Silla");
        objetos.add("Lápiz");
        
        int tamaño = objetos.size();
        
        System.out.println("La lista mide: "+tamaño);
        
        String mostrarMensajes = objetos.toString();
        
        System.out.println("Los mensajes son los siguientes: "+mostrarMensajes);
    }
}
