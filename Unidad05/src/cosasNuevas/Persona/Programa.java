package cosasNuevas.Persona;

import java.time.LocalDate;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Localidad gr = new Localidad(1, "Granada");
        Localidad ma = new Localidad(2, "Málaga");
        Localidad ja = new Localidad(3, "Jaén");
        
        
        
        lista.add(new Persona("Abel",30,LocalDate.now().minusYears(30),gr));
        lista.add(new Persona("María",20,LocalDate.now().minusYears(20),ma));
        lista.add(new Persona("Hermenegildo",120,LocalDate.now().minusYears(120),ja));
        lista.add(new Persona("Antonio",80,LocalDate.now().minusYears(80),gr));
        lista.add(new Persona("Ana",50,LocalDate.now().minusYears(50),ja));
        
        Collections.sort(lista);
        
        Collections.sort(lista, new ComparadorPersonasPorEdad());        
        
        for(Persona i : lista){
            //System.out.println("Nombre: "+i.getNombre()+" - Edad: "+i.getEdad()+" - Fecha Nacimiento: "+i.getFechaNacimiento());
            System.out.println("%s ... %d ... %s ... %s".formatted(i.getNombre(),i.getEdad(),i.getFechaNacimiento().toString(), i.getLocalidad().localidad()));
        }
        
        
    }
}
