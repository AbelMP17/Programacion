import java.time.*;
/*
Consulta el pdf de la librería “java time” y busca las clases LocalDate y
DayOfWeek. Haz un programa que muestre por pantalla el nombre del día de la semana que
será el 28 de febrero de 2100. 
 */
public class Ejercicio45 {
    public static void main(String[] args) {
                
        LocalDate fecha = LocalDate.of(2100, Month.FEBRUARY, 28);      
        DayOfWeek dia = fecha.getDayOfWeek();
        System.out.println(dia);
       
    }

}
