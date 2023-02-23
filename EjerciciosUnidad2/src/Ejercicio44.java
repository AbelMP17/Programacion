import java.time.*;
import java.time.format.*;
 /*
Consulta el pdf de la librería “java time” y busca las clases LocalDate y
DateTimeFormatter. Haz un programa que muestre por pantalla la fecha actual en formato
día/mes/año y después en formato día-mes-año. 
 */
public class Ejercicio44 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        
        
        String formato1= fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String formato2= fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        System.out.println(formato1);
        System.out.println(formato2);
        
    }
}
