/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.clasesAnonimas;

/**
 *
 * @author usuario
 */
public abstract class Funcion {
    private String nombre;
    
    public Funcion(String n){
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularY(double x);
}
