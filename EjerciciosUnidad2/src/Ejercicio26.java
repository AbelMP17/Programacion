
import java.util.*;

/*
Consulta el pdf de la “Librería Estándar de Java” y busca la clase Thread. Realiza
un programa que pregunte al usuario “¿cuántos segundos quiere esperar?”. El usuario
escribirá un número entero y el programa hará una pausa de dicha cantidad de segundos.
Pasado ese tiempo se mostrará el mensaje “Programa finalizado”.
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("¿cuántos segundos quiere esperar?");
        long num = new Scanner (System.in).nextLong();
        
        try{
            Thread.sleep(num*1000);
            System.out.println("Programa finalizado.");
        }catch(InterruptedException error){
            System.out.println("Error");
        }
        
    }
}
