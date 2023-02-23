/*
Realiza un programa que pregunte al usuario por la ruta de un archivo del disco
duro. Si dicho archivo existe y es directorio, el programa dirá "La ruta introducida corresponde
a un directorio" y terminará sin hacer nada más. En caso de que sea un archivo, el programa
mostrará "La ruta introducida es un archivo de tamaño ... bytes. ¿Desea borrarlo (si/no)?". Si el
usuario introduce la palabra "si", el archivo se borrará y el ordenador mostrará si se ha
borrado correctamente o se ha producido un error al borrar. En caso de que el usuario escriba
cualquier otra cosa el programa responderá "Borrado cancelado" y finalizará.
 */
import java.io.*;
import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.print("Introduce la ruta de un archivo: ");
        String ruta = new Scanner (System.in).nextLine();
        File ruta1 = new File(ruta);
        
        if (ruta1.exists() && ruta1.isDirectory()){
            System.out.println("Es un directorio");
        }else if(ruta1.exists() && ruta1.isFile()){
            System.out.println("El tamaño del archivo es "+ruta1.length()+" Bytes");
            System.out.println("¿Desea borrarlo (si/no)?");
            String respuesta = new Scanner(System.in).nextLine();
            if(respuesta.equals("si")){
                boolean delete = ruta1.delete();
                System.out.println("Su archivo ha sido eliminado: "+delete);
            }else{
                    System.out.println("Su archivo no ha sido eliminado");
            }
        }else{
            System.out.println("Error");
        }
    }
}
