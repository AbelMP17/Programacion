/*
Realiza un programa que genere números enteros aleatorios entre 0 y 10 y los
muestre por pantalla. El programa terminará cuando el número generado sea el 10.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int numero = 0;
        while (numero !=10){
            numero = (int) (Math.random()*(0-11)+11);
            System.out.println(numero);
        }
        System.out.println("El programa a finalizado.");
        
    }
}
