import bpc.daw.consola.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
/*
     Haz que las imágenes se alternen de forma aleatoria en tres zonas de la pantalla.

     Al pulsar la tecla 1, se detendrá la imagen de la primera casilla

     Al pulsar la tecla 2, se detendrá la imagen de la segunda casilla

     Al pulsar la tecla 3, se detendrá la imagen de la tercera casilla

     Cuando las tres casillas estén detenidas, se mostrará el premio obtenido por el usuario

     Realiza el programa para que tenga fácil mantenimiento, esto es, si queremos
    modificar los premios o añadir más combinaciones de premios, queremos que sea
    sencillo hacerlo sin tocar muchas líneas del programa. 
 */
public class Ejercicio50 {
    public static void main(String[] args) {
        Consola c = new Consola();
        CapaCanvas cC = c.getCapaCanvas();
        Graphics gr = cC.getGraphics();
        CapaTexto cT = c.getCapaTexto();
        
        Random rnd = new Random();
        
        int ancho = 100;
        int alto = 100;
        
        int x = 680;
        
        int pos1 = 300;
        int pos2 = pos1+alto;

        boolean  parar = true;
        
        int acum = 0;
        
        try{
           
            for(int h = 0;parar;h++){
                
                File her = new File("E:\\Programación\\EjerciciosUnidad3\\EjerciciosUnidad3\\src\\herradura.png");
                Image herradura = ImageIO.read(her);
                
                File b = new File("E:\\Programación\\EjerciciosUnidad3\\EjerciciosUnidad3\\src\\bar.jpg");
                Image bar = ImageIO.read(b);
                
                File camp = new File("E:\\Programación\\EjerciciosUnidad3\\EjerciciosUnidad3\\src\\campana.png");
                Image campana = ImageIO.read(camp);
                
                File cer = new File("E:\\Programación\\EjerciciosUnidad3\\EjerciciosUnidad3\\src\\cereza.png");
                Image cereza = ImageIO.read(cer);
                
                for(int i = 0;i<4;i++){           
                    gr.drawImage(herradura, x, pos1+alto*acum,ancho,alto, null);
                    gr.drawImage(herradura, x+ancho, pos1+alto*acum,ancho,alto, null);
                    gr.drawImage(herradura, x+ancho*2, pos1+alto*acum,ancho,alto, null);
                    Thread.sleep(500);
                    cC.cls();
                    acum++;
                }
                acum = 0;
            }
            
            c.getTeclado().leerCaracter();
            
        }catch(IOException | InterruptedException error){
            System.out.println(error);
        }       
        
        
    }
}
