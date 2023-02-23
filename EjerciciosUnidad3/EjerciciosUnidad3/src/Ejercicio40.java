import java.util.*;
/*
Realiza un programa que pida diez notas por teclado y al final muestre su nota 
media. Si alguna nota introducida es incorrecta (negativa o superior a 10) el programa la 
preguntará nuevamente. 
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        System.out.print("Introduce 10 notas: ");
        int[] notas = new int[10];
        int acumulador = 0;
        for(int i = 0; i<10;i++){
            int num = new Scanner(System.in).nextInt();
            if(num>=0 && num<=10){
               notas[i]=num;
               acumulador+=num;
            }else{
                i=0;
                System.out.println("Introduce 10 notas: ");
            }
        }
        int media = acumulador/notas.length;
        System.out.println("Nota media: "+media);
        
    }
}
