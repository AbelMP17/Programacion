import java.util.*;
public class Ejercicio13 {
    public static void main(String[] a){
    
        System.out.println("Escribe las horas: ");
        int hora = new Scanner (System.in).nextInt();
        System.out.println("Escribe los minutos: ");
        int minuto = new Scanner (System.in).nextInt();
        System.out.println("Escribe los segundos: ");
        int segundo = new Scanner (System.in).nextInt();
        
        int segundosUno = hora*3600;
        int segundosDos = minuto*60;
        int segundosTotales = segundosUno+segundosDos+segundo;
        
        System.out.println("Las horas expresadas anteriormente son "+segundosUno+" segundos.");
        System.out.println("Los minutos expresados anteriormente son "+segundosDos+" segundos.");
        System.out.println("En total son "+segundosTotales+" segundos.");

    }
}

