/*
En los ciclos de Formación Profesional, un alumno que falte más de un 20% de las horas
de clase pierde el derecho a la evaluación continua.

    · Realiza un programa que muestre por pantalla la cantidad máxima de faltas permitidas para
    cada una de estas asignaturas

    · Haz que el programa pregunte al usuario por el número de faltas de un alumno en redes y
    nos muestre si el alumno ha superado o no la cantidad de faltas indicada.
 */
import java.util.*;
public class Ejercicio31 {
    public static void main(String[] a){
        
        final int horasLM = 128;
        final int horasR = 192;
        final int horasH = 96;
        
        double faltasPermitidasLM = 0.2*horasLM; 
        double faltasPermitidasR = 0.2*horasR; 
        double faltasPermitidasH = 0.2*horasH; 
        
        System.out.println("- Faltas permitidas en: \n  · Lenguaje de Marcas: "+faltasPermitidasLM+"\n  · Redes: "+faltasPermitidasR+"\n  · Hardware: "+faltasPermitidasH);System.out.print("Escribe el número de faltas que has tenido en Redes: ");
        int faltas = new Scanner(System.in).nextInt();

        if (faltas>faltasPermitidasR){
            System.out.println("Has superado el limite de faltas.");
        }else{
            System.out.println("Estas dentro del limite de faltas.");

        }
    }
}
