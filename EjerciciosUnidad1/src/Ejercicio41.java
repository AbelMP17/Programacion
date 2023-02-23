import java.util.*;
public class Ejercicio41 {
    public static void main(String[] a){
    System.out.println("Escribe un número comprendido entre 10 y 56: ");
        int num = new Scanner (System.in).nextInt();
        
        if (num>=10 && num<=56){
            System.out.println("El número es correcto.");
        }else{
            System.out.println("El número es incorrecto");
        }
    }
}
