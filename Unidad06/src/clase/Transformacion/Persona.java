/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.Transformacion;

import java.io.*;
import java.util.Optional;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    private Persona hijo;
    
    public Persona(String n, int e){
        this(n, e, null);
    }
    public Persona(String n, int e,Persona h){
        this.nombre = n;
        this.edad = e;
        this.hijo = h;
    }

    public Optional<Persona> getHijo() {
//        Optional<Persona> o = Optional.empty();
//        if(hijo!=null){
//            o = Optional.of(hijo);
//        }
//        return o;

//        return hijo==null?Optional.empty():Optional.of(hijo);
        
        return Optional.ofNullable(hijo);
    }
    
    public void trabajar() throws IOException{
        if(this.edad<18){
            throw new IOException("Un menor de edad no puede trebajar.");
        }else{
            System.out.println("La persona "+this.nombre+" esta trabajando.");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
