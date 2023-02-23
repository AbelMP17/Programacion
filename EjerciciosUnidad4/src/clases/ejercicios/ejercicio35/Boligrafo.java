package clases.ejercicios.ejercicio35;

import java.awt.*;
import bpc.daw.consola.*;
import java.util.*;

public class Boligrafo {
    private static final Color[] COLORES = {Color.red,Color.green,Color.blue,Color.white,Color.yellow};
    private int color;
    private CapaTexto ct;
    
    public Boligrafo(CapaTexto ct){
        this.color = 0;
        this.ct = ct;
    }
    
    public void setColor(int n){
        ct.setColorTexto(COLORES[n]);
    }
    
    public void escribir(String texto){

        ct.print(texto);
    }
    
    public void escribirGuay(String texto){
        Random r = new Random();
        String letra = "";
        for (int i = 0;i<texto.length();i++) {
                letra = texto.substring(i);
            this.escribir(letra);
        }       
        
    }
}
