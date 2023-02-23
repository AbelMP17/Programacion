import java.io.*;
import java.util.Scanner;
/*
Ejercicio 1 pero con el switch mejorado
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.print("Elige entre estas dos opciones (1-Escribir dos frases en un archivo. 2-Leer dos frases del archLivo): ");
        int opcion = new Scanner (System.in).nextInt();
        
        //String ruta = "/media/usuario/Abel 3.0/Programación/EjerciciosUnidad3/texto.txt";
        File ruta = new File("E:\\Programación\\EjerciciosUnidad3\\texto.txt");
        switch (opcion){
            case 1 -> { 
            System.out.println("Escribe una frase: ");
            String frase1 = new Scanner (System.in).nextLine();
            
            System.out.println("Escribe otra frase: ");
            String frase2 = new Scanner (System.in).nextLine();

                try(PrintWriter fichero2 = new PrintWriter(ruta)){
                    fichero2.print(frase1+" "+frase2);
                }catch(IOException error){
                    System.out.println("Error 1");
                }

            }
            
            case 2-> { 
            try{
                Scanner frase = new Scanner (ruta);
                System.out.println(frase.nextLine());
            }catch(FileNotFoundException error){
                System.out.println("Error 2");
            }
                
           
            }
        }
      
        
    }
}