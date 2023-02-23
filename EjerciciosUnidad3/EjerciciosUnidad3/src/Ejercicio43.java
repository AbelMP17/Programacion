
import java.util.*;

/*
Haz un programa que cree una tabla de 4 filas y 3 columnas rellenada con 
booleanos aleatorios. El programa mostrará la tabla en pantalla y después la recorrerá y nos 
dirá cuántos true y cuántos false hay en la tabla. 
 */
public class Ejercicio43 {
    public static void main(String[] args) {
        Random rnd = new Random(); 
        boolean[][] tabla = new boolean[4][3];
        
        int verdadero = 0;
        int falso = 0;
        
        for(int i = 0; i<tabla.length;i++){
            for(int j = 0; j<tabla[i].length;j++){
                tabla[i][j]=rnd.nextBoolean();
                System.out.print(tabla[i][j]+" ");
                if(tabla[i][j]==true){
                    verdadero++;
                }else{
                    falso++;
                }
            }
            
            System.out.print("\n");
        }
        
        System.out.println("True: "+verdadero);   
        System.out.println("False: "+falso);
        
    }
}
