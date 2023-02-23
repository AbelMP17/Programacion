package com.ieshlanz.titulos.clases;

import java.io.*;
import java.util.*;

public class CatalogoTitulosArchivos implements CatalogoTitulos{
    private String ruta;
    private List<Titulo> titulos;
    
    public CatalogoTitulosArchivos(String ruta) throws IOException{
        this.ruta = ruta;
        BufferedReader br = new BufferedReader(new FileReader(this.ruta));
        String lineas = "";
        while(br.lines() != null){
            lineas = br.readLine();
            Titulo t = this.extraerTitulo(lineas);
            this.titulos.add(t);
        }
        br.close();
    }
    
    private Titulo extraerTitulo(String linea){
        String[] parte = linea.split(";");
        return new TituloArchivo(parte[0],parte[1], parte[2], Estado.values()[Integer.parseInt(parte[3])]);
    }
    
    @Override
    public List<Titulo> getTitulos() {
       return titulos;
    }

    @Override
    public boolean guardar() {
        boolean hacer = false;
        try{
            PrintWriter pr = new PrintWriter(ruta);

            for(Titulo a : titulos){
                pr.println(a.toString());
                pr.close();
            }
            hacer = true;
        }catch(IOException error){
            System.out.println(error);
        }  
        return hacer;
    }

    @Override
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado) {
        return titulos.add(new TituloArchivo(dni, nombre, estudio, estado));
    }
    
}
