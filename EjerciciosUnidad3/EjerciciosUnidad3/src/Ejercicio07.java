
import java.util.Scanner;

/*
Según el reglamento de la federación de caza, un cazador no puede cazar más
piezas de las que se permiten en un día. Queremos hacer un programa que nos lleve la cuenta
de piezas cazadas e indique cuando se ha excedido el límite. Para ello primero se leerá por
teclado el límite del día y a continuación los valores de las piezas cazadas en el orden que se
obtienen. El programa imprimirá un mensaje en el momento en que el límite haya sido
excedido. Después de que cada pieza ha sido registrada, el programa mostrará el número total
de piezas que se llevan hasta ese momento cazadas. Ejemplo:
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        System.out.print("Escribe el limite del dia: ");
        int limite = new Scanner(System.in).nextInt();

        int contador = 0;

        while (limite > contador) {
            System.out.println("Limite de caza del dia: " + limite);
            System.out.println("Escribe cuantos animales has cazado: ");
            int caza = new Scanner(System.in).nextInt();

            contador += caza;

            if (contador > limite) {
                System.out.println("Has superado el limite del dia.");

            } else {
                System.out.println("LLevas " + contador + " piezas cazadas de " + limite + " piezas como limite.");
            }
        }

    }
}
