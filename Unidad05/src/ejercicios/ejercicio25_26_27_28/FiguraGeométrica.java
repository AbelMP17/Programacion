package ejercicios.ejercicio25_26_27_28;

import java.awt.*;

public interface FiguraGeométrica extends Coloreable{
    public double getArea();
    public int getPerimetro();
    public void dibujar(Graphics g);
    public default Cuadrado crearCuadradoIgualArea(Point esquinaSueperiorIzquierda){
        
    }
}
