
import java.util.*;

/*
Haz un programa que pregunte un número al usuario y nos muestre por pantalla 
si es primo o no. De las dos formas que hay de hacer el ejercicio, elige la que más fácil te sea: 

1. Se generan todos los números desde 2 hasta el que hay antes del número. Si alguno de 
los números generados es un divisor, entonces ya sabemos que el número no es 
primo. En ese caso, se interrumpe la generación de números y hemos terminado. Si 
por el contrario no hay divisores, entonces el número es primo. 

2. Se generan todos los números desde 2 hasta el que hay antes del número y se cuenta 
en una variable auxiliar el número de divisores que se van encontrando. Si al finalizar 
el recorrido dicha variable es 0 el número es primo. 

 */
public class Ejercicio37 {

    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int num = new Scanner(System.in).nextInt();
        
        boolean hace = true;
        
        for (int i = 2;i<=num && hace; i++) {
            if (num % 2 == 1) {
                System.out.println("El numero es primo.");
                hace=false;
            }else{
                System.out.println("El numero no es primo.");
                hace=false;
            }
        }
        
    }
}
