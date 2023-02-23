/*
Como ya sabes, una dirección de correo tiene el formato nombre@dominio.
Realiza un programa que pregunte al usuario su nombre y después su dominio. En caso de que
el dominio termine en .com o .es, el programa el programa formará una nueva variable
llamada “correo” a partir de ellos y la mostrará por pantalla. En caso contrario, mostrará un
mensaje de error “El dominio es incorrecto”.
 */
import java.util.*;
public class Ejercicio17 {
    public static void main(String[] a) {
        System.out.println("Escribe tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();

        System.out.println("Escribe el dominio de tu correo: ");
        String dominio = new Scanner(System.in).nextLine();

        int com = dominio.lastIndexOf(".com");
        int es = dominio.lastIndexOf(".es");
        
        if (com!=-1 || es!=-1){
            String correo = nombre+"@"+dominio;
            System.out.println("Tu correo es: "+correo);
        }else{
            System.out.println("Has puesto mal algo");
        }
        
    }
}
