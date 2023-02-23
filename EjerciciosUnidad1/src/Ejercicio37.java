import java.util.*;
public class Ejercicio37 {
    public static void main(String[] a){
        System.out.println("Escribe un número: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Escribe un número: ");
        int num2 = new Scanner(System.in).nextInt();
       
        int[] numeros = {num1,num2};
        
        //int[] numeros = {4,6};
        
        int suma = numeros[0]+numeros[1];
        System.out.println("Número 1º: "+numeros[0]);
        System.out.println("Número 2º: "+numeros[1]);
        System.out.println("Suma: "+suma);
        
    }
}
