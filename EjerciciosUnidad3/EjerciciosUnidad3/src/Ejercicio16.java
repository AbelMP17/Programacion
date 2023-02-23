
import bpc.daw.consola.Consola;
import java.awt.*;
import java.util.Random;
/*
Haz un programa que dibuje en la pantalla 8 rectángulos cuyas coordenadas,
dimensiones y color sean aleatorios.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Consola cons = new Consola();
        for (int i = 0; i < 8; i++) {
            Random rnd = new Random();
            int x = Toolkit.getDefaultToolkit().getScreenSize().width;
            int y = Toolkit.getDefaultToolkit().getScreenSize().height;
            
            int x2 = rnd.nextInt(0, x);
            int y2 = rnd.nextInt(0, y);
            
            int w =  rnd.nextInt(0, x);
            int h =  rnd.nextInt(0, y);
            
            int r = rnd.nextInt(0,256);
            int g = rnd.nextInt(0,256);
            int b = rnd.nextInt(0,256);
            Color cl = new Color(r, g, b);
            
            Graphics rect = cons.getCapaCanvas().getGraphics();
            rect.fillRect(x2, y2, w, h);
            rect.setColor(cl);

        }
        cons.getTeclado().leerCaracter();
    }
}
