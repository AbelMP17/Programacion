/*
Haz un programa que pregunte al usuario por su dirección de correo y la
descomponga en su nombre de usuario y su dominio.
 */
import java.util.*;
public class Ejercicio18 {
    public static void main(String[] a) {
        System.out.println("Escribe tu correo electrónico: ");
        String nombreCorreo = new Scanner(System.in).nextLine();
        
        int determinante = nombreCorreo.indexOf("@");
        
        String nombre = nombreCorreo.substring(0,determinante);
        System.out.println("Nombre: "+nombre);
        
        String dominio = nombreCorreo.substring(determinante+1);
        
        System.out.println("Dominio: "+dominio);
    }

}
