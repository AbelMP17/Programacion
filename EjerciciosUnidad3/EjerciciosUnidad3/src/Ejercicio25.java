/*
Haz un programa en el que haya un array rellenado con 5000 ceros. A 
continuación el programa modificará las posiciones impares y guardará un 1 en ellas. Al 
terminar, se mostrarán todos los números del array en pantalla. 
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        int[] lista = new int[5000];
        for(int i = 0;i<lista.length;i++){
            if(i % 2==1){
                lista[i]=1;
            } 
            System.out.println(lista[i]);
        }
        
    }
}
