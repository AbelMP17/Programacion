package ejercicios.ejercicio09;

import java.time.*;

public class Adivinanza {
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;
    
    public Adivinanza(String e, String rc){
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        this.inicio = null;
    }
    
    public String getEnunciado(){
        this.inicio = Instant.now();
        return enunciado;
    }
    
    public void comprobar(String respuesta){
        if(inicio!=null){
            if(respuesta.equalsIgnoreCase(respuestaCorrecta)){
                if(inicio.isAfter(inicio.plusSeconds(30))){
                    try {
                        throw new TiempoSuperadoException();
                    } catch (TiempoSuperadoException error) {
                        System.out.println(error);
                    }
                }
                System.out.println("Respuesta Correcta");
            }else{
                try {
                    throw new AdivinanzaIncorrectaException();
                } catch (AdivinanzaIncorrectaException error) {
                    System.out.println(error);
                }
            }
        }
    }
    
}
