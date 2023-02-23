
package clases.ejercicios.ejercicio34;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Reloj {
    private LocalTime hora;
    
    public Reloj(){
        this.hora = LocalTime.now();
    }
    
    public void añadir(int segundos){
        this.hora = hora.plusSeconds(segundos);
    }
    
    public boolean esNoche(){
        boolean noche = false;
        
        LocalTime e = LocalTime.of(20, 0, 0);
        LocalTime f = LocalTime.of(8, 0, 0);
        if(hora.isAfter(e) || hora.isBefore(f)){
            noche = true;
        }
        
        return noche;
    }
    
    public void esperar(int segundos){
        try{
            Thread.sleep(segundos*1000);
            this.hora = LocalTime.now();
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    
    public String toString(){
        return hora.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }
}
