/*
Realiza un programa en el que haya una variable entera llamada año inicializada con
cualquier valor positivo. El programa mostrará por pantalla si el año guardado en dicha variable es
bisiesto. Ten en cuenta que un año es bisiesto cuando se cumple alguna de estas dos condiciones:
    a) Es múltiplo de 400
    b) No es múltiplo de 400, pero es múltiplo de 4 y no es múltiplo de 100
 */
import java.util.*;
public class Ejercicio48 {
     public static void main(String[] a){
        System.out.print("Intriduce un año para saber si es bisiesto o no: ");
        int año = new Scanner(System.in).nextInt();
        
        if ((año % 400 == 0) || (año % 4 == 0) && (año % 100 != 0)){
            System.out.println("El año "+año+" es bisiesto.");
        }else{
            System.out.println("El año "+año+" no es bisiesto.");
        }
    }
}
