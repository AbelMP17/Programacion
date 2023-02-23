/*
En la librería Música se encuentran clases para reproducir una sencilla partitura
en un instrumento musical. Haz un programa que reproduzca en un piano la siguiente
canción. Modifica el programa para que al finalizar, se vuelva a reproducir con una guitarra. 
 */
import bpc.daw.musica.*;
public class Ejercicio31 {
    public static void main(String[] a){
        Cancion cancionJava = new Cancion("");
        Instrumento p = new Piano();
                
        NotaMusical blancaSol = new NotaMusical(4,1);
        NotaMusical negraDo = new NotaMusical(0,2);
        NotaMusical negraSol = new NotaMusical(4,2);
        NotaMusical negraLa = new NotaMusical(5,2);
        NotaMusical corcheaFa = new NotaMusical(3,3);
        NotaMusical corcheaMi = new NotaMusical(2,3);
        NotaMusical semicorcheaRe = new NotaMusical(1,4);
        NotaMusical semicorcheaMi = new NotaMusical(2,4);
        NotaMusical semicorcheaFa = new NotaMusical(3,4);
        
        cancionJava.añadir(negraDo);
        cancionJava.añadir(negraDo);
        cancionJava.añadir(negraSol);
        cancionJava.añadir(negraSol);
        cancionJava.añadir(negraLa);
        cancionJava.añadir(negraLa);
        cancionJava.añadir(blancaSol);
        cancionJava.añadir(corcheaFa);
        cancionJava.añadir(corcheaFa);
        cancionJava.añadir(corcheaMi);
        cancionJava.añadir(corcheaMi);
        cancionJava.añadir(semicorcheaRe);
        cancionJava.añadir(semicorcheaMi);
        cancionJava.añadir(semicorcheaFa);
        cancionJava.añadir(semicorcheaRe);
        cancionJava.añadir(negraDo);
        
        p.reproducir(cancionJava);
        
        Instrumento g = new Guitarra();
               
        g.reproducir(cancionJava);
    }
}
