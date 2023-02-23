public class Ejercicio19
{
    public static void main (String[] a){
    
        int cobra = 200;
        int alumnoPaga = 15;
        int clasesAlumnos = alumnoPaga*30;
        int mes = cobra+clasesAlumnos;
        int academiaGana = (100-alumnoPaga)*30;
        System.out.println("El alumno cobra "+mes+" €.");
        System.out.println("La academia gana "+academiaGana+" €.");
    }

}