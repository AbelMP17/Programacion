package ejercicios.ejercicio25_26_27_28;

import java.awt.*;

public class Rectangulo implements Apoyable, Centrable{
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    public Rectangulo(Point esi, Point eid, Color c){
        this.esquinaSuperiorIzquierda = esi;
        this.esquinaInferiorDerecha = eid;
        this.color = c;
    }

    @Override
    public int getLongitudBase() {
        
    }

    @Override
    public int getLongitudAltura() {
        
    }

    @Override
    public double getArea() {
        
    }

    @Override
    public int getPerimetro() {
    }

    @Override
    public void dibujar(Graphics g) {
        
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Point getCentro() {
        return new Point();
    }
}
