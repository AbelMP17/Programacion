/*
Calcula la suma de los cuadrados de los números comprendidos entre 5 y 13: 
5^2+6^2+7^2+8^2+9^2+10^2+11^2+12^2+13^2
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i = 5;i<=13;i++){
            
            int potencia = (int) Math.pow(i, 2);
            suma+=potencia;
            
        }
        System.out.println(suma);
    }
}
