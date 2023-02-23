package clases.ejercicios.hora;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public record Hora(int hora, int minuto, int segundo){
    public Hora{
        //throw new UnsupportedOperationException("metodo no creado.");
        if(!((hora>=0 && hora<=23) && (minuto>=0 && minuto<=59) && (segundo>=0 && segundo<=59))){
            throw new IllegalArgumentException("La hora/minuto/segundo introducido son/es incorreto/s");
        }
    }
    
    public Hora añadirSegundos(int segundos){
        //throw new UnsupportedOperationException("metodo no creado.");
        LocalTime plus = toLocalTime().plusSeconds(segundos);
        return new Hora(plus.getHour(),plus.getMinute(),plus.getSecond());
    }
    
    public boolean esNoche(){
        //throw new UnsupportedOperationException("metodo no creado.");
        return hora>=20 || hora<=8;
    }
    
    public String toString(){
        //throw new UnsupportedOperationException("metodo no creado.");        
        return toLocalTime().format(DateTimeFormatter.ofPattern("h:m:s"));
        
    }
    
    public LocalTime toLocalTime(){
        //throw new UnsupportedOperationException("metodo no creado.");
        return LocalTime.of(hora, minuto, segundo);
    }
    
    public static Hora suma(Hora h1, Hora h2){
        //throw new UnsupportedOperationException("metodo no creado.");
        return new Hora(h1.hora()+h2.hora(),h1.minuto()+h2.minuto(),h1.segundo()+h2.segundo());
    }
    
}
