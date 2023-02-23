
package clase.juegoDeNaves;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;

public class CacheImagenes {
    private static CacheImagenes instancia;
    private Map<String,Image> imagenes;
    
    private CacheImagenes(){
        this.imagenes = new HashMap<>();
        instancia = this;
    }
    
    public static CacheImagenes getInstancia(){
        if(instancia==null){
            instancia = new CacheImagenes();
        }
        return instancia;
    }
    
    public Image getImage(String archivo){
        Image img = null;
        if(imagenes.containsKey(archivo)){
            img = imagenes.get(archivo);
        }else{
            File f = new File(archivo);
            try {
                imagenes.put(archivo, img);
                img = ImageIO.read(f);
            } catch (IOException error) {
                 throw new IllegalArgumentException("Archivo no encontrado.");
            }
        }
        return img;
    }
}
