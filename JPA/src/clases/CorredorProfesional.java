package clases;

import java.io.*;
import java.time.*;
import javax.persistence.*;

@Entity
public class CorredorProfesional extends Corredor implements Serializable{
    private int numeroTrofeos;
    private String club;
    
    public CorredorProfesional(){
        
    }
    public CorredorProfesional(String nombre, LocalDate fechaNac, int numTrofeos, String club){
        super(nombre, fechaNac);
        this.numeroTrofeos = numTrofeos;
        this.club = club;
    }
    
}
