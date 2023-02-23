
import java.util.*;
public class Ejercicio40 {
    public static void main(String[] a){
        System.out.println("Escribe un número: ");
        int num1 = new Scanner (System.in).nextInt();
        
        System.out.println("Escribe otro número: ");
        int num2 = new Scanner (System.in).nextInt();
        
        System.out.println("Escribe otro número: ");
        int num3 = new Scanner (System.in).nextInt();
        
        if (num1>num2 && num1>num3){
            System.out.println("El número mayor es el "+num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("El número mayor es el "+num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("El número mayor es el "+num3);
        }
        
    }
}
