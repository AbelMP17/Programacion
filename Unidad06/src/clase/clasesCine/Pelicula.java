package clase.clasesCine;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;
import javax.swing.JOptionPane;

public record Pelicula(String titulo, String rutaFoto) {
    
    public Pelicula(String titulo){
        this(titulo, titulo+".jpg");
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
