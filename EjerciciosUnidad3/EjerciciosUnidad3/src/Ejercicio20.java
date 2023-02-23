
import bpc.daw.consola.Consola;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
Usa la Consola DAW y las clases de Java Time para realizar un programa que 
muestre en el centro de la pantalla la hora, minutos y segundos actuales. Durante medio 
minuto, a cada segundo la pantalla se borrará y se volverá a imprimir la hora actual, dando la 
apariencia de un reloj. 

 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Consola cons = new Consola();
                
        for (int i = 0; i!=30;i++){
            try{
            LocalTime horas = LocalTime.now();  
            String tiempo = horas.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
            cons.getCapaTexto().print(15,40 , tiempo);
            Thread.sleep(1000);
            cons.getCapaTexto().cls();
            }catch(InterruptedException error){
                cons.getCapaTexto().print("Error");
            }
        }
        
    }
}
