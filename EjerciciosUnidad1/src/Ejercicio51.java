/*

 */
import java.util.*;
public class Ejercicio51 {
    public static void main(String[] a){
        System.out.println("Escribe el numero de tu DNI: ");
        int numDNI = new Scanner (System.in).nextInt();
        
        char lista[] = {'T','R','W','A','G','M'
                ,'Y','F','P','D','X','B','N','J'
                ,'Z','S','Q','V','H','L','C','K'
                ,'E','T'};
        int resto = numDNI%23;
        
        System.out.println("La letra de tu DNI es: "+lista[resto]);
        
    }
}
