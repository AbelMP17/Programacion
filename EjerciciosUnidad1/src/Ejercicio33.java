/*
En una clase de 26 alumnos ha aprobado el 66% de alumnos, ha suspendido el 19.5% y
el resto no se han presentado. Realiza un programa que muestre por pantalla el número de alumnos
de cada tipo.
 */
public class Ejercicio33 {
    public static void main(String[] a){
        
        int alumnosClase = 26;
        
        double porcentajeAlumnosAprob = 0.66;
        double porcentajeAlumnosSus = 0.195;
        double porcentajeAlumnosRest = 1-(porcentajeAlumnosAprob+porcentajeAlumnosSus);
        
        
        double alumnosAprob = alumnosClase*porcentajeAlumnosAprob;
        double alumnosSus = alumnosClase*porcentajeAlumnosSus;
        double alumnosRes = alumnosClase*porcentajeAlumnosRest;
        
        System.out.println("· Alumnos aprobados: "+alumnosAprob+"\n· Alumnos suspensos: "+alumnosSus+"\n· Alumnos restantes: "+alumnosRes);
        
        
        
    }
}
