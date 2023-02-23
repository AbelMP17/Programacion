
import bpc.daw.consola.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

/*
Usa la Consola DAW para hacer un programa que pregunte al usuario por la ruta de
una imagen y la ponga como imagen de fondo. El programa entonces preguntará "¿Desea
poner otra imagen?". Si el usuario pulsa la tecla S, se repetirá el proceso, y si pulsa cualquier
otra tecla, finalizará.
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        Consola cons = new Consola();
        
        boolean repetir = true;
        
        while (repetir){
            
            CapaTexto textoPantalla = cons.getCapaTexto();

            Fondo f = new FondoColorSolido(Color.blue);
            cons.getCapaFondo().setFondo(f);

            textoPantalla.setColorTexto(Color.yellow);       

            cons.getTeclado().setTipoCursor(Teclado.CURSOR_LINEA);
            
            cons.getCapaTexto().println("");
            
            cons.getCapaTexto().println("Escribe una ruta de una imagen: ");
            String ruta = cons.getTeclado().leerCadenaCaracteres();

            File archivo = new File(ruta);

            try{

                BufferedImage imagen = ImageIO.read(archivo);
                FondoImagen imagen2 = new FondoImagen(imagen);
                cons.getCapaFondo().setFondo(imagen2);
                imagen2.setEscalado(true);
                
            }catch(IOException error){
                cons.getCapaTexto().println( "error");
            }
            
            cons.getCapaTexto().println("¿Desea poner otra imagen? ");    
            String respuesta = cons.getTeclado().leerCadenaCaracteres();
            
            if(respuesta.equalsIgnoreCase("no")){
                repetir = false;
            }


        }
        
    }
}
