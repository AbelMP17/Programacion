import java.util.*;
public class Ejercicio14 {
    public static void main(String[] a){
    
        System.out.println("Escribe la cantidad de euros que quieras cambiar: ");
        double euros = new Scanner (System.in).nextDouble();
        
        double dolares = euros*0.98;
        double libras = euros*0.87;
        double yens = euros*129.98;
        double pesetas = euros*60;
        
        System.out.println("Dolares: "+euros+"€ = "+dolares+"$");
        System.out.println("Libras: "+euros+"€ = "+libras+"£");
        System.out.println("Yens: "+euros+"€ = "+yens+"	¥");
        System.out.println("Pesetas: "+euros+"€ = "+pesetas+"pts");

    }
}