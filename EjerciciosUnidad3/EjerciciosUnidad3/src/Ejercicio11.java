
import java.util.Scanner;

/*
Creamos dos variables de tipo double llamadas S y A, y les damos valor inicial uno.
Actualizamos S con la siguiente fórmula:
Si el valor absoluto de la diferencia entre S y A es menor de 0.000001 entonces ya
hemos terminado y la raíz cuadrada aproximada es S. En caso contrario, le damos a A
el valor de S y repetimos el proceso a partir del punto anterior.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        
        System.out.println("Escribe un numero: ");
        double n = new Scanner(System.in).nextInt();
       
                double a = 1;
                double s = 1;
                s = (0.5)*(a+(n/a)); 
            
            while(Math.abs(a-s)>0.000001){
                
                a=s;
                s = (0.5)*(a+(n/a)); 
                
            }
            
        System.out.println("Resultado de la raíz cuadrada: "+s);
        
        
        
        
        
    }
}
