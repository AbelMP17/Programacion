import java.util.*;
public class Ejercicio39 {
    public static void main(String[] a){
        System.out.println("Escribe un número: ");
        int num1 = new Scanner (System.in).nextInt();
        
        System.out.println("Escribe otro número: ");
        int num2 = new Scanner (System.in).nextInt();
        
        if (num1>num2){
            System.out.println("El primer número es mayor al segundo.");
        }else if(num1==num2){
            System.out.println("El primer número es igual al segundo.");

        }else{
            System.out.println("El primer número es menor al segundo.");
        }
        
    }
}
