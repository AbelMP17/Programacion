
import java.time.*;

import java.util.*;

/*
Consulta la “Librería estándar de Java” y busca las clases Thread y Random. Haz
un programa que haga una pausa de una cantidad aleatoria de segundos entre 0 y 10.
Consulta ahora el pdf de la librería “java time” y busca las clases Instant y Duration. Obtén un
objeto Instant antes de que empiece la pausa y luego otro objeto Instant cuando la pausa
termine. A partir de dichos dos objetos, obtén un objeto Duration y úsalo para mostrar
cuántos segundos ha durado la pausa.
 */
public class Ejercicio46 {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        
        int numAleatorio = rnd.nextInt(11-0);
        
        Instant momento1 = Instant.now();
        
        System.out.println(momento1);
        
        try{
            Thread.sleep(numAleatorio*1000);
        }catch (InterruptedException error){
            System.out.println("error");
        }
        
        Instant momento2 = Instant.now();
        
        System.out.println(momento2);
        
        Duration duracion = Duration.between(momento1,momento2);
        
        double segundos = duracion.getSeconds();
        
        System.out.println("Segundos esperados: "+segundos);
    }
}
