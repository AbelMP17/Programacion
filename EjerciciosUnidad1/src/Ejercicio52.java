/*
Estamos haciendo un programa de loterías y tenemos dos variables llamadas número y
NúmeroPremiado, que se encuentran inicializadas con números de 5 cifras. El programa deberá
mostrar por pantalla:
    a) Si el número coincide con el número premiado.
    b) Si el número tiene reintegro, es decir, se dan a la vez las dos siguientes condiciones:
        a. La primera cifra del número coincide con la primera cifra del número premiado
        b. La última cifra del número coincide con la última cifra del número premiado
 */
import java.util.Scanner;

public class Ejercicio52 {

    public static void main(String[] a) {
        int premiado = 23456;
        
        System.out.println("El numero premiado es: " + premiado);
        
        System.out.print("Introduce tu número de lotería: ");
        int numero = new Scanner(System.in).nextInt();
        
        int restoP = premiado % 10;
        int restoN = numero % 10;
       
        int primeraCifraP = premiado / 10000;
        int primeraCifraN = numero / 10000;
        
        if (numero == premiado) {
            System.out.println("Has ganado la lotería.");
        }else if (restoP==restoN && primeraCifraP==primeraCifraN){
            System.out.println("Tu número tiene reintegro.");
        }else{
            System.out.println("Tu número no ha sido premiado.");
        }

        System.out.println("Última letra del numero premiado: "+restoP);
        System.out.println("Última letra de tu numero: "+restoN);
        System.out.println("Primera letra del numero premiado: "+primeraCifraP);
        System.out.println("Primera letra de tu numero: "+primeraCifraN);
     
    }
}
