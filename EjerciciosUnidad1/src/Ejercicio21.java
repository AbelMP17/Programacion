/*
Un profesor hace un examen en el que la teoría vale un 40% de la nota y los problemas
un 60%. En total hay 8 preguntas de teoría (todas valen lo mismo) y 4 problemas (todos valen lo
mismo). Un alumno contesta correctamente 6 preguntas de teoría y hace bien 1 problema. Realiza
un programa que muestre por pantalla la nota del alumno.
*/
public class Ejercicio21 {
    public static void main(String[] a){
        //Lo que vale cada cosa
        double teoria = 0.4;
        double practica = 0.6;
        
        //esto es lo que vale lo que ha hecho el alumno 
        double teoriaA = 6*10/8;
        double practicaA = 1*10/4;
        
        //se multiplica lo que ha hecho el alumno y lo que vale cada parte del examen
        double finalTeoria = teoriaA*teoria;
        double finalPractica = practicaA*practica;
        
        //nota final
        double nota = finalTeoria+finalPractica;
        
        System.out.println("La nota del alumno es "+nota);
        
    }
}
