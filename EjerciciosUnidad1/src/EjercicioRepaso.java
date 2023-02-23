
import java.util.Scanner;

/*

 */
public class EjercicioRepaso {
    public static void main(String[] args) {
        System.out.print("Escribe el precio del prodeucto: ");
        double precio = new Scanner (System.in).nextDouble();
        
        double euros = (int)precio;
        double centimos = (precio*100)%100;

        System.out.println(euros);
        System.out.println(centimos);
    }
}
