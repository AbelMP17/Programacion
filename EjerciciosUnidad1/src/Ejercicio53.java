/*
Un equipo de 7 amigos futbolistas llamados Pedro, Luis, Miguel, Jorge, Juan, Manolo y
Pepe echa a suerte quien se pone de portero. Para eso, todos sacan a la vez la mano y se cuenta el
número de dedos que ha sacado cada uno. Entonces, se va contando de uno en uno y al que le
toque, se pone de portero. Si al llegar al último jugador no se ha terminado, se sigue contando
comenzando por el primero.
    Realiza un programa que muestre por pantalla el nombre del jugador que se pone de portero
    si el número de dedos que ha sacado cada amigo es:
 */
public class Ejercicio53 {
    public static void main(String[] a){
        String[] nombres = {"Pedro","Luis","Miguel","Jorge","Juan","Manolo","Pepe"};
        int[] num = {4,5,1,0,3,2,3};
        
        int longitud = nombres.length;
        
        int sumaDedos = num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6];
        
        int vuelta2 = sumaDedos%longitud;
        
        System.out.println("El portero es "+nombres[vuelta2]);
    }
}
