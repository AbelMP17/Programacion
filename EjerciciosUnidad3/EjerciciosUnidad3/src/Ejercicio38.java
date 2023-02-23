
import java.util.*;

/*
Realiza un programa que pregunte al usuario una cadena de caracteres con su 
NIF. El programa deberá analizarla y decir si se trata de un NIF correcto o incorrecto. Un NIF 
correcto está formado por 8 dígitos y una letra. Los dígitos deben estar comprendidos entre 0 
y 9 y la letra debe calcularse tal y como se indica en un ejercicio del tema 1.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        System.out.print("Introduce tu NIF: ");
        String nif = new Scanner (System.in).nextLine();
        char lista[] = {'T','R','W','A','G','M'
                ,'Y','F','P','D','X','B','N','J'
                ,'Z','S','Q','V','H','L','C','K'
                ,'E','T'};
        
        char letra = nif.charAt(8);
        
        String nums2 = nif.substring(0,8);
        
        int numeros = Integer.parseInt(nums2);
        
        int resto = numeros%23;
        

            if(letra==lista[resto]){
                System.out.println("Es un NIF correcto");

            }else{
                System.out.println("Es un NIF incorrecto");
            }

    }
}
