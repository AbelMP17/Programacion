import java.util.*;
public class Ejercicio11 {
    public static void main (String[] a){
        System.out.println("Escribe tu primer apellido:");
        String primerApellido = new Scanner (System.in).nextLine();
        System.out.println("Escribe tu segundo apellido:");
        String segundoApellido = new Scanner (System.in).nextLine();
        System.out.println("Escribe tu Nombre:");
        String nombre = new Scanner (System.in).nextLine();

        System.out.println(primerApellido+" "+segundoApellido+", "+nombre);

    }

}
