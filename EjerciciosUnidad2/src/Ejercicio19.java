/*
Consulta el pdf de la librería “java io” y encuentra la clase File. Realiza un
programa que pregunte al usuario por teclado la ruta de un archivo. El programa deberá decir
cuántos bytes y cuántos megabytes ocupa en el disco duro.
*/
import java.io.*;
import java.util.*;
public class Ejercicio19 {
    public static void main(String[] a) {
        System.out.println("Escribe la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File archivo = new File(ruta);
  
        if (archivo.exists()){
            System.out.println("El tamaño del archivo en Bytes: \n"+archivo.length());
            double pasarMB = archivo.length()/(1024*1024);
            System.out.println("El tamaño del archivo en MBytes: \n"+pasarMB);
        }else{
            System.out.println("No existe.");
        }
    }

}
