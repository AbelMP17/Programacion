import java.util.*;
public class Ejercicio43 {
    public static void main (String[] a){
        System.out.println("Escribe un número: ");
        int num = new Scanner (System.in).nextInt();
        
        if (num%2 == 0){
            System.out.println("Estes número "+num+" es par.");
        }else{
            System.out.println("Estes número "+num+" es impar.");
        }
        
        
    }
}
