/*
En la librería ReproductorMúsica.jar se encuentran clases para reproducir
archivos mp3 y crear listas de reproducción que pueden guardarse en el disco. Su diagrama de
clases y documentación vienen en el pdf que acompaña la librería. Realiza un programa que
reproduzca en segundo plano (asíncrona) un archivo mp3 que tengas en tu disco duro. Una vez
comenzada la reproducción, se mostrará el título de la canción, su autor y su duración. 

 */
import bpc.daw.reproductor.*;
public class Ejercicio32 {
    public static void main(String[] a){
        
        PlayList listaM = new PlayList();
        listaM.setTitulo("Musicotes");
        String ruta = "/media/usuario/Abel 3.0/Programación/Route 66.mp3";
        ArchivoMP3 cancion = new ArchivoMP3(ruta);
        listaM.añadir(cancion);
        
        Reproductor repro = new Reproductor(cancion,false,false);       
        
        String tituloCancion = cancion.getTitulo();
        String autorCancion = cancion.getAutor();
        long duracionCancion = cancion.getDuracion();
        repro.play();
        System.out.println("Titulo: "+tituloCancion+"\nAutor: "+autorCancion+"\nDuración: "+duracionCancion);
        
    }
}
