package clase.abstracta;

import java.awt.Color;

public class Bicilieta extends Vehiculo{
    private boolean timbre;

    public Bicilieta( Color c, boolean t) {
        super(1, 45, c);
        timbre= t;
    }
    @Override
    public void mover(int x, int y) {
        System.out.println("La bicicleta se mueve al punto: "+x+", "+y);
    } 
}
