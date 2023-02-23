/*
Un alumno ha sacado un 6.5, un 4.2, un 5.75, un 3.5 y un 8 en sus exámenes, y además,
tiene 10 faltas. Realiza un programa que nos diga si el alumno ha aprobado, teniendo en cuenta que
para aprobar se siguen estos criterios:

· Si el número de faltas es superior a 10, la nota media de los exámenes debe ser mayor que 5
· Si el número de faltas está entre 15 y 20, la nota media de los exámenes debe ser más de 7
· Si el número de faltas es superior a 20, está suspenso
 */
public class Ejercicio30 {
    public static void main(String[] a){
        
        int faltas = 10;
        
        double nota1 = 6.5;
        double nota2 = 4.2;
        double nota3 = 5.75;
        double nota4 = 3.5;
        double nota5 = 8;
        
        double media = (nota1+nota2+nota3+nota4+nota5)/5;
        
        System.out.println("Media: "+media);
        System.out.println("Faltas: "+faltas);
        
        if (faltas>=10 && faltas<15 && media>5){
            System.out.println("Estás aprobado.");
        }else if(faltas>=15 && faltas<=20 && media>7){
            System.out.println("Estás aprobado.");
        }else{
            System.out.println("Estás suspenso.");
        }
        
    }
}
