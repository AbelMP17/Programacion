import bpc.daw.reproductor.*;
import java.io.*;
public class Ejercicio33 {
    public static void main(String[] args){

        PlayList listaM = new PlayList();

        listaM.setTitulo("Lista de ejemplo");
        
        ArchivoMP3 cancion1 = new ArchivoMP3("/media/usuario/Abel 3.0/Programación/Route 66.mp3");
        ArchivoMP3 cancion2 = new ArchivoMP3("/media/usuario/Abel 3.0/Programación/Route 66.mp3");
        ArchivoMP3 cancion3 = new ArchivoMP3("/media/usuario/Abel 3.0/Programación/Route 66.mp3");
        
        String tituloCancion1 = cancion1.getTitulo();
        String autorCancion1 = cancion1.getAutor();
        
        String tituloCancion2 = cancion2.getTitulo();
        String autorCancion2 = cancion2.getAutor();
        
        String tituloCancion3 = cancion3.getTitulo();
        String autorCancion3 = cancion3.getAutor();
        
        /*Primer Metodo
        listaM.añadir(cancion1);
        listaM.añadir(cancion2);
        listaM.añadir(cancion3);
        */
        
        //Segundo metodo
        ArchivoMP3[] listaC = {cancion1,cancion2,cancion3};
        listaM.añadirVarias(listaC);
        
        
         try{
            String ruta = "/media/usuario/Abel 3.0/Programación/playlist.txt";
            listaM.guardar(ruta);
        }catch(IOException error){
            System.out.println("error");
        }

        Reproductor repro = new Reproductor(listaM, true, false); 
        System.out.println("Titulo1: "+tituloCancion1+"\nAutor: "+autorCancion1);
        System.out.println("Titulo2: "+tituloCancion2+"\nAutor: "+autorCancion2);
        System.out.println("Titulo3: "+tituloCancion3+"\nAutor: "+autorCancion3);
        repro.play();
        
        
    }
}