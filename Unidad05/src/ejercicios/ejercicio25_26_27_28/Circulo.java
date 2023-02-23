package ejercicios.ejercicio25_26_27_28;

import java.awt.*;

public class Circulo implements FiguraGeométrica, Centrable{
    private Point centro;
    private int radio;
    private Color color;
    
    public Circulo(Point centro, int radio, Color color){
        this.centro = centro;
        this.radio = radio;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public int getPerimetro() {
        return (int)(2*Math.PI*radio);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.drawOval(getCentro().x, getCentro().y, radio*2, radio*2);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Point getCentro() {
        return centro;
    }
}
