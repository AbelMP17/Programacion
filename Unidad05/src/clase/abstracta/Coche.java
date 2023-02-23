package clase.abstracta;

import java.awt.Color;

public class Coche extends Vehiculo{
    private String matricula;
    private int potencia;
    public Coche(int numeroPasajeros, int vm, Color c, String m, int p) {
        super(numeroPasajeros, 120, c);
        this.matricula = m;
        this.potencia = p;
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("El coche se mueve al punto: "+x+", "+y);
    }    
}
