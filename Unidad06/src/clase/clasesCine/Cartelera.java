package clase.clasesCine;

import java.util.*;
import java.io.*;


public class Cartelera {
    public static List<Sala> cargarCartelera(String ruta) throws IOException{
        List<Sala> lista = new ArrayList<>();
        Scanner scan = new Scanner(new File(ruta));
        int i=0;
        while(scan.hasNextLine()){
            i++;            
            String l = scan.nextLine();
            String[] sp = l.split(";");
            
            int c = Integer.parseInt(sp[0]);
            String peli = sp[1];
            
            Sala s = new Sala(i, c, new Pelicula(peli));
            
            lista.add(s);
        }
        
        return lista;
    }
}
