
package ejercicios.ejercicio13_14_15_16;

import bpc.daw.consola.*;
import java.awt.*;

public class Programa {
    public static void main(String[] args) {
        GeneradorContraseñasRaras g = new GeneradorContraseñasRaras();
        System.out.println(g.generarContraseña(9));
    }
}
