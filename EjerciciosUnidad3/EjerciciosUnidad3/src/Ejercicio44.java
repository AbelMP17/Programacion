
import java.util.*;

/*

 */
public class Ejercicio44 {
    public static void main(String[] args) {
        System.out.print("Numero de filas: ");
        int filas = new Scanner (System.in).nextInt();
        
        System.out.print("Numero de columnas: ");
        int columnas = new Scanner (System.in).nextInt();
        
        int[][] tabla = new int[filas][columnas];
        
        int j = 0;
        
        for (int i = 0;i<tabla.length; i++){
            System.out.print(i);    
            for(j = 1;j<tabla[i].length; j++){
            System.out.print(j+i);    
            }
            System.out.println();
        }
    }       
}
