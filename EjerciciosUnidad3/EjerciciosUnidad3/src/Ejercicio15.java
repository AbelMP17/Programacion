import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
/*
Usa las clases LocalDate y DateTimeFormatter para hacer un programa que 
pregunte al usuario un número de mes (entre 1 y 12) y un año. El programa mostrará por 
pantalla todos los días de ese mes, con el siguiente formato: “día/mes/año y día de la semana” 

 */
public class Ejercicio15 {
    public static void main(String[] args) {
        
        try{
        System.out.println("Numero del mes");
        int mes = new Scanner(System.in).nextInt();
        
        System.out.println("Numero del año");
        int año = new Scanner(System.in).nextInt();
                      
        int dia = 1;
        
        LocalDate date = LocalDate.of(año, mes, dia);
        
        while (dia<date.lengthOfMonth()+1){
            LocalDate date1 = LocalDate.of(año, mes, dia);
            DateTimeFormatter fecha=DateTimeFormatter.ofPattern("dd/MM/yyyy/eeee");
            System.out.println(date1.format(fecha));  
            dia++;
        }
        }catch(DateTimeException error){
            System.out.println("Error de fecha");
        }
        
    }
}
