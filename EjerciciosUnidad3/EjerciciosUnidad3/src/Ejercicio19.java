
import java.io.IOException;
import java.net.*;
import java.time.*;
import java.util.*;

/*
Realiza un programa que pregunte por teclado una dirección IP y un número 
entero. El programa usará la clase InetAddress para realizar la cantidad de pings indicada a la 
dirección IP, midiendo el tiempo empleado en hacer cada uno (clases Instant y Duration), y 
mostrará el resultado de esta forma: 

 */
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.print("Escribe una dirección IP: ");
        String ip = new Scanner(System.in).nextLine();
        
        System.out.print("Escribe un numero entero: ");
        int num = new Scanner(System.in).nextInt();
        try{
            InetAddress url = InetAddress.getByName(ip);
            for(int i=0;i<num;i++){
                Instant i1 = Instant.now();
                System.out.println("Haciendo ping a "+url.getHostName()+"["+url.getHostAddress()+"]");
                url.isReachable(100);
                Instant i2 = Instant.now();
                System.out.println("Respuesta desde "+url.getHostAddress()+": Tiempo= "+Duration.between(i1, i2).toMillis()+" ms");
            }
        }catch(IOException error){
            System.out.println(error);
        }
        
        
        
    }
}
