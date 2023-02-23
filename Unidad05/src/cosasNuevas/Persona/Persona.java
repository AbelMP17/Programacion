package cosasNuevas.Persona;

import java.time.*;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;    
    private Localidad localidad;
    
    public Persona(String n, int e, LocalDate fn, Localidad l){
        this.nombre = n;
        this.edad = e;
        this.fechaNacimiento = fn;
        this.localidad = l;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    @Override
    public int compareTo(Persona o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.localidad.compareTo(o.localidad);
    }
}
