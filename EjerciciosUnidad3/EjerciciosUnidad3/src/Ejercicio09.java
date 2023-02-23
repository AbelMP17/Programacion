/*
Usa la Consola DAW para realizar un programa que pregunte al usuario "¿Cuántos
círculos desea dibujar?". El usuario escribirá un número entero (si el número es incorrecto o
negativo, el programa dirá "Número incorrecto" y finalizará sin hacer nada más) y la pantalla
se borrará y se dibujarán tantos círculos como haya indicado el usuario. Cada círculo tendrá un
color con valores RGB aleatorios entre 0 y 255, y sus coordenadas también serán aleatorias
entre (0,0) y la resolución de la pantalla.
 */
import bpc.daw.consola.*;
import java.awt.*;
import java.util.*;

public class Ejercicio09 {
    public static void main(String[] args) {
        Consola cons = new Consola();
        
        cons.getCapaTexto().println("Escribe el numero de cirulos que desea dibujar en pantalla: ");
        int num = cons.getTeclado().leerNumeroEntero();
        
        int i = 0;

        
        
       if (num<=0){
                cons.getCapaTexto().println("Número incorrecto");
                cons.getTeclado().leerCaracter();
            }else{
                while(i!=num){
                    
                    int x = Toolkit.getDefaultToolkit().getScreenSize().width;
                    int y = Toolkit.getDefaultToolkit().getScreenSize().height;
                    
                    Random rnd = new Random();

                    int r = rnd.nextInt(0, 255);
                    int g = rnd.nextInt(0, 255);
                    int b = rnd.nextInt(0, 255);
                    int x1 = rnd.nextInt(0, x);
                    int y1 = rnd.nextInt(0, y);

                    Color col = new Color(r, g, b);

                    Graphics crl = cons.getCapaCanvas().getGraphics();
                    crl.fillOval(x1, y1, 90, 90);
                    crl.setColor(col);
                    
                    cons.getCapaTexto().cls();
                    
                    i++;
                   
                } 
                cons.getTeclado().leerCaracter();
            }
        
    }
}
