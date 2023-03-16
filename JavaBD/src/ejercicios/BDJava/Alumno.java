/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.BDJava;

/**
 *
 * @author usuario
 */
public class Alumno {
    private int id;
    private String nombre;
    private String ciudad;
    
    public Alumno(int id, String nombre, String ciudad){
        this.id = id;
        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    
}
