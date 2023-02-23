import java.util.*;
/*
Un problema muy importante en la programación es el de ordenar de menor a mayor
los números de una lista. Sigue los pasos de este ejercicio para ordenar un array usando un
método llamado “método de selección”, que consiste en recorrer todas las posiciones del
array, y por cada una, buscar en el resto del array el número más pequeño, intercambiándolo
con aquel en el que estamos situados. Sigue estos pasos:
     Crea un array con los números 50, 26, 7, 9, 15 y 27
     Recorre todas las posiciones entre la 0 y la última y llama “i” a dicho contador
     A continuación, recorre con un nuevo bucle las posiciones desde “i+1” hasta el final del
    array y busca el número más pequeño que hay en esa sección del array. Deberás
    conservar también la posición donde se encuentra ese número.
     Intercambia el número de la posición “i” con la del número más pequeño que
    encontraste en el punto anterior.
     Repite el proceso con todas las “i” y tendrás el array ordenado
     Gráficamente el proceso sería así: 
 */
public class Ejercicio45 {
    public static void main(String[] args) {
        int[] nums = {50,26,7,9,15,27 };
        int a = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                
            }
        }
    }    
}
