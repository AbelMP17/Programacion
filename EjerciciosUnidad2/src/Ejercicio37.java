import java.util.Scanner;
/*
Consulta el pdf de la “Librería Estándar de Java” y busca la clase Integer, que está
en la hoja de “clases envoltorio”. Haz un programa que pregunte al usuario por teclado un
número. El programa mostrará ese número escrito en binario y hexadecimal.
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        int num = new Scanner(System.in).nextInt();
        
        String bin = Integer.toBinaryString(num);
        String hex = Integer.toHexString(num);
        
        System.out.println("Binario: "+bin+"\nHexadecimal: "+hex);
        
        
    }
}
