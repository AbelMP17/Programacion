/*
Realiza un programa con la librería de Mario Bros en el que haya dos cañones. Haz que el primero dispare dos veces y el segundo tres. Pregunta a los dos cañones cuántas veces
han disparado y muestra dichos valores por pantalla.
 */
import bpc.daw.mario.*;
public class Ejercicio05 {
    public static void main(String[] a){
        Cañon c1 = new Cañon(800,300);
        Cañon c2 = new Cañon(800,400);
        c1.disparar(10, 300);
        c1.disparar(10, 330);
        c2.disparar(10, 400);
        c2.disparar(10, 430);
        c2.disparar(10, 460);

        int disparos = c1.getTotalDisparosRealizados();
        int disparos2 = c2.getTotalDisparosRealizados();

        System.out.println("Cañon 1: "+disparos+"\nCañon 2: "+disparos2);

    }
}
