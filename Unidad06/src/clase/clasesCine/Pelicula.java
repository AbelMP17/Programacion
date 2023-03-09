package clase.clasesCine;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

public record Pelicula(String titulo, String rutaFoto) {
    
    public Pelicula(String titulo){
        this(titulo, titulo+".jpeg");
    }
    public Image getFoto(){
        BufferedImage bI = null;
        try {
            bI = ImageIO.read(new File(rutaFoto));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return bI;
    }
}
