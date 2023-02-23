package clase.juegoNaves;

import java.awt.*;
public abstract class Nave {
    private int energia;
    private Point posicion;
    
    public Nave(){
        energia = 100;
        posicion = new Point(800,400);
    }
    
    public void moverArriba(){
        posicion.y--;
    }
    public void moverAbajo(){
        posicion.y++;
    }
    public void moverIzquierda(){
        posicion.x--;
    }
    public void moverDerecha(){
        posicion.x++;
    }
    public abstract void disparar();
    public abstract void poderEspecial();
}
