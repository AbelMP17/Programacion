/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hlanz.Instituto;

/**
 *
 * @author usuario
 */
public class Alumno {
    private String nombre;
    private int nota;
    
    public Alumno(String nombre, int nota ){
        //throw new UnsupportedOperationException("Metodo sin programar");
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre(){
        //throw new UnsupportedOperationException("Metodo sin programar");
        return this.nombre;
    }
    public int getNota(){
        //throw new UnsupportedOperationException("Metodo sin programar");
        return this.nota;
    }
}
