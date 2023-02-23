package clases.repaso.CatalogoTitulos;

import java.io.*;
import java.util.*;

public class CatalogoTitulosArchivos implements CatalogoTitulos{
    private String ruta;
    private List<Titulo> titulos;
    
    public CatalogoTitulosArchivos(String ruta) throws IOException{
        this.ruta = ruta;
        this.titulos = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(this.ruta));
        String lineas = "";
        while(br.lines() != null){
            lineas = br.readLine();
            Titulo t = this.extraerTitulo(lineas);
            titulos.add(t);
        }
        br.close();
        
    }
    
    private Titulo extraerTitulo(String linea){
        String[] s = linea.split(";");
        return new TituloArchivo(s[0], s[1], s[2], Estado.values()[Integer.parseInt(s[3])]);
    }

    @Override
    public List<Titulo> getTitulos() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return titulos;
    }

    @Override
    public boolean guardar() {
        boolean hacer = false;
        try {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            PrintWriter pr = new PrintWriter(ruta);
            for(Titulo t : titulos){
                pr.println(t.toString());
                pr.close();
            }
            hacer = true; 
        } catch (FileNotFoundException error) {
            System.out.println(error);
        }
        return hacer;
    }

    @Override
    public boolean anadirTitulo(String dni, String nombre, String estudios, Estado estado) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return titulos.add(new TituloArchivo(dni, nombre, estudios, estado));
    }
}
