import java.util.*;
public class Ejercicio23 {
    public static void main (String[] a){
        System.out.println("Escribe la nota del 1er examen: ");
        double nota1 = new Scanner (System.in).nextDouble();
        System.out.println("Escribe la nota del 2º examen: ");
        double nota2 = new Scanner (System.in).nextDouble();
        System.out.println("Escribe la nota del 3er examen: ");
        double nota3 = new Scanner (System.in).nextDouble();
        
        double media = (nota1+nota2+nota3)/3;
        
        boolean aprobado = media >= 5;
               
        System.out.println("¿Estás aprobado?: "+aprobado);
        
        
    }
}
