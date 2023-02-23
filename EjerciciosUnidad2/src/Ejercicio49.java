/*
En la librería “Efecto Imagen” se encuentra la clase EfectoBuilder, que sirve para
aplicar efectos a una imagen. Consulta su documentación y realiza un programa que haga esto:
     Pregunte al usuario la ruta de un archivo con una imagen
     Utiliza la clase ImageIO de la librería “java 2d” para cargar la imagen
     Utiliza la clase EfectoImagen para aplicar, en este orden, los efectos “invertir”, “blurred” y “escala de grises” a la fotografía.
     Cuando hayas terminado de aplicar los efectos, muestra una ventana en la que se vea
    la imagen final.
 */
import java.awt.image.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import daw.efectoimagen.*;
public class Ejercicio49 {
    public static void main(String[] args) throws IOException {
        
        try {
        System.out.print("Escribe la ruta en la que se encuentra el directorio de la imagen: ");
        String ruta = new Scanner (System.in).nextLine();
        
        File archivo = new File(ruta);
        
        BufferedImage imagen = ImageIO.read(archivo);
        
        EfectoBuilder efectos = new EfectoBuilder(imagen);
                
        efectos.aplicarEfecto(2763);

        efectos.aplicarEfecto(2730);
        
        efectos.aplicarEfecto(2748);
        
        efectos.build();
        }catch (IOException error){
            System.out.println("La ruta de la imagen no ha sido encontrada.");

        }
        
        
    }
}
