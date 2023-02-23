import bpc.daw.consola.*;
import java.awt.*;
/*

 */
public class ForAnidado {
    public static void main(String[] args) {
        Consola cons = new Consola();
        Graphics g = cons.getCapaCanvas().getGraphics();
        
        int x = 100;
        int y = 100;
        
        for(int i = 0; i<6;i++){
            for(int j = 0; j<4 ; j++)
            g.drawOval(x*i, y*j, 50, 50);
        }
        cons.getTeclado().leerCaracter();
        
    }
}
