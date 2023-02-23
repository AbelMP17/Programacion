
import java.util.*;

/*
Realiza un programa en el que haya una variable llamada "contraseña" iniciada
con el valor que tú quieras. A continuación el programa pedirá al usuario que introduzca la
contraseña. El usuario solo tiene 5 intentos para ponerla bien. En caso de que el usuario la
acierte, el programa dirá "Acceso permitido". Si se agotan los intentos, se mostrará "Acceso
denegado". En todo momento el programa mostrará el número de intentos restantes.
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        String contraseña = "12345";
                        
        int intentos = 5;
        
        for (int i= 0;i<5;i++){
            
            System.out.print("Introduce la contraseña: ");
            String cont = new Scanner (System.in).nextLine();
            
            if (!cont.equals(contraseña)){
                System.out.println("Acceso denegado prueba de nuevo.");
                intentos--;
                System.out.println("Intentos restantes: "+intentos);
            }else{
                System.out.println("Acceso permitido.");
                i=6;
            }           
        }
        if(intentos==0){
            System.out.println("Acceso denegado definitivamente");
        }
        
    }
}
