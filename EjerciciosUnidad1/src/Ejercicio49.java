/*

 */
import java.util.*;
public class Ejercicio49 {
    public static void main(String[] a){
        int[] suspensos = {3,8,2,0,0};
        String[] alumnos = {"Antonio","Jaime","Pedro","Manuel","Maite"};
        
        System.out.print("Escribe un número del 0 al 4 para ver los datos de un alumno: ");
        int numAlumno = new Scanner(System.in).nextInt();
        
        if(numAlumno>=0 && numAlumno<=4){
            System.out.println(alumnos[numAlumno]+" con "+suspensos[numAlumno]+" asignaturas suspensas.");
            if(suspensos[numAlumno]==0){
                System.out.println("Estás aprobado");
            }else if(suspensos[numAlumno]>0){
                System.out.println("Estás suspenso");
            }else{
                System.out.println("Número de asignaturas suspensas incorrecto.");
            }
        }else{
            System.out.println("Número de alumno incorrecto.");
        }
    }
}
