import java.util.*;
public class Ejercicio26 {
    public static void main(String[] a){
        System.out.println("Escribe la nota final del examen: ");
        double notaFinal = new Scanner (System.in).nextDouble();

        boolean aprobado = notaFinal >= 5;
        boolean suspenso = notaFinal < 5;       
        System.out.println("¿Estás aprobado?: "+aprobado);
        System.out.println("¿Estás suspenso?: "+suspenso);
        
    }
    
}
