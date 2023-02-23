/*
Haz un programa en el que haya una variable String llamada “clave” con el texto
que tú quieras. A continuación, el programa pedirá que introduzcas una contraseña por
teclado. El ordenador mostrará si la variable “clave” coincide con la contraseña introducida.
 */
import java.util.*;
public class Ejercicio15 {
    public static void main(String[]a){
        System.out.println("Escribe una contraseña: ");
        String clave = new Scanner(System.in).nextLine();
        
        System.out.println("Repite la contraseña: ");
        String clave2 = new Scanner(System.in).nextLine();
        
        if(clave.equals(clave2)){
            System.out.println("La contraseña coincide.");
        }else{
            System.out.println("Has escrito mal la contraseña.");
        }
        
    }
    
}
