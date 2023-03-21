package clase.abstracta;

import java.awt.*;

public class Programa {
    public static void main(String[] args) {
        Vehiculo v = new Coche(5,200,Color.WHITE,"1111aaa",120);
        Vehiculo v2 = new Bicilieta(Color.red, true);
        v.mover(new Point(10, 10));
        v2 .mover(new Point(20, 20));        
    }
}
