import java.util.*;
/*
Un profesor hace diez exámenes y calcula la nota de la asignatura haciendo la 
nota media, pero si alguna de las notas es suspenso, entonces la calificación de la asignatura es 
suspenso. Realiza un programa que pida una por una las notas y muestre al final la nota de la 
asignatura. El programa deberá detenerse si alguno de los exámenes está suspenso. 
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        
        int nota = 0;
        
        double num = 0;     
        
        int i=0;
        
        boolean repetir = true;
        
        while(repetir){
            System.out.println("Escribe un tu nota comprendida entre 0 y 10 (Introduce otro numero para mas datos):");
            nota = new Scanner (System.in).nextInt();
                
            if(nota>=0 && nota<5){
                repetir=false;
            }else if(nota>=5 && nota<=10){
                lista.add(nota);
                num+=nota;
                i++;
            }else{
                System.out.println("Numero no valido.");
                
            }
            if (i==10){
                repetir=false;
            }
        }
        if(nota>=0 && nota<5){
            System.out.println("Has supendido");
        }else{
            System.out.println("Nota media: "+num/lista.size());
        }
        
        
        
    }
}
