/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hlanz.Instituto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Instituto {
    
    private String nombre;
    private List<Alumno> alumnos;
    
    public Instituto(String nombre){
        //throw new UnsupportedOperationException("Metodo sin programar");
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }
    public void anadir(Alumno a){
        //throw new UnsupportedOperationException("Metodo sin programar");
        alumnos.add(a);
    }
    
    public List<Alumno> getAlumnos(){
        //throw new UnsupportedOperationException("Metodo sin programar");
        return alumnos;
    }
}
