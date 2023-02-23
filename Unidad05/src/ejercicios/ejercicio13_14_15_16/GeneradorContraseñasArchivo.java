package ejercicios.ejercicio13_14_15_16;

import java.io.*;
import java.util.*;
public class GeneradorContraseñasArchivo extends GeneradorContraseñas{
    private File archivo;
    
    public GeneradorContraseñasArchivo(String ruta){
        archivo = new File(ruta);
    }
    public GeneradorContraseñasArchivo(String ruta, Random r){
        super(r);
        archivo = new File(ruta);
    }
    @Override
    public String generarContraseña(int longitud){
        String psw = super.generarContraseña(longitud);
        try{
            FileWriter fw = new FileWriter(archivo,true);
            fw.write(psw+"\n");
            fw.close();
        }catch (IOException error){
            System.out.println(error);
        }
        
        return psw;
    }
}
