import java.util.*;

/*
Realiza un programa que pida una por una, las notas de los alumnos
comprendidas entre 0 y 10 sin decimales. Cuando el usuario introduzca un -1, se mostrará la
mayor nota, la menor, y la nota media de todos ellos.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        
        boolean repetir = true;
        
        int i = 0;
        
        List<Integer> lista = new ArrayList<>();
               
        int nota = 0;
        
        int num = 0;     
        
        while(repetir){
                        
            System.out.println("Escribe un tu nota comprendida entre 0 y 10 (Introduce -1 para mostrar más datos):");
            nota = new Scanner (System.in).nextInt();
                
            if(nota>=0 && nota<=10){
                lista.add(nota);
                i++;
                num+=nota;
            }else{
                System.out.println("El número no está dentro del intervalo.");
                repetir = false;
            }
                        
        }
        
        
        System.out.println("La nota media es :" + num / lista.size());
        System.out.println("La mayor nota es :" + Collections.max(lista));
        System.out.println("La menor nota es :" + Collections.min(lista));
        
    }
}
