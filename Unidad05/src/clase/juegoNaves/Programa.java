package clase.juegoNaves;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        System.out.println("""
                           Elige una nave:
                           1) Nave A.
                           2) Nave B.
                           3) Nave C.
                           
                           """);
        Nave player1 = null;
        int opc = new Scanner(System.in).nextInt();
        player1 = switch(opc){
            case 1 ->  new NaveA();
            case 2 -> new NaveB();
            case 3 -> new NaveC();
            default -> throw new IllegalArgumentException("Opcion no válida");
        };
        
        //======================================================================
        
        player1.disparar();
        player1.poderEspecial();
    }
}
