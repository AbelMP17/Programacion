package clase.abstracta;

import java.awt.*;

import clase.clasesAnonimas.Bicilieta;

public class Programa {
    public static void main(String[] args) {
        Vehiculo v = new Coche2(5,200,Color.WHITE,"1111aaa",120);
        Vehiculo v2 = new Bicilieta(Color.red, true);
        v.mover(new Point(10, 10));
        v2 .mover(new Point(20, 20));        
    }
}
