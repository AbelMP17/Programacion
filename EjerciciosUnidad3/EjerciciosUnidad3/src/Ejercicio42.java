import java.util.*;
/*
Ejercicio 42: En este ejercicio vas a hacer un programa que pida por teclado al usuario el
nombre de un día y muestre tu horario de clases de ese día. Sigue estos pasos:
    a) Crea una lista para guardar los nombres de los días de la semana
    b) Crea una lista de String para guardar las horas (por ejemplo “16:00 – 16:55”)
    c) Crea una tabla 5 x 6 con las asignaturas que tienes cada día (cada columna es un día).
    d) Pide por teclado al usuario el nombre de un día
    e) Obtén la posición que tiene el día introducido dentro de la lista del apartado a)
    f) Recorre la columna correspondiente a ese día y muestra las asignaturas, poniendo
también la hora correspondiente a cada una.
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        String[] horas = {"8:15 - 9:15","9:15 - 10:15","10:15 - 11:15","11:45 - 12:45","12:45 - 13:45","13:45 - 14:45"};
        String[][] modulos = {
            {"BD","SI","FOL","ED","BD"},
            {"BD","SI","FOL","ED","BD"},
            {"PR","FOL","PR","PR","LM"},
            {"PR","ED","PR","PR","LM"},
            {"SI","PR","BD","LM","SI"},
            {"SI","PR","BD","LM","SI"},
        };
        boolean salir = true;
        for (int h = 0; h<dias.length;h++) {
            System.out.print("Escribe un día de la semana (Lunes-Viernes): ");
            String dato = null;
            for(int i = 0;i<modulos[h].length || salir;i++){
                dato = new Scanner (System.in).nextLine();
                for(int j = 0;j<modulos[i].length+1;j++){
                    if (dias[i].equalsIgnoreCase(dato)){
                        System.out.println("Modulo: "+modulos[j][i]+"-> Hora: "+horas[j]); 
                    }else{
                        salir = false;
                    }
                }                    
                
            }
        }
    }
}

