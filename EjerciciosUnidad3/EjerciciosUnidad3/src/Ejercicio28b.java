import java.util.*;
/*
Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El
programa deberá mostrar por pantalla las palabras únicas (o sea, las palabras repetidas no se
mostrarán). 
 */
public class Ejercicio28b {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        List<String> listaFiltro = new ArrayList<>();
        String palabra = null;
        
        System.out.println("Escribe 6 palabras: ");
                       
        for (int i = 0 ; i<6 ; i++) {
            palabra = new Scanner(System.in).nextLine();
            lista.add(palabra);
            if(lista.contains(palabra) && listaFiltro.contains(palabra)){
                System.out.println("La palabra "+palabra+" está repetida.");
            }else{
                listaFiltro.add(palabra);
            }
        }
        
        System.out.println(listaFiltro);
    }
}
