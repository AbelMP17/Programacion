/*
Con el bloc de notas haz un archivo llamado palabras.txt y rellénalo con las 10 
palabras que tú quieras. A continuación, haz un programa que abra ese archivo y lea todas las 
palabras del archivo, guardándolas en un List<String>. Por último, recorre ese List<String> 
usando un for mejorado y muestra cada palabra en pantalla. 
 */
import java.io.*;
import java.util.*;
public class Ejercicio52 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        String fila = "";
        try{
            File archivo = new File("E:\\Programación\\EjerciciosUnidad3\\EjerciciosUnidad3\\src\\Ej52.txt");
            BufferedReader r = new BufferedReader(new FileReader(archivo));
            boolean repetir = true;
            while(repetir){
                String linea = r.readLine();
                if(linea!=null){
                    lista.add(fila);
                }else{
                    repetir = false;
                }
            }
            
        }catch(IOException error){
            System.out.println(error);
        }
        
        for(String palabra : lista){
            System.out.println(palabra);
        }
        
    }
}
