package ejercicios.ejercicio09;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Adivinanza a = new Adivinanza("¿Que tiene el rey en la panza?", "ombligo");
        System.out.println(a.getEnunciado());
        String respuesta = new Scanner(System.in).nextLine();
        a.comprobar(respuesta);
    }
}
